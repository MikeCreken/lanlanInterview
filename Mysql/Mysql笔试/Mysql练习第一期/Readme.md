大家好，我是蓝蓝。

今天内容是关于 SQL 的练习，为了看着整洁，所有的 SQL 使用代码图的方式展示，为了大家方便复制代码下来练习，可以去我的 Github 中下载。

> 创建表

```sql
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```

> 查找最晚入职员工的所有信息

采用子查询的方式，先找出入职时间最晚的，这样也可以确保有多条最晚入职时间被查询出来。有些同学可能会使用 order by 的方式，不过这样的方式仅限于最晚入职数据只有一条的时候才正确。

```sql
select * from employees
where hire_date in (select max(hire_date)
                    from employees)
```

> 查找入职员工时间排名倒数第三的员工所有信息

目标是查找员工所有信息，条件是时间排名倒数第三，这里的考点也就在倒数第三怎么去写罢了，可以再此去复习再 Limit 相关的内容。

- Limit m，n：表示的是从 m+1 开始，取 n 条数据
- Limit n： 标识从第 0 条开始，取 n 条数据 是 limit(0,n) 缩写

综上，同样采用的是子查询的方法，去重使用了 distinct 函数，去重以后按照入职日期分组，多个相通的入职日期分为分为一组，你可能会这样写

```sql
select * from employees order by hire_date desc limit 2,1
```

这个做法只能是查出入职时间排名三的时间的员工信息，而不是入职员工时间排名倒数第三的员工的入职时间。

```sql
select * from employees
where hire_date = (select distinct hire_date from employees
order by hire_date desc limit 2,1);
```

> 查找各个部门当前(to_date='9999-01-01')领导当前薪水详情以及其对应部门编号dept_no

- 创建表

解题套路：以s.emp_no = d.emp_no来关联两张表，随后限制to_date = '9999-01-01'

```sql
CREATE TABLE `dept_manager` (
`dept_no` char(4) NOT NULL,
`emp_no` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));
CREATE TABLE `salaries` (
`emp_no` int(11) NOT NULL,
`salary` int(11) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`from_date`));
```

目标是当前领导的详情及所在部门编号，所以涉及到两个表，**salaries** 和 **dpt_manager**，两个表的关联关系为 **dm.emp_no = sa.emp_no**，所以 SQL 如下

```SQL
select sa.emp_no, sa.salary, sa.from_date, sa.to_date, dm.dept_no
from salaries as sa inner join dept_manager as dm 
on dm.emp_no = sa.emp_no
and dm.to_date = '9999-01-01'
and sa.to_date = '9999-01-01';
```

> 查找所有已经分配部门的员工的 **last_name** 和 **first_name** 

- 创建表

```sql
CREATE TABLE `dept_emp` (
`emp_no` int(11) NOT NULL,
`dept_no` char(4) NOT NULL,
`from_date` date NOT NULL,
`to_date` date NOT NULL,
PRIMARY KEY (`emp_no`,`dept_no`));
CREATE TABLE `employees` (
`emp_no` int(11) NOT NULL,
`birth_date` date NOT NULL,
`first_name` varchar(14) NOT NULL,
`last_name` varchar(16) NOT NULL,
`gender` char(1) NOT NULL,
`hire_date` date NOT NULL,
PRIMARY KEY (`emp_no`));
```

目标是查找员工的 **last_name** 和 **first_name**，条件是已经分配的部门即涉及到两个表，员工表与部门表，关联关系 **em.emp_no = de.emp_no**;

employees作为主表，使用左链接，题目中明确说明了需要查找已经分配部门的员工，说明这些员工是有dept_no，没有dept_no即没有分配部门，去除dept_no为空的情况

```SQL
select e.last_name,e.first_name,d.dept_no
from employees e left join dept_emp d on e.emp_no = d.emp_no
where d.dept_no is not null;
```

> 查找所有员工的last_name和first_name以及对应部门编号dept_no，也包括展示没有分配具体部门的员工

