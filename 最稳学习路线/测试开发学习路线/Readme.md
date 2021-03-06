蓝姐姐，请问你知道准备面试测试开发岗位，怎么去准备吗？

哦？嗯？一万个问号？？就凭这句蓝姐姐，我熬了两个晚上写下了这篇学习路线，望你们都能上岸。

尤其是还在学校的我们，可能很少有测试的基础更就没有工作经验了，那么对于面试官而言，如果你有测试的经验，再加上对计算机基础的理解也不错，那就认定你了啦。

大家想这个岗位，可能觉得测试可能轻松一些，工资也不至于低，看完这篇也许你就明白了。

## Python基础

为什么现在测试都喜欢使用 Python 作为基础语言，首先就是容易上手，另外还有下方几个特点

首先 Python 是一门动态语言，虽然它比 Java、C/C++ 的执行速度慢，但作为解析型的动态语言它的语法非常简单灵活，没有什么约束。

其次 Python 是通用型的大众语言，使用群体广泛，应用在程序研发的各个领域，比如数据分析、系统编程、自动化等领域都大量应用了 Python 语言。

最后Python 是高级编程语言，具备高级语言的诸多特性，比如数据结构、面向对象、函数式编程等都有支持，3.6 版本以后还新增了类型支持，弥补了之前的短板。

写到这里，我在纠结要不要在这里写个怎么装，学习哪些知识点。要不，我先列着，如果大家需要，点赞的童鞋多，我就单独安排一波如何？那这样，我先画个思维导图，大家可以根据这个路线去学习一波，稳的。

对于 Python 的考察，主要是语法知识和基本数据类型的掌握了，比较简单，举个例子，可能会问你super、self、cls等如何使用，异常处理什么意思，用在哪些场景，如果你没有用过，这些还是不怎么能回答出来。

列几个题目，大家可以思考一下，如果比较吃力，那么就从上面的思维导图去学习，巩固

- 

其次即数据结构和算法，比如常见的数据结构列表、词典，或是在此基础上的扩展数据结构，比如堆栈、队列、链表。这里需要注意 Python 语法的二叉树实现，我们需要掌握如何使用 Python 实现二叉树遍历。



在数据结构与算法中还会考察你对基础数据的分析和统计能力，比如有一个几十万行的日志，我们如何从中统计出错的日志，以及它的基本数据情况是什么的，这里涉及一系列的数据查找汇总知识，具体的内容我们会在下方讲解

随后就是计算机知识中的领域知识了。因为设计的测试，可能有功能测试，性能测试，安全测试，重点不一样，复习的重点也就自然不一样，但是对于通用知识的把握还是非常的重要

- 系统编程中会考察你对进程、线程知识的了解程度，比如如何开启关闭线程，如何并发等等；
- 网络编程在我们的工作中也是非常重要的，这里主要考察 TCP socket、HTTP 协议请求等内容。
- 自动化测试中主要考察 UI 自动化测试和接口自动化测试。
- 数据编程主要考察 XML 和 JSON 结构的处理，这里需要重点掌握 JSON 数据结构。
- 还有就是测试用例和 Web 开发，测试用例中需要能够掌握 unittest、pytest 等测试框架，以及在此基础上衍生出的其他第三方框架。
- Web 开发中需要你对 Flask、HTML、JavaScript、Vue 有一定的了解。如果你能够掌握了上述这些内容在面试中一定会是加分项。

## Python测试框架

> Unittest

Unittest 是 Python 自带的测试框架，包括对一些常规测试用例的支持，如下

- test fixture
- test case
- test suite
- test runner

> pytest

其实，在我们日常做集成测试时已经很少使用直接调用方法的方式了，现在有更强大的第三方测试框架 pytest。pytest 框架可以帮助我们更轻松地完成对测试用例的定义，也包括对测试用例的相关调用。

pytest 与 unittest 最大的差别在于测试用例的定义方式更灵活，同时它也支持 unittest，你的 unittest 测试用例可以无缝应用在 pytest 下，同时它自身还有着非常灵活强大的 fixture 机制，可以在执行测试用例时动态完成初始化，根据不同的需求加载不同的 fixture，另外它的 assert 也要比 unittest 的强大很多。

