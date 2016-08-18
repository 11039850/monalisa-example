package test;

import com.tsc9526.monalisa.orm.annotation.DB;
import com.tsc9526.monalisa.orm.datasource.DBConfig;
  
/**
 * 
 * Database connection setup. <br><br>
 * 
 * Configuration used as file, see: {@link DB#configFile()}
 * 
 * @author zzg
 */
@DB(
	 url="jdbc:mysql://127.0.0.1:3306/test?allowMultiQueries=true" 
	,username="root"
	,password="root"
	,datasourceClass="C3p0DataSource" //Option: C3p0DataSource or DruidDataSource
)
public interface TestDB {                    
	public static DBConfig DB=DBConfig.fromClass(TestDB.class);        
}
