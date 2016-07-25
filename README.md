# monalisa-example

初始状态, 工程编译会有错误，请按照以下步骤操作：

工程初始化：

1. 安装插件:     插件安装 [参考这里](https://github.com/11039850/monalisa-db/wiki/Code%20Generator#eclipse%E6%8F%92%E4%BB%B6)
2. 设置数据库:   127.0.0.1:3306/test, 用户: root 密码: root （_或： 手工修改TestDB.java文件_）
3. 生成测试数据: 运行Create.java (_或：用数据库工具运行其中的SQL代码_）
4. 生成代码:     打开 TestDB.java 改动后保存，改动仅仅是为了触发插件重新生成数据库的接口代码（_或: mvn package_)

运行示例：

* 主程序：      src/main/java/test/action/UserAction.java   执行查询结果
* 数据访问： src/main/java/test/dao/UserBlogDao.java  示例修改SQL语句，自动更新结果类: UserBlogs
* 动态更新:  monalisa/sql/UserBlogDao.java  示例加载更新后的代码（_修改后确认$VERSION$的值比  src/main/java/test/dao/UserBlogDao.java里面的大， 然后运行主程序_）


细节 [可参考这里](https://github.com/11039850/monalisa-db/wiki/Dynamic%20Java%20Files) 

# Maven: 
```xml
	
	<dependency>
		<groupId>com.tsc9526</groupId>
		<artifactId>monalisa-orm</artifactId>
		<version>1.6.0</version>
	</dependency>
``` 
