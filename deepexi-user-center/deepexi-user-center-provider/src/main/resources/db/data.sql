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


DROP TABLE IF EXISTS cuser;
CREATE TABLE IF NOT EXISTS cuser(id varchar(32) unsigned not null primary key,user_name varchar(32),
user_number varchar(32),nick_name varchar(32),email varchar(32),tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO cuser(id, user_name,user_number, nick_name, email, created_by, updated_by, created_at, updated_at, dr) VALUES
('1', '红红','001', '小红', '1@xx.com', null, null, null, null, 0),
('2', '黄黄','002', '小黄', '2@xx.com', null ,null, null, null, 0),
('3', '绿绿','003', '小绿', '3@xx.com', null ,null, null, null, 0),
('4', '刚刚','004', '小刚', '4@xx.com', null ,null, null, null, 0),
('5', '嘿嘿','005', '小黑', '5@xx.com', null ,null, null, null, 0),
('6', '蓝蓝','006', '小蓝', '6@xx.com', null ,null, null, null, 0),
('7', '紫紫','007', '小紫', '7@xx.com', null ,null, null, null, 0),
('8', '兔兔','008', '小兔', '8@xx.com', null ,null, null, null, 0),
('9', '猫猫','009', '小猫', '9@xx.com', null ,null, null, null, 0),
('10', '狗狗','010', '小狗', '10@xx.com', null ,null, null, null, 0),
('11', '弟弟','011', '小弟', '11@xx.com', null ,null, null, null, 0),
('12', '花花','012', '小花', '12@xx.com', null ,null, null, null, 0);