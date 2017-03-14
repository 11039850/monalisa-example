package example.web.dao.userblogdao;
 

import example.db.testdb.TbUser;
import example.db.testdb.TbBlog;
import com.tsc9526.monalisa.orm.annotation.Column;
  
/**
 * Auto generated code by monalisa 2.0.0-SNAPSHOT
 *
 * @see example.web.dao.UserBlogDao#selectUserBlogsByList(example.web.dao.List<Integer>, int, int)
 */
public class ResultSelectUserBlogsByList implements java.io.Serializable{
	private static final long serialVersionUID = 576553765467L;	
	final static String  FINGERPRINT = "000002E94583EC3B";
	  
	 
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> user name
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.name$name, key=TbUser.M.name$key, auto=TbUser.M.name$auto, notnull=TbUser.M.name$notnull, length=TbUser.M.name$length, value=TbUser.M.name$value, remarks=TbUser.M.name$remarks)
	private String name;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> title of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=12, name=TbBlog.M.title$name, key=TbBlog.M.title$key, auto=TbBlog.M.title$auto, notnull=TbBlog.M.title$notnull, length=TbBlog.M.title$length, value=TbBlog.M.title$value, remarks=TbBlog.M.title$remarks)
	private String title;	
	
	
	
	private String content;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
	* <li><B>remarks:</B> create time
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=93, name=TbBlog.M.createTime$name, key=TbBlog.M.createTime$key, auto=TbBlog.M.createTime$auto, notnull=TbBlog.M.createTime$notnull, length=TbBlog.M.createTime$length, value=TbBlog.M.createTime$value, remarks=TbBlog.M.createTime$remarks)
	private java.util.Date createTime;	
	
	
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> user name
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.name$name, key=TbUser.M.name$key, auto=TbUser.M.name$auto, notnull=TbUser.M.name$notnull, length=TbUser.M.name$length, value=TbUser.M.name$value, remarks=TbUser.M.name$remarks)
	public ResultSelectUserBlogsByList setName(String name){
		this.name = name;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> title of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=12, name=TbBlog.M.title$name, key=TbBlog.M.title$key, auto=TbBlog.M.title$auto, notnull=TbBlog.M.title$notnull, length=TbBlog.M.title$length, value=TbBlog.M.title$value, remarks=TbBlog.M.title$remarks)
	public ResultSelectUserBlogsByList setTitle(String title){
		this.title = title;
		return this;
	}
	
	
	
	public ResultSelectUserBlogsByList setContent(String content){
		this.content = content;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
	* <li><B>remarks:</B> create time
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=93, name=TbBlog.M.createTime$name, key=TbBlog.M.createTime$key, auto=TbBlog.M.createTime$auto, notnull=TbBlog.M.createTime$notnull, length=TbBlog.M.createTime$length, value=TbBlog.M.createTime$value, remarks=TbBlog.M.createTime$remarks)
	public ResultSelectUserBlogsByList setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
		return this;
	}
	
	
	
	 
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> user name
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.name$name, key=TbUser.M.name$key, auto=TbUser.M.name$auto, notnull=TbUser.M.name$notnull, length=TbUser.M.name$length, value=TbUser.M.name$value, remarks=TbUser.M.name$remarks)
	public String getName(){
		return this.name;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> user name
	* @param defaultValue  Return the default value if name is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.name$name, key=TbUser.M.name$key, auto=TbUser.M.name$auto, notnull=TbUser.M.name$notnull, length=TbUser.M.name$length, value=TbUser.M.name$value, remarks=TbUser.M.name$remarks)
	public String getName(String defaultValue){
		String r=this.getName();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> title of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=12, name=TbBlog.M.title$name, key=TbBlog.M.title$key, auto=TbBlog.M.title$auto, notnull=TbBlog.M.title$notnull, length=TbBlog.M.title$length, value=TbBlog.M.title$value, remarks=TbBlog.M.title$remarks)
	public String getTitle(){
		return this.title;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> title of the blog
	* @param defaultValue  Return the default value if title is null.*/
	@Column(table=TbBlog.M.TABLE, jdbcType=12, name=TbBlog.M.title$name, key=TbBlog.M.title$key, auto=TbBlog.M.title$auto, notnull=TbBlog.M.title$notnull, length=TbBlog.M.title$length, value=TbBlog.M.title$value, remarks=TbBlog.M.title$remarks)
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
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
	* <li><B>remarks:</B> create time
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=93, name=TbBlog.M.createTime$name, key=TbBlog.M.createTime$key, auto=TbBlog.M.createTime$auto, notnull=TbBlog.M.createTime$notnull, length=TbBlog.M.createTime$length, value=TbBlog.M.createTime$value, remarks=TbBlog.M.createTime$remarks)
	public java.util.Date getCreateTime(){
		return this.createTime;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> create_time &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 19<br>
	* <li><B>remarks:</B> create time
	* @param defaultValue  Return the default value if createTime is null.*/
	@Column(table=TbBlog.M.TABLE, jdbcType=93, name=TbBlog.M.createTime$name, key=TbBlog.M.createTime$key, auto=TbBlog.M.createTime$auto, notnull=TbBlog.M.createTime$notnull, length=TbBlog.M.createTime$length, value=TbBlog.M.createTime$value, remarks=TbBlog.M.createTime$remarks)
	public java.util.Date getCreateTime(java.util.Date defaultValue){
		java.util.Date r=this.getCreateTime();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
		 
}
 