接下来我们看下如何使用 pytest 框架，使用 pytest 时首先需要定义测试用例，pytest 中定义测试用例主要有三种方式。

首先，它兼容 unittest，已有的 unittest 库和文件都可以直接进行调用；

其次，它可以基于最简单的类进行定义，如果一个类里面没有初始化方法，并且以 Test 开头，系统便会认为这是一个测试用例；

最后，你可以直接定义测试函数来定义测试用例。

> 生成报告

生成可视化的 HTML 报告还可以使用 allure2，它允许我们生成一个更漂亮更完整的测试报告，我们看下 allure2 的报告。

![img](https://s0.lgstatic.com/i/image3/M01/5A/C8/Cgq2xl4B3JyADKSiAAHUe39NO7A549.png)

allure2 具备更强的功能，它可以分析数据，绘制曲线图。现在很多公司都在使用 allure2 测试框架生成报告，接下来我们就来看下如何使用 allure2。

其实它的用法也非常简单，我们可以查看  allure2 的官方文档并安装插件。

回到代码中，点击进入 Terminal，输入 allure serve，然后后面跟项目的路径 allure_results。

![img](https://s0.lgstatic.com/i/image3/M01/5A/C8/Cgq2xl4B3JyAFXYsAAKcYAPQ_k0382.png)

最后运行就会自动生成一个测试报告，报告中显示当前有 7 个 case，以及失败率成功率各是多少等信息。

![img](https://s0.lgstatic.com/i/image3/M01/5A/C8/CgpOIF4B3JyATFl4AAIgVSpo_5s704.png)

你可以依次点击左侧的标题栏，第二项显示 bug 的分类，它会显示 bug 大概属于哪几种分类，如果两个 bug 是一样的，它会进行相同的归类。

![img](https://s0.lgstatic.com/i/image3/M01/5A/C8/Cgq2xl4B3J2ACkfYAAOy_0gc_SE985.png)

suites 中显示每个测试用例下面的层级关系。



graphs 中显示 case 成功与失败的概率等信息。依次类推，课后你可以查看每一项内容的具体信息。allure2 生成的报告是非常优美数据全面的，所以我推荐使用 allure2 框架来生产测试报告。



## 数据库基础知识

数据库包含关系型数据库，比如 Mysql、Oracle、Sqlite等，也有 Nosql诸如 MongoDB、Redis、Hbase等，还可能设计图数据库：Neo4j。

除了关系型数据库还有一些为大数据存储单独设计的数据库，它们更多的是为了数据的存储和分析，并不强调关系的计算，所以它们并不是严格意义上的数据库，所以行业里把 MongoDB、Redis、HBase 等归纳为 NoSQL 型数据库。

还有就是图数据库，比如 Neo4j，它可以计算不同数据之间的关联关系；最后就是 NewSQL，这是一种新出现的叫作 RethinkDB 的数据库，它也有一些自己的特性。

还是很方便入手的，如果需要装 Mysql，可以直接使用Docker的方式一键安装即可，如果不熟悉 Docker，可以参考下我这篇文章来完成相应环境的安装。



我们不用去掌握 Mysql 的底层核心知识，当然了，如果能掌握是最好的，但是对于其增删改查的熟练程度一定不能少，常见的 Sql 练习语句如下

既然数据库相关知识这么多而且这么重要，那么我们如何着手进行学习呢？这里我给你几点建议。

第一点，如果想要入门 MySQL，最好先掌握 MySQL 的官方文档，因为文档中会教会你如何使用 MySQL。

第二点，在掌握了 MySQL 基础知识的基础上，可以通过学习《高性能MySQL》这本书进行拔高，同时书中还介绍了使用 MySQL 时的一些常见问题以及解决方案，是不错的经验结晶。

然后是关于数据库的学习顺序的问题，建议你主学 MySQL，而避开像 SQL Server 这类比较边缘的数据库，因为 SQL Server 是微软开发的，微软体系在国内的正式开发环境中应用比较少。

再一点是学好 SQL，虽然 SQL 诞生于 RDBMS 是关系型数据库，但它的用途却不局限于此，因为 SQL 是用来描述数据关系的，所以很多 NoSQL 型数据库也支持 SQL，比如 MongoDB、ElasticSearch 都支持 SQL，然后像 Hadoop、Spark 这类的大数据引擎也支持 SQL 或 SQL 的一些子集，所以 SQL 在你的工作中也是很重要的基础。

学会 SQL 你便可以很快掌握一些大数据或搜索引擎，NoSQL 型数据库大多数情况下都用于大数据计算分析，这部分内容可以用来拔高自己的知识脉络。





## 自动化测试基础

如果在面试之前能够有一定的自动化测试基础，那一定你懂的。既然有了 Python 的基础知识，那么学习一门自动化技术，真不在话下，我这里推荐的是 Selenium。

> Selenium 基本架构

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/Cgq2xl5XdQqASMVjAAJMtC1ch8w140.png)



我们可以看到 Selenium 的基础架构是这样的，它是用来做 Web 自动化测试的一个框架，整体架构采用这样一种模式，你可以使用 Python、Java、Ruby 等各种语言去编写你的自动化测试用例，然后测试用例会请求 Selenium 框架调用浏览器，浏览器的运行需要各自的 Driver 来驱动，Selenium 会借助每个浏览器的专属驱动来完成自动化。

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/CgpOIF5XdQqABom0AAWpUWFCL9U037.png)

我们可以打开 Selenium 的官网 selenium.dev，这是它的最新版本的官网，在官网中介绍了 Selenium 的整体用途，以及它的一些简单的 case 怎么去编写。

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/Cgq2xl5XdQuAJAjuAAJjfIjEy-g112.png)

比如官网中的 Python 测试用例，整体逻辑是这样的，首先需要导入依赖，然后创建一个 Driver，接下来调用 Driver 来完成相应的方法，比如打开浏览器，然后根据特定的标签来定位元素，并往里面输入一些值，最后进入显式等待过程并校验结果是否正确，这便是 Selenium 的基本使用情况。

Selenium 核心组件

了解完基础架构和主要用途，我们来看下 Selenium 的基本组成部分，从开始的架构图中我们也可以看到 Selenium 主要包括 Selenium Webdriver Client，也就是每种语言的客户端；以及 Selenium Driver 用于驱动各个浏览器。



在 Selenium 老一点的版本中还包含 Selenium 1，主要使用 JS 注入模式来完成自动化测试，在新版本中该组件已经被废弃了，我们现在更多的使用的是 Driver 模式。然后它也提供了一定的生态环境，比如像 Selenium IDE，用于录制 case。还有 Selenium Grid 用于多浏览器管理。

Selenium 安装

我们看下 Selenium 具体怎样安装。首先，Selenium 各个组件的安装你需要先有一个浏览器，我们大部分同学的本地都是有浏览器的，所以你只需要找到本地浏览器的 Driver 就可以了。



我们以我的本地浏览器 Chrome 为例，第一步需要我们做的是安装 Selenium的Chrome Driver，并把它放入一个 Path 变量中，接下来需要安装 Selenium Client，Client 是每个语言的一个语言库，这个时候我们可以使用前面学习过的 PyCharm 或 Python pip 的方式来进行安装。

最后我们安装浏览器的扩展 Selenium IDE，IDE 可以帮助我们录制一些入门级的 case，随着你个人能力的提升你也可以不再使用 IDE，而是直接编写 case。



我们具体看下怎么安装 Selenium，首先是下载浏览器驱动，比如 Chrome 的驱动你可以从这个网址https://npm.taobao.org/mirrors/chromedriver进行下载。



我们打开网址，你可以在“关于Chrome”里找到 Chrome 的版本设置，然后便可以根据你的浏览器的版本下载对应的驱动了，下载完成之后你需要把 Driver 放到系统的 Path 变量中去，这个时候我们打开 Shell。Windows的同学可以使用Git Bash。

which chromedriver

首先通过这条命令检查系统的 Path 变量里面有没有 chromedriver工具。







找到工具之后，你需要先验证能不能启动它，为了节省时间这里是我之前下载的版本，这样第一步就完成了。下载 Driver 并把它赋值给 Path 变量，然后确保能够正常启动它，这样就说明你已经安装完成了。

Selenium IDE 用例录制

接下来，我们就可以使用 Selenium 的一个扩展来完成简单的 IDE 的录制了，当然你也可以不使用 IDE 录制，直接写代码也是可以的。



我们先来看下入门的引导录制工具是怎样使用的，首先行业内有两个比较常用的录制工具，一个叫作 Selenium IDE，一个叫作 Katalon Studio，这两个工具都非常不错，今天我们使用官方的Selenium IDE 来进行演示。

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/Cgq2xl5XdQuAVz6sAAKblXP8tyI978.png)



