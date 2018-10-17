-- 商品类别
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(255) DEFAULT NULL,
  `cat_type` varchar(255) DEFAULT NULL,
  `banner` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cat_id`)
);
insert into category (cat_id, cat_name,cat_type,banner) values (1, '蔬菜' ,'1' , null);
insert into category (cat_id, cat_name,cat_type,banner) values (2, '瓜果' ,'2' , null);
insert into category (cat_id, cat_name,cat_type,banner) values (3, '海鲜' ,'3' , null);

DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `good_id` int(11) NOT NULL AUTO_INCREMENT,
  `good_name` varchar(255) DEFAULT NULL,
  `good_price` decimal(10,2) DEFAULT NULL,
  `good_main_url` varchar(255) DEFAULT NULL,
  `good_detail_urls` varchar(6000) DEFAULT NULL,
  `good_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`good_id`)
);
insert into good (good_id, good_name,good_price,good_main_url,good_detail_urls,good_type) values (11, '茄子' ,1.00 , null, null, '1');
insert into good (good_id, good_name,good_price,good_main_url,good_detail_urls,good_type) values (12, '豆角' ,1.00 , null, null, '1');
insert into good (good_id, good_name,good_price,good_main_url,good_detail_urls,good_type) values (21, '西瓜' ,1.00 , null, null, '2');
insert into good (good_id, good_name,good_price,good_main_url,good_detail_urls,good_type) values (22, '桃子' ,1.00 , null, null, '2');
insert into good (good_id, good_name,good_price,good_main_url,good_detail_urls,good_type) values (31, '带鱼' ,1.00 , null, null, '3');
insert into good (good_id, good_name,good_price,good_main_url,good_detail_urls,good_type) values (32, '黄花鱼' ,1.00 , null, null, '3');

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
);

insert into user (user_name, password,gender,name,age) values ('demo', 'password' ,'man' ,'tom', 18);
insert into user (user_name, password,gender,name,age) values ('dev',  'password' ,'man' ,'tom', 18);
insert into user (user_name, password,gender,name,age) values ('test', 'password' ,'man' ,'tom', 18);
insert into user (user_name, password,gender,name,age) values ('prod', 'password' ,'man' ,'tom', 18);
-- Cart
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT,
  `good_id` int(11) DEFAULT NULL,
  `good_name` varchar(255) DEFAULT NULL,
  `good_price` decimal(10,2) DEFAULT NULL,
  `good_main_url` varchar(255) DEFAULT NULL,
  `good_detail_urls` varchar(6000) DEFAULT NULL,
  `selected` int(11) DEFAULT '0',
  `num` int(11) DEFAULT '1',
  PRIMARY KEY (`cart_id`)
);
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `good_name` varchar(255) DEFAULT NULL,
  `good_price` decimal(10,2) DEFAULT NULL,
  `good_main_url` varchar(255) DEFAULT NULL,
  `good_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
);
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shop_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`shop_id`)
);
insert into shop (shop_name) values ('shop1');
insert into shop (shop_name) values ('shop2');
