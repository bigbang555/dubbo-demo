DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);


DROP TABLE IF EXISTS uc_user;
CREATE TABLE IF NOT EXISTS uc_user(id varchar(32) unsigned not null primary key,username varchar(32),
usernumber varchar(32),nickname varchar(32),email varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO uc_user(id, usernumber, nickname, email, created_by, updated_by, created_at, updated_at, dr) VALUES
('1', '1', '小红', '1@xx.com', null, null, null, null, 0),
('2', '2', '小黄', '2@xx.com', null ,null, null, null, 0),
('3', '3', '小绿', '3@xx.com', null ,null, null, null, 0),
('4', '4', '小刚', '4@xx.com', null ,null, null, null, 0),
('5', '5', '小黑', '5@xx.com', null ,null, null, null, 0),
('6', '6', '小蓝', '6@xx.com', null ,null, null, null, 0),
('7', '7', '小紫', '7@xx.com', null ,null, null, null, 0),
('8', '8', '小兔', '8@xx.com', null ,null, null, null, 0),
('9', '9', '小猫', '9@xx.com', null ,null, null, null, 0),
('10', '10', '小狗', '10@xx.com', null ,null, null, null, 0),
('11', '11', '小弟', '11@xx.com', null ,null, null, null, 0),
('12', '12', '小花', '12@xx.com', null ,null, null, null, 0);



