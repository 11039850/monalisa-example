package example.web.dao;

import com.tsc9526.monalisa.tools.string.MelpString;

import example.db.testdb.TbBlog;
import example.db.testdb.TbUser;
import example.db.testdb.TbUser.Sex;
import example.db.vo.Address;
import example.db.vo.Group;
import example.web.dao.userblogdao.ResultSelectUserBlogsOne;

/**
 * 
 * @author zzg.zhou(11039850@qq.com)
 */
public class CURD {
	public static void main(String[] args) {
		CURD curd=new CURD();
		int id=curd.createUser();
		curd.readUser(id);
		
		TbBlog blog=new TbBlog();
		blog.setContent("xy");
		blog.setStatus(1);
		blog.setUserId(id);
		blog.setTitle("no-title");
		blog.save();
		
		UserBlogDao dao=new UserBlogDao();
		ResultSelectUserBlogsOne one=dao.selectUserBlogsOne(id);
		System.out.println("fa: "+ one.getFaAsStringUTF8() );
	}
	
	public void readUser(int id){
		TbUser user=new TbUser(id).load();
		String fa=user.getFaAsStringUTF8();
		String fb=user.getFbAsStringUTF8();
		Address address=user.getAddress();
		int[] favorite =user.getFavorite();
		Group group=user.getGroups();
		String name=user.getName();
		String pwd=user.getPasswd();
		String[] phones=user.getPhones();
		boolean status=user.isStatus();
		Sex sex=user.getSex();
	 	
		System.out.println("fa: "+MelpString.toString(fa));
		System.out.println("fb: "+MelpString.toString(fb));
		System.out.println("address: "+MelpString.toString(address));
		System.out.println("favorite: "+MelpString.toString(favorite));
		System.out.println("group: "+MelpString.toString(group));
		System.out.println("name: "+MelpString.toString(name));
		System.out.println("pwd: "+MelpString.toString(pwd));
		System.out.println("phones: "+MelpString.toString(phones));
		System.out.println("status: "+MelpString.toString(status));
		System.out.println("sex: "+MelpString.toString(sex));
	}
	
	public int createUser(){
		TbUser user=new TbUser();
		user.setAddress(new Address("GuangDong", "ShenZhen","NanShan Road"));
		user.setFavorite(new int[]{1,2,3});
		user.setFa("001.txt",MelpString.toBytesUtf8("Hello world A!"));
		user.setFb("001.txt",MelpString.toBytesUtf8("Hello world B!"));
		user.setGroups(Group.GROUP_A);
		user.setName("zzg");
		user.setPasswd("123456");
		user.setPhones(new String[]{"13012345678","13112345678"});
		user.setSex(Sex.MALE);
		user.setStatus(true);
		user.save();
		return user.getId();
	}
}
