drop table if exists user;

create table user (id int primary key auto_increment, username varchar(20), password varchar(20)， roleid varchar(10));

insert into user (username, password) values ('admin', 'password', 'admin');
insert into user (username, password) values ('dev', 'password', 'dev');
insert into user (username, password) values ('test', 'password', 'dev');
insert into user (username, password) values ('prod', 'password', 'dev');
