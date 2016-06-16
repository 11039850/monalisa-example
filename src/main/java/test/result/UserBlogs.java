



package test.result;
 

import test.testdb.User;

import test.testdb.Blog;

import com.tsc9526.monalisa.core.annotation.Column;

 
/**
 * 
 * @see test.dao.UserBlogDao#selectUserBlogs(int)
 */
public class UserBlogs implements java.io.Serializable{
	private static final long serialVersionUID = 478337089611L;	
	final static String  FINGERPRINT = "000001F0DC85DBD3";
	  
	 
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
* <li><B>remarks:</B> 用户ID
*/
@Column(table=User.M.TABLE, jdbcType=4, name=User.M.id$name, key=User.M.id$key, auto=User.M.id$auto, notnull=User.M.id$notnull, length=User.M.id$length, value=User.M.id$value, remarks=User.M.id$remarks)
	private Integer id;	
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 用户名称
*/
@Column(table=User.M.TABLE, jdbcType=12, name=User.M.name$name, key=User.M.name$key, auto=User.M.name$auto, notnull=User.M.name$notnull, length=User.M.name$length, value=User.M.name$value, remarks=User.M.name$remarks)
	private String name;	
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 博客标题
*/
@Column(table=Blog.M.TABLE, jdbcType=12, name=Blog.M.title$name, key=Blog.M.title$key, auto=Blog.M.title$auto, notnull=Blog.M.title$notnull, length=Blog.M.title$length, value=Blog.M.title$value, remarks=Blog.M.title$remarks)
	private String title;	
	
	
	
	private String content;	
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
* <li><B>remarks:</B> 创建时间
*/
@Column(table=Blog.M.TABLE, jdbcType=93, name=Blog.M.createTime$name, key=Blog.M.createTime$key, auto=Blog.M.createTime$auto, notnull=Blog.M.createTime$notnull, length=Blog.M.createTime$length, value=Blog.M.createTime$value, remarks=Blog.M.createTime$remarks)
	private java.util.Date createTime;	
	
	
	
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
* <li><B>remarks:</B> 用户ID
*/
@Column(table=User.M.TABLE, jdbcType=4, name=User.M.id$name, key=User.M.id$key, auto=User.M.id$auto, notnull=User.M.id$notnull, length=User.M.id$length, value=User.M.id$value, remarks=User.M.id$remarks)
	public UserBlogs setId(Integer id){
		this.id = id;
		return this;
	}
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 用户名称
*/
@Column(table=User.M.TABLE, jdbcType=12, name=User.M.name$name, key=User.M.name$key, auto=User.M.name$auto, notnull=User.M.name$notnull, length=User.M.name$length, value=User.M.name$value, remarks=User.M.name$remarks)
	public UserBlogs setName(String name){
		this.name = name;
		return this;
	}
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 博客标题
*/
@Column(table=Blog.M.TABLE, jdbcType=12, name=Blog.M.title$name, key=Blog.M.title$key, auto=Blog.M.title$auto, notnull=Blog.M.title$notnull, length=Blog.M.title$length, value=Blog.M.title$value, remarks=Blog.M.title$remarks)
	public UserBlogs setTitle(String title){
		this.title = title;
		return this;
	}
	
	
	
	public UserBlogs setContent(String content){
		this.content = content;
		return this;
	}
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
* <li><B>remarks:</B> 创建时间
*/
@Column(table=Blog.M.TABLE, jdbcType=93, name=Blog.M.createTime$name, key=Blog.M.createTime$key, auto=Blog.M.createTime$auto, notnull=Blog.M.createTime$notnull, length=Blog.M.createTime$length, value=Blog.M.createTime$value, remarks=Blog.M.createTime$remarks)
	public UserBlogs setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
		return this;
	}
	
	
	
	 
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
* <li><B>remarks:</B> 用户ID
*/
@Column(table=User.M.TABLE, jdbcType=4, name=User.M.id$name, key=User.M.id$key, auto=User.M.id$auto, notnull=User.M.id$notnull, length=User.M.id$length, value=User.M.id$value, remarks=User.M.id$remarks)
	public Integer getId(){
		return this.id;		
	}
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
* <li><B>remarks:</B> 用户ID
* @param defaultValue  Return the default value if id is null.*/
@Column(table=User.M.TABLE, jdbcType=4, name=User.M.id$name, key=User.M.id$key, auto=User.M.id$auto, notnull=User.M.id$notnull, length=User.M.id$length, value=User.M.id$value, remarks=User.M.id$remarks)
	public Integer getId(Integer defaultValue){
		Integer r=this.getId();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 用户名称
*/
@Column(table=User.M.TABLE, jdbcType=12, name=User.M.name$name, key=User.M.name$key, auto=User.M.name$auto, notnull=User.M.name$notnull, length=User.M.name$length, value=User.M.name$value, remarks=User.M.name$remarks)
	public String getName(){
		return this.name;		
	}
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 用户名称
* @param defaultValue  Return the default value if name is null.*/
@Column(table=User.M.TABLE, jdbcType=12, name=User.M.name$name, key=User.M.name$key, auto=User.M.name$auto, notnull=User.M.name$notnull, length=User.M.name$length, value=User.M.name$value, remarks=User.M.name$remarks)
	public String getName(String defaultValue){
		String r=this.getName();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 博客标题
*/
@Column(table=Blog.M.TABLE, jdbcType=12, name=Blog.M.title$name, key=Blog.M.title$key, auto=Blog.M.title$auto, notnull=Blog.M.title$notnull, length=Blog.M.title$length, value=Blog.M.title$value, remarks=Blog.M.title$remarks)
	public String getTitle(){
		return this.title;		
	}
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
* <li><B>remarks:</B> 博客标题
* @param defaultValue  Return the default value if title is null.*/
@Column(table=Blog.M.TABLE, jdbcType=12, name=Blog.M.title$name, key=Blog.M.title$key, auto=Blog.M.title$auto, notnull=Blog.M.title$notnull, length=Blog.M.title$length, value=Blog.M.title$value, remarks=Blog.M.title$remarks)
	public String getTitle(String defaultValue){
		String r=this.getTitle();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	public String getContent(){
		return this.content;		
	}
	
	
	public String getContent(String defaultValue){
		String r=this.getContent();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
* <li><B>remarks:</B> 创建时间
*/
@Column(table=Blog.M.TABLE, jdbcType=93, name=Blog.M.createTime$name, key=Blog.M.createTime$key, auto=Blog.M.createTime$auto, notnull=Blog.M.createTime$notnull, length=Blog.M.createTime$length, value=Blog.M.createTime$value, remarks=Blog.M.createTime$remarks)
	public java.util.Date getCreateTime(){
		return this.createTime;		
	}
	
	/**
* @Column
* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
* <li><B>remarks:</B> 创建时间
* @param defaultValue  Return the default value if createTime is null.*/
@Column(table=Blog.M.TABLE, jdbcType=93, name=Blog.M.createTime$name, key=Blog.M.createTime$key, auto=Blog.M.createTime$auto, notnull=Blog.M.createTime$notnull, length=Blog.M.createTime$length, value=Blog.M.createTime$value, remarks=Blog.M.createTime$remarks)
	public java.util.Date getCreateTime(java.util.Date defaultValue){
		java.util.Date r=this.getCreateTime();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
		 
}
 
