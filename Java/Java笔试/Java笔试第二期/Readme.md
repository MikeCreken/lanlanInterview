大家好，我是蓝蓝，现在开始和大家一起总结笔试中 Java 第二部分，其中包含选择，填空及问答，每个题目都会涉及相应的知识点，一共包含四期，这是第二期，那就开始了。

## 1 什么叫多态

多态是同一个行为具有多个不同表现形式或形态的能力，即同一个接口采用不同的实例而执行不同的操作。

我们都知道面向对象有四个基本特性: 抽象,封装,继承,多态.概括可以理解为,抽象,封装,继承,是多态的基础,多态是抽象,封装,继承的表现.多态,是Java中非常重要的一部分.
简单理解:不同类的 对象 对同一消息 做出了不同的响应就叫做多态, 比如上课铃声响了,上体育课的学生跑到操场上站好,而上英语课的学生会在班级做好 一样.

多态的作用:

简单讲 就是 解耦.详细点说就是,多态是设计模式的基础,不能说所有的设计模式都使用到了多态,但是23种设计模式中 多数都是基于多态的!

多态存在的三个条件

**1.有继承的关系
2.子类重写父类方法
3.父类引用指向子类对象
**

## 2 以下哪个选项属于多态存在的必要条件

A：继承

B：重写

C：父类引用指向子类对象

**D：以上都是**

多态存在的必要条件：继承、重写、父类引用指向子类对象

## 3 以下哪些属于多态的优点

**A：可替换性和可扩充性**

**B：接口性**

**C：简化性和灵活性**

增强类型之间的耦合关系

## 4 在Java中有以下两种方式可以实现多态：________、________

继承、接口

## 5 Java实现多态仅有两个必要条件：继承、重写

错误

Java实现多态有三个必要条件：继承、重写、向上重载

## 6 在接口的多态中，指向接口的引用必须是指定这实现了该接口的一个类的实例程序

正确

在接口的多态中，指向接口的引用必须是指定这实现了该接口的一个类的实例程序，在运行时会根据对象引用的实际类型来执行相应的方法

## 7 当父类对象引用变量指向子类对象时，是通过被引用对象的类型还是引用变量的类型来决定调用谁的成员方法？

通过被引用对象的类型来决定，且这个被调用的方法必须是在父类中定义过的，也就是被子类覆盖的方法。

## 8 请简述多态的优点

可替换性、可扩充性、接口性、简化性、灵活性、消除类型之间的耦合关系

## 9 以下关于抽象类的说法哪个是错误的？

A：抽象类必须使用 abstract 修饰符来修饰

B：抽象方法必须使用 abstract 修饰符来修饰

C：抽象方法不能有方法体

**D：抽象类中必须至少有一个抽象方法**

抽象的关键字为 abstract，定义抽象类和方法时必须显示的使用该修饰符。抽象方法在声明时，不能有方法体，其实现放在继承它的子类中。抽象类中可以没有抽象方法。

## 10 以下关于抽象类的说法哪个是正确的？

A：关键字 abstract 和 static 可以同时修饰一个方法

**B：有抽象方法的类必定是抽象类**

C：抽象类可以被实例化

D：关键字abstract和final可以同时修饰一个方法

抽象关键字不可以和static、final、private等关键字并存，因为抽象类必须要在继承它的子类中实现，而final、static都不可被修改，private则无法被继承。因为抽象类的构造方法没有意义，故而不可以被实例化。

## 11继承接口的关键字是________

implements

## 12 下列有关抽象类的叙述正确的是哪项？

A：抽象类中一定含有抽象方法

**B：抽象类的声明必须包含abstract关键字**

C：抽象类既能被实例化也能被继承

D：抽象类中不能有构造方法

抽象类的声明必须包含abstract关键字，这样才算是一个抽象类。而抽象类中可以没有抽象方法，也不能被实例化。抽象类有构造方法，但是没有意义。

## 13 下列有关接口的叙述错误的是哪项？

A：接口中只能包含抽象方法和常量

**B：一个类可以实现多个接口**

C：类实现接口时必须实现其中的方法

D：接口不能被继承

接口中包含普通方法，一个类可以实现多个接口，而且实现接口时必须实现其中的方法。

## 14 下列关于接口的定义哪项是正确的？

A：interface C{int a；}

B：public interface A implements B  {}

**C：public interface A  {int a()；  }**

