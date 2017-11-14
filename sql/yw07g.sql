CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL COMMIT '用户名',
  `password` varchar(255) NOT NULL COMMIT '密码',
  `nickname` varchar(255) DEFAULT NULL COMMIT '昵称',
  `sex` int(11) DEFAULT '0' COMMIT '性别（0女 1男）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMIT '用户基本信息表';

