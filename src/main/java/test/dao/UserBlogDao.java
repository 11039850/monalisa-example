package test.dao;

import java.util.List;

import test.TestDB;
import test.dao.userblogdao.ResultSelectUserBlogsByList;
import test.dao.userblogdao.ResultSelectUserBlogsOne;
import test.dao.userblogdao.UserBlogs;
import test.testdb.Blog;
import test.testdb.User;

import com.tsc9526.monalisa.orm.Query;
import com.tsc9526.monalisa.orm.annotation.Select;
import com.tsc9526.monalisa.orm.annotation.Tx;
import com.tsc9526.monalisa.orm.datatable.DataMap;
import com.tsc9526.monalisa.orm.datatable.Page;

/**
 * Database access class <br><br>
 * 
 * Auto generate DTOs, you need install the eclipse plugin:<br>
 * https://github.com/11039850/monalisa-orm/wiki/code-generator#eclipse-plugin
 */
public class UserBlogDao {
	final static long $VERSION$= 207L;  //Auto increase 1 after save

	@Select(name="test.dao.userblogdao.UserBlogs") //Auto Generate DTO class: test.dao.userblogdao.UserBlogs
	public List<UserBlogs>  selectUserBlogs(int user_id){  // <--- List selectUserBlogs(int user_id)
		Query q=TestDB.DB.createQuery();
		             
		q.add(""+/**~{*/""
				+ "SELECT a.id, a.name, b.title, concat(b.content,'x00x') as content,b.create_time"
				+ "\r\n	FROM user a, blog b      "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?            "
		+ "\r\n"/**}*/, user_id);  
		 
		return q.getList(UserBlogs.class); // <--- return q.getList();
	} 
	
	@Select //Auto generate DTO class: test.dao.userblogdao.ResultSelectUserBlogsOne
	public ResultSelectUserBlogsOne  selectUserBlogsOne(int user_id){ // <--- public Object selectUserBlogsOne(int user_id)
		Query q=TestDB.DB.createQuery(); 
		            
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title, concat(b.content,'x00x') as content,b.create_time "
				+ "\r\n	FROM user a, blog b   "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?     "
		+ "\r\n"/**}*/, user_id);
		 
		return q.getResult(ResultSelectUserBlogsOne.class); // <--- return q.getResult();
	} 
	
	@Select( //Auto generate DTO class: test.dao.userblogdao.ResultSelectUserBlogsByList
		build=
			 "List ids=new java.util.ArrayList(); \r\n"  //Init some parameters manual 
			+"ids.add(1); \r\n" 
			+"int limit = 10; " 
	)
	public List<ResultSelectUserBlogsByList>  selectUserBlogsByList(List<Integer> ids,int limit,int offset){ 
		Query q=TestDB.DB.createQuery();    
		                   
		q.add(""+/**~{*/""
			+ "SELECT a.id,a.name,b.title, concat(b.content,'x00x') as content,b.create_time"
			+ "\r\n	FROM user a, blog b         "
			+ "\r\n	WHERE a.id=b.user_id AND a.id "
		+ "\r\n"/**}*/.trim()).in(ids);
		
		return q.getList(ResultSelectUserBlogsByList.class, limit, offset); 
	} 
	
	@Tx //Run this method in a transaction
	public void  updateUserBlog(int user_id,int blog_id){
		User user=User.SELECT().selectByPrimaryKey(user_id);
		Blog blog=Blog.SELECT().selectByPrimaryKey(blog_id);
		user.setName("new name").update();
		blog.setContent("new content").update();
	}
	
	//DataMap
	public Page<DataMap>  selectUserBlogsAsListMap(int user_id,int limit,int offset){
		Query q=TestDB.DB.createQuery();
		         
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title,b.content,b.create_time"
				+ "\r\n	FROM user a, blog b "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?		"
		+ "\r\n"/**}*/, user_id);
		 
		return q.getPage(limit,offset);
	}
}