D：abstract interface D{}

A 中不能有成员变量，因为是接口而不是类，B 中是实现接口而不是定义，D 中关键字 abstract 是定义抽象类的而不是接口

## 15 接口中的所有成员变量都默认由________修饰符修饰

**public static final**

## 16 接口中的所有成员方法都默认由________修饰符修饰

**public abstract**

## 17 抽象类实现接口必须实现所有接口内部定义的方法

**错误**

## 18一个接口可以实现另一个接口

**错误**

## 19 什么叫重载？

在同一个类中，存在多个方法的方法名相同，参数列表不同

## 20 下列选项哪个选项能说明参数列表不同？

**A：参数个数不同**

**B**：**参数的数据类型不同**

**C**：**不同参数类型的参数顺序不同**

D ：相同参数类型的参数顺序不同

## 21方法重载，既可以发生在普通方法上，也可以发生在构造方法上。既可以发生在同类中，也可以发生在父子类中。

正确

1、子类继承父类的方法，就相当于是自己定义的，所以可以发生在父子类中。

## 22 以下关于重写的说法正确的有？

**A：覆盖的方法的标志必须要和被覆盖的方法的标志完全匹配，才能达到重写的效果**

**B：覆盖的方法的返回值必须要和被覆盖的方法的返回值完全匹配，才能达到重写的效果**

**C：覆盖的方法所抛出的异常必须要和被覆盖的方法一致，或者是其子类**

**D：被覆盖的方法不能定义为private**

1、被覆盖的方法不能定义为private,否则在其子类中指示重新定义了一个方法，并没有对其进行覆盖。
2、其他的根据重写的定义可知。

## 23 编写三个方法，分别为无参数、一个整型参数和一个字符串型参数，分别调用三个方法

```java
public class Chongzai {
    public static void main(String[] args) {
        print();
        print("hahaha");
        print(666);
    }
    

    public static void print() {
        System.out.println("无参的print方法");
    }
    public static void print(int a) {

System.out.println("带有一个整型参数的print方法，参数值为：" + a);
}
    public static void print(String a) {
        System.out.println("带有一个字符串参数的print方法，参数值为：" + a);
    }

}
```

## 24 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系。

```java
public class Test {
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
    // 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系。
    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 2;
        System.out.println(max(a1, b1));
        double a2 = 1.1;
        double b2 = 2.2;
        System.out.println(max(a2, b2));
        System.out.println(max(a2, b2, b1));
    }
    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    private static double max(double a, double b) {
    if (a > b) {
        return a;
    } else {
        return b;
    }

	private static double max(double a, double b,int c) {
  	 	 double temp = (a > b ? a : b) > c ? (a > b ? a : b) : c;
   		 return temp;
    }
}
```

## 25 实现 Runnable 接口，必须重写 Runnable 的哪个方法？

**A：start()**

**B：sleep()**

C：run()

D：wait()

## 26 下列有关于super说法正确的是

A： **其他几项都不对**

B：这是一个编译器指令

C：run() 这是一个方法

D：wait()   这是一个对象

## 27 抽象类和接口的区别：____只有定义，____可以有定义和实现

接口、抽象类

## 28 定义一个接口时，需要用到什么关键字

A：class

**B：implements**

C：extends

D：implements

## 29 多态的表现形式（）

A：**重写**

B：抽象

C：继承

D：封装

## 30 关于抽象的说法不正确的是

A：包含抽象方法的类必须是抽象类

B：抽象类不可以被实例化

C：抽象类可以被继承

**D：抽象类不可以包含非抽象方法**

 抽象类可以包含非抽象方法。

## 31有如下一个抽象类

abstract class A{
		public abstract void add();
}则,下面正确的是:(多选)

A：

```java
class B extends A{
		public void delete(){
		}
}
```

B：

```java
B：class B extends A{
     public void delete(){
     System.out.print("b");
}}
```

**C:**

```java
abstract class B extends A{
	public void update();
	}
}
```

**D:**

```java
abstract class B extends A{
	public void update();
	}
}
```



选项A中B类没有声明为抽象方法且没有实现A的抽象方法。选项B也是一样。c中虽然没实现add方法，但C仍为抽象类，D中实现了add方法，也可以定义为抽象类。

## 32 对抽象和接口来讲,以下正确的是?

A：抽象类不可以被实例化,而接口可以.

