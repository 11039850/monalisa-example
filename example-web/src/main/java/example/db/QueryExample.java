package example.db;

/**
 * 
 * @author zzg.zhou(11039850@qq.com)
 */
public class QueryExample{
	public static void main(String[] args) {
		System.out.println( MultiDb.DBX.select("SELECT * FROM tb_user") );

	}
}