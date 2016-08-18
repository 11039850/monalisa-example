package test;
 
import com.tsc9526.monalisa.orm.tools.generator.DBGeneratorMain;

/**
 * Init test tables and generate model classes <br>
 * 
 * @author zzg
 */
public class InitDatabase {
	
	public static void main(String[] args) {  
		initTables();     
		generateModels();
	}

	public static void initTables(){
		TestDB.DB.execute(""+/**~{*/""
				+ "DROP TABLE IF EXISTS `user` ;"
				+ "\r\nDROP TABLE IF EXISTS `blog` ;"
				+ "\r\n"
			 + "\r\n 	CREATE TABLE IF NOT EXISTS `user` ("
				+ "\r\n  `id`     int(11)     NOT NULL AUTO_INCREMENT COMMENT 'User''s  ID',"
				+ "\r\n  `name`   varchar(64) NOT NULL                COMMENT 'user name',"
				+ "\r\n  `passwd` varchar(64) DEFAULT '123456'        COMMENT 'user password' ,"
				+ "\r\n  `status` int(11)     DEFAULT 1               COMMENT 'user status: 0-disable, 1-normal',"
				+ "\r\n  PRIMARY KEY (`id`)"
				+ "\r\n) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'This is a User Table';"
				+ "\r\n "
				+ "\r\nCREATE TABLE IF NOT EXISTS  `blog` ("
				+ "\r\n  `id`      int(11)      NOT NULL AUTO_INCREMENT COMMENT 'the Blog ID',"
				+ "\r\n  `user_id` int(11)      NOT NULL                COMMENT 'user ID',"
				+ "\r\n  `title`   varchar(64)  NOT NULL                COMMENT 'title of the blog',"
				+ "\r\n  `content` text     DEFAULT NULL                COMMENT 'content of the blog' ,"
				+ "\r\n  `create_time` DATETIME NOT NULL                COMMENT 'create time' ,"
				+ "\r\n  `status` int(11)   DEFAULT NULL                COMMENT 'blog status: 0-diable, 1-normal',"
				+ "\r\n  PRIMARY KEY (`id`)"
				+ "\r\n) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'This is a Blog Table';"
			 + "\r\n"
				+ "\r\nINSERT INTO `user`(id,name,passwd,status)VALUES(1,\"zzg1\",\"123\",1);"
				+ "\r\nINSERT INTO `user`(id,name,passwd,status)VALUES(2,\"zzg2\",\"123\",1);"
				+ "\r\nINSERT INTO `user`(id,name,passwd,status)VALUES(3,\"zzg3\",\"123\",1);"
				+ "\r\n"
				+ "\r\nINSERT INTO `blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-11','Test Content 11',1,now());"
				+ "\r\nINSERT INTO `blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-12','Test Content 12',1,now());"
				+ "\r\nINSERT INTO `blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-13','Test Content 13',1,now());"
				+ "\r\nINSERT INTO `blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-14','Test Content 14',0,now());"
				+ "\r\nINSERT INTO `blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-15','Test Content 15',0,now());"
		+ "\r\n"/**}*/);		
	}
	
	/**
	 * About code generator, see:<br>
	 * https://github.com/11039850/monalisa-orm/wiki/Code-Generator#eclipse-plugin 
	 */
	 public static void generateModels() {
         //Generate Model classes to directory: target/generated-sources/annotations
         DBGeneratorMain.generateModelClass(TestDB.class,"./target/generated-sources/annotations"); 

     }
}