B：抽象类可以被实例化,而接口不行.

C：一个类可以继承多个抽象方法,

D：**一个类可以实现多个接口**

抽象类和接口都不可以被实例化，一个类可以实现多个接口，不可以继承多个类。

## 33 以下不正确的是

A:

```java
interface A {
public String getName();
  retrun "name";
}
```

B:

```java
Interface A {
String getName();
}
```

C:

```java
interface A {
static  String name="a";
}
```

**D：**

```java
abstract A {
     public static  abstract String getName();

}
```

 抽象方法不可以定义为静态。

## 34 以下java接口定义是否正确?为什么?

```java
interface A{
int i;
}
```

不正确，接口A中的属性i，默认为final stratic的，所以必须初始化值。

## 35 以下java接口定义是否正确?为什么?

```java
interface A{
	int j = 0;
}
class Main(){
	public static void main(String[] args){
	A.j++;
	}
}
```

不正确，接口A中的属性i，默认为final stratic的，不可以再改变值

## 36 以下抽象类定义是否正确?为什么?

```java
abstract class A{
	private String a;
	private abstract void getName();
}
```

不正确，抽象方法不可以定义为私有的。

## 37 以下抽象类定义是否正确?为什么?

```java
interface A{
	String a = “initial”;
	private void getName();
}
```

不正确，接口中的未实现的方法只能定义为public的类型.

## 38 下方代码结果

```java
abstract class C{
   private String a;
   public  void getName(){
      System.out.println("C");
   }

}
public class Test extends C{
   public static void main(String[] args) {
      Test test = new Test();
      test.getName();

   }
}
```

运行是否报错？什么原因。如果运行正确的话，结果是什么？

正确。C

由于Test类继承自C类，test对象执行getName（）方法会调用定义在抽象类C中的getName方法。

## 39 ArrayList list=new ArrayList(20);中的list扩充几次（）

**A. 0**

B. 1

C. 2

D. 3

已经指定了长度, 所以不扩容

## 40 List、Set、Map哪个继承自Collection接口，以下说法正确的是（）

A. List Map

B. Set Map

**C. List Set**

D. List Map Set

Map接口继承了java.lang.Object类,但没有实现任何接口

## 41 以下结构中，哪个具有同步功能（）

A. HashMap

**B. ConcurrentHashMap**

C. WeakHashMap

D. TreeMap

A，C，D都线程不安全，B线程安全，具有同步功能

## 42 以下结构中，插入性能最高的是（）

A. ArrayList

**B. Linkedlist**

C. tor

D. Collection

数组插入、删除效率差，排除A
tor 不是 java 里面的数据结构，是一种网络路由技术；因此排除C
Collection 是集合的接口，不是某种数据结构；因此排除D

## 43 以下结构中，哪个最适合当作stack使用（）

A. LinkedHashMap

B. LinkedHashSet

**C. LinkedList**

Stack是先进后出的线性结构；所以链表比较合适；不需要散列表的数据结构

## 44 下列叙述中正确的是（）

A. 循环队列有队头和队尾两个指针，因此，循环队列是非线性结构

B. 在循环队列中，只需要队头指针就能反映队列中元素的动态变化情况

C. 在循环队列中，只需要队尾指针就能反映

**D. 在循环队列中元素的个数是由队头指针和队尾指针共同决定的列中元素的动态变化情况**

分析：循环队列中元素的个数是由队首指针和队尾指针共同决定的，元素的动态变化也是通过队首指针和队尾指针来反映的，当队首等于队尾时，队列为空。

## 45 ArrayList类的底层数据结构是(  )

**A、数组结构**

B、链表结构

C、哈希表结构

D、红黑树结构

ArrayList类的底层数据结构是数组结构

## 46 LinkedList类的特点是(  )

A、查询快

**B、增删快**

C、元素不重复

D、元素自然排序

底层链表结构，查询慢，增删快

## 47 Vector类的特点是(  )

**A、线程同步**

B、线程不同步

C、增删快

D、底层是链表结构

数据结构基于数组，插入删除效率低，线程安全

## 48 关于迭代器说法错误的是()

A、迭代器是取出集合元素的方式

B、迭代器的hasNext()方法返回值是布尔类型

C、List集合有特有迭代器

**D、next()方法将返回集合中的上一个元素**

## 49 关于泛型的说法错误的是()

A、泛型是JDK1.5出现的新特性

