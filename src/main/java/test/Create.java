package test;


public class Create {
	public static void main(String[] args) {  
		TestDB.DB.execute(""+/**~{*/""
			+ "DROP TABLE IF EXISTS `user` ;"
			+ "\r\nDROP TABLE IF EXISTS `blog` ;"
			+ "\r\n"
		 + "\r\n 	CREATE TABLE IF NOT EXISTS `user` ("
			+ "\r\n  `id`     int(11)     NOT NULL AUTO_INCREMENT COMMENT '用户ID',"
			+ "\r\n  `name`   varchar(64) NOT NULL                COMMENT '用户名称',"
			+ "\r\n  `passwd` varchar(64) DEFAULT '123456'        COMMENT '用户密码' ,"
			+ "\r\n  `status` int(11)     DEFAULT 1               COMMENT '用户状态: 0-禁用, 1-正常',"
			+ "\r\n  PRIMARY KEY (`id`)"
			+ "\r\n) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';"
			+ "\r\n "
			+ "\r\nCREATE TABLE IF NOT EXISTS  `blog` ("
			+ "\r\n  `id`      int(11)      NOT NULL AUTO_INCREMENT COMMENT '博客ID',"
			+ "\r\n  `user_id` int(11)      NOT NULL                COMMENT '用户ID',"
			+ "\r\n  `title`   varchar(64)  NOT NULL                COMMENT '博客标题',"
			+ "\r\n  `content` text     DEFAULT NULL                COMMENT '博客内容' ,"
			+ "\r\n  `create_time` DATETIME NOT NULL                COMMENT '创建时间' ,"
			+ "\r\n  `status` int(11)   DEFAULT NULL                COMMENT '博客状态: 0-禁用, 1-正常',"
			+ "\r\n  PRIMARY KEY (`id`)"
			+ "\r\n) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '博客表';"
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
}
