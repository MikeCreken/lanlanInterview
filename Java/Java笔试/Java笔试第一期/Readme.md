大家好，我是蓝蓝，现在开始和大家一起总结笔试中 Java 部分，其中包含选择，填空及问答，每个题目都会涉及相应的知识点，一共包含四期，这是第一期，那就开始了。

## 1 什么叫多态

多态是同一个行为具有多个不同表现形式或形态的能力，即同一个接口采用不同的实例而执行不同的操作。

## 2 以下哪个选 项属于多态存在的必要条件

A：继承

B：重写

C：父类引用指向子类对象

**D：以上都是**

多态存在的必要条件：继承、重写、父类引用指向子类对象

## 3 以下哪些属于多态的优点

**A：可替换性和可扩充性**

**B：接口性****

**C：简化性和灵活性**

D：增强类型之间的耦合关系

多态可以消除类型之间的耦合关系，故D选项不正确

## 4 在Java中有以下两种方式可以实现多态：________、________

继承、接口

## 5 在接口的多态中，指向接口的引用必须是指定这实现了该接口的一个类的实例程序

在接口的多态中，指向接口的引用必须是指定这实现了该接口的一个类的实例程序，在运行时会根据对象引用的实际类型来执行相应的方法

## 6 当父类对象引用变量指向子类对象时，是通过被引用对象的类型还是引用变量的类型来决定调用谁的成员方法？

通过被引用对象的类型来决定，且这个被调用的方法必须是在父类中定义过的，也就是被子类覆盖的方法。

## 7 请简述多态的优点

可替换性、可扩充性、接口性、简化性、灵活性、消除类型之间的耦合关系

## 8 以下关于抽象类的说法哪个是错误的？

A：抽象类必须使用abstract修饰符来修饰

B：抽象方法必须使用abstract修饰符来修饰

C：抽象方法不能有方法体

**D：抽象类中必须至少有一个抽象方法**

抽象的关键字为abstract，定义抽象类和方法时必须显示的使用该修饰符。抽象方法在声明时，不能有方法体，其实现放在继承它的子类中。抽象类中可以没有抽象方法

## 9 以下关于抽象类的说法哪个是正确的？

A：关键字abstract和static可以同时修饰一个方法

**B：有抽象方法的类必定是抽象类****

C：抽象类可以被实例化

D：关键字abstract和final可以同时修饰一个方法

抽象关键字不可以和 static、final、private 等关键字并存，因为抽象类必须要在继承它的子类中实现，而 final、static 都不可被修改，private 则无法被继承。因为抽象类的构造方法没有意义，故而不可以被实例化。

## 10 下列有关抽象类的叙述正确的是哪项？

A：抽象类中一定含有抽象方法

**B：抽象类的声明必须包含abstract关键字****

C：抽象类既能被实例化也能被继承

D：抽象类中不能有构造方法

## 11 下列有关接口的叙述错误的是哪项？

**A：接口中只能包含抽象方法和常量**

B：一个类可以实现多个接口

C：类实现接口时必须实现其中的方法

D：接口不能被继承

接口中包含普通方法，一个类可以实现多个接口，而且实现接口时必须实现其中的方法。

## 12 下列关于接口的定义哪项是正确的？

A：interface C{int a；} 

B：public interface A implements B  {}

**C：public interface A  {int a()；  }**

D：abstract interface D{}

A中不能有成员变量，因为是接口而不是类，B中是实现接口而不是定义，D中关键字abstract是定义抽象类的而不是接口

## 13 接口中的所有成员变量都默认由________修饰符修饰

public static final

## 14 接口中的所有成员方法都默认由________修饰符修饰

public abstract

## 15 接口没有构造方法

正确

## 16 一个类只能实现一个接口

错误，一个类能实现多个接口

## 17 抽象类也可以实现接口

正确

## 18 抽象类实现接口必须实现所有接口内部定义的方法

错误

## 19 一个接口可以实现另一个接口

错误

## 20 什么叫重载？

在同一个类x中，存在多个方法的方法名相同，参数列表不同

方法重载就是方法名重复，加载参数不同x

## 21 方法的重载是一个类中多态的一种表现

正确

## 22 下列选项哪个选项能说明参数列表不同？

**A：参数个数不同**

**B：参数的数据类型不同**

**C：不同参数类型的参数顺序不同**

A：相同参数类型的参数顺序不同

## 23 方法重载，既可以发生在普通方法上，也可以发生在构造方法上。既可以发生在同类中，也可以发生在父子类中。

正确 1、子类继承父类的方法，就相当于是自己定义的，所以可以发生在父子类中。n

## 24 以下关于重写的说法正确的有？

