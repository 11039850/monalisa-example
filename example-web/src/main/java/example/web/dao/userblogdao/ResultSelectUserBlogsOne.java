package example.web.dao.userblogdao;
 

import example.db.db1.TbUser;
import com.tsc9526.monalisa.tools.io.MelpFile;
import java.io.File;
import com.google.gson.JsonObject;
import example.db.vo.Address;
import example.db.vo.Group;
import example.db.db1.TbBlog;
import com.tsc9526.monalisa.orm.annotation.Column;
import com.tsc9526.monalisa.orm.datasource.DBConfig;
  
/**
 * Auto generated code by monalisa 2.0.0-SNAPSHOT
 *
 * @see example.web.dao.UserBlogDao#selectUserBlogsOne(int)
 */
public class ResultSelectUserBlogsOne implements java.io.Serializable{
	private static final long serialVersionUID = 1393591269749L;	
	final static String  FINGERPRINT = "0000019D936EADA6";
	  
	 
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.id$name, key=TbUser.M.id$key, auto=TbUser.M.id$auto, notnull=TbUser.M.id$notnull, length=TbUser.M.id$length, value=TbUser.M.id$value, remarks=TbUser.M.id$remarks)
	private Integer id;	
	
	
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
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> passwd
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64 &nbsp;<B>value:</B> 123456<br>
	* <li><B>remarks:</B> user password
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.passwd$name, key=TbUser.M.passwd$key, auto=TbUser.M.passwd$auto, notnull=TbUser.M.passwd$notnull, length=TbUser.M.passwd$length, value=TbUser.M.passwd$value, remarks=TbUser.M.passwd$remarks)
	private String passwd;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fa
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> file path.    #file{monalisa/tmp/fa}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fa$name, key=TbUser.M.fa$key, auto=TbUser.M.fa$auto, notnull=TbUser.M.fa$notnull, length=TbUser.M.fa$length, value=TbUser.M.fa$value, remarks=TbUser.M.fa$remarks)
	private String fa;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fb
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> var path.    #file{${dbcfg.file.path}/fb}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fb$name, key=TbUser.M.fb$key, auto=TbUser.M.fb$auto, notnull=TbUser.M.fb$notnull, length=TbUser.M.fb$length, value=TbUser.M.fb$value, remarks=TbUser.M.fb$remarks)
	private String fb;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> json
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> json object.  #json{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.json$name, key=TbUser.M.json$key, auto=TbUser.M.json$auto, notnull=TbUser.M.json$notnull, length=TbUser.M.json$length, value=TbUser.M.json$value, remarks=TbUser.M.json$remarks)
	private JsonObject json;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> address
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> java bean.    #json{example.db.vo.Address}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.address$name, key=TbUser.M.address$key, auto=TbUser.M.address$auto, notnull=TbUser.M.address$notnull, length=TbUser.M.address$length, value=TbUser.M.address$value, remarks=TbUser.M.address$remarks)
	private Address address;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> phones
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string array. #array{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.phones$name, key=TbUser.M.phones$key, auto=TbUser.M.phones$auto, notnull=TbUser.M.phones$notnull, length=TbUser.M.phones$length, value=TbUser.M.phones$value, remarks=TbUser.M.phones$remarks)
	private String[] phones;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> favorite
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> int array.    #array{int}   (int may be: int/long/float/double)
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.favorite$name, key=TbUser.M.favorite$key, auto=TbUser.M.favorite$auto, notnull=TbUser.M.favorite$notnull, length=TbUser.M.favorite$length, value=TbUser.M.favorite$value, remarks=TbUser.M.favorite$remarks)
	private int[] favorite;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> groups &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string enum.  #enum{example.db.vo.Group}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.groups$name, key=TbUser.M.groups$key, auto=TbUser.M.groups$auto, notnull=TbUser.M.groups$notnull, length=TbUser.M.groups$length, value=TbUser.M.groups$value, remarks=TbUser.M.groups$remarks)
	private Group groups;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> sex &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 16<br>
	* <li><B>remarks:</B> boolean.      #enum{{ MALE, FEMALE }}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.sex$name, key=TbUser.M.sex$key, auto=TbUser.M.sex$auto, notnull=TbUser.M.sex$notnull, length=TbUser.M.sex$length, value=TbUser.M.sex$value, remarks=TbUser.M.sex$remarks)
	private TbUser.Sex sex;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10 &nbsp;<B>value:</B> 1<br>
	* <li><B>remarks:</B> int enum.     #boolean{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.status$name, key=TbUser.M.status$key, auto=TbUser.M.status$auto, notnull=TbUser.M.status$notnull, length=TbUser.M.status$length, value=TbUser.M.status$value, remarks=TbUser.M.status$remarks)
	private Boolean status;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> the Blog ID
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.id$name, key=TbBlog.M.id$key, auto=TbBlog.M.id$auto, notnull=TbBlog.M.id$notnull, length=TbBlog.M.id$length, value=TbBlog.M.id$value, remarks=TbBlog.M.id$remarks)
	private Integer id1;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> user_id &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.userId$name, key=TbBlog.M.userId$key, auto=TbBlog.M.userId$auto, notnull=TbBlog.M.userId$notnull, length=TbBlog.M.userId$length, value=TbBlog.M.userId$value, remarks=TbBlog.M.userId$remarks)
	private Integer userId;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> title of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=12, name=TbBlog.M.title$name, key=TbBlog.M.title$key, auto=TbBlog.M.title$auto, notnull=TbBlog.M.title$notnull, length=TbBlog.M.title$length, value=TbBlog.M.title$value, remarks=TbBlog.M.title$remarks)
	private String title;	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> content
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 65535<br>
	* <li><B>remarks:</B> content of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=-1, name=TbBlog.M.content$name, key=TbBlog.M.content$key, auto=TbBlog.M.content$auto, notnull=TbBlog.M.content$notnull, length=TbBlog.M.content$length, value=TbBlog.M.content$value, remarks=TbBlog.M.content$remarks)
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
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> blog status: 0-diable, 1-normal
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.status$name, key=TbBlog.M.status$key, auto=TbBlog.M.status$auto, notnull=TbBlog.M.status$notnull, length=TbBlog.M.status$length, value=TbBlog.M.status$value, remarks=TbBlog.M.status$remarks)
	private Integer status1;	
	
	
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.id$name, key=TbUser.M.id$key, auto=TbUser.M.id$auto, notnull=TbUser.M.id$notnull, length=TbUser.M.id$length, value=TbUser.M.id$value, remarks=TbUser.M.id$remarks)
	public ResultSelectUserBlogsOne setId(Integer id){
		this.id = id;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> name &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> user name
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.name$name, key=TbUser.M.name$key, auto=TbUser.M.name$auto, notnull=TbUser.M.name$notnull, length=TbUser.M.name$length, value=TbUser.M.name$value, remarks=TbUser.M.name$remarks)
	public ResultSelectUserBlogsOne setName(String name){
		this.name = name;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> passwd
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64 &nbsp;<B>value:</B> 123456<br>
	* <li><B>remarks:</B> user password
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.passwd$name, key=TbUser.M.passwd$key, auto=TbUser.M.passwd$auto, notnull=TbUser.M.passwd$notnull, length=TbUser.M.passwd$length, value=TbUser.M.passwd$value, remarks=TbUser.M.passwd$remarks)
	public ResultSelectUserBlogsOne setPasswd(String passwd){
		this.passwd = passwd;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fa
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> file path.    #file{monalisa/tmp/fa}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fa$name, key=TbUser.M.fa$key, auto=TbUser.M.fa$auto, notnull=TbUser.M.fa$notnull, length=TbUser.M.fa$length, value=TbUser.M.fa$value, remarks=TbUser.M.fa$remarks)
	public ResultSelectUserBlogsOne setFa(String fa){
		this.fa = fa;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fb
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> var path.    #file{${dbcfg.file.path}/fb}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fb$name, key=TbUser.M.fb$key, auto=TbUser.M.fb$auto, notnull=TbUser.M.fb$notnull, length=TbUser.M.fb$length, value=TbUser.M.fb$value, remarks=TbUser.M.fb$remarks)
	public ResultSelectUserBlogsOne setFb(String fb){
		this.fb = fb;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> json
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> json object.  #json{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.json$name, key=TbUser.M.json$key, auto=TbUser.M.json$auto, notnull=TbUser.M.json$notnull, length=TbUser.M.json$length, value=TbUser.M.json$value, remarks=TbUser.M.json$remarks)
	public ResultSelectUserBlogsOne setJson(JsonObject json){
		this.json = json;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> address
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> java bean.    #json{example.db.vo.Address}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.address$name, key=TbUser.M.address$key, auto=TbUser.M.address$auto, notnull=TbUser.M.address$notnull, length=TbUser.M.address$length, value=TbUser.M.address$value, remarks=TbUser.M.address$remarks)
	public ResultSelectUserBlogsOne setAddress(Address address){
		this.address = address;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> phones
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string array. #array{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.phones$name, key=TbUser.M.phones$key, auto=TbUser.M.phones$auto, notnull=TbUser.M.phones$notnull, length=TbUser.M.phones$length, value=TbUser.M.phones$value, remarks=TbUser.M.phones$remarks)
	public ResultSelectUserBlogsOne setPhones(String[] phones){
		this.phones = phones;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> favorite
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> int array.    #array{int}   (int may be: int/long/float/double)
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.favorite$name, key=TbUser.M.favorite$key, auto=TbUser.M.favorite$auto, notnull=TbUser.M.favorite$notnull, length=TbUser.M.favorite$length, value=TbUser.M.favorite$value, remarks=TbUser.M.favorite$remarks)
	public ResultSelectUserBlogsOne setFavorite(int[] favorite){
		this.favorite = favorite;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> groups &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string enum.  #enum{example.db.vo.Group}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.groups$name, key=TbUser.M.groups$key, auto=TbUser.M.groups$auto, notnull=TbUser.M.groups$notnull, length=TbUser.M.groups$length, value=TbUser.M.groups$value, remarks=TbUser.M.groups$remarks)
	public ResultSelectUserBlogsOne setGroups(Group groups){
		this.groups = groups;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> sex &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 16<br>
	* <li><B>remarks:</B> boolean.      #enum{{ MALE, FEMALE }}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.sex$name, key=TbUser.M.sex$key, auto=TbUser.M.sex$auto, notnull=TbUser.M.sex$notnull, length=TbUser.M.sex$length, value=TbUser.M.sex$value, remarks=TbUser.M.sex$remarks)
	public ResultSelectUserBlogsOne setSex(TbUser.Sex sex){
		this.sex = sex;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10 &nbsp;<B>value:</B> 1<br>
	* <li><B>remarks:</B> int enum.     #boolean{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.status$name, key=TbUser.M.status$key, auto=TbUser.M.status$auto, notnull=TbUser.M.status$notnull, length=TbUser.M.status$length, value=TbUser.M.status$value, remarks=TbUser.M.status$remarks)
	public ResultSelectUserBlogsOne setStatus(Boolean status){
		this.status = status;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> the Blog ID
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.id$name, key=TbBlog.M.id$key, auto=TbBlog.M.id$auto, notnull=TbBlog.M.id$notnull, length=TbBlog.M.id$length, value=TbBlog.M.id$value, remarks=TbBlog.M.id$remarks)
	public ResultSelectUserBlogsOne setId1(Integer id1){
		this.id1 = id1;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> user_id &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.userId$name, key=TbBlog.M.userId$key, auto=TbBlog.M.userId$auto, notnull=TbBlog.M.userId$notnull, length=TbBlog.M.userId$length, value=TbBlog.M.userId$value, remarks=TbBlog.M.userId$remarks)
	public ResultSelectUserBlogsOne setUserId(Integer userId){
		this.userId = userId;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> title &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> title of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=12, name=TbBlog.M.title$name, key=TbBlog.M.title$key, auto=TbBlog.M.title$auto, notnull=TbBlog.M.title$notnull, length=TbBlog.M.title$length, value=TbBlog.M.title$value, remarks=TbBlog.M.title$remarks)
	public ResultSelectUserBlogsOne setTitle(String title){
		this.title = title;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> content
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 65535<br>
	* <li><B>remarks:</B> content of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=-1, name=TbBlog.M.content$name, key=TbBlog.M.content$key, auto=TbBlog.M.content$auto, notnull=TbBlog.M.content$notnull, length=TbBlog.M.content$length, value=TbBlog.M.content$value, remarks=TbBlog.M.content$remarks)
	public ResultSelectUserBlogsOne setContent(String content){
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
	public ResultSelectUserBlogsOne setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
		return this;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> blog status: 0-diable, 1-normal
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.status$name, key=TbBlog.M.status$key, auto=TbBlog.M.status$auto, notnull=TbBlog.M.status$notnull, length=TbBlog.M.status$length, value=TbBlog.M.status$value, remarks=TbBlog.M.status$remarks)
	public ResultSelectUserBlogsOne setStatus1(Integer status1){
		this.status1 = status1;
		return this;
	}
	
	
	
	 
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.id$name, key=TbUser.M.id$key, auto=TbUser.M.id$auto, notnull=TbUser.M.id$notnull, length=TbUser.M.id$length, value=TbUser.M.id$value, remarks=TbUser.M.id$remarks)
	public Integer getId(){
		return this.id;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	* @param defaultValue  Return the default value if id is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.id$name, key=TbUser.M.id$key, auto=TbUser.M.id$auto, notnull=TbUser.M.id$notnull, length=TbUser.M.id$length, value=TbUser.M.id$value, remarks=TbUser.M.id$remarks)
	public Integer getId(Integer defaultValue){
		Integer r=this.getId();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
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
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> passwd
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64 &nbsp;<B>value:</B> 123456<br>
	* <li><B>remarks:</B> user password
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.passwd$name, key=TbUser.M.passwd$key, auto=TbUser.M.passwd$auto, notnull=TbUser.M.passwd$notnull, length=TbUser.M.passwd$length, value=TbUser.M.passwd$value, remarks=TbUser.M.passwd$remarks)
	public String getPasswd(){
		return this.passwd;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> passwd
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64 &nbsp;<B>value:</B> 123456<br>
	* <li><B>remarks:</B> user password
	* @param defaultValue  Return the default value if passwd is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.passwd$name, key=TbUser.M.passwd$key, auto=TbUser.M.passwd$auto, notnull=TbUser.M.passwd$notnull, length=TbUser.M.passwd$length, value=TbUser.M.passwd$value, remarks=TbUser.M.passwd$remarks)
	public String getPasswd(String defaultValue){
		String r=this.getPasswd();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fa
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> file path.    #file{monalisa/tmp/fa}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fa$name, key=TbUser.M.fa$key, auto=TbUser.M.fa$auto, notnull=TbUser.M.fa$notnull, length=TbUser.M.fa$length, value=TbUser.M.fa$value, remarks=TbUser.M.fa$remarks)
	public String getFa(){
		return this.fa;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fa
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> file path.    #file{monalisa/tmp/fa}
	* @param defaultValue  Return the default value if fa is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fa$name, key=TbUser.M.fa$key, auto=TbUser.M.fa$auto, notnull=TbUser.M.fa$notnull, length=TbUser.M.fa$length, value=TbUser.M.fa$value, remarks=TbUser.M.fa$remarks)
	public String getFa(String defaultValue){
		String r=this.getFa();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fa
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> file path.    #file{monalisa/tmp/fa}
	* @param charset  read file content using this charset.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fa$name, key=TbUser.M.fa$key, auto=TbUser.M.fa$auto, notnull=TbUser.M.fa$notnull, length=TbUser.M.fa$length, value=TbUser.M.fa$value, remarks=TbUser.M.fa$remarks) 
	public String getFaAsString(String charset){
		String r=this.getFa();
		
		if(r==null){
			return null;
		}
		
		DBConfig db=DBConfig.fromClass(TbUser.class);
		String filepath=MelpFile.combinePath("monalisa/tmp/fa",r);
		filepath=db.getCfg().parseFilePath(filepath);
		return MelpFile.readToString(new File(filepath),charset);
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fa
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> file path.    #file{monalisa/tmp/fa}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fa$name, key=TbUser.M.fa$key, auto=TbUser.M.fa$auto, notnull=TbUser.M.fa$notnull, length=TbUser.M.fa$length, value=TbUser.M.fa$value, remarks=TbUser.M.fa$remarks) 
	public String getFaAsStringUTF8(){
		return getFaAsString("utf-8");
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fa
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> file path.    #file{monalisa/tmp/fa}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fa$name, key=TbUser.M.fa$key, auto=TbUser.M.fa$auto, notnull=TbUser.M.fa$notnull, length=TbUser.M.fa$length, value=TbUser.M.fa$value, remarks=TbUser.M.fa$remarks) 
	public byte[] getFaAsBytes(){
		String r=this.getFa();
		
		if(r==null){
			return null;
		}
		
		DBConfig db=DBConfig.fromClass(TbUser.class);
		String filepath=MelpFile.combinePath("monalisa/tmp/fa",r);
		filepath=db.getCfg().parseFilePath(filepath);
		return MelpFile.readFile(new File(filepath));
	}
	
	public File getFaAsFile(){
		String r=this.getFa();
		
		if(r==null){
			return null;
		}
		
		DBConfig db=DBConfig.fromClass(TbUser.class);
		String filepath=MelpFile.combinePath("monalisa/tmp/fa",r);
		filepath=db.getCfg().parseFilePath(filepath);
		return new File(filepath);
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fb
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> var path.    #file{${dbcfg.file.path}/fb}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fb$name, key=TbUser.M.fb$key, auto=TbUser.M.fb$auto, notnull=TbUser.M.fb$notnull, length=TbUser.M.fb$length, value=TbUser.M.fb$value, remarks=TbUser.M.fb$remarks)
	public String getFb(){
		return this.fb;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fb
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> var path.    #file{${dbcfg.file.path}/fb}
	* @param defaultValue  Return the default value if fb is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fb$name, key=TbUser.M.fb$key, auto=TbUser.M.fb$auto, notnull=TbUser.M.fb$notnull, length=TbUser.M.fb$length, value=TbUser.M.fb$value, remarks=TbUser.M.fb$remarks)
	public String getFb(String defaultValue){
		String r=this.getFb();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fb
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> var path.    #file{${dbcfg.file.path}/fb}
	* @param charset  read file content using this charset.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fb$name, key=TbUser.M.fb$key, auto=TbUser.M.fb$auto, notnull=TbUser.M.fb$notnull, length=TbUser.M.fb$length, value=TbUser.M.fb$value, remarks=TbUser.M.fb$remarks) 
	public String getFbAsString(String charset){
		String r=this.getFb();
		
		if(r==null){
			return null;
		}
		
		DBConfig db=DBConfig.fromClass(TbUser.class);
		String filepath=MelpFile.combinePath("${dbcfg.file.path}/fb",r);
		filepath=db.getCfg().parseFilePath(filepath);
		return MelpFile.readToString(new File(filepath),charset);
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fb
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> var path.    #file{${dbcfg.file.path}/fb}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fb$name, key=TbUser.M.fb$key, auto=TbUser.M.fb$auto, notnull=TbUser.M.fb$notnull, length=TbUser.M.fb$length, value=TbUser.M.fb$value, remarks=TbUser.M.fb$remarks) 
	public String getFbAsStringUTF8(){
		return getFbAsString("utf-8");
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> fb
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> var path.    #file{${dbcfg.file.path}/fb}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.fb$name, key=TbUser.M.fb$key, auto=TbUser.M.fb$auto, notnull=TbUser.M.fb$notnull, length=TbUser.M.fb$length, value=TbUser.M.fb$value, remarks=TbUser.M.fb$remarks) 
	public byte[] getFbAsBytes(){
		String r=this.getFb();
		
		if(r==null){
			return null;
		}
		
		DBConfig db=DBConfig.fromClass(TbUser.class);
		String filepath=MelpFile.combinePath("${dbcfg.file.path}/fb",r);
		filepath=db.getCfg().parseFilePath(filepath);
		return MelpFile.readFile(new File(filepath));
	}
	
	public File getFbAsFile(){
		String r=this.getFb();
		
		if(r==null){
			return null;
		}
		
		DBConfig db=DBConfig.fromClass(TbUser.class);
		String filepath=MelpFile.combinePath("${dbcfg.file.path}/fb",r);
		filepath=db.getCfg().parseFilePath(filepath);
		return new File(filepath);
	}
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> json
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> json object.  #json{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.json$name, key=TbUser.M.json$key, auto=TbUser.M.json$auto, notnull=TbUser.M.json$notnull, length=TbUser.M.json$length, value=TbUser.M.json$value, remarks=TbUser.M.json$remarks)
	public JsonObject getJson(){
		return this.json;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> json
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 64<br>
	* <li><B>remarks:</B> json object.  #json{}
	* @param defaultValue  Return the default value if json is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.json$name, key=TbUser.M.json$key, auto=TbUser.M.json$auto, notnull=TbUser.M.json$notnull, length=TbUser.M.json$length, value=TbUser.M.json$value, remarks=TbUser.M.json$remarks)
	public JsonObject getJson(JsonObject defaultValue){
		JsonObject r=this.getJson();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> address
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> java bean.    #json{example.db.vo.Address}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.address$name, key=TbUser.M.address$key, auto=TbUser.M.address$auto, notnull=TbUser.M.address$notnull, length=TbUser.M.address$length, value=TbUser.M.address$value, remarks=TbUser.M.address$remarks)
	public Address getAddress(){
		return this.address;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> address
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> java bean.    #json{example.db.vo.Address}
	* @param defaultValue  Return the default value if address is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.address$name, key=TbUser.M.address$key, auto=TbUser.M.address$auto, notnull=TbUser.M.address$notnull, length=TbUser.M.address$length, value=TbUser.M.address$value, remarks=TbUser.M.address$remarks)
	public Address getAddress(Address defaultValue){
		Address r=this.getAddress();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> phones
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string array. #array{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.phones$name, key=TbUser.M.phones$key, auto=TbUser.M.phones$auto, notnull=TbUser.M.phones$notnull, length=TbUser.M.phones$length, value=TbUser.M.phones$value, remarks=TbUser.M.phones$remarks)
	public String[] getPhones(){
		return this.phones;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> phones
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string array. #array{}
	* @param defaultValue  Return the default value if phones is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.phones$name, key=TbUser.M.phones$key, auto=TbUser.M.phones$auto, notnull=TbUser.M.phones$notnull, length=TbUser.M.phones$length, value=TbUser.M.phones$value, remarks=TbUser.M.phones$remarks)
	public String[] getPhones(String[] defaultValue){
		String[] r=this.getPhones();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> favorite
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> int array.    #array{int}   (int may be: int/long/float/double)
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.favorite$name, key=TbUser.M.favorite$key, auto=TbUser.M.favorite$auto, notnull=TbUser.M.favorite$notnull, length=TbUser.M.favorite$length, value=TbUser.M.favorite$value, remarks=TbUser.M.favorite$remarks)
	public int[] getFavorite(){
		return this.favorite;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> favorite
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> int array.    #array{int}   (int may be: int/long/float/double)
	* @param defaultValue  Return the default value if favorite is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.favorite$name, key=TbUser.M.favorite$key, auto=TbUser.M.favorite$auto, notnull=TbUser.M.favorite$notnull, length=TbUser.M.favorite$length, value=TbUser.M.favorite$value, remarks=TbUser.M.favorite$remarks)
	public int[] getFavorite(int[] defaultValue){
		int[] r=this.getFavorite();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> groups &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string enum.  #enum{example.db.vo.Group}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.groups$name, key=TbUser.M.groups$key, auto=TbUser.M.groups$auto, notnull=TbUser.M.groups$notnull, length=TbUser.M.groups$length, value=TbUser.M.groups$value, remarks=TbUser.M.groups$remarks)
	public Group getGroups(){
		return this.groups;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> groups &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 255<br>
	* <li><B>remarks:</B> string enum.  #enum{example.db.vo.Group}
	* @param defaultValue  Return the default value if groups is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.groups$name, key=TbUser.M.groups$key, auto=TbUser.M.groups$auto, notnull=TbUser.M.groups$notnull, length=TbUser.M.groups$length, value=TbUser.M.groups$value, remarks=TbUser.M.groups$remarks)
	public Group getGroups(Group defaultValue){
		Group r=this.getGroups();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> sex &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 16<br>
	* <li><B>remarks:</B> boolean.      #enum{{ MALE, FEMALE }}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.sex$name, key=TbUser.M.sex$key, auto=TbUser.M.sex$auto, notnull=TbUser.M.sex$notnull, length=TbUser.M.sex$length, value=TbUser.M.sex$value, remarks=TbUser.M.sex$remarks)
	public TbUser.Sex getSex(){
		return this.sex;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> sex &nbsp;[<font color=red>ENUM</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 16<br>
	* <li><B>remarks:</B> boolean.      #enum{{ MALE, FEMALE }}
	* @param defaultValue  Return the default value if sex is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=12, name=TbUser.M.sex$name, key=TbUser.M.sex$key, auto=TbUser.M.sex$auto, notnull=TbUser.M.sex$notnull, length=TbUser.M.sex$length, value=TbUser.M.sex$value, remarks=TbUser.M.sex$remarks)
	public TbUser.Sex getSex(TbUser.Sex defaultValue){
		TbUser.Sex r=this.getSex();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10 &nbsp;<B>value:</B> 1<br>
	* <li><B>remarks:</B> int enum.     #boolean{}
	*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.status$name, key=TbUser.M.status$key, auto=TbUser.M.status$auto, notnull=TbUser.M.status$notnull, length=TbUser.M.status$length, value=TbUser.M.status$value, remarks=TbUser.M.status$remarks)
	public Boolean isStatus(){
		return this.status;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_user&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10 &nbsp;<B>value:</B> 1<br>
	* <li><B>remarks:</B> int enum.     #boolean{}
	* @param defaultValue  Return the default value if status is null.*/
	@Column(table=TbUser.M.TABLE, jdbcType=4, name=TbUser.M.status$name, key=TbUser.M.status$key, auto=TbUser.M.status$auto, notnull=TbUser.M.status$notnull, length=TbUser.M.status$length, value=TbUser.M.status$value, remarks=TbUser.M.status$remarks)
	public Boolean isStatus(Boolean defaultValue){
		Boolean r=this.isStatus();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> the Blog ID
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.id$name, key=TbBlog.M.id$key, auto=TbBlog.M.id$auto, notnull=TbBlog.M.id$notnull, length=TbBlog.M.id$length, value=TbBlog.M.id$value, remarks=TbBlog.M.id$remarks)
	public Integer getId1(){
		return this.id1;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> id &nbsp;[<font color=red>KEY</font>|<font color=red>AUTO</font>|<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> the Blog ID
	* @param defaultValue  Return the default value if id1 is null.*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.id$name, key=TbBlog.M.id$key, auto=TbBlog.M.id$auto, notnull=TbBlog.M.id$notnull, length=TbBlog.M.id$length, value=TbBlog.M.id$value, remarks=TbBlog.M.id$remarks)
	public Integer getId1(Integer defaultValue){
		Integer r=this.getId1();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> user_id &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.userId$name, key=TbBlog.M.userId$key, auto=TbBlog.M.userId$auto, notnull=TbBlog.M.userId$notnull, length=TbBlog.M.userId$length, value=TbBlog.M.userId$value, remarks=TbBlog.M.userId$remarks)
	public Integer getUserId(){
		return this.userId;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> user_id &nbsp;[<font color=red>NOTNULL</font>]
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> user ID
	* @param defaultValue  Return the default value if userId is null.*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.userId$name, key=TbBlog.M.userId$key, auto=TbBlog.M.userId$auto, notnull=TbBlog.M.userId$notnull, length=TbBlog.M.userId$length, value=TbBlog.M.userId$value, remarks=TbBlog.M.userId$remarks)
	public Integer getUserId(Integer defaultValue){
		Integer r=this.getUserId();
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
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> content
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 65535<br>
	* <li><B>remarks:</B> content of the blog
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=-1, name=TbBlog.M.content$name, key=TbBlog.M.content$key, auto=TbBlog.M.content$auto, notnull=TbBlog.M.content$notnull, length=TbBlog.M.content$length, value=TbBlog.M.content$value, remarks=TbBlog.M.content$remarks)
	public String getContent(){
		return this.content;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> content
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 65535<br>
	* <li><B>remarks:</B> content of the blog
	* @param defaultValue  Return the default value if content is null.*/
	@Column(table=TbBlog.M.TABLE, jdbcType=-1, name=TbBlog.M.content$name, key=TbBlog.M.content$key, auto=TbBlog.M.content$auto, notnull=TbBlog.M.content$notnull, length=TbBlog.M.content$length, value=TbBlog.M.content$value, remarks=TbBlog.M.content$remarks)
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
	
	
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> blog status: 0-diable, 1-normal
	*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.status$name, key=TbBlog.M.status$key, auto=TbBlog.M.status$auto, notnull=TbBlog.M.status$notnull, length=TbBlog.M.status$length, value=TbBlog.M.status$value, remarks=TbBlog.M.status$remarks)
	public Integer getStatus1(){
		return this.status1;		
	}
	
	/**
	* @Column
	* <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B>table:</B> tb_blog&nbsp;<B>name:</B> status
	* <li>&nbsp;&nbsp;&nbsp;<B>length:</B> 10<br>
	* <li><B>remarks:</B> blog status: 0-diable, 1-normal
	* @param defaultValue  Return the default value if status1 is null.*/
	@Column(table=TbBlog.M.TABLE, jdbcType=4, name=TbBlog.M.status$name, key=TbBlog.M.status$key, auto=TbBlog.M.status$auto, notnull=TbBlog.M.status$notnull, length=TbBlog.M.status$length, value=TbBlog.M.status$value, remarks=TbBlog.M.status$remarks)
	public Integer getStatus1(Integer defaultValue){
		Integer r=this.getStatus1();
		if(r==null){
			r=defaultValue;
		}		
		
		return r;
	}
	
	
	
		 
}
 
