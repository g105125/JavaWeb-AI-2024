-- 1. 往emp表中插入一条测试数据， 全部的字段都需要插入值 。
insert into emp values(31,'zhugeliang','123456','诸葛亮',1,'19876890453',5,3000,'31.jpg','2020-04-05',now(),now());

-- 2. 批量往emp表中插入两条测试数据， 全部的字段都需要插入值 。
insert into emp values(32,'zhangfei','12345678','张飞',2,'14564553568',4,4000,'32.jpg','2021-05-06',now(),now())
,(33,'liubei','123456','刘备',1,'14569045643',3,7000,'33.jpg','2022-07-25',now(),now());

-- 3. 为id为2,4,6,8,9这个几个员工，涨100块钱工资 （在当前薪资的基础上 + 100）。
update emp set salary=salary+100 where id in (2,4,6,8,9);

-- 4. 删除id为30,31的员工信息
delete from emp where id=30 or id=31;

-- 5. 将id为6，7，9，12这个几个员工的 入职日期修改为 '2018-09-10' , 密码修改为 '1234567'
update emp set entry_date='2018-09-10',password='1234567' where id in(6,7,9,12);
