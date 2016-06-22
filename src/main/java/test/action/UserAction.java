package test.action;

import test.TestDB;
import test.dao.UserBlogDao;
import test.result.UserBlogs;
import test.testdb.User;

import com.tsc9526.monalisa.core.query.Page;
import com.tsc9526.monalisa.core.query.Query;
import com.tsc9526.monalisa.core.query.Tx;
import com.tsc9526.monalisa.core.query.datatable.DataMap;
import com.tsc9526.monalisa.core.query.datatable.DataTable;
import com.tsc9526.monalisa.core.query.model.Record;

/**
 * 调用示例
 */
public class UserAction {
	public static void main(String[] args)throws Exception {
		UserAction action=new UserAction();
		
		action.testDAO();
		
		action.testDBAction();
		
		action.testDynamic();
		
		action.testDataTable();
	}
	 
	
	//这里需要调用 Query.Create()来创建数据访问类. 不能直接调用new, 否则会丢失@Tx标记方法的事务特性， 以及数据访问类更新加载的特性
	private UserBlogDao dao=Query.create(UserBlogDao.class);
			
	//调用DAO
	public void testDAO(){
		for(UserBlogs x: dao.selectUserBlogs(1)){
			System.out.println(x.getContent());
		}
	}
	
	//基本数据库操作
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
	 
	
	//使用动态模型
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
	
	//DataTable 示例
	public void testDataTable(){
		DataTable<User>  users=User.SELECT().select();
		
		//SQL: SELECT name ,count(*) FROM _THIS_TABLE WHERE status >=0 GROUP BY name ORDER by name ASC
		DataTable<DataMap> rs=users.select(
				"name, count(*) as cnt"
				,"status >= 0"
				,"name asc"
				, "name");
		for(DataMap r:rs){
			System.out.println(r.getString("name")+"="+r.getInt("cnt",0));
		}
	}

}
