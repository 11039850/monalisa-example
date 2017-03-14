package example.db;

import com.tsc9526.monalisa.main.DBModelGenerateMain;
import com.tsc9526.monalisa.orm.annotation.DB;
import com.tsc9526.monalisa.orm.datasource.DBConfig;
import com.tsc9526.monalisa.tools.io.MelpFile;
  
/**
 * 
 * Database connection setup. <br><br>
 * 
 * Configuration used as file, see: {@link DB#configFile()}
 * 
 * @author zzg
 */
@DB(
	 url             = "jdbc:mysql://127.0.0.1:3306/test" 
	,username        = "root" 
	,password        = "root" 
	
	,dbs             = "testdb" //Enable db service named: testdb (default is disable)
	,dbsAuthUsers    = "none"   //Set no auth access to db service(default is monalisa:monalisa)
	
	,datasourceClass = "DruidDataSource" //Option: C3p0DataSource or DruidDataSource
)
public interface TestDB {                                   
	public static DBConfig DB=DBConfig.fromClass(TestDB.class);   
	     
	//Code generate(OR  Maven Build / Eclipse Plugin )
	public static class CreateModelClasses{
		public static void main(String[] args)throws Exception{
			//Initialize database 
			String sqlscripts=MelpFile.readToString(TestDB.class.getResourceAsStream("/init-db.sql"),"utf-8");
			DB.executeBatch(sqlscripts.split(";")); 
			
			//Generate model classes
			DBModelGenerateMain.generateModelClass(TestDB.class,"./target/generated-sources/annotations"); 
		}
	}
}
