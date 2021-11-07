> 获取select \* from employees对应的执行计划

通过**explain** 模拟优化器执行 **SQL** 语句，可以查看 SQL 执行的计划，这样更清楚 MYSQL 是如何处理 SQL 语句，通过 explain 可以分析查询语句及表结构性能瓶颈

> 将 employees 表的所有员工的 last_name 和 first_name 拼接起来作为 Name，中间以一个空格区分

```sql
select CONCAT(last_name,' ',first_name) as Name
from employees;
```

- 不同字符串连接方法不一样，在Mysql中，可以利用 **CONCAT()** 函数将多个字符串连接起来，中间用逗号隔开。
- 空格用 ' ' 表示。

> 创建一个 actor 表，包含如下列信息

| 列表        | 类型        | 是否为NULL | 含义                               |
| ----------- | ----------- | ---------- | ---------------------------------- |
| actor_id    | smallint(5) | not null   | 主键id                             |
| first_name  | varchar(45) | not null   | 名字                               |
| last_name   | varchar(45) | not null   | 姓氏                               |
| last_update | timestamp   | not null   | 最后更新时间，默认是系统的当前时间 |

```sql
create table actor(
actor_id smallint(5) not null,
first_name varchar(45) not null,
last_name varchar(45) not null,
last_update timestamp not null default current_timestamp,
primary key(actor_id));
```

这里大家需要主要的是，创建主键和默认系统当前时间的设置。

> 对于表actor批量插入如下数据

| actor_id | first_name | last_name | last_update         |
| -------- | ---------- | --------- | ------------------- |
| 1        | PENELOPE   | GUINESS   | 2021-09-07 10:42:22 |
| 2        | NICK       | WAHLBERG  | 2021-09-07 10:42:22 |

```sql
insert into actor values(1,'PENELOPE','GUINESS','2006-02-15 12:34:33'),
(2,'NICK','WAHLBERG','2021-09-07 10:42:22');
```

插入数据的语法：insert into <表名> values (<数据1>,<数据2>....);

> 第三十五题：对于表 **actor** 批量插入如下数据,如果数据已经存在，请忽略，不使用 **replace** 操作

| actor_id | first_name | last_name | last_update         |
| -------- | ---------- | --------- | ------------------- |
| '3'      | 'ED'       | 'CHASE'   | 2021-09-07 10:42:22 |

```sql
insert ignore into actor values(3,'ED','CHASE','2021-09-07 10:42:22');
```

如果数据存在则忽略，在 insert into 之间加个 ignore 就可以。

> 对于如下表actor，其对应的数据为:

| actor_id | first_name | last_name | last_update         |
| -------- | ---------- | --------- | ------------------- |
| 1        | PENELOPE   | GUINESS   | 2021-09-07 10:42:22 |
| 2        | NICK       | WAHLBERG  | 2021-09-07 10:42:22 |

创建一个**actor_name** 表，将 **actor** 表中的所有 **first_name** 以及 **last_name** 导入改表。**actor_name** 表结构如下：

| 列表       | 类型        | 是否为NULL | 含义 |
| ---------- | ----------- | ---------- | ---- |
| first_name | varchar(45) | not null   | 名字 |
| last_name  | varchar(45) | not null   | 姓氏 |

```sql
create table actor_nameselect first_name,last_name from actor
```

在 **Mysql** 中，可以加 **as**，也可以不加 **as**。

> 针对表 **actor** 结构创建索引，对 **first_name** 创建唯一索引 **uniq_idx_firstname**，对 **last_name** 创建普通索引 **idx_lastname**

```sql
CREATE UNIQUE INDEX uniq_idx_firstname ON actor(first_name);
```

```sql
CREATE INDEX idx_lastname ON actor(last_name)
```

创建唯一索引：CREATE UNIQUE INDEX <唯一索引名> ON <表名> (<列名>);

创建一个简单的索引：CREATE INDEX <普通索引名> ON <表名> (<列名>);

> 针对 actor 表创建视图 actor_name_view，只包含 first_name 以及 last_name 两列，并对这两列重新命名，first_name 为 first_name_v，last_name 修改为 last_name_v

```sql
CREATE VIEW actor_name_view(first_name_v,last_name_v)AS select first_name,last_name from actor;
```

创建视图语句：

