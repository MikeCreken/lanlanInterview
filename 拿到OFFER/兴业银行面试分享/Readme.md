> 这是来自球友分享的兴业提前批经验贴，题解由蓝蓝编写，可以参考。

## 前言

面任何的企业，银行，了解其基本背景一定是没错的。更何况群面场景的丰富性，让我们无从下手。

鉴于此，我都会在介绍任何行之前，说一些基础内容，如果群面中遇到了，那么这很可能就是你能脱颖而出的理由，如果遇不到，了解此行的基本背景也无痛处。

从战略来看，兴业战略为"以金融科技为核心的趋动力"，可见其决心。再看看布局

- 金融科技体制改革基本完成

意味着科技队伍明显扩大，监管数据深入开展，研发职效逐步加强。

- 构建场景化新生态

G 端完善 “福建金服云”，落地 "宁夏金服云"平台。C端通过开放银行平台对接头部互联网平台从而获客。

- 数字化业务与业务数字化水平提高

智能化能力的加强，全集团上线智能风控模块，实现风险预警，模型分析，加快人工智能的应用场景。

- 推进开放银行

开放银行推出 12 大类 API 接口服务，将金融服务链接至教育，医疗，交通，汽车金融等场景。

2020 年科技投入排名第 9 ，48.62亿元，科技人员占比 4.82%。

## 招聘情况

兴业数金的招聘比较佛性：没有宣讲会，没有在各大应届生招聘平台卖广告，唯一的方式只有让新员工去牛客发内推帖子，不然都不知道有这么个公司招聘。

工作地点：**福州、上海、成都** ，缺人比较多，其他地方（杭州、深圳、武汉、广州、北京、苏州、西安）陆陆续续也在招但不多，成都工作地点位于高新区世纪城国际会展中心旁边的烟草兴业大厦；

