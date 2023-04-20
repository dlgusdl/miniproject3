CREATE TABLE user_tb(
id int auto_increment primary key,
username varchar unique not null,
password varchar not null,
email varchar not null,
created_at timestamp not null
);

CREATE TABLE boad_tb(
id int auto_increment primary key,
password varchar not null,
content varchar not null,
title varchar not null,
created_at timestamp not null
);

CREATE TABLE product_tb(
id int auto_increment primary key,
product_name varchar(255) not null,
product_price int not null,
product_qty int not null,
created_at timestamp not null 
);