**A：覆盖的方法的标志必须要和被覆盖的方法的标志完全匹配，才能达到重写的效果**

**B：覆盖的方法的返回值必须要和被覆盖的方法的返回值完全匹配，才能达到重写的效果**

**C：覆盖的方法所抛出的异常必须要和被覆盖的方法一致，或者是其子类**

**D：被覆盖的方法不能定义为private**

1、被覆盖的方法不能定义为private,否则在其子类中指示重新定义了一个方法，并没有对其进行覆盖。
2、其他的根据重写的定义可知。

编写三个方法，分别为无参数、一个整型参数和一个字符串型参数，分别调用三个方法

```java
public class Chongzai {
    public static void main(String[] args) {
        print();
        print("hahaha");
        print(666);
    }
```

```java
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
根据重载的定义，定义多个方法，不同参数，返回值任意就行

## 25 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系。

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
    }private static int max(int a, int b) {
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
}

private static double max(double a, double b,int c) {
    double temp = (a > b ? a : b) > c ? (a > b ? a : b) : c;
    return temp;
    }
}
```

## 26 重载和重写对多态性的体现有何不同？

重载体现的是编译多态性
重写体现的是运行多态性

## 27 实现 Runnable 接口，必须重写 Runnable 的哪个方法？

start() sleep() **run()**      wait()

## 28 下列有关于super说法正确的是

 A： **其他几项都不对**

 B：这是一个编译器指令

 C： 这是一个方法

 D： 这是一个对象

## 29 抽象类和接口的区别：____只有定义，____可以有定义和实现

接口、抽象类

## 30 接口是一种引用类型，在接口中可以声明___、____、____、____但不可以声明共有的域或私有的成员变量

方法、属性、索引器和事件

## 31 扩展一个接口来生成新的接口应使用关键字____，实现一个接口使用____

extends   implements

## 32java这种实现多态的机制是什么

靠的是父类或接口定义的引用变量可以指向子类或具体实现类的实例对象，而程序调用的方法在运行期才动态绑定，就是引用变量所指向的具体实例对象的方法，也就是内存里正在运行的那个对象的方法，而不是引用变量的类型中定义的方法。

## 33 抽象方法可以写方法体

错误，象方法都不包含方法体

## 34 抽象类必须包含抽象方法

错误

抽象类可以不包含任何抽象方法

## 35 一个类既有抽象方法，也有普通方法，那么它就不是抽象类

错误

有抽象方法的类就是抽象类

## 36 关于java描述正确的是

A： **JAVA SE8后允许在接口中增加静态方法**

B：**接口方法的默认实现用default修饰符标记**

C： 接口中可以含有实例域

D： **接口只能可以存在多个方**法

## **37 instance of可以检查一个类是否属于某个特定的接口**

**对**

错

## 38 接口中的所有方法都自动属于public，因此声明方法时无需提供public关键字

**对**

错

## 39 接口的使用默认方法不能保证源代码兼容，不能实现接口演化功能

对

**错**

## 40 请简述抽象类和接口的区别？

- 抽象类要被子类继承，接口被类实现。
- 接口只能作方法声明，抽象类可以作方法声明，可以作方法实现。
- 接口里定义的变量为public static final的，抽象类中的变量是普通变量。
- 接口是设计的结果，抽象类是重构的结果。
- 抽象类和接口都是用来抽象具体对象的，但是抽象的级别更高。
- 接口只能有抽象方法和不可变常量，抽象类可以有具体的方法和属性。
- 接口主要用来抽象功能，抽象类主要用来抽象类别。
- 每个类可以实现多个接口，但是只能继承于一个类

## 41 如果在一个接口中将一个方法定义为默认方法，又在父类或另一个接口中定义了同样的方法，产生的二义性应该如何解决？

如果为父类方法和接口方法重复，则以父类优先。同名而且有相同参数类型的默认方法会被忽略。如果是接口和另一个接口的方法重复，编译器会报错，则交由程序员解决这个二义性，写明自己选择的是哪个接口里的方法。

42 按照步骤编写代码，输出如下所示的结果：
输出内容：
AAAA
BBBB
编写步骤：

1. 定义接口A，普通类B实现接口A。
2. A接口中，定义抽象方法showA。
3. A接口中，定义默认方法showB。
4. B类中，重写showA方法。
5. 测试类中，创建B类对象，调用showA方法，showB方法。

```java
interface InterfaceA{
	 abstract void showA();
	 default void showB(){
		system.out.println(“BBBB”);
	}
}
public class B implements InterfaceA{
    @Override
    showA(){
    	System.out.println(“AAAA”);
    }
}

public class Test{
 	public void main(string[] args){
		 ClassB b = new ClassB();
 		 b.showA();
 		 b.showB();
		}
}
```

