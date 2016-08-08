package test;

import com.tsc9526.monalisa.orm.annotation.DB;
import com.tsc9526.monalisa.orm.datasource.DBConfig;
  
@DB(url="jdbc:mysql://127.0.0.1:3306/test?allowMultiQueries=true" ,username="root", password="root")
public interface TestDB {       
	public static DBConfig DB=DBConfig.fromClass(TestDB.class); 
}
