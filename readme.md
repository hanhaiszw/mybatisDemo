# 说明
mybatis简单示例工程
数据库szw，表student
```mysql
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '名字',
  `score` int(8) DEFAULT NULL COMMENT '分数',
  `interest` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '兴趣',
  `grade` int(8) DEFAULT NULL COMMENT '班级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
```mysql
INSERT INTO `student` VALUES (1,'小红',80,'足球',1);
INSERT INTO `student` VALUES (2,'小华',88,'篮球',1);
INSERT INTO `student` VALUES (3,'小明',90,'羽毛球',2);
INSERT INTO `student` VALUES (4,'小李',85,'乒乓球',2);
INSERT INTO `student` VALUES (5,'小花',95,'象棋',2);
INSERT INTO `student` VALUES (6,'小爱',87,'羽毛球',3);
INSERT INTO `student` VALUES (7,'小冰',80,'乒乓球',3);
INSERT INTO `student` VALUES (8,'小张',92,'跑步',4);
INSERT INTO `student` VALUES (9,'小绿',77,'书法',5);
INSERT INTO `student` VALUES (10,'小纯',82,'钓鱼',5);
INSERT INTO `student` VALUES (11,'小紫',88,'品茶',1);
INSERT INTO `student` VALUES (12,'小伟',98,'围棋',2);
```


