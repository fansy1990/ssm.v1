CREATE TABLE `table_node` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `folder` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `table_node` VALUES (1, 'FirstLevel', 1, NULL);
INSERT INTO `table_node` VALUES (2, 'Secondary Level 1', 1, 1);
INSERT INTO `table_node` VALUES (3, 'Secondary Level 2', 1, 1);
INSERT INTO `table_node` VALUES (4, 'ThirdLevel 1', 0, 2);
INSERT INTO `table_node` VALUES (5, 'ThirdLevel 2', 0, 2);
INSERT INTO `table_node` VALUES (6, 'Third Level 3', 0, 3);