B、泛型是一种安全机制

C、使用泛型避免了强制类型转换

**D、使用泛型必须进行强制类型转换**

## 50 以下java程序代码，执行后的结果是（）

A、java.util.HashMap map=new java.util.HashMap(); 

B、map.put("name",null);

**C、map.put("name","Jack");**

D、System.out.println(map.size());

HashMap 可以插入 null 的 key 或 value，插入的时候，检查是否已经存在相同的key，如果不存在，则直接插入，如果存在，则用新的value替换旧的value，在本题中，第一条 put 语句，会将 key/value 对插入 HashMap，而第二条 put，因为已经存在一个 key 为 name 的项，所以会用新的 value 替换旧的value，因此，两条 put 之后，HashMap 中只有一个 key/value 键值对。那就是（name，jack）。所以，size为1。

## 51 Java的集合框架中重要的接口java.util.Collection定义了许多方法。选项中哪个方法不是Collection接口所定义的（ ）

A、int size()

B、boolean containsAll(Collection c)

C、compareTo(Object obj)

D、boolean remove(Object obj)

## 52 下面有关java HashMap的说法错误的是（）

A、HashMap 的实例有两个参数影响其性能：“初始容量” 和 “加载因子”。

B、HashMap 的实现不是同步的，意味着它不是线程安全的

**C、HashMap通过开放地址法解决哈希冲突**

D、HashMap中的key-value都是存储在Entry数组中的

HashMap采用拉链法（链地址法）解决冲突

## 53 下列关于容器集合类的说法正确的是（）？

A、LinkedList继承自List

B、AbstractSet继承自Set

**C、HashSet继承自AbstractSet**

D、WeakHashMap继承自HashMap

A选项Linkedlist类是实现了List接口，而不是继承；
B选项AbstractSet类实现Set接口；
C选项HashSet继承 AbstractSet类，同时也实现set；
D 选项WeakHashMap继承自 Abstract Map

## 54 下面关于Collection和 Collections的区别正确的是()

A、Collections是集合顶层接口

B、Collection是针对Collections集合操作的工具类

C、List、Set、Map都继承自Collection接口

**D、Collections是针对Collection集合操作的工具类**

## 55 关于HashMap的实现机制，下面哪些描述是正确的（）

A、HashMap中key-value 当成一个整体进行处理，系统总是根据 数组的坐标来获得 key-value 的存储位置。

**B、HashMap基于哈希表的 Map 接口的实现，允许使用 null 值和 null 键。**

C、如果HashMap中，如果Key的hash相同的话，HashMap将会出错。

D、HashMap每次容量的扩增都是以2的倍数来增加。

A 错误，HashMap是无序的,所以无下标的说法
B 正确，但是干扰性很强；键对象不允许重复，但是可以为null，即只能有一个key值为null的映射；而value可以重复，也可以为null；
C 错误，不会出错,而是新的值替代了旧的值；
D 错误，HashMap的容量一定是2的倍数, 但是不是以2的倍数类递增。

## 56 JAVA8中，下面哪个类用到了解决哈希冲突的开发定址法（）

A、LinkedHashSet

B、HashMap

**C、ThreadLocalMap**

D、TreeMap

## 57 Java中的集合类包括ArrayList、LinkedList、HashMap等类，下列关于集合类描述错误的是( )

A、ArrayList和LinkedList均实现了List接口

B、ArrayList的访问速度比LinkedList快

**C、添加和删除元素时，ArrayList的表现更佳**

D、HashMap实现Map接口，它允许任何类型的键和值对象，并允许将null用作键或值

A 正确，因为ArrayList和LinkedList都实现List接口。 
B 正确，ArrayList底层是数组，所以查询快，增删慢；而LinkedList底层是链表，查询慢，增删快。 
C 错误，见B解析。 
D 正确，描述正确，有一个Hashtable类，是不允许null作键和值的。

## 58 list是一个ArrayList的对象，哪个选项的代码填到//todo delete处，可以在Iterator遍历的过程中正确并安全的删除一个list中保存的对象？（）

```java
Iterator it = list.iterator();
int index = 0;
while (it.hasNext())
{
    Object obj = it.next();
    if (needDelete(obj))  //needDelete返回boolean，决定是否要删除
    {
        //todo delete
    }
    index ++;
}
```

A、it.remove();

B、list.remove(obj);

C、list.remove(index);

