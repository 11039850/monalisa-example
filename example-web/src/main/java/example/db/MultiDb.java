package example.db;

import com.tsc9526.monalisa.main.DBModelGenerateMain;
import com.tsc9526.monalisa.orm.annotation.DB;
import com.tsc9526.monalisa.orm.datasource.DBConfig;
import com.tsc9526.monalisa.tools.io.MelpFile;

/**
 * 
 * @author zzg.zhou(11039850@qq.com)
 */
public interface MultiDb {
	@DB(configFile="multi-db.cfg",configName="dbx")
	public interface DBX{}  
	
	@DB(configFile="multi-db.cfg",configName="dby")
	public interface DBY{}  
	
	public static DBConfig DBX=DBConfig.fromClass(DBX.class);
	public static DBConfig DBY=DBConfig.fromClass(DBY.class);
	
	 
	public static class CreateModelClasses{ 
		public static void main(String[] args) {  
			//Initialize database 
			String sqlscripts=MelpFile.readToString(MultiDb.class.getResourceAsStream("/init-db.sql"),"utf-8");
			DBX.executeBatch(sqlscripts.split(";"));  
			DBY.executeBatch(sqlscripts.split(";"));  
			 
			//Generate model classes
			DBModelGenerateMain.generateModelClass(DBX.class,"./target/generated-sources/annotations");
			DBModelGenerateMain.generateModelClass(DBY.class,"./target/generated-sources/annotations");
		}
	}
}
