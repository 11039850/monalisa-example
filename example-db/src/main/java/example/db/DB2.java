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
@DB //Load from default file: The Annotated Class Name + ".cfg" under current path, for this example is: ./example.db.DB2.cfg 
public interface DB2 {
	public static DBConfig DB=DBConfig.fromClass(DB2.class);   
	        
	//Code generate(OR  Maven Build / Eclipse Plugin )
	public static class CreateModelClasses{ 
		public static void main(String[] args) {  
			//Initialize database 
			String sqlscripts=MelpFile.readToString(DB2.class.getResourceAsStream("/init-db.sql"),"utf-8");
			DB.executeBatch(sqlscripts.split(";"));  
			
			//Generate model classes
			DBModelGenerateMain.generateModelClass(DB2.class,"./target/generated-sources/annotations"); 
		}
	}
}
