package test;

import com.tsc9526.monalisa.core.annotation.DB;
import com.tsc9526.monalisa.core.datasource.DBConfig;
  
@DB(url="jdbc:mysql://127.0.0.1:3306/test?allowMultiQueries=true" ,username="root", password="root")
public interface TestDB {     
	public static DBConfig DB=DBConfig.fromClass(TestDB.class); 
}
