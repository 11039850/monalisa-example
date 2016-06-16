package test.dao;

import java.util.List;

import test.TestDB; 

import com.tsc9526.monalisa.core.annotation.Select;
import com.tsc9526.monalisa.core.annotation.Tx;
import com.tsc9526.monalisa.core.query.Query;

import test.result.UserBlogs; 
import test.testdb.Blog;
import test.testdb.User;

public class UserBlogDao {
	final static long $VERSION$= 1L; 
	 
	@Select(name="test.result.UserBlogs")
	public List<UserBlogs>  selectUserBlogs(int user_id){
		Query q=TestDB.DB.createQuery();
		          
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title, concat(b.content,'x==x') as content,b.create_time"
				+ "\r\n	FROM user a, blog b   "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?		"
		+ "\r\n"/**}*/, user_id);
		 
		return q.getList(UserBlogs.class);
	} 
	
	@Tx 
	public void  updateUserBlog(int user_id,int blog_id){
		User user=User.SELECT().selectByPrimaryKey(user_id);
		Blog blog=Blog.SELECT().selectByPrimaryKey(blog_id);
		
		user.setName("new name").update();
		blog.setContent("new content").update();
	}
}