```sql
select em.last_name, em.first_name, de.dept_no
from employees as em left join dept_emp as de
on em.emp_no = de.emp_no;
```

> 查找所有员工入职时候的薪水情况，给出emp_no以及salary， 并按照emp_no进行逆序

这个题目左内链接都可以，关键在于 salaries表中的 from_data 和 employees表的 hire_date需要相同，所以限制条件为 em.hire_date=s.from_date，另外，salaries表中可能有多个相同的 emp_no的 salary，即emp_no在salaries表中不唯一，可能出现涨薪或降薪。

```SQL
select em.emp_no,sa.salary from employees as em left join salaries as sa on em.emp_no = sa.emp_no and em.hire_date=sa.from_data order by em.emp_no desc;
```

> 查找薪水涨幅超过15次的员工号emp_no以及其对应的涨幅次数t

涨幅次数通过 COUNT(*) 求得，通过关联条件 a.to_date = b.from_date 来限定两者工资比较是相邻的，如果不加上这个条件，那么同一个 emp_no 下的任意两个 salary 都可以比较。

```SQL
select a.emp_no,count(*) t
from salaries a inner join salaries b on a.emp_no=b.emp_no and a.to_date = b.from_date
where a.salary < b.salary
group by a.emp_no
having t > 15;
```

> 找出所有员工当前(to_date='9999-01-01')具体的薪水salary情况，对于相同的薪水只显示一次,并按照逆序显示

去重大家首先想到的就是 distinct，但是如果数据比较的情况，最好还是使用 group by，这样更快。

```SQL
select salary
from salaries
where to_date='9999-01-01'
group by salary
order by salary desc;
```

> 获取所有部门当前manager的当前薪水情况，给出 dept_no, emp_no 以及 salary，当前表示to_date='9999-01-01'

仔细阅读题目，题目中有两个当前，s.to_date = '9999-01-01'容易理解，限定当前时间当前工资，d.to_date = '9999-01-01'则限定在职经理

```sql
SELECT d.dept_no,d.emp_no,s.salary
from salaries s left join dept_manager d on d.emp_no = s.emp_no
where d.to_date = '9999-01-01' and s.to_date = '9999-01-01';
```

> 获取所有非manager的员工 emp_no

employees 作为主表，使用左联结，限定条件为d.dept_no为空，选择出在 employees 中但不在 dept_manager中的emp_no记录。

```SQL
select em.emp_no from employees as em left join dept_manager as dmon em.emp_no = dm.emp_no where dm.dept_no is null;
```

> 获取所有员工当前的manager，如果当前的manager是自己的话结果不显示，当前表示to_date='9999-01-01'。

有三个要点需要大家关注。

- 每个部门有一个 manager，每个人属于一个部门，所以使用部门号 dept_no 作为联结条件即可
- 如果当前manager是自己不显示，那么就要求 dept_emp表中的员工编号和 dept_manager的编号不能一样
- 还要求当前的manager，所以最后经理表的 dept_manager时间为 to_date='9999-01-01'

```SQL
SELECT
  de.emp_no,
  dm.emp_no AS manager_no 
FROM
  dept_emp de
LEFT JOIN dept_manager dm ON de.dept_no = dm.dept_no 
WHERE
  de.to_date = '9999-01-01'
AND dm.to_date = '9999-01-01'
AND de.emp_no <> dm.emp_no;
```

> 获取所有部门中当前员工薪水最高的相关信息，给出dept_no, emp_no以及其对应的salary

同样的先拆解题目，分为两点

- 先分组再取得各组的最高者，即使用 Group by d.dept_no 将部门分组，使用 MAX来求最高者
- 获取当前薪水，工资表和部门表的to_date都是'9999-01-01'

```sql
SELECT
  d.dept_no,
  s.emp_no,
max( s.salary ) AS salary 
FROM
  salaries s
LEFT JOIN dept_emp d ON s.emp_no = d.emp_no 
WHERE
  s.to_date = '9999-01-01'
AND d.to_date = '9999-01-01'
GROUP BY
  d.dept_no;
```

