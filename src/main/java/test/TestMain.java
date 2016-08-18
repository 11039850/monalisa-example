package test;

import test.action.UserAction;

/**
 * Test main
 * 
 * @author zzg
 */
public class TestMain {
 
	/**
	 * For the first test run, please setup: <br><br>
	 * 
	 * 1. Setup database from class: {@link test.TestDB}<br><br>
	 * 
	 * 2. Call {@link test.InitDatabase#main} init test tables and generate model classes, then refresh(F5)<br><br>
	 * 
	 * 3. Run this class<br><br>
	 * 
	 * For better experience, please install the eclipse plugin: <br><br>
	 * https://github.com/11039850/monalisa-orm/wiki/code-generator#eclipse-plugin
	 */
	public static void main(String[] args)throws Exception {
		UserAction action=new UserAction();
		
		action.testDAO();
		
		action.testDBAction();
		
		action.testDynamic();
		
		action.testDataTable();
	}
}
