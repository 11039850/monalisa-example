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
 * To auto create or update DTOs, you need to install the eclipse plugin:<br>
 * https://github.com/11039850/monalisa-orm/wiki/code-generator#eclipse-plugin
 */
public class UserBlogDao {
	final static long $VERSION$= 213L;  //Auto increase 1 after save

	// @Select indicating that the method will generate a DTO
    // Optional parameter: name 
    //                     specifies the name of the class generated DTO, 
    //                     if not specified, using the default: "Result" + the method's name
    // Optional parameter: build
    //                     a Java snippet for initializing the method parameters, 
    //                     replace the default initialization rule
    @Select(name = "test.dao.userblogdao.UserBlogs")

    // !!! After saving, the plugin will automatically modify the return value: List -> List <UserBlogs>
    //
    // The first time, DTO class does not exist. In order to compile the code correctly,
    // the return value and the result of the query must be replaced by a generic value. 
    // If saved, the plugin will automatically modify the results to the corresponding values.
    //
    // Here is the corresponding relationship between the return value and the results of the query:
    // 1. List query
    // Public DataTable method_name (...) {... return query.getList ();} or
    // Public List      method_name (...) {... return query.getList ();}
    //
    // 2. Page query
    // Public Page      method_name (...) {... return query.Page ();   }
    //
    // 3. Single record
    // Public Object    method_name (...) {... return query.getResult ();}
    //
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
			 "List ids=new java.util.ArrayList(); \r\n"  //Custom initialization parameters  
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