## 42 以下关于继承的叙述正确的是

A：**在Java中类只允许单一继承**

B：在Java中一个类只能实现一个接口

C：在Java中一个类不能同时继承一个类和实现一个接口

D：在Java中接口只运行单一继承

## 43 下列类定义中哪些是合法的抽象类的定义

A：abstract Animal{abstract void growl();}

B：class abstract Animal{abstract void growl();}

**C：abstract class Animal{abstract void growl();}**

D：abstract class Animal{abstract void growl(){System.out.println(“growl”);}}

## 44 Java接口的修饰符可以为

A：private

B：protected

C：final

**D：abstract**

## 45 以下关于接口的描述，错误的是

A：声明一个接口，可以使用interface这个关键字

**B：instance of不可以检查一个类是否属于某个特定的接口**

**每个类只能实现一个接口**

C：一个类实现接口，可以使用implements这个关键字

D：12 关于接口与抽象类的区别，以下说法正确的是

## 46 **抽象类要被子类继承，接口被类实现**

- 每个类可以实现多个接口，但是只能继承于一个类

- 接口里定义的变量为public static final的，抽象类中的变量是普通变量

- 接口只能作方法声明，抽象类可以作方法声明，可以作方法实现

## 47  一个接口可以继承于另一个接口

**对**

错

## 48 我们可以直接去实例化一个接口

对

**错**

## 49一个类如果要实现某个接口的话，那么它必须要实现这个接口中的所有方法

**对**

错

## 50 接口中所有的方法都是抽象的和public的，所有的属性都是public static final的

**对**

错

## 51 按要求编写Java程序：

（1）编写一个接口：interfaceA，只含有一个方法int method（int n）
（2）编写一个类：ClassA来实现接口interfaceA，实现计算1到n的和
（3）编写一个类：ClassB来实现接口interfaceA，实现计算n的阶乘
（4）编写测试类E：在E的main方法中使用接口回调的形式来测试实现

```java
public interface InterfaceA{
 	int method(int n);
}
public class A implements InterfaceA{
    @Override
    public int method(int n){
    	int m=0;
    	int he=0;
    	for(int i=0;i<n;i++){
   			 m+=1;
   			 he+=m;
		}
		return he;
	}
}
public class B implements InterfaceA{
     @Override
     public int method(int n){
      	int m=1;
    	for(int i=1;i<n;i++){
      		 m=m*i
   		 }
		return m;
	}
}
public class E{
 	public static void main(string[] args){
 		 ClassA a = new ClassA();
		 ClassB b = new ClassB();
 		 System.out.println(a.method(10));
  		System.out.println(b.method(5));
		}
}
```

## 52 抽象类方法的访问权限默认都是public

错

关于抽象类 
JDK 1.8以前，抽象类的方法默认访问权限为protected 
JDK 1.8时，抽象类的方法默认访问权限变为default

## 53 内部类（也叫成员内部类）可以有4种访问权限

内部类可以拥有private访问权限、protected访问权限、public访问权限及默认访问权限。如果成员内部类用private修饰，则只能在外部类的内部访问；如果用public修饰，则任何地方都能访问；如果用protected修饰，则只能在同一个包下或者继承外部类的情况下访问；如果是默认访问权限，则只能在同一个包下访问。外部类只能被public和包访问两种权限修饰

## 54 将类的成员的访问权限设置为默认的，则该成员能被

A：**同一包中的类访问**

B：其它包中的类访问

C：所有的类访问

D：所有的类的子类访问

public：共有访问。对所有的类都可见。
protected：保护型访问。对同一个包可见，对不同的包的子类可见。
default：默认访问权限。只对同一个包可见，注意对不同的包的子类不可见。
private：私有访问。只对同一个类可见，其余都不见。

## 55 Java中访问修饰符不包括

A：public

B：private 

C：default

**D：final**

## 56 成员内部类的访问权限有

**A： public**

**B：private** 

**C：default**

**D：protected****

内部类可以拥有 private 访问权限、protected 访问权限、public 访问权限及包访问权限。如果成员内部类用 private 修饰，则只能在外部类的内部访问；如果用 public 修饰，则任何地方都能访问；如果用 protected 修饰，则只能在同一个包下或者继承外部类的情况下访问；如果是默认访问权限，则只能在同一个包下访问。外部类只能被public和包访问两种权限修饰。

## 57 局部内部类的访问权限有3种

对

错