D、list.remove(obj,index);

Iterator  支持从源集合中安全地删除对象，只需在 Iterator 上调用 remove() 即可。这样做的好处是可以避免 ConcurrentModifiedException ，当打开 Iterator 迭代集合时，同时又在对集合进行修改。有些集合不允许在迭代时删除或添加元素，但是调用 Iterator 的remove() 方法是个安全的做法。

## 59 HashMap和Hashtable的区别：

a：HashMap不是线程安全的，而HashTable是线程安全的；

b：HashMap允许空的值和空的值，而HashTable则不允许；

c：HashMap的性能要优于HashTable。

## 60 集合和数组的区别：

a：数组是固定长度的，集合可变长度的;

b：数组可以存储基本数据类型，也可以存储引用数据类型，集合只能存储引用数据类型;

c：数组存储的元素必须是同一个数据类型，集合存储的对象可以是不同数据类型。

## 61 ArrayList和LinkedList的区别：

a：ArrayList是实现了动态数组的数据结构，LinkedList基于链表的数据结构。

b：对于随机访问get和set，很明显ArrayList的性能要优于LinkedList。

c：对于增加和删除操作add和remove，LinkedList占优势。

d：当操作是在一列数据的后面添加数据而不是在前面或中间，并且需要随机地访问其中的元素时，使用ArrayList性能比较好；当操作是在一列数据的前面或中间添加或删除数据，并且按照顺序访问其中的元素时，就应该使用LinkedList了。

## 62 List和Set的区别：

a：两者都继承自Collection接口

b：List集合内的的元素是有序的，元素可以重复

c：Set集合内的元素是无序的，但元素不可以重复

## 63 生成10个1到20之间的不重复的随机数

```java
package hashset;

import java.util.HashSet;
import java.util.Random;

public class Test1_HashSet {

 public static void main(String[] args) {
      //1.创建Random对象
      Random r = new Random();
      //2.创建HashSet对象
      HashSet<Integer> hs = new HashSet<>();  //注意是包装类不是int
      //3.判断并添加元素
      while(hs.size()< 10) {
       //4.通过Random中随机方法nextInt()获取1到20范围内随机数
       hs.add(r.nextInt(20) + 1);   //如果不加1，随机范围是0到19
      }
      //5.遍历HashSet
      for (Integer integer : hs) {
       System.out.println(integer);
      }
     }
}
```

## 64 从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来。

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyWord {
public static void main(String[] args) {
     //1.创建List对象
      List<String> list = new ArrayList<String>();
      //2.将数字放入集合
      Scanner in = new Scanner(System.in);
      System.out.println("请输入需要排序的单词数量");
      int num = in.nextInt();
      System.out.println("请一次输入单词");
      for(int i = 0;i<num;i++){
       		list.add(in.next());
      }
      //3.集合数字排序
      for(int j = 0;j<list.size()-1;j++){
       	for(int i = 0;i<list.size()-1-j;i++){
       	   if(list.get(i).compareTo(list.get(i+1))>0){
        	 String temp = list.get(i);
         	 list.set(i, list.get(i+1));
         	 list.set(i+1, temp);
         }
        }
       }
      //4.打印数字
       for(int i = 0;i<list.size();i++){
         System.out.println(list.get(i));
       }
 }
}
```

## 65 HashMap的说法正确的是（）

A：底层是数组结构

B：底层是链表结构

**C：可以存储null值和null键**

D：不可以存储null值和null键

## 66 对 Map 的用法，正确的有：

A：new java.util.Map().put("key" , "value") 

B：new java.util.SortedMap().put("key" , "value") 

**C：new java.util.HashMap().put( null , null )** 

**D：****new java.util.TreeMap().put( 0 , null )**

A选项Map属于接口类型，不可以new的方式创建对象。所以A错误。

B选项SortedMap属于接口类型，不可以new的方式创建对象。所以B错误。

C选项HashMap基于哈希表实现Map接口的类，并允许null的值和null键。

D选项TreeMap通过红黑树实现Map接口的类，key不可以为null，会报NullPointerException异常,value可以为null。

## 67 HashMap和Hashtable正确的说法有（）

**A：都属于Map接口的类**

B：Hashtable 类不是同步的，HashMap类是同步的

**C：Hashtable 类不允许 null 键和 null 值**

**D：****HashMap 类允许null 键和null 值**

## 68 映射 (Map) 的key和value都不可重复。

x

## 69 List，Set，Map都继承自继承Collection接口。

x

## 70 映射 (Map) 的key和value都不可重复。 

x

## 71 Map集合中的元素都是成对出现的，并且都是以（）、（）的映射关系存在的。

键/key；值/value

## 72 请简述Hashtable和HashMap的区别。

1、Hashtable是线程安全的；HashMap非线程安全

2、Hashtable的key和value都不能为null；HashMap的key和value都可以为null，key为null的只能有一个，value为null的可以有多个

3、Hashtable的默认容量为11，HashMap的默认容量为16。初始化时，传入的容量多大，Hashtable就有多大；HashMap会将它转为2的幂

4、Hashtable的扩容为2*n+1，HashMap的扩容为2*n

## 73 给定一个字符串集合，集合大小为n，n=6000000, 请问从集合中查询字符串，以下算法中最快速的是哪一个？

A：skiplist（跳表）

B：B 树

**C：哈希表**

D：红黑树

哈希表查询时间复杂度为O(1)

## 74 使用Iterator迭代集合元素时，可以调用集合对象的方法增删元素。这句话是否正确？ 

正确

## 75 想要集合中保存的元素没有重复并且按照一定的顺序排列，可以使用以下哪个集合？ 

A：LinkedList

B：ArrayList

**C：HashSet**

D：TreeSet

## 76 如下Java代码，输出的运行结果是（）

```java
public class Test {