[招聘网站](https://sc.hotjob.cn/wt/CIB/web/index?brandCode=100001)

兴业数金前几年是由兴业银行和几家银行外包公司共同参股的，最近两年被兴业银行收回成为全资子公司，并将总行的科技部的员工全部放到子公司了，个人猜测兴业为了去外包化最近还是比较缺人的。

## 笔试题型

笔者于 **7 月 1 日** 在兴业数金官网投递简历，一个多月迟迟没有消息，于是在牛客找员工内推，很快顺利拿到笔试资格。所以，大家要注意哈，其实蛮多信息是需要自己提前查询的，信息差能力是非常重要的技能。

- 笔试时间：**8** 月下旬 ，考试时间 **2** 个小时，考试链接有效期：48 小时内完成即可。

- 题型：选择（单选和多选：涵盖Java，计算机网络、数据库等内容）+一道简单编程题

- 能回忆选择题考察的点：存储过程、异常捕获、交换机的功能、序列化、线程优先级、SpringMVC、yield、数组等

- 代码题：分解质因子 

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder cache = new StringBuilder();
        cache.append(num).append("=");
        if (num < 4) {
            cache.append(num);
        } else {
            List<Integer> primeList = getPrime(num);
            int i = 0;
            while (num % primeList.get(i) != 0) {
                ++i;
            }
            cache.append(primeList.get(i));
            num = num / primeList.get(i);
            while(num != 1) {
                while (num % primeList.get(i) != 0) {
                    ++i;
                }
                cache.append("*").append(primeList.get(i));
                num /= primeList.get(i);
            }
        }
        System.out.println(cache);
    }
    static List<Integer> getPrime(int num) {
        int m = (int)Math.sqrt(num + 0.5);
        boolean[] vis = new boolean[num + 1];
        for (int i = 2; i <= m; ++i) {
            if (!vis[i]) {
                for (int j = i * i; j <= num; j += i) {
                    vis[j] = true;
                }
            }
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 2; i <= num; ++i) {
            if (!vis[i]) {
                ret.add(i);
            }
        }
        return ret;
    }
}
```

笔试的 4 天后很快通知第二天下午面试，面试共两轮：

## 面试

> 一面

**一面技术面：两个面试官，轮流问，共25-30分钟。**相对来说是有一定的技术含量的啦。

- 自我介绍+项目介绍+场景题

- 访问的用户量很大如果保证 **id** 不冲突？

-  项目中Redis怎么用的，遇到过哪些问题和异常？

- Redis 底层存储机构？你在项目中用了哪些？

- 如何保证Redis于数据库的一致性？

早就知道要问我 Redis 这么多知识点，因为确实复习了这一块，哈哈哈哈哈。说到 Redis 多半就跑不了数据库缓存一致性。那岂不是很简单，我昂首挺胸的直接上头

更新的时候，先更新数据库，然后再删除缓存。度的时候呢，先读缓存，如果没有再读数据库，同时将这个数据放入缓存，并返回响应。

面试官吃惊了，大吼一声，你确定？

我突然怂了，差点认错。仔细想想，发现确实有些问题，如果先更新了数据，删除缓存的时候出错了怎么搞勒？此时数据库是更新完的数据，但是缓存中是老的数据，就出现不一致勒呀。

> 改进改进

这样先抑后扬的操作在我数次面试中拿捏的死死的。

![](https://img-blog.csdnimg.cn/3b042d5a5e73484a9efa244a69f35da9.jpg?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

先删除缓存，然后更新数据库。此时如果后面更新数据库失败了，缓存是空空的，度的时候会从数据库重新拉取，虽然都是旧的数据，但是两口子是保持一致的。

我瞬间站起了，呀，面试官，方案应该是这样的。

更新的时候，先删除缓存，然后再更新数据库。

读的时候，先读缓存；如果没有的话，就读数据库，同时将数据放入缓存，并返回响应。

面试官的表情慢慢暗淡，怎么回事？阿这？就完美了，你简历不写了高并发？头发？

![](https://img-blog.csdnimg.cn/b3f898f439f74ef194a9c4134f4b5768.jpg?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

哎，这面试官完全就在我套路之中，那就继续回答。我想想，在数据发生变更的时候，先删除缓存，然后修改数据库，如果动作有点慢，还没来得及修改，新的请求就过来了，读缓存发现缓存是空的，然后读数据库，读到了准备修改前的旧的数据，然后把旧的数据放在了缓存，随后，数据变更程序完成了数据库的修改。那么完了，这个时候发生数据不一致了......GGG

![](https://img-blog.csdnimg.cn/d1bec38028b948f488e4aa23e95cb366.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

所有，后面采取的是，将修改 DB 这个操作放在 JVM 队列中，后面请求来了后，“更新缓存”的操作也放进同一个JVM队列,每个队列，对于一个作业线程，按照队列的顺序，依次执行相关操作，这样就可以保证“更新缓存”一定是在DB修改之后，以保证数据一致性，具体如下图所示

![](https://img-blog.csdnimg.cn/8e699b892ffb4bb08b34dce106d2410f.png)

面试官脸色慢慢红润，但其鄙视的眼神还是出卖了他的心灵，但是他已经知道我还有后续，顾放弃了挣扎，拿去 OFFER 吧。哈哈哈哈，问点其他的

- Redis 集群了解过么？

- 面向对象的特性？如何理解的，详细说说？

纳尼，上来就是问有没有对象？是担心昂加班没人陪？这些小招数对我并没有用，小天才不是白叫的。

孤独的变量反复弱鸡一样，必须拉 A，B 两个可战斗的队友一起，A 会跳舞来让对手眼花缭乱，B 一套咏春拳让你迷失自我，三者就组成了一个类，这就是第一个特性**封装**了。

B 选手年纪已达，需要把些小招数继承个弟子，可又不完全给弟子，因为那是它的私活(private)确实不想告诉任何人，至于弟子和师傅相同的技能(重写)，弟子可以加强其技能。这就是**继承**。

继承是多态的前提，可以通过不同的事物来体系那不同的形态，即多态。

- Java的重载和重写有什么区别？

重载？小三上位？还重写？二婚？这太离谱了吧。

重载发生在同一个类，方法名相同，参数列表不同，和返回值无关，只和方法名，参数的类型有关。

注意：

1. 重载的方法必须具有不同的参数列表。
2. 不能通过访问权限，返回类型，抛出的异常进行重载。
3. 方法的异常类型和数目不会对重载造成影响。
4. 可以有不同的返回类类型，只要参数列表不同就可以了。
5. 可以有不同的访问修饰符。
6. 可以抛出不同的异常。

为了加强对基本概念的理解，看看代码。

```java
public class lanlan {
//参数数目不同
public void out() {
    System.out.println("参数为空");
}
public void out(Integer n) {
    System.out.println("参数"+n.getClass().getName());
}
//参数类型不同
public void out(String string) {
System.out.println("参数"+string.getClass().getName());
}
public void out(Integer n ,String s) {
System.out.println("参数"+n.getClass().getName()+","+s.getClass().getName());    
}
//参数顺序不同
public void out(String s,Integer n) {
System.out.println("参数"+s.getClass().getName()+","+n.getClass().getName());    
}
 
public static void main(String[] args) {
    lanlan test1 = new lanlan();
    test1.out();
    test1.out(1);
    test1.out("string");
    test1.out(1,"string");
    test1.out("string",1);
}
```

看看其输出结果，是否为你所预期的呢？

![](https://img-blog.csdnimg.cn/a897509f999c4420aa72cb600cd8fc2d.png)

- 什么是事务？有哪些特性？

>  事务概念基本概念

事务由单独单元的一个或多个SQL语句组成，在这个单元中，每个SQL语句是相互依赖的。而整个单独单元作为一个不可分割的整体，如果单元中某条SQL语句一旦执行失败或产生错误，整个单元将会回滚。所有受到影响的数据将返回到事物开始以前的状态；如果单元中的所有SQL语句均执行成功，则事物被顺利执行。

⑴  原子性（Atomicity）

原子性是指事务包含的所有操作要么全部成功，要么全部失败回滚。

⑵  一致性（Consistency）

一致性是指事务必须使数据库从一个一致性状态变换到另一个一致性状态，也就是说一个事务执行之前和执行之后都必须处于一致性状态。
拿转账来说，假设用户 A 和用户 B 两者的钱加起来一共是 5000，那么不管A和B之间如何转账，转几次账，事务结束后两个用户的钱相加起来应该还得是 5000，这就是事务的一致性。

⑶ 隔离性（Isolation）

隔离性是当多个用户并发访问数据库时，比如操作同一张表时，数据库为每一个用户开启的事务，不能被其他事务的操作所干扰，多个并发事务之间要相互隔离。
即要达到这么一种效果：对于任意两个并发的事务T1和T2，在事务T1看来，T2要么在T1开始之前就已经结束，要么在T1结束之后才开始，这样每个事务都感觉不到有其他事务在并发地执行。

⑷ 持久性（Durability）
持久性是指一个事务一旦被提交了，那么对数据库中的数据的改变就是永久性的，即便是在数据库系统遇到故障的情况下也不会丢失提交事务的操作。

- 了解MySQL索引吗，有哪些索引，你[项目]()中用到索引了吗？
- 聚簇索引是什么？

又是索引，说到数据库都离不开它，数据量大了，不用点基本索引套路，客户就要叫爹叫妈了，哎呀，这都什么破玩意儿呀。。。。

> 什么是聚族索引

举个例子，爱学习的我们期末前两个星期经常泡在图书馆，有时候就会去 B 区 3 柜 3 排 5 仓拿书，这很清晰，走到 A 区就可以很快知道 B 区，直奔 3 柜就可找到。其思想就类似聚族索引了。

聚簇索引，实际存储的**循序结构与数据存储的物理机构**是一致的，所以通常来说物理顺序结构只有一种，那么一个表的聚簇索引也只能有一个，通常默认都是主键，设置了**主键**，系统默认就为你加上了聚簇索引，当然有人说我不想拿主键作为聚簇索引，我需要用其他字段作为索引，当然这也是可以的，这就需要你在设置主键之前自己手动的先添加上唯一的聚簇索引，然后再设置主键，这样就木有问题啦。

**总而言之**，聚簇索引是顺序结构与数据存储物理结构一致的一种索引，并且一个表的聚簇索引只能有唯一的一条；

- 哪些情况索引会失效？

这样类似的问法很多，加了索引就一定快？索引失效的场景等。

1. 如果条件中有or，即使其中有条件带索引也不会使用(**这也是为什么尽量少用or的原因**)

![](https://img-blog.csdnimg.cn/0f690bb460e846bfa98b85d092cb2aef.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

2. like查询是以%开头

![](https://img-blog.csdnimg.cn/58a570730caf4cfeb8c69f3c22ec23c6.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

3. 如果列类型是字符串，那一定要在条件中将数据使用引号引用起来,否则不使用索引

![](https://img-blog.csdnimg.cn/26ea1ad5de414c8b9e91164e82d26a6e.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

- JVM 内存结构讲一下，哪些私有，哪些共有？GC算法有哪些？讲讲CMS？新生代和老年代的比值？

涉及到 Java 的进阶知识，后面单独的介绍 JVM。

- 二叉树的高度？口述思路。

二叉树的高度是二叉树结点层次的最大值，也就是其左右子树的最大高度+1

```java
/**
     * 通过递归的方式求出二叉树高度，这种方式很难想
     * @param node
     */
    public static int getHeightByRecursion(Node<Integer> node){
        if (node == null || node == null) return 0;
        int left = getHeightByRecursion(node.left);
        int right = getHeightByRecursion(node.right);
        if (left > right){
            return left + 1;
        }else {
            return right + 1;
        }
    }
```

> 二面

**二面综合面：在一面后的5天，有人是项目主管有人是HR**，**10-15** 分钟

面试的前一天会给你一张表，WORD 格式的填写个人主要信息（我直接从简历粘贴进来），面试当天就照着这张表来问，个人情况，从高中到研究生开始查户口，奖学金，学生工作这些；

然后问了为什么选择成都？抗压能力？接收加班么？

反问环节：公司的培养制度和业务范围；

二面结束第二天收到提交材料通知内审，再过一天收到体检通知；

**随后的周末还有个通用测评**（不知道做这个测评为什么要放在面试之后？）;

题量巨大的行测题（一小时）+三篇英语阅读（半小时）+性格测试（四十分钟）；题量太大了根本答不完。

## 总结

本文到此就结束了，如有不对的地方，烦请大家指出，如有所帮助，麻烦点赞，在看，转发，感谢。需要 PDF 的小伙伴，可以直接私信我。



需要进星球的小伙伴，可以直接领取卷，目前就只有 15 的优惠卷了，先到先得罗。