> 从titles表获取按照title进行分组，每组个数大于等于2，给出title以及对应的数目t。

这个题目就完全考察大家 group by 分组的要点了。

- 使用 group by 对 title 进行分组，然后使用 having找到大于等于2的组，这里需要大家主义的是，having必须在group 后面，而且有 group by 才使用 having。
- 使用count(*) 进行统计

```SQL
SELECT
  title,
count( title ) AS t 
FROM
  titles 
GROUP BY
  title 
HAVING
  t >= 2;
```

> 从titles表获取按照title进行分组，每组个数大于等于2，给出title以及对应的数目t。
> 注意对于重复的emp_no进行忽略。

```sql
SELECT
  title,
count( DISTINCT emp_no ) AS t 
FROM
  titles 
GROUP BY
  title 
HAVING
  t >= 2;
```

> 查找employees表所有emp_no为奇数，且last_name不为Mary的员工信息，并按照hire_date逆序排列

员工号为奇数，奇数特点即 emp_no 取余数为1，last_name 不是 Marry，使用’！=‘表示，另外逆序使用 desc

```sql
SELECT
  * 
FROM
  employees 
WHERE
  emp_no % 2 = 1
AND last_name != 'Mary'
ORDER BY
  hire_date DESC;
```

> 统计出当前各个title类型对应的员工当前薪水对应的平均工资。结果给出title以及平均工资avg。

- 创建薪水表

```sql
CREATE TABLE `salaries` (`emp_no` int(11) NOT NULL,`salary` int(11) NOT NULL,`from_date` date NOT NULL,`to_date` date NOT NULL,PRIMARY KEY (`emp_no`,`from_date`));CREATE TABLE IF NOT EXISTS "titles" (`emp_no` int(11) NOT NULL,`title` varchar(50) NOT NULL,`from_date` date NOT NULL,`to_date` date DEFAULT NULL);
```

- 实战sql

使用 group by 进行分组，当前用两表to_date='9999-01-01'进行限定，平均工资用聚合函数avg。

```SQL
SELECT
  t.title,
avg( salary ) AS avg
FROM
  salaries s
INNER JOIN titles t ON s.emp_no = t.emp_no 
WHERE
  s.to_date = '9999-01-01'
AND t.to_date = '9999-01-01'
GROUP BY
  t.title;
```

> 取当前（to_date='9999-01-01'）薪水第二多的员工的 emp_no 以及其对应的薪水 salary

- 现在工资表中找出最多的工资，然后使用子查询，以工资小于最大工资为限定条件
- 再使用 max(salary)在除去排名第一工资的表里找最大的工资，即找到排名第二的工资。

```sql
SELECT
  emp_no,
  salary 
FROM
  salaries 
WHERE
  salary = ( SELECT max( salary ) FROM salaries WHERE to_date = '9999-01-01' AND salary < ( SELECT max( salary ) FROM salaries ) );
```

> 查找当前薪水(to_date='9999-01-01')排名第二多的员工编号 emp_no、薪水salary、last_name以及first_name，不准使用order by

```sql
SELECT
  e.emp_no,
  s.salary,
  e.last_name,
  e.first_name 
FROM
  employees e
INNER JOIN salaries s ON e.emp_no = s.emp_no 
WHERE
  salary = ( SELECT max( salary ) FROM salaries WHERE to_date = '9999-01-01' AND salary < ( SELECT max( salary ) FROM salaries ) );
```

> 查找所有员工的 last_name 和 first_name 以及对应的 dept_name，也包括暂时没有分配部门的员工

- 创建部门表