CREATE VIEW <视图名称> (<视图列名1>,<视图列名2>…)

AS

> 针对 **salaries** 表 **emp_no** 字段创建索引 **idx_emp_no**，查询 **emp_no** 为 **10005**, 使用强制索引

```sql
create index idx_emp_no on salaries(emp_no);
```

```sql
select * from salaries FORCE INDEX (idx_emp_no) where emp_no = 10005;
```

先创建索引，再创建强制索引查询，**索引名一定要加括号**，否则错误。

强制索引：FORCE INDEX(<索引名>);

SELECT * FROM <表名> FORCE INDEX (<索引名>)

> 在表 **actor** 中，在 **last_update** 后面新增加一列名字为 **create_date**, 类型为 datetime, not null，默认值为 '0000-00-00 00:00:00'

```sql
alter table actoradd column create_date datetime NOT NULL default '0000-00-00 00:00:00';
```

添加列是使用变更表定义的 ALTER TABLE 语句，ALTER TABLE <表名> ADD COLUM

N <列名> <列的定义>;

> 构造一个触发器 **audit_log**，在向 **employees_test** 表中插入一条数据的时候，触发插入相关的数据到 **audit** 表中

```sql
CREATE TRIGGER audit_log AFTER insert
ON employees_test FOR EACH ROW
BEGIN
INSERT INTO audit VALUES(NEW.ID, NEW.NAME);
END;
```

创建触发器

CREATE TRIGGER <触发器名称> <触发时机> <触发事件>

ON <表名> FOR EACH ROW <触发后执行的语句>;

trigger_name 触发器名称 自定义

trigger_time 触发时机 可以选 BEFORE或者AFTER

trigger_event 触发事件 INSERT，UPDATE，DELETE

trigger_stmt 触发之后需要执行的语句，可以使用BEGIN,END开始和结束

关于NEW.ID, NEW.NAME 的解释：

audit表里只有emp_no和name两列，所以只能插入id和name这两列，我们可以使用 NEW与OLD 关键字访问触发后（或触发前）的employees_test表单记录

> 删除emp_no重复的记录，只保留最小的id对应的记录

```sql
DELETE FROM titles_test
WHERE id NOT IN (SELECT * FROM
(SELECT min(id) FROM titles_test GROUP BY emp_no ) AS a);
```

解题思路：

①使用子查询的方法，将emp_no进行分组后找出最小id对应的记录，再使用not in，将非最小id的记录删除。

②高赞答案都是只用一次子查询，但在MySQL中，UPDATE或DELETE中子查询不能为同一张表，所以在这里要嵌套一个子查询，另外，在MySQL中需要给子查询添加别名，否则会出错。

> **将所有to_date为9999-01-01的全部更新为NULL,且 from_date更新为2001-01-01**

```sql

update titles_test
set from_date = '2001-01-01',
to_date = null
where to_date = '9999-01-01';
```

解题思路：

①表更新使用update语句，多个更新之间用逗号隔开，而不能使用and连接。

②这里两个更新分别考察了简单update语句和搜索型update语句。

③一个比较容易出错的地方是某列更新为null时不能使用<列名> is null的方法，正确的方法是：update <表名> set <字段> = null where <条件>;

> **第四十四题：将id=5以及emp_no=10001的行数据替换成id=5以及emp_no=10005,其他数据保持不变，使用replace实现**

```
update titles_test
set emp_no = replace(emp_no,10001,10005)
where id = 5;
```

解题思路：

①第一反应是：replace(要替换的值,替换前的数据,替换后的数据)，由此得出方法一，但是这个语句在Mysql中不能实现。



②本题说用replace实现，在Mysql中，应该是考察replace into语句。replace into <表名> (<列名>) values(值1,值2…) （列名可以省略）



③这题要把所有列的值都列出来的原因是：如果在replace语句中没有指定某列， 在replace之后这列的值会被置空 。参考：https://blog.csdn.net/zhangjg_blog/article/details/23267761



replace into 跟 insert （update同理）功能类似，不同点在于：replace into 首先尝试插入数据到表中， 1. 如果发现表中已经有此行数据（根据主键或者唯一索引判断）则先删除此行数据，然后插入新的数据。



\2. 否则，直接插入新数据。要注意的是：插入数据的表必须有主键或者是唯一索引！否则的话，replace into 会直接插入数据，这将导致表中出现重复的数据。



