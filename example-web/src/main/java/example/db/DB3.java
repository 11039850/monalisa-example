package example.db;

import com.tsc9526.monalisa.main.DBModelGenerateMain;
import com.tsc9526.monalisa.orm.annotation.DB;
import com.tsc9526.monalisa.orm.datasource.DBConfig;
import com.tsc9526.monalisa.tools.io.MelpFile;
  
/**
 * 
 * Database connection setup. <br><br>
 * 
 * Configuration used as classpath file, see: {@link DB#configFile()}
 * 
 * @author zzg
 */
@DB(
	configFile="classpath:/db3.cfg" //OR file path: "your_file_path/db3.cfg"
)
public interface DB3 {                                           
	public static DBConfig DB=DBConfig.fromClass(DB3.class);   
	        
	//Code generate(OR  Maven Build / Eclipse Plugin )
	public static class CreateModelClasses{ 
		public static void main(String[] args) {  
			//Initialize database 
			String sqlscripts=MelpFile.readToString(DB3.class.getResourceAsStream("/init-db.sql"),"utf-8");
			DB.executeBatch(sqlscripts.split(";"));  
			
			//Generate model classes
			DBModelGenerateMain.generateModelClass(DB3.class,"./target/generated-sources/annotations"); 
		}
	}
}