```sql
CREATE TABLE `departments` (`dept_no` char(4) NOT NULL,`dept_name` varchar(40) NOT NULL,PRIMARY KEY (`dept_no`));CREATE TABLE `dept_emp` (`emp_no` int(11) NOT NULL,`dept_no` char(4) NOT NULL,`from_date` date NOT NULL,`to_date` date NOT NULL,PRIMARY KEY (`emp_no`,`dept_no`));CREATE TABLE `employees` (`emp_no` int(11) NOT NULL,`birth_date` date NOT NULL,`first_name` varchar(14) NOT NULL,`last_name` varchar(16) NOT NULL,`gender` char(1) NOT NULL,`hire_date` date NOT NULL,PRIMARY KEY (`emp_no`));
```

- 实战sql

需要理解三个表的关系

- 题目要求包含暂时没有分配部门的员工，那么将 employees 作为主表，使用左联结的方式和 dept_emp 表联结，联结条件为员工编号emp_no，得出所有员工所在部门，并将结果命名为a。
- 将查询结果a与departments左联结，联结条件为部门编号dept_no，求出部门名字dept_name。

```sql
SELECT  last_name,  first_name,  dept_name FROM 
(SELECT  e.last_name,  e.first_name,  de.dept_no 
 FROM  employees eLEFT JOIN dept_emp de ON e.emp_no = de.emp_no   ) aLEFT JOIN departments dp ON a.dept_no = dp.dept_no;
```

> 查找员工编号emp_no为10001其自入职以来的薪水salary涨幅值growth

- 员工入职以来工资最大值减去工资最小值

```sql
SELECT max( salary ) - min( salary ) AS growth FROM  salaries WHERE  emp_no = '10001';
```

> 查找所有员工自入职以来的薪水涨幅情况，给出员工编号emp_no以及其对应的薪水涨幅growth，并按照growth进行升序

- 先找出所有员工当前薪水和入职前薪水
- 联结employees表和salaries表，子查询a限定条件直接为当前时间'9999-01-01'，子查询b限定条件为入职时间，每个员工入职时间不一样，所以要使用谓词 in 找出在工资表里所有员工对应的最小时间。最后a，b子查询都要对员工编号进行分组。
- 最后将这两个子查询联结，联结条件为a.emp_no = b.emp_no，再按照题目要求对薪水涨幅进行升序排序。

```sql
SELECT  a.emp_no,  (a.salary - b.salary) AS growthFROM  
(SELECT  e.emp_no,  s.salary FROM  employees e LEFT JOIN salaries s ON 
e.emp_no = s.emp_noWHERE  s.to_date = '9999-01-01'GROUP BY s.emp_no) a,  
(SELECT  e.emp_no,  s.salary FROM employees e LEFT JOIN salaries s ON 
e.emp_no = s.emp_noWHERE s.to_date IN (SELECTmin(to_date) FROM  salaries s GROUP BY       s.emp_no  )GROUP BY s.emp_no) b WHERE  a.emp_no = b.emp_noORDER BY growth ASC;
```

> 统计各个部门的工资记录数，给出部门编码dept_no、部门名称dept_name以及次数sum

先找出两个关联表，departments 和 dept_emp 两个表进行关联，得到对应部门编号和部门名称，然后链接salaries，通过对部门分组获取每组的工资数

```sql
SELECT
  a.dept_no,
  a.dept_name,
count(*) AS sum
FROM
  (
SELECT
      d.dept_no,
      de.emp_no,
      d.dept_name
FROM
      dept_emp de
LEFT JOIN departments d ON de.dept_no = d.dept_no
  ) a
INNER JOIN salaries s ON a.emp_no = s.emp_no
GROUP BY
  a.dept_no;
```

> 对所有员工的当前(to_date='9999-01-01')薪水按照salary进行按照 1-N 的排名，相同 salary 并列且按照emp_no升序排列

这里使用了窗口函数 DENSE_RANK() 和 OVER() 来实现薪水按照salary进行按照1-N的排名，相同salary并列。不太了解的童鞋可以去学习哈哦。

```sql
SELECT
  emp_no,
  salary,
dense_rank () over (ORDER BY salary DESC) AS 'rank'
FROM
  salariesWHERE to_date = '9999-01-01'
ORDER BY
  salary DESC,
  emp_no ASC;
```