MySQL replace into 有三种形式：

\1. replace <表名>(<列名>) values(...)

\2. replace <表名>(<列名>) select ...

\3. replace <表名> set <列名>=value, ...

前两种形式用的多些。其中 “into” 关键字可以省略，不过最好加上 “into”，这样意思更加直观。

参考：https://blog.csdn.net/leyangjun/article/details/38734625

> **第四十五题：将titles_test表名修改为titles_2017**

```
rename table titles_test to titles_2017;
```

解题思路：变更表名：rename table <变更前的名称> to <变更后的名称>;

> **第四十六题：在audit表上创建外键约束，其emp_no对应employees_test表的主键id**

```
alter table audit add foreign key(emp_no) references employees_test(id);
```

解题思路：创建外键约束语法：

alter table <子表的数据表名> add foreign key(子表的外键字段) references <父表的数据表名称>(父表的主键名称);

**第四十七题：存在如下的视图：create view emp_v as select \* from employees where emp_no >10005;**

**如何获取emp_v和employees有相同的数据，输出格式：**

| emp_no | birth_date | first_name | last_name | gender | hire_date  |
| ------ | ---------- | ---------- | --------- | ------ | ---------- |
| 10006  | 1953-04-20 | Anneke     | Preusig   | F      | 1989-06-02 |
| 10007  | 1957-05-23 | Tzvetan    | Zielinski | F      | 1989-02-10 |
| 10008  | 1958-02-19 | Saniya     | Kalloufi  | M      | 1994-09-15 |
| 10009  | 1952-04-19 | Sumant     | Peac      | F      | 1985-02-18 |
| 10010  | 1963-06-01 | Duangkaew  | Piveteau  | F      | 1989-08-24 |
| 10011  | 1953-11-07 | Mary       | Sluis     | F      | 1990-01-22 |



方法一：

- 

```
select * from emp_v;
```





方法二：

- 

```
select e.* from employees e, emp_v ev where e.emp_no = ev.emp_no;
```





解题思路：视图和表的区别在于“是否保存了实际的数据” ，在编写select语句时，不需要特别在意表和视图有什么不同，可以直接使用视图作为表进行查询 。

 



**第四十八题：将所有获取奖金的员工的当前薪水增加10%**

```sql
update salaries set salary = salary * 1.1where to_date = '9999-01-01' and emp_no in(select emp_no from emp_bonus);
```

使用update更新表工资，限定条件为当前和emp_bonus表中所有的员工（使用in谓词解决），另外本题的emp_bonus表的用例数据可以在倒数第三题的用例中获取。

> 针对库中的所有表生成select count(\*)对应的SQL语句，输出格式如下：

| cnts                               |
| ---------------------------------- |
| select count(*) from employees;    |
| select count(*) from departments;  |
| select count(*) from dept_emp;     |
| select count(*) from dept_manager; |
| select count(*) from salaries;     |
| select count(*) from titles;       |
| select count(*) from emp_bonus;    |

在Mysql中，针对库中的所有表生成 select count(*) 对应的 SQL 语句：

```sql
select concat("select count(*) from ",table_name,";") as cntsfrom information_schema.tables where table_schema='niuke';
```

在 Mysql 中，针对所有数据库中的所有表生成 select count(*) 对应的 SQL 语句：

```sql
select concat("select count(*) from ",table_name,";") as cntsfrom (select table_name from information_schema.tables) as new;
```

MySQL 中获得所有表的名称：

```sql
select table namefrom information schema.tables where table schema='mydata';
```

MySQL 语句中，‘mydata’ 是当前数据库的名称的意思

information_schema.tables 表示从表名中选择，information_schema.xxx 中 xxx 可选的还有很多字段，如information_schema.columns表示从所有表的所有字段中选择。

MySQL 字符串的连接使用 concat 函数，多个字符串连接中间用逗号隔开。

> 将employees表中的所有员工的last_name和first_name通过(')连接起来。

```sql
select concat(last_name,"'",first_name) as namefrom employees;
```

考察字符串拼接函数concat(<列1>,<列2>…)，多个列或字符串之间用个逗号隔开，这里 last_name 和 first_name 通过 (') 连接，符号  '  要用双引号括起来。