局部内部类就像是方法里面的一个局部变量一样，不能赋予访问权限.局部变量的生命周期为一个方法的调用期间，所以没必要为其设置权限访问字段，既然你都能访问到这个方法，所以就没必要再为其方法内变量赋予访问权限

## 58 匿名内部类可以被访问修饰符修饰

对

**错**

匿名内部类不能有访问修饰符

## 59 外部类定义前面可以修饰public,protected和private

对于外部类来说，只有两种修饰，public和默认（default），因为外部类放在包中，只有两种可能，包可见和包不可见。

对

**错**

## 60 一个程序的主类必须是公共类

**对**

错

## 61 什么叫继承

继承是子类继承父类的特征和行为，使得子类对象具有父类的实例域和行为，或子类从父类继承方法，使得子类具有父类相同的行为

## 62 子类继承到底继承了什么

继承的范围：成员变量、方法；

继承的修饰符条件：父类修饰符为private、protected、public的子类不会继承，为default的在同一个包下可以继承父类，不同包下无法继承；

## 63 下列关于继承优点的叙述正确的是（）

A：可以创建更为特殊的类型

B：**消除重复代码**

C：执行效率高

D：便于维护

## 64 在子类调用父类中被覆盖的方法需要使用哪项关键字（）

A：this

**B：super**

C：new

D：以上都不是

super可以理解为指向自己父类对象的一个指针，而这个父类对象指的是离自己最近的一个父类

## 65  java语言的类间的继承关系是（）

A：多重的

**B：单重的**

C： 单重的和多重的

D：不能继承

java的一个特性是简单，如果java支持多继承，那么一个类同时继承多个类时，就会导致结构上的混乱，因为类是结构性的，单继承也会使得程序更具安全性。

## 66 java语言的类间的继承的关键字是（）

A：implements

**B：extends**

C：class

D：public

extends关键字代表继承，而implements关键字则代表接口的实现，class为类，public为修饰符，表示公共、公有的意思

## 67 final修饰方法和类，对继承有什么影响？

1.final修饰类，那么类不能被继承
2.final修饰方法，那么方法不能被覆写

final修饰的类、对象、方法、变量均不可被修改

## 68 以下关于java语言继承的说法错误的是（）

**A：java中的类可以有多个直接父类**

B：抽象类可以有子类

C：java中的接口支持多继承

D：子类调用父类中被覆盖的方法需要使用super关键字

java的继承为单继承，一个子类只能有一个直接父类；

抽象类可以被继承，并在其子类中实现父类的接口；

java的接口是支持多继承的；

子类调用父类中被覆盖的方法是需要使用super关键字来进行调用的

## 69 下面这段代码的输出结果是什么？

```java
class Fu {
    public int num = 10;
    public Fu() {
        System.out.println("fu");
    }
}

class Zi extends Fu {
    public int num = 20;
    public Zi() {
        System.out.println("zi");
    }
    public void show() {
        int num = 30;
        System.out.println(num); 
        System.out.println(this.num); 
        System.out.println(super.num); 
    }
}
class ExtendsTest {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
```

运行结果：
fu
zi
30
20
10

> 解析

1. 访问成员变量的原则：就近原则。

2. 2.this和super的问题：

3. this 访问本类的成员

4. super 访问父类的成员

5. 子类的所有构造方法执行前默认先执行父类的无参构造方法。

6. 一个类的初始化过程：

   成员变量进行初始化过程如下：
   默认初始化
   显示初始化
   构造方法初始化

## 70 为什么要有继承？继承的好处是什么？

1. 提高了代码的复用性；
2. 提高了代码的维护性；
3. 让类与类之间产生了关系，是多态的前提

1.复用性是指多个类相同的成员可以放到同一个类中，其他类要用只需要继承就好；

2.维护性是指如果功能的代码需要修改，修改一处即可；

## 71 看代码其结果为()

```java
 public class Test {
 public static void main(String[] args) {
      People p = new Student();
      String name = p.getName();
      System.out.println(name);
 }
}

class People{
     private String name="name";
     public String getName(){
      return name;
     }
}
class Student extends People{
     private String name = "nameTwo";
     private String idCard;
     public String getName(){
      return super.getName() + "++";
     }
     public String getIdCard(){
      return idCard;
     }
}
```

执行该程序,输出结果为_?

name++

People p = new Student();

String name = p.getName();

p.getName()方法调用的是People的子类Student的getName()方法.所以结果为name++

## 72 关于java中的多态,以下说法不正确的为()

多态不仅可以减少代码量,还可以提高
代码的可扩展性和可维护性.

**把子类转换为父类,称为向下转型,**
**自动进行类型转化**

## 73 多态是指同一个实现接口,使用不同的实例而执行不同的操作

