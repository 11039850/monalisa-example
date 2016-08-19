package test.action;

import java.util.ArrayList;
import java.util.List;

import test.TestDB;
import test.dao.UserBlogDao;
import test.dao.userblogdao.ResultSelectUserBlogsByList;
import test.dao.userblogdao.ResultSelectUserBlogsOne;
import test.dao.userblogdao.UserBlogs;
import test.testdb.User;

import com.tsc9526.monalisa.orm.Query;
import com.tsc9526.monalisa.orm.Tx;
import com.tsc9526.monalisa.orm.datatable.DataMap;
import com.tsc9526.monalisa.orm.datatable.DataTable;
import com.tsc9526.monalisa.orm.datatable.Page;
import com.tsc9526.monalisa.orm.model.Record;

/**
 * Call example
 */
public class UserAction {
	private UserBlogDao dao=Query.create(UserBlogDao.class);
			
	/**
	 * DAO call
	 */
	public void testDAO(){
		for(UserBlogs x: dao.selectUserBlogs(1)){
			System.out.println(x.getContent());
		}
		
		Page<DataMap> rs1=dao.selectUserBlogsAsListMap(1, 5, 0);
		for(DataMap m:rs1.getList()){
			System.out.println(m);
		}
		
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		for(ResultSelectUserBlogsByList x:dao.selectUserBlogsByList(ids, 5, 0)){
			System.out.println(x.getContent());
		}
		
		ResultSelectUserBlogsOne one=dao.selectUserBlogsOne(1);
		System.out.println(one.getContent());
		
		dao.updateUserBlog(1, 1);
	}
	
	/**
	 * Basic database access
	 */
	public void testDBAction(){
		//insert
		new User().setName("zzg.zhou").setStatus(1).save();
		
		//parse data from type: Map, json/xml string, JsonObject(Gson), HttpServletRequest, JavaBean
		new User().parse("{'name':'oschina','status':0}").save();
		new User().parse("<data> <name>china01</name><status>1</status> </data>").save();
		
		//select
		User.SELECT().selectByPrimaryKey(1);
		
		//SQL: SELECT * FROM `user` WHERE `name` = 'zzg.zhou'
		User.SELECT().selectOne("name=?", "zzg.zhou");
		
		//SQL: SELECT `name`, `status` FROM `user`
		User.SELECT().include("name","status").select();
		 
		Page<User> page=User.WHERE().name.like("zzg%").status.in(1,2,3).SELECT().selectPage(10,0);
		System.out.println(page.getTotalRow());
		
		//SQL: SELECT * FROM `user` WHERE `name` like 'zzg%' AND `status` IN(0, 1)
		for(User x:User.WHERE().name.like("zzg%").status.in(0, 1).SELECT().select()){
			System.out.println(x);
		}
				
		//SQL: SELECT * FROM `user` WHERE (`name` like 'zzg%' AND `status` >= 0) OR (`name` = 'zzg' AND `status` > 1) ORDER BY `status` ASC 
		for(User x:User.WHERE()
					.name.like("zzg%").status.ge(0)
					.OR()
					.name.eq("zzg").status.gt(1)
					.status.asc()
					.SELECT().select()){ //SELECT / delete / update
			System.out.println(x);
		}
		
	 	 
		//general query
		TestDB.DB.select("SELECT * FROM user WHERE name like ?","zzg%");
		TestDB.DB.createQuery().add("SELECT * FROM user WHERE name like ?","zzg%").getList(User.class);
		 
		Query q=new Query(TestDB.DB);
		DataTable<DataMap> rs=q.add("SELECT * FROM user WHERE name like ?","zzg%")
		 .add(" AND status ").in(1,2,3)
		 .getList();
		for(User x:rs.as(User.class)){
			System.out.println(x);
		}
		
		//update
		User user=User.SELECT().selectOne("name=?", "zzg.zhou");
		user.setStatus(3).update();
		
		User updateTo=new User().setName("tsc9526");
		User.WHERE().name.like("zzg%").update(updateTo);
	
		
		//transaction
		Tx.execute(new Tx.Atom() {
			public int execute() {
				new User().setName("name001").setStatus(1).save();
				new User().setName("name002").setStatus(2).save();
				//... other database operation
				return 0;
			}
		});
		 
		
		//delete
		user.delete();

		//SQL: DELETE FROM `user` WHERE `name`='china01'
		User.WHERE().name.eq("china01").delete();
		
		//User.DELETE().deleteAll();
	}  
	 
	
	/**
	 * Dynamic Model: ActiveRecord
	 */
	public void testDynamic(){
		Record r=new Record("user").use(TestDB.DB);
		r.set("name", "jjyy").set("status",1)
		 .save();
		
		//SQL: SELECT * FROM `user` WHERE (`name` like 'jjyy%' AND `status` >= 0) OR (`name` = 'zzg' AND `status` > 1) ORDER BY `status` ASC 
		for(Record x:r.WHERE()
				.field("name").like("jjyy%").field("status").ge(0)
				.OR()
				.field("name").eq("zzg").field("status").gt(1)
				.field("status").asc()
				.SELECT().select()){
			System.out.println(x);
		} 
		
		//SQL: DELETE FROM `user` WHERE `name` like 'jjyy%' AND `status` >= 0
		r.WHERE()
		 .field("name").like("jjyy%").field("status").ge(0)
		 .delete();
	}
	
