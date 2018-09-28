drop table if exists user;

create table user (id int primary key auto_increment, username varchar(20), password varchar(20));

insert into user (username, password) values ('demo', 'password');
insert into user (username, password) values ('dev', 'password');
insert into user (username, password) values ('test', 'password');
insert into user (username, password) values ('prod', 'password');
