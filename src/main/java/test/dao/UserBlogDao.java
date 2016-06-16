package test.dao;

import java.util.List;

import test.TestDB; 

import com.tsc9526.monalisa.core.annotation.Select;
import com.tsc9526.monalisa.core.annotation.Tx;
import com.tsc9526.monalisa.core.query.Query;

import test.result.UserBlogs; 
import test.testdb.Blog;
import test.testdb.User;

/**
 * 数据访问类
 */
public class UserBlogDao {
	final static long $VERSION$= 1L; //!!! 版本号, 每次保存为自动 +1
	
	@Select(name="test.result.UserBlogs") //自动生成结果类, 如果不指定name, 则默认值为: Result + 方法名
	public List<UserBlogs>  selectUserBlogs(int user_id){ //!!! 保存后会自动修改该方法的返回类型为： List<UserBlogs>
		Query q=TestDB.DB.createQuery();
		           
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title, concat(b.content,'x00x') as content,b.create_time"
				+ "\r\n	FROM user a, blog b   "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?"
		+ "\r\n"/**}*/, user_id);
		 
		return q.getList(UserBlogs.class); //!!! 保存后会自动修改返回类型为: UserBlogs.class
	} 
	
	@Tx  //在一个事务中运行这个方法
	public void  updateUserBlog(int user_id,int blog_id){
		User user=User.SELECT().selectByPrimaryKey(user_id);
		Blog blog=Blog.SELECT().selectByPrimaryKey(blog_id);
		
		user.setName("new name").update();
		blog.setContent("new content").update();
	}
}