继承是多态的基础,没有继承就没有
多态

## 74 将子类对象赋给父类引用变量,称为__转型,父类引用变量(可以/不可以)__访问子类特有的方法.

A：向上,可以

B：向下,不可以

C：**向上,不可以**

D：向下,可以

把子类转化为父类称为向上转型,方法必须在父类对象中定义,才可以访问.

现有两个类Animal和Cat, Cat继承Animal,将Cat对象c转化为Animal类型的写法为_?

## 75 Java多态存在的必要条件有哪些：( )

**A：需要有继承或实现关系的存在**

**B：子类需要有方法的重写或者实现**

C： **需要有父类的引用指向子类对象**

D：子类需要实现父类接口

多态的使用前提有3条，分别是：
（1）继承或者实现关系。
（2）方法的重写。
（3）父类引用指向子类对象。

## 76 所有定义语句：int a=10; double b = 3.14; 表达式;'A'+a+b的类型是？

A：int

B：char

**C：double**

D：string

自动类型转换，double的优先级比其他两个高

## 77 所有定义语句：int a=10; double b = 3.14; 表达式;"A"+a+b的类型是？

A：int

B：char

C：double

**D：string**

自动类型转换，string的优先级比其他两个高

## 78 所有定义语句：long a=10; double b = 3.14; 表达式;"A"+a+b的类型是？

A：long

B：char

C：double

D：s**string**

自动类型转换，string的优先级比其他两个高

79 下述代码的执行结果为：

```java
class Base{
     public void one(){
      System.out.print("A");
      two();
     }

     public void two(){
      System.out.print("B");
     }
    }

    class Derived extends Base{
     public void one(){
      super.one();
      System.out.print("C");
     }

     public void two(){
      super.two();
      System.out.print("D");
     }
}

public class logs{

     public static void main(String[] args) {
      Base b = new Derived(); 
      b.one(); 
     }
}
```

ABDC

父类只能调用父类中的方法和子类中被覆盖的方法，不能单独调用子类中的其他方法；
子类中可以通过super调用父类的方法，子类默认调用子类的方法；
所以
第一步：调用子类的one方法
第二步：子类中one调用父类one，打印A
第三步：调用子类two方法
第四步：调用父类two方法
第五步：打印B，回溯
第六步：打印D，回溯
第七步：打印C

## 79 有如下代码，

```java
public class Base {   
    void method() {   
        System.out.println("Base method");   
    }   
    static void staticMethod() {   
        System.out.println("Base static Method");   
    }   
}
public class Sub extends Base{   
    void method() {   
        System.out.println("Sub static Method");   
    }      
    void subMethod() {   
        System.out.println("Method only belonging to Sub");   
    }   
    public static void main(String args[]) {
        Base who = new Sub();   
        who.method();   
        who.staticMethod();       
    }
}
```

请问，运行main后，是否能正常运行？控制台输出什么？

能正常运行，控制台输出：

Sub static Method
Base static Method

虽然 who 的类型是 Base 但是 实际引用的是 Sub 类 new Sub() 会在堆区分配内存空间。当who.method() 方法时，jvm 会根据 who 持有的引用定位到堆区的 Sub 实例，再根据 Sub 持有的引用定位到方法区 Sub 类的类型信息获得 method 的字节。在当前环境下获得 method 的字节码，此时Sub类复写了 Base 的 method 的方法, 获得 method 的字节码，直接执行 method 包含的指令。如果没有复写 method 方法，则去获得 Base 类的字节码，执行包含的指令

## 80 下列关于继承的说法，错误的是（）

子类对象可以向上转型为父类对象，但是父类对象不能转换为子类对象

父类拥有的成员对象，子类肯定也有，而子类拥有的成员，父类不一定有。

**子类会继承父类的所有域并且能够访问使用**

父类可以引用子类对象，执行顺序是先在子类寻找，后在父类寻找

子类会继承父类的所有域，私有域无法访问和使用，除非父类有公用方法。

## 81 下面代码的运行结果是()。

```java
class Car {
    public void run() {
        System.out.println("汽车在跑");
    }
}

public class Benz extends Car {
    public void run() {
        System.out.println("奔驰在跑");
        }
public void price() {
    System.out.println("Benz:800000$");
}
public static void main(String[] args) {
    Car car = new Benz();
    car.run();
    car.price();
}
```

汽车在跑
Benz:800000$

奔驰在跑
Benz:800000$

**无法编译**

运行时将抛出异常

car 这个对象虽然指向子类，但是子类由于进行了向上转型，就失去了使用父类中所没有的方法的“权利”，在此处就是不能调用price()这个方法。

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