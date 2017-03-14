package example.web.dao;


import java.util.List;

import com.tsc9526.monalisa.orm.Query;
import com.tsc9526.monalisa.orm.annotation.Select;
import com.tsc9526.monalisa.orm.annotation.Tx;
import com.tsc9526.monalisa.tools.datatable.DataMap;
import com.tsc9526.monalisa.tools.datatable.Page;

import example.db.TestDB;
import example.db.testdb.TbBlog;
import example.db.testdb.TbUser;
import example.web.dao.userblogdao.ResultSelectUserBlogsByList;
import example.web.dao.userblogdao.ResultSelectUserBlogsOne;
import example.web.dto.UserBlog;

/**
 * Database access class <br><br>
 * 
 * To auto create or update DTOs, please install the eclipse plugin:<br>
 * https://github.com/11039850/monalisa-orm/wiki/code-generator#eclipse-plugin
 */
public class UserBlogDao {
	//Auto increase 1 after saved
	final static long $VERSION$= 119L;  
  
	@Select(name = "example.web.dto.UserBlog")
	//public List selectUserBlogs(int user_id){
	public List<UserBlog> selectUserBlogs(int user_id){  
		Query q=TestDB.DB.createQuery();
		                 
		q.add(""+/**~{*/""
				+ "SELECT a.id, a.name, b.title, concat(b.content,' ...') as content,b.create_time"
				+ "\r\n	FROM tb_user a, tb_blog b "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?    "
		+ "\r\n"/**}*/, user_id);     
		
		//return q.getList();
		return q.getList(UserBlog.class); 
	} 
	
	@Select
	//public Object selectUserBlogsOne(int user_id){
	public ResultSelectUserBlogsOne  selectUserBlogsOne(int user_id){
		Query q=TestDB.DB.createQuery(); 
		       
		q.add(""+/**~!{*/""
				+ "SELECT *           "
				+ "\r\n	FROM tb_user a, tb_blog b                     "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=" +(user_id)+ "    "
		+ "\r\n"/**}*/);  
		//return q.getResult(); 
		return q.getResult(ResultSelectUserBlogsOne.class);
	} 
 	
	@Select(
		build=
			 "List ids=new java.util.ArrayList(); \r\n"  //Custom initialization parameters  
			+"ids.add(1); \r\n"   
			+"int limit = 10; "  
	) 
	//public List selectUserBlogsByList(List<Integer> ids,int limit,int offset){
	public List<ResultSelectUserBlogsByList>   selectUserBlogsByList(List<Integer> ids,int limit,int offset){ 
		Query q=TestDB.DB.createQuery();    
		                      
		q.add(""+/**~{*/""
			+ "SELECT a.name,b.title, concat(b.content,'x00x') as content,b.create_time"
			+ "\r\n	FROM tb_user a, tb_blog b             "
			+ "\r\n	WHERE a.id=b.user_id AND a.id             "
		+ "\r\n"/**}*/.trim()).in(ids);  
		
		//return q.getList(limit,offset);
		return q.getList(ResultSelectUserBlogsByList.class, limit, offset); 
	} 
	
	@Tx //Run this method in a transaction
	public void  updateUserBlog(int user_id,int blog_id){
		TbUser user=TbUser.SELECT().selectByPrimaryKey(user_id);
		TbBlog blog=TbBlog.SELECT().selectByPrimaryKey(blog_id);
		user.setName("new_name").update();
		blog.setContent("new_content_xxx").update();
	}
	
	//DataMap
	public Page<DataMap>  selectUserBlogsAsListMap(int user_id,int limit,int offset){
		Query q=TestDB.DB.createQuery();
		         
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title,b.content,b.create_time"
				+ "\r\n	DTestDB tb_user a, tb_blog b "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?		 "
		+ "\r\n"/**}*/, user_id);
		  
		return q.getPage(limit,offset);
	}
}