> 获取所有非manager员工当前的薪水情况，给出dept_no、emp_no以及salary ，当前表示to_date='9999-01-01'

首先将部门员工表 dept_emp 和部门 经理表 dept_manager 联结，通过 dept_emp 的员工编号和 dept_manager 的员工编号不相等找出非manager员工。

再联结工资表找出工资，记得限定工资表salaries和员工表dept_emp的时间都为to_date='9999-01-01'

```sql
SELECT a.dept_no,
 a.emp_no,
 s.salaryFROM (
  SELECT
    de.emp_no,
    de.dept_no
  FROM
    dept_emp de
  INNER JOIN dept_manager dm ON de.dept_no = dm.dept_no
  WHERE
    de.emp_no <> dm.emp_no
  AND de.to_date = '9999-01-01'
) aINNER
JOIN salaries s ON a.emp_no = s.emp_noWHERE s.to_date = '9999-01-01';
```

> 获取员工其当前的薪水比其manager当前薪水还高的相关信息，当前表示to_date='9999-01-01',
> 结果第一列给出员工的emp_no，
> 第二列给出其manager的manager_no，
> 第三列给出该员工当前的薪水emp_salary,
> 第四列给该员工对应的manager当前的薪水manager_salary

真的烦人，这 sql，哈哈哈哈。

- 先创建两个查询，分别找出非manager的员工编号、部门、薪水（如子查询a）和manager的员工编号，部门、薪水（如子查询b）
- a、b子查询都是联结dept_emp表和salaries工资表，使用 in 和 not in 谓词分别找出manager和员工，记得限定时间为当前。
- 最后将两个子查询以部门编号联结，找出在同一个部门的manager和员工，限定条件为员工工资大于manager工资。

```sql
SELECT
  a.emp_no,
  b.emp_no AS manager_no,
  a.emp_salary,
  b.manager_salary
FROM
  (
    (
SELECT
        de.emp_no,
        de.dept_no,
        s.salary AS emp_salary
FROM
        dept_emp de,
        salaries s
WHERE
        de.emp_no = s.emp_no
AND de.emp_no NOT IN (
SELECT
          dm.emp_no
FROM
          dept_manager dm
      )
AND s.to_date = '9999-01-01'
    ) a,
    (
SELECT
        de.emp_no,
        de.dept_no,
        s.salary AS manager_salary
FROM
        dept_emp de,
        salaries s
WHERE
        de.emp_no = s.emp_no
AND de.emp_no IN (
SELECT
          dm.emp_no
FROM
          dept_manager dm
      )
AND s.to_date = '9999-01-01'
    ) b
  )
WHERE
  a.dept_no = b.dept_no
AND a.emp_salary > b.manager_salary;
```

> 汇总各个部门当前员工的title类型的分配数目，结果给出部门编号dept_no、dept_name、其当前员工所有的title以及该类型title对应的数目count

```sql
SELECT
  de.dept_no,
  dp.dept_name,
  t.title,
count(t.title) AS count
FROM
  (
    titles t
LEFT JOIN dept_emp de ON t.emp_no = de.emp_no
AND t.to_date = '9999-01-01'
AND de.to_date = '9999-01-01'
  )
INNER JOIN departments dp ON de.dept_no = dp.dept_no
GROUP BY
  de.dept_no,
  t.title
```

> 给出每个员工每年薪水涨幅超过5000的员工编号emp_no、薪水变更开始日期from_date以及薪水涨幅值salary_growth，并按照salary_growth逆序排列。

```sql
SELECT
  s2.emp_no,
  s2.from_date,
  (s2.salary - s1.salary) AS salary_growth
FROM
  salaries s1
INNER JOIN salaries s2 ON s1.emp_no = s2.emp_no
WHERE
  s2.salary - s1.salary > 5000
AND (
extract(YEAR FROM s2.to_date) - extract(YEAR FROM s1.to_date) = 1
)
ORDER BY
  salary_growth DESC;
```