	/**
	 * Some examples using class: DataTable 
	 */
	public void testDataTable(){
		DataTable<User>  users=User.SELECT().select();
		
		//Example 1: Query the datatable, The effect is the same as the SQL below
		//SELECT name ,count(*) FROM _THIS_TABLE 
		//		      WHERE status >=0 
		//		      GROUP BY name 
		//		      ORDER by name ASC
		DataTable<DataMap> results=users.select(
		        "name, count(*) as cnt"
		        ,"status >= 0"
		        ,"name asc"
		        ,"name");
		System.out.println(results); 
		
		
		
		//Example 2：User defined datas
		DataTable<DataMap> table = new DataTable<DataMap>();
		 
		//Create some test datas
		for(int userId=1;userId<=6;userId++){
			DataMap row = new DataMap();
			row.put("user", userId);
			row.put("area", "guangdong-"+(userId%2));
			row.put("rank"  ,90+userId);
			table.add(row);
		}
		DataMap r=table.selectOne("count(*) as cnt", "rank  > 91", null, null);
		System.out.println(r); 
		//Output： {cnt=5}
		
		DataTable<DataMap> rs=table.select(
				//SELECT fields: support some SQL aggregate functions：sum/avg/count
				//null or "": *
				"area,count(*) as cnt"  
				
				//Filter: AND, OR 
				//null or "": no filter
				, "rank>0"              
				
				//ORDER BY fields：ASC/DESC
				//null or "": no ORDER BY
				,"area ASC"  
				
				//GROUP BY statement：GROUP BY ... HAVING ...
				//null or "": no filter
				,"area");
		
		System.out.println(rs);
		//Output：[{area=guangdong-0, cnt=3}, {area=guangdong-1, cnt=3}]
		
		
		
		//Example 3： table join
		DataTable<User> t1 = new DataTable<User>();
		t1.add(new User().setName("zzg1").setStatus(1));
		t1.add(new User().setName("zzg2").setStatus(1));
		t1.add(new User().setName("zzg3").setStatus(1));
		
		DataTable<DataMap> t2 = new DataTable<DataMap>();
		for(int i=0;i<2;i++){
			DataMap row = new DataMap();
			row.put("name", "zzg"+i);
			row.put("age"  ,16+i);  //"age" is a new field
			t2.add(row);
		}
		  
		DataTable<DataMap> ts=
			t1.join(t2, "name","name")//Join table t1 and t2  on "name" 
			.select(null, "age>0","age",null); //Filter: age>0; ORDER BY： age ASC
		System.out.println(ts);
		/*Output：
		  [
		   {name=zzg1, status=1  , name1=zzg1, age=17}
		  ]
		*/
	}
}
