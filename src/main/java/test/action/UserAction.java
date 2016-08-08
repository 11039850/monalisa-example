package test.action;

import test.TestDB;
import test.dao.UserBlogDao;
import test.result.UserBlogs;
import test.testdb.User;

import com.tsc9526.monalisa.orm.Query;
import com.tsc9526.monalisa.orm.Tx;
import com.tsc9526.monalisa.orm.datatable.DataMap;
import com.tsc9526.monalisa.orm.datatable.DataTable;
import com.tsc9526.monalisa.orm.datatable.Page;
import com.tsc9526.monalisa.orm.model.Record;

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
		//例子1: 从数据库查询出一个DataTable
		DataTable<User>  users=User.SELECT().select();
	 
		DataTable<DataMap> results=users.select(
		        "name, count(*) as cnt"
		        ,"status >= 0"
		        ,"name asc"
		        ,"name");
		 
		//对TableData的过滤操作，执行效果和下面的SQL相同
		//SELECT name ,count(*) FROM _THIS_TABLE 
		//		      WHERE status >=0 
		//		      GROUP BY name 
		//		      ORDER by name ASC
		System.out.println(results); 
		
		
		
		//例子2： 自定义数据
		DataTable<DataMap> table = new DataTable<DataMap>();
		 
		//创建测试数据
		for(int userId=1;userId<=6;userId++){
			DataMap row = new DataMap();
			row.put("user", userId);
			row.put("area", "guangdong-"+(userId%2));
			row.put("rank"  ,90+userId);
			table.add(row);
		}
		
		DataMap r=table.selectOne("count(*) as cnt", "rank  > 91", null, null);
		System.out.println(r); 
		//输出： {cnt=5}
		
		DataTable<DataMap> rs=table.select(
				//字段选择: 支持常用的SQL聚合函数：sum/avg/count
				//(null 或  "" 表示 *)
				"area,count(*) as cnt"  
				
				//过滤条件: 支持AND, OR , 括号
				//(null 或  "" 表示无条件)
				, "rank>0"              
				
				//排序字段：ASC/DESC
				//(null 或  "" 表示无指定的排序)
				,"area ASC"  
				
				//分组语句：GROUP BY ... HAVING ...
				//(null 或  "" 表示无分组)
				,"area");
		
		System.out.println(rs);
		//输出：[{area=guangdong-0, cnt=3}, {area=guangdong-1, cnt=3}]
		
		
		
		//例子3： Join
		DataTable<User> t1 = new DataTable<User>();
		t1.add(new User().setName("zzg1").setStatus(1));
		t1.add(new User().setName("zzg2").setStatus(1));
		t1.add(new User().setName("zzg3").setStatus(1));
		
		DataTable<DataMap> t2 = new DataTable<DataMap>();
		for(int i=0;i<2;i++){
			DataMap row = new DataMap();
			row.put("name", "zzg"+i);
			row.put("age"  ,16+i);  //新字段
			t2.add(row);
		}
		  
		DataTable<DataMap> ts=
			t1.join(t2, "name","name")//用字段name连接2个表 t1,t2; 
			.select(null, "age>0","age",null); //过滤 出age>0,并按age升序
		System.out.println(ts);
		/*输出如下：
		  [
		   {name=zzg1, status=1  , name1=zzg1, age=17}
		  ]
		*/
	}
	
	

}