你可以在 Chrome 里面通过扩展打开 Selenium IDE，也可以自行的安装它，安装完成之后你可以根据引导来一步一步完成你想要的 case。

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/CgpOIF5XdQyAf7PQAACQCI3a-kQ436.png)



比如我们创建一个 testchrome 的案例。

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/Cgq2xl5XdQyAC8k-AACZDEmccGQ088.png)

然后，我们打开 testerhome 的网址。

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/CgpOIF5XdQyAKJlnAAV6yXtz99U647.png)



打开完成之后，我们就可以看到整个界面，我们在搜索栏中输入 appium，然后按回车。

![img](https://s0.lgstatic.com/i/image3/M01/6B/51/Cgq2xl5XdQ2AdivkAAJA1ScCkT0000.png)



这个时候就可以搜到一条记录，然后点击取消，我们回到 Selenium IDE。



![img](https://s0.lgstatic.com/i/image3/M01/6B/51/CgpOIF5XdQ2AGCo7AAD6eAHDv5E107.png)



点击关闭代码。

测试用例编写

基本的 case 生成之后，接下来我们来了解如何编写测试用例，然后并运行它，关于如何编写测试用例这里有一个入门文档 https://selenium-python.readthedocs.io/。



我们打开这个网址，这个是 Selenium Python 库的一个使用文档，文档中介绍的也非常的详细，告诉你是如何入门的，以及它的一个简单使用，还包括一些高级功能应该如何使用，等等。



接下来，我带你编写一个小的 case，首先我们刚才已经录制了 case 并且也装了 Chrome 的驱动了，这个时候基本的条件就已经满足了，那我们去运行我们的第一个 case。

用例的关键要素

首先，我们看下测试用例的一个结构分析，测试用例的结构差不多可以分为四大部分：

导入依赖

创建 Driver

执行自动化步骤

断言







我们回到项目中，给你看下 case 的基本结构，这是我们已经录制好的 case，你可以看到类名叫作 TestSearch，然后 setup、teardown 方法中都有完整的对浏览器 Driver 的初始化及退出处理，中间代码是测试的 case，这基本上就符合我们的测试用例结构的，首先是导入依赖，接着是创建Driver，然后执行你的 case，最后在加一个断言就可以了，断言你可以使用 assert 去获取某一个控件的内容或者属性。



这就是整个 case 的编写过程，我们试着去运行我们的 case，首先这里如果提示有报错，你需要安装对应的依赖，



现在 Selenium 已经把所有的代码和依赖都已经帮我们生成好了，接下来我们只需要运行它就可以了，我给你演示下怎么去运行，首先我们点击运行，你可以看到它驱动起来一个浏览器，并按照我们刚才录制的 case 的顺序进行执行，这时 case 就运行成功了，可以看出录制功能是非常强大的，基本上一步到位就全部帮你自动生成了。



但随着测试用例的增多，断言的增加，或是你的公司需要的测试越来越复杂，这个时候 Selenium IDE 可能就无法满足你的需求了，我们就需要使用 Page Object模式来解决问题了，关于 Page Object 的使用我会在后面的课时进行详细的讲解。

> Selenium自动化 API

本课时我们进入 Selenium 常用自动化 API 的学习，我们先来看下 Selenium 有哪几种常用的 API。

Web 控件定位与常见操作

首先，我们从 Web 控件定位与常见操作开始讲起，我们先来看下 Selenium 常见的定位方法，其实在上一课时录制 case 的时候我们就看到了 Selenium 有一些定位， Selenium 总共有多少种定位方法呢，这里给你做一次梳理，Selenium 主要的定位方法分别是：

ID 定位，根据控件的 ID 进行定位；

NAME 定位，根据控件的 NAME 属性进行定位；

TAG NAME 定位，根据控件的 TAG 标签进行定位；

Class NAME 定位，根据控件的 Class 属性进行定位；

CSS定位

LinkText定位

XPath定位

前 4 种是封装好的使用快捷的定位方法，这些定位本质上底层都是使用 CSS 定位符，关于 CSS 定位符，Selenium 也给我们提供了一个独特的 API 叫作 find_element_by_css_selector，我们可以从 self.driver 方法中找到 find 系列方法集。



还有一种定位方式比较特殊，它不再使用 CSS 定位，而是采用更底层的 XPath 定位，因为 HTML 本身也是一种特殊的 XML 文件，XML 也支持 XPath，所以我们也可以使用 XPath 来对控件进行定位。



除此之外，还有一种是 Link 定位，Link 定位通过文本文件的标签内容进行定位，本质上它也可以写成 XPath 定位风格。总体上 Selenium 给我们提供的定位 API 就以上这几种，那我们接下来看具体怎么写这些定位符。

定位符的正确写法

关于定位符的正确写法，我们可以看到传统的方法 Selenium 的 driver 中已经给我们封装了 driver.find_element_by_name 系列方法，这个系列方法在实际工作中并不建议你使用，因为很多时候我们都需要做进一步的封装，或者控件的 ID 会发生变化，这个时候如果采用find_element_by_name 系列方法，当 ID 发生变化时就意味着 case 的 name 定位也需要发生变化，这样不利于复用与解耦，所以不建议你使用这种方法。



通常情况下，建议你使用第 2 种或第 3 种方法，第 2 种和第 3 种方法会把一个控件的定位符描述好，然后把它存入一个变量中，这样就可以通过引用变量进行定位。在平时写代码时我们也会尽量使用 find_element 方法， 然后在方法中设置我们需要定位控件的定位符。

CSS 定位

关于 Selenium 更复杂的定位多数情况下是使用 CSS，通常有些控件是没有 name 的，或者没有 ID，这种情况就需要使用 class 进行定位，而 class 定位又有非常多的属性，这些属性有时需要结合使用，比如说需要使用 ID 的同时，还需要结合 class属性，甚至还有父子关系，这样定位才会更精准，在这种复杂的情况下默认的几种方法就不太可行了。



这个时候我们需要使用 CSS 的高级定位，比如父子关系的兄弟节点，我们都可以使用 CSS 高级定位查找到，CSS 在 H5 开发中也用的非常的多，所以在 Selenium 中我更推荐你使用 CSS 定位，关于CSS定位的更多细节可以参考  https://www.w3schools.com/cssref/css_selectors.asp

XPath 定位

XPath 定位在 Web 测试中使用的比较少，而在移动端的测试中使用的比较多，不过在某些特殊场景下，XPath 也可以帮助你解决一些 Web 测试中的问题，关于 XPath 定位你可以参考 https://www.w3schools.com/xml/xpath_syntax.asp 文档。

控件对应的操作方法

了解了控件的定位之后，接下来我们再来了解控件对应的操作方法，在前面的演练中你也看到了，通常是包含 click 和 send_keys 两个关键操作的，除了这两个操作之外呢，我们还需要获取到控件的关键属性来进行后续的断言，这个时候我们需要使用 get_attribute，所以这 3 种方法就组成了我们对控件进行相关操作的主流方法。



接下来我们通过测试一个新的网站来看下典型的测试用例该如何编写，我们进入 PyCharm，回到之前的项目中去，这次我们使用一个新的 case，打开这个网站的地址，来模拟一个新网站的搜索操作，我们点击搜索框输入Selenium 并回车，然后就可以得到搜索结果，我们在搜索结果中断言是否包含 Selenium，接下来就以这个 case 来教你怎么去编写具体的代码。



def test_testingstudio(self):
    self.driver.get("https://testing-studio.com/")
    self.driver.find_element(By.CSS_SELECTOR,'search-button').click()
    self.driver.find_element(By.CSS_SELESTOR,'search-trem').send_keys("selenium")


首先，我们需要复制网址并把它写进来，在这里使用 self.driver.get，接下来我们使用 find.element 去查看点击的搜索控件，使用 Chrome 给我们提供的便捷工具就可以找到搜索控件，然后右键复制它的 selector，这样就可以把 CSS 定位符直接拿到了。



拿到定位符之后我们使用 BY.CSS 定位，然后使用对应定位符定位并执行 click 方法，接下来我们再定位搜索的输入框并使用 send_keys 方法。



self.driver.find_element(By.CSS_SELECTOR,'#search-term')


输入完成之后就会进入搜索结果页面，在结果页中我们想断言第一个搜索结果的标题中是否匹配我的关键字，这个时候就可以继续使用检查找到它的 selector，我们继续使用 CSS 定位符，然后需要断言它的内容，我们看下它的定位符“ember377”，很明显定位符里面包含数字，如果下次跑 case 时数字变化了，case 就会失败，通常情况下如果我们发现定位符写的不够精准就需要去找到正确的稳定的定位符。







我们可以看到它的 class 属性的 selector 是不变的，所以我们把它复制过来作为正式的定位符，因为这是一个class属性，class在css定位符里是用一个点表示的，点表示控件的类属性，如果是 ID 属性我们就需要使用 # 号，CSS 是有自己的定位语法的，它非常的灵活，然后我们使用 get_attribute。



def test_testingstudio(self):
    self.driver.get("https://testing-studio.com/")
    self.driver.find_element(By.CSS_SELECTOR,'search-button').click()
    self.driver.find_element(By.CSS_SELESTOR,'search-trem').send_keys("selenium")
    assert "Selenium" in self.driver.find_element(By.CSS_SELESTOR,
'.topic-title').text


get_attribute 可以获取到你想要的控件的属性，因为我们只涉及文本，所以可以使用它的一个简单的方法 .text，它会获取到控件的文本内容，获取到文本内容之后断言它里面是否包含 Selenium，所以我们使用 assert，然后判断 Selenium 是否在文本内，这样整个 case 就编写完了。



def test_testingstudio(self):
    self.driver.get("https://testing-studio.com/")
    self.driver.find_element(By.CSS_SELECTOR,'search-button').click()
    input_element=self.driver.find_element(By.CSS_SELESTOR,'search-trem')
    input_element.send_keys("selenium")
    input_element.send_keys(Keys.ENTER)
    assert "Selenium" in self.driver.find_element(By.CSS_SELESTOR,
'.topic-title').text


这个时候的运行结果是少一个按回车的操作的，我们回到代码中，一旦需要多次用到同一个定位符的时候，就可以把获取到的控件保存下来，使用 send_keys，send_keys 中我们选择 Keys.ENTER，然后我们再运行就没有任何问题了，这样 case 就编写完成了，通过这个 case 我们了解到对于任何新的网站都可以快速的进行一个测试，当然这也是最简单的一个案例。

Actions

接下来，我们看下除了上面讲到的常见的 3 种方法外还有哪些常见的 API，比如有的时候我需要滑动操作，把一个控件滑动到另外一个控件内，你可以使用 Actions 进行操作，如果涉及移动端还有 TouchAction，因为篇幅原因具体的用法就不再进行讲解了，你可以课后自己看下对应的文档。

多窗口处理与 frame 切换

再一个是多窗口切换，我们点开一个控件出现一个新窗口的时候，也需要检测切换，如果不检测切换就算你的控件存在也无法检测到，在这种情况下我们需要使用 window_handles、switch_to.window、switch_to.frame 这 3 个 API。window_handles 可以获取目前浏览器中有几个窗口，switch_to 可以切换到对应的窗口或 frame 里，还有更多的 API 你可以课后查看 self.driver的具体方法的官方文档，这里就不再具体讲解了。









## 持续交付

敏捷开发模型中涉及一个非常重要的概念就是持续集成，持续集成最早是在 06 年由我们前面课时介绍过的马丁福勒提出，核心是在一个开发过程中需要开发者不断的集成代码，每天进行集成，每次提交代码都可以通过构建发现问题，从而能够更早地把问题解决掉。

那么持续集成具有什么优点呢？首先你要明白持续集成并不能帮你减少 Bug，而是可以帮助你更早更快地解决问题，它的特点是每完成一点更新就集成到对应的分支，可以快速发现问题、定位问题，如果不经常集成，而分支或主干又在不断更新，会导致以后集成的难度变大，甚至难以集成，而采用持续集成就可以解决。

持续集成流程

![img](https://s0.lgstatic.com/i/image/M00/08/4B/Ciqc1F66cpuAUG-1AATdPsuNiWA879.png)

接下来我们看下持续集成的正常工作流程，首先开发工程师会不断提交代码到 Git 仓库，当开发把代码提交到代码管理仓库后，持续集成服务器会检测到代码的变更，一旦发现代码变更便会自动化构建，构建完成之后进入自动化测试，最后自动化打包，这就是整个流程。在持续集成环境中你可以使用 Jenkins 等工具进行持续集成，也可以使用 Maven、gradle 等完成项目的构建，同时还会伴有单元测试、代码静态分析、代码审计、代码版本管理等，这就是持续集成的整体流程。

**持续集成、持续交付、持续部署**

![img](https://s0.lgstatic.com/i/image/M00/08/4B/Ciqc1F66cqWAczw7AANWKAlLm_g201.png)

接下来，我们看下持续集成、持续交付、持续部署这三者的区别，如图所示，从图中我们可以发现，从开发、构建到测试，如果整个阶段频繁地进行集成、测试，这个阶段就称之为 CI 持续集成。如果还包括测试、打包部署到测试环境等临时环境，这样的流程就称之为持续部署，通过 Dvelop 就可以把最新的代码一步到位部署到某个环境中，现在国内大部分公司都已经采用了持续交付。除了部署到发布环境、测试环境外，如果还可以直接部署到线上环境，就称之为持续部署，持续部署需要更严格的保障措施，比如线上监控、回滚、灰度发布机制等。

综上所述，我们发现 CI 负责完成最小的集成，CD 负责完成最新代码的发布，而持续部署要求我们能够持续地部署到线上环境，而在实际生产环境中，想要完成这样的流程需要对团队、团队的技术栈完成一定的改造。

![img](https://s0.lgstatic.com/i/image/M00/08/4B/CgqCHl66cq-AUI3JAAY-UYu4_D8326.png)

持续集成有非常多的管理工具，在这里我推荐你使用 Jenkins，大家可以在维基百科中查看相关的总结，这份总结中把目前行业里流行的各种各样的工具进行了统计和分析，你可以发现其中 Jenkins 是功能最全的，使用人群基数最大的，当然随着技术的发展进步，除 Jenkins 之外，还会涌现出越来越多的优秀的持续集成工具。

![img](https://s0.lgstatic.com/i/image/M00/08/4B/CgqCHl66creATpMnAAURg5NimbA179.png)

为什么 Jenkins 可以得到广大开发者的青睐呢？是因为它具有以下优势。

![img](https://s0.lgstatic.com/i/image/M00/08/4B/CgqCHl66cr-AfzMsAARZjtoWH7g102.png)

首先，Jenkins 是一个历史悠久的开源项目，同时开发人群使用度，插件机制都非常完善，是目前行业中使用最广泛的持续集成平台。

## 加分项

在面试中脱颖而出，最重要的是你的能力，这也是最大的加分项，如果你去面试一家公司，一定要很好的证明你的能力，首先可以在简历中体现自己掌握的技能，其次可以在面试聊到个人发展情况时，拿出一些工作成果证明自己的能力是非常卓越的。

能力加分项
接下来我们看下哪些能力是在传统简历描述之上的加分项，第一是内在实力，比如专利，如果你在上一家公司有申请过专利，面试官一定会对你刮目相看。第二是解决方案，你在职期间为公司提供过什么样的解决方案，又帮助公司解决了哪些问题等。第三是你在 GitHub 的开源项目，比如解决行业内经常遇到的一些问题，比如自动化测试、网站性能检测、 App 兼容问题分析等，这些开源项目可以很好地证明你的技术实力。以上这三点都是很好的加分项。

外在名望也是一个重要的加分项，外在名望首先是出版图书，如果一个人有能力出书说明他在这个领域还是有一定见解的，而且管理层对出书这件事还有一些传统认知，认为出版图书是很权威的事情。然后是参加行业内的技术分享大会，说明在一定程度上也是被同行所认可的，这是一个人能力很好的证明。还有就是获奖情况，比如在上一家公司获得了诸如优秀新人奖、创新奖等都可以写到简历里，这些都是很好的加分项。

履历加分项
我们再来看履历加分项，履历加分项更多是可以判断一个人能否快速为公司带来价值。履历加分项也包括几个维度，首先是友商公司履历加分，同行业的公司技术重合度高，同时也能够为面试公司带来更优质的人脉资源，所以面试公司一般会更喜欢同行业的友商公司员工。

还有小而美的企业，这些企业知名度高，口碑也好。通常这些公司里面工作的人也会有很优秀的技术沉淀，有在行业内很不错的产品，这也会是你的加分项。这些小而美的公司的工程师通常会在一些行业大会上进行分享，或是开源一些项目，自然可以在技术圈积攒一个不错的口碑。

再有就是大厂履历，因为大厂有专业的培养体系和文化熏陶，可以让一个人得到快速地成长，而能够进入大厂工作首先也说明你非常优秀。进入大厂工作一段时间后，个人能力都会得到提升，在面试时，大厂履历是一个很不错的加分项。

最后是互联网履历加分项，通常情况下，互联网公司的技术基因是比较先进的，它可以有效弥补一些传统公司技术上的短板，况且互联网公司独有的加班文化也是很多传统企业所欣赏的。

但这里需要注意，履历还有一个减分项，那就是恶意竞品履历，比如你曾在某个出现负面新闻的公司里任职，应聘方可能会存在一些偏见。

学历加分项
还有就是学历加分项，学历加分项主要包括你毕业的学校和所获得的学位，一般情况下，985>211>一本>二本>三本……博士>硕士>学士，虽然学历高并不一定代表能力高，但是在大数据里，两者的相关性还是很高的。

再有就是英语的掌握水平，随着中国企业走出海外，英语需求会扩大，一般英语 8 级>英语 6 级>英语 4 级。

面试加分项
我们最后看下面试环节的加分项，面试环节主要考察你的综合实力，包括技术和软实力，在专业背景方面前面已经讲了很多了，这里就不再扩展了，我们重点讲下面试中需要注意的几个事项，第一是你的业务能力，无论你去面试哪家公司，面试前一定要了解被面试公司的业务和所需任职的能力。其次是专业能力，需要你有扎实的专业实力、丰富的行业经验。然后是精神面貌，积极、乐观、充满正能量、良好的沟通方式都可以给面试官留下深刻的印象。

想要找到心仪的工作，前面的这些加分项尽量要体现出来，当你去面试一家公司时，面试官首先看到的是你的简历，你的简历就代表了你个人，所以简历一定要简洁明了，重点突出能力。有了一份漂亮的简历，就可以开始投递了，投递简历的方式主要有两种，一种是招聘网站上投递，一种是内推，招聘网站上的热门职位很多都是百里挑一，需要你的基本面要好，但招聘网站的投递量比较多，招聘方很多情况下都不会很仔细地看，而这时，通过内推的方式便可以很好地提高成功率。