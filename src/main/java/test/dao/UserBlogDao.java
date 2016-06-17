package test.dao;

import java.util.List;

import test.TestDB;
import test.dao.userblogdao.ResultSelectUserBlogsOne;
import test.result.UserBlogs;
import test.testdb.Blog;
import test.testdb.User;

import com.tsc9526.monalisa.core.annotation.Select;
import com.tsc9526.monalisa.core.annotation.Tx;
import com.tsc9526.monalisa.core.query.DataMap;
import com.tsc9526.monalisa.core.query.Page;
import com.tsc9526.monalisa.core.query.Query;

/**
 * 数据访问类
 */
public class UserBlogDao {
	final static long $VERSION$= 18L; //!!! 版本号, 每次保存为自动 +1
	
	//@Select 注解指示该方法需自动生成结果类
	//默认类名: Result + 方法名， 默认包名：数据访问类的包名+"."+数据访问类的名称(小写)
	//可选参数：name 指定生成结果类的名称
	@Select(name="test.result.UserBlogs") 
	
	//!!! 保存后会自动修改该函数的返回值为： List -> List<UserBlogs>
	//第一次编写时，由于结果类还不存在, 为了保证能够编译正常, 函数的返回值 和 查询结果要用 泛值 替代, 保存后，插件会自动修改
	//函数的返回值 和 查询结果 泛值的对应关系分三类如下：
	//1. List查询
	//public DataTable   method_name(...){... return Query.getList();   }    或
	//public List        method_name(...){... return Query.getList();   }    
	//
	//2. Page查询
	//public Page   method_name(...){... return Query.Page();      }
	//
	//3. 单条记录
	//public Object method_name(...){... return Query.getResult(); }
	//
	public List<UserBlogs>  selectUserBlogs(int user_id){ 
		Query q=TestDB.DB.createQuery();
		           
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title, concat(b.content,'x00x') as content,b.create_time"
				+ "\r\n	FROM user a, blog b   "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?"
		+ "\r\n"/**}*/, user_id);
		 
		//!!! 保存后会自动修改 查询结果为: getList() -> getList<UserBlogs.class>
		return q.getList(UserBlogs.class); 
	} 
	
	
	@Select //自动产生结果类: test.dao.userblogdao.ResultSelectUserBlogsOne
	public ResultSelectUserBlogsOne  selectUserBlogsOne(int user_id){ 
		Query q=TestDB.DB.createQuery();
		           
		q.add(""+/**~{*/""
				+ "SELECT a.id,a.name,b.title, concat(b.content,'x00x') as content,b.create_time"
				+ "\r\n	FROM user a, blog b   "
				+ "\r\n	WHERE a.id=b.user_id AND a.id=?"
		+ "\r\n"/**}*/, user_id);
		 
		return q.getResult(ResultSelectUserBlogsOne.class);
	} 
	
	@Tx  //在一个事务中运行这个方法
	public void  updateUserBlog(int user_id,int blog_id){
		User user=User.SELECT().selectByPrimaryKey(user_id);
		Blog blog=Blog.SELECT().selectByPrimaryKey(blog_id);
		
		user.setName("new name").update();
		blog.setContent("new content").update();
	}
	
	//使用Map存储查询结果
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