    public static void main(String[ ] args) {

        List<String> list=new ArrayList<String>();

        list.add("str1");

        list.add(2, "str2");

        String s=list.get(1);

        System.out.println(s);

    }

}
```

**A：运行时出现异常**

B：正确运行，输出str1

C：正确运行，

D：编译时出现异常

List不以key/value的方式存储

## 77 给定如下Java代码，编译运行的结果是（ ）

```java
public class Test {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        String s = "code";

        map.put(s, "1");

        map.put(s, "2");

        System.out.println(map.size());

    }

}
```

A：编译时发生错误

B：运行时引发异常

**C：正确运行，输出：1**

D：正确运行，输出：2

HashMap,存储元素时，元素会作为HashMap的key存入，而HashMap的key是不会重复的。

## 总结

后面会慢慢的迭代这些内容，虽然十一月了，大家也不要放弃哟，机会都是留给准备好的你们呢。好了，拜拜~~~

稍等，记得去我的 Github 点个 Star~~~

蓝蓝的 Github：[点Star就上岸哟](https://github.com/MikeCreken/lanlanInterview)

这里还有一个在线的网站方便大家复习。[](https://lanlanbank.gitee.io/lanlan-interview/#/)

Github不知道会做到什么时候，才一个月时间，现在已经有些人那我这丢丢资料去卖给人家，哎，挺无语的，需要的小伙伴可以去下载，记得给我点个 Star 哈。

，不上岸找我，哼~~

![](https://img-blog.csdnimg.cn/bb60cc286d8b42d7ae925e9176a9a65c.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

蓝蓝的公众号：暖蓝笔记

[暖蓝笔记公众号](https://mp.weixin.qq.com/s?__biz=MzAxMDMzOTEwMA==&mid=2453507437&idx=1&sn=7c805cc389e91e7c2da8affa8bcacbbf&chksm=8c98fb1ebbef72089666c7b716637ab9c8d54b84d9345799dd73ee43560bbdedb3cda62bc1e3&token=112701746&lang=zh_CN#rd)


**蓝蓝的星球：蓝蓝银行小分队**

这个星球将给大家进行**简历修改**(针对性的修改)及所有文章**PDF**版本的领取，一定是物有所值的啦。


<div align=center>
<img src="https://img-blog.csdnimg.cn/5b35f132dd5e490abbc64f08aef7cf56.png" width="50%" height="50%">
</div>

这些 PDF 的内容大概如下，会实时的更新~~

<div align=center>
<img src="https://img-blog.csdnimg.cn/3b49ee99608d41438a37458a92be156b.png" width="30%" height="50%">
</div>

如果你也有想要分享的内容，或者进入银行国企的交流群，我们一起成长，那也可以加我这个专用wx，记得备注"**Github**"


<div align=center>
<img src="https://img-blog.csdnimg.cn/58213272ee7948e9b910d1f00eae6c35.jpg" width="50%" height="50%">
</div>