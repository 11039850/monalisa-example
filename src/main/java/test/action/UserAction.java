package test.action;

import java.util.List;

import test.TestDB;
import test.dao.UserBlogDao;
import test.result.UserBlogs;
import test.testdb.User;

import com.tsc9526.monalisa.core.query.DataMap;
import com.tsc9526.monalisa.core.query.Query;

/**
 * 调用示例
 */
public class UserAction {
	public static void main(String[] args)throws Exception {
		UserAction action=new UserAction();
		action.findUserBlogs(1);
	}
	
	/**
	 * 这里需要调用 Query.Create()来创建数据访问类. 不能直接调用new, 否则会丢失@Tx标记方法的事务特性， 以及数据访问类更新加载的特性
	 */
	private UserBlogDao dao=Query.create(UserBlogDao.class);
	
	public void findUserBlogs(int user_id){
		for(UserBlogs x: dao.selectUserBlogs(user_id)){
			System.out.println(x.getContent());
		}
	}
	
	public void saveLoad(){
		new User().setName("zzgx").setStatus(1).save();
		
		for(User x:User.WHERE().name.like("zzg%").status.in(0, 1).SELECT().select()){
			System.out.println(x.toJson());
		}
	}       
	    
	 
	public List<DataMap>  selectUserBlogs(int user_id){
		Query q=TestDB.DB.createQuery();
		         
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title,b.content,b.create_time"
				+ "\r\n	FROM user a, blog b "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?		"
		+ "\r\n"/**}*/, user_id);
		 
		return q.getList();
	}
}
