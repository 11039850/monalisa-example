DROP TABLE IF EXISTS `tb_user` ;
DROP TABLE IF EXISTS `tb_blog` ;
	
CREATE TABLE IF NOT EXISTS `tb_user` ( 
  `id`       int(11)      NOT NULL AUTO_INCREMENT COMMENT 'user ID',
  `name`     varchar(64)  NOT NULL                COMMENT 'user name',
  `passwd`   varchar(64)  DEFAULT '123456'        COMMENT 'user password' ,
  `fa`       varchar(64)  DEFAULT NULL            COMMENT 'file path.    #file{monalisa/tmp/fa}' ,
  `fb`       varchar(64)  DEFAULT NULL            COMMENT 'var path.    #file{${dbcfg.file.path}/fb}' ,
  `json`     varchar(64)  DEFAULT NULL            COMMENT 'json object.  #json{}',
  `address`  varchar(255) DEFAULT NULL            COMMENT 'java bean.    #json{example.db.vo.Address}',
  `phones`   varchar(255) DEFAULT NULL            COMMENT 'string array. #array{}',
  `favorite` varchar(255) DEFAULT NULL            COMMENT 'int array.    #array{int}   (int may be: int/long/float/double)',
  `groups`   varchar(255) DEFAULT NULL            COMMENT 'string enum.  #enum{example.db.vo.Group}',
  `sex`      varchar(16)  DEFAULT NULL            COMMENT 'boolean.      #enum{{ MALE, FEMALE }}',
  `status`   int(11)      DEFAULT 1               COMMENT 'int enum.     #boolean{}',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'This is a User Table';
	 
CREATE TABLE IF NOT EXISTS  `tb_blog` (
  `id`      int(11)      NOT NULL AUTO_INCREMENT COMMENT 'the Blog ID',
  `user_id` int(11)      NOT NULL                COMMENT 'user ID',
  `title`   varchar(64)  NOT NULL                COMMENT 'title of the blog',
  `content` text     DEFAULT NULL                COMMENT 'content of the blog' ,
  `create_time` DATETIME NOT NULL                COMMENT 'create time' ,
  `status` int(11)   DEFAULT NULL                COMMENT 'blog status: 0-diable, 1-normal',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'This is a Blog Table';
 
INSERT INTO `tb_user`(id,name,passwd,status,sex,groups,favorite)VALUES(1,"zzg1","123",1,'MALE'   ,'GROUP_A','[1,2,3]');
INSERT INTO `tb_user`(id,name,passwd,status,sex,groups,favorite)VALUES(2,"zzg2","123",1,'FEMALE' ,'GROUP_B','[3]');
INSERT INTO `tb_user`(id,name,passwd,status,sex,groups,favorite)VALUES(3,"zzg3","123",1,'MALE'   ,'GROUP_C','[4,5,6]');

INSERT INTO `tb_blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-11','Test Content 11',1,now());
INSERT INTO `tb_blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-12','Test Content 12',1,now());
INSERT INTO `tb_blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-13','Test Content 13',1,now());
INSERT INTO `tb_blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-14','Test Content 14',0,now());
INSERT INTO `tb_blog`(user_id,title,content,status,create_time)VALUES(1,'Hello-15','Test Content 15',0,now());			