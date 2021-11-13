大家好，我是蓝蓝。

封面自己画的，应该还算比较可爱的吧，复古类型的可爱啦。为什么是森林呢，嗯~~周末看了书《挪威的森林》，其中有句话是

如果你掉进了黑暗里，你能做的，不过是静心等待，直到你的双眼适应黑暗。此篇文章关于 C/C++/Linux后端开发的全路线。

[TOC]



## 前言

-----

![](https://img-blog.csdnimg.cn/71d75c7d77384df2864946d47b7991e2.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)



于我而言，最开始学习就是 **C++**，除了计算机专业，其他专业可能学习的第一门编程语言为 **C** 语言，还是谭浩强爷爷那本，当时想着有点 **C** 基础，无外乎就是 **C** 语言的升级版，于是开启了 **C++** 的路程。

语言这个东西，可能过后你会发现，它真就一工具，你如果想做个爬虫或者数据分析，那多半会选择 **Python**，无论是接口还是开源社区都非常的完善，如果想做一个快速迭代的 **CRUD** 项目，也可以选择 **Python** 的 **Django** 框架或者 Java的框架快速完成开发，如果是内核驱动，那老老实实的用大哥 C，如果玩儿数据库，搜索引擎就整 C++,如果是分布式或者 **Devops**那一套，自然就是 **Golang**，有轮子直接上手就好，先保证完成任务，其次是优化。

不过在找工作的时候，不同的岗位确实有一个大家公认的语言，比如测试开发，多半就会涉及到 **Python** 的知识点考察， 毕竟需要一些自动化的开发工作，如果是服务端开发，多半就会涉及到 **Linux** 的知识点。

研究生期间，实验室很严格，几乎没有实习的时间，专硕，导师的项目又比较紧凑，就只能挤出时间去准备，所以如果大家是非科班的，也不要担心，时间一定是可以挤出来，静下心去积累，结果不会差。

> 大厂到底喜欢问啥

**计算机基础**，包含计算机组成原理，操作系统，计算机网络，数据库，设计模式，算法与数据结构。那么最容易被刷掉的就是算法，每一年的招聘中，简历去掉一部分，算法还要去掉一部分。

我当时复习的时候，边学算法导论边抄代码，后面要找工作的时候采取**Leetcode** 练习，加上剑指 **Offer** 的复习，几乎三轮左右。

不管你是什么技术栈，都是需要稳扎稳打的，大厂=基础+算法+项目。如果有拿得出手的项目，而且能把项目的背景，目的，干什么的，都能表述的非常清楚了，那可能距离 offer 更进一步。这些每个环节都不能疏漏，进大厂就需要培养自己的大局观，大厂思想，你就是牛逼，别人不会的你就会，你就有机会拿下 offer。

## 时间上安排

早一点的互联网公司在**三四月**的时候就会出现提前批，对于没有一点面试经验的你们，可以三四月份找几家公司去体验下面试的流程及面试的难度。

到了**八九月**就是笔试面试的高峰期，一天面试个四五家公司也算正常，不过你会发现，面试的题目翻来覆去都是那些问题。

我准备的时间还是比较晚，到了九月份基础还不算扎实，上来就被百度当头一棒。对于阿里这样的岗位，七八月大部分的 **OFFER** 也就结束，腾讯如果 **9** 月面试，大概 **10** 月中旬即拿到 **OFFER**。对于银行和国企，就更往后了，不过那个时候毕业论文啥的也着急，所以找点准备。

## 就业方向

既然要选定方向，就需要先了解学了这个方向以后可能从事什么岗位，自己喜欢或更加适合哪些岗位。

选择 **C/C++** 的同学需要酌情考虑这个问题，它的门槛比 **Python**，**Java** 的路线高一些。不过道理是一样的，技术毕竟都相通，**Java**，**Python**工作岗位机会多，学的人也多一些，竞争自然也就大。

国内大厂如阿里，腾讯，头条，百度，京东等都有招聘 **C/C++** 的岗位，其核心搜索，腾讯的底层架构等机会都是 **C++** 写的，所以没必要担心找不到工作，薪资也是杠杠的。

越接近底层机器，其效率越高，各有各的优势，想深入了解计算机系统，选择 **C/C++**最好不过。有些同学这个月学 **C++** 的路线，下个月学 **Java** 的路线，这是兵家大忌，不管走哪个路线，一定要沉稳，稳扎稳打。**学习的过程是枯燥无味的，学习的苦痛是暂时的，未学到的痛苦则是终生的。**

那一般都有哪些方向呢？

> 服务器方向

服务器方向包含 **Linux** 服务器开发工程师，**Linux** 后端/后台开发工程师。下面我们看看腾讯对于服务端开发工程师而言的基本要求。

![岗位要求](https://img-blog.csdnimg.cn/43a6ee6caf95408fbd205108f3cb53ce.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

再来看后面还有一句话是，对 **Python/shell** 等脚本有一定的了解，如果对分布式系统，负载均衡等知识能有了解则可加分。

关于这一块内容更加强调后端知识的运用，在学校期间基本上是没法涉及的，需要实习或自己学习其他的资源来弥补对这方面知识的空缺，后续也会有一篇专门的后端路线。

> 网络安全方向

网络抓包工具 **Wireshark**，防火墙 **Iptable** 等熟知的工具，均为 **C/C++** 开发。为了让大家更加清晰了解网络安全方向的定位，我们不妨去相关公司看看招聘要求。于我而言，学习网络更有效地方式之一，是学会去理解这些工具的开发思路，开源库如 **libpcap**。

- 安全开发工程师

比如防火墙，电脑管家等信息安全领域，算**C/C++** 用武之地。看看 360 安全开发工程师的招聘要求。

![安全开发工程师](https://img-blog.csdnimg.cn/cf915d90c9ac4a8db21e81c26ae10da2.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

> 音视频/流媒体/SDK

各大直播平台，北快手南抖音， B 站，映客等直播平台都会有音视频的岗位。这里的话希望能有一定的视频编解码基础知识，比如 HEVC 或 H264。

![](https://img-blog.csdnimg.cn/47798fd77c804e1d9e6542e42013e4fd.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

> 嵌入式方向

主要偏向内核及应用层，网络交互功能的开发，同时会对产品模块在不同平台的开发，移植等。

![](https://img-blog.csdnimg.cn/0cb3c5fa6294487ca4eb04641afb23a7.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

> 测试开发工程师

很多人说测试开发岗位就是测试岗位，那还有个测试工程师是啥意思。而且测试开发岗位的薪水是基本和开发岗位持平，面试难度确实会简单一些，但是对测试开发人员的要求并不低。

![](https://img-blog.csdnimg.cn/cbfebef2e73c458193ddfff1847c8ba8.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

> 游戏引擎开发工程师

曾经自己喜欢玩儿游戏才选择计算机，入行这么久才发现并不会写游戏，尴尬~~现在游戏引擎涉及内容包含渲染，动画，AI等多技术融合，为美术和策划搭建高效的内容制作工作流。

如果有一定的 C++/C# 的调试技巧则是有一定的加分可能。

![](https://img-blog.csdnimg.cn/87a71395c3fb48d7ad0abbbb2ed1cd78.png#pic_center)

> 数据库开发工程师

估计很少有应届生投递这个岗位，难度比较大，岗位也非常少了。

![](https://img-blog.csdnimg.cn/2b2f80b19a4846f3adb9649ac3245ecf.png#pic_center)

> 客户端/桌面开发工程师

客户端或桌面开发工程师更多是 **Win**下的开发，其桌面应用的库如 **QT** 就需要了解了。

![](https://img-blog.csdnimg.cn/f678d1e5c08647919e1c2af8028c2760.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

> 网络传输协议优化工程师

这方向通常针对实验室做网络性能优化的，几乎为 C/C++,你在了解常用协议的同时，还需要对高性能的 DPDK，RDMA等技术进行深入的研究。

![网络传输协议优化工程师](https://img-blog.csdnimg.cn/915c668589fc48328cb848d12e2a3215.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

> Linux 内核开发工程师

当初面了小米的内核开发工程师，一共三面，除了一面是对计算机知识和算法考察外，后续完全是对内核调试的各种暴捶。

![](https://img-blog.csdnimg.cn/c0812c50862d4fd3a57e81b26bc5367a.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

## 开发环境

对于 **Win** 开发者而言，**VS** 系列一定是最熟悉，最舒服的了。不过可能大部分同学还是会去 **Linux** 下开发。

读书的时候，写第一个 **C** 语言程序使用的 **VC6.0**，这里推荐大家使用 **Linux(Centos,Ubuntu)**来感受 **C/C++** 的魅力)，熟悉 **Linux** 常用命令，**Git**，**SQL**，多装多乱玩整，整坏了修就完事儿。工欲善其事必先利其器。

## C语言

数组、函数、指针及对内存的管理。说到内存，就涉及到后面操作系统部分。对于 **C** 语言的学习，不想说太多，一句话即：**在 Linux 中去玩儿 C**。

> 推荐书籍

C 程序设计语言、C 缺陷与陷阱、C 专家编程、C 和指针，后面也算是三剑客了，关于 C 语言重点章节如内存，数组指针的讲解，一定让你能够非常清晰的理解其思想，至此还想拿出来看看这本书。

## C++

> 推荐书籍

可能很多同学入门 **C++** 都会看 《**C++ Primer**》,但是这本书太厚了，入门推荐华为的一本手册，浓缩了不少精华，名字也很霸气，叫做《华为最牛逼的C++基础与提高》

![](https://img-blog.csdnimg.cn/14825628bb244f4e95c39caea2641903.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)



这本书很多例子都是去实现 **C** 中的一些基本数据结构，如通过 **C++** 的方式去封装链表库，让你加深对链表的理解，对面向对象思想的理解。

刚开始学习的时候，看书的重点在了解语言基础和数据结构，有了这两门技能就可以练习算法题了。 

通过上面这本书基本上能够完成 C++ 项目中的基础功能，为了进一步的加强对 **C++** 的理解，可以参考下面的书籍，当然也是面试中的关键部分。

随后开始进阶内容的学习，比如函数模板、类模板，**C++** 中对于异常的处理，对于继承和多态底层的理解，对于 **virtual** 底层的理解等。在 **C++**  中 **boost** 库八大智能指针的掌握与理解，其核心是理解并且剖析过相应的源码， <scoped_ptr/shared_ptr/weak_ptr>  这三个是最核心的智能指针。STL 源码：对于 STL 中的容器剖析，常见容器有 **list、vector、stack、queue、map** 等，考察自动扩容的原理、**map** 的底层实现（**RBtree**），源码是必须手动至少剖析一遍的，学习这些内容可以参考下面的书籍。

- 《STL源码剖析》

内容包括 **C++** 底层内存管理、各种容器的数据结构实现、常见算法的实现等，如果你在学习 C++ 的时候按照上面的思路，那么看这本书就会轻松很多了对不对。这是必读书籍，可以帮助深入理解 **C++** 底层，同时也是对数据结构的复习和巩固。其中也有很多面试常考的知识点，如内存池的机制、**traits** 技法、一些常用容器的底层数据结构等。

- 《深度探索 **C++** 对象模型》

讲解了 **C++** 面向对象特性的底层实现机制，由于是翻译版本，读起来内容会相对晦涩一些，但是内容非常重要，尤其是**虚函数底层的实现机制**，建议多看几遍加深理解，这个基本是C++必问的知识点。看完这本书，对C++面向对象的理解帮助极大，建议必读。

- 《effective C++》

这本书是 **C++** 程序的条框，有助于梳理在编写C++程序时的一些常见错误和注意事项，也是面试常考的。如果认真读过了，C++ Primer，这本书看起来会非常快，其中的很多内容都包含在**C++ Primer**中了。

通过上面的学习，你应该能够能更加深刻的理解什么是迭代器、空间配置器，比如：一级空间配置器、二级空间配置器的运用场合分别是什么？一二级空间配置器的本质是什么，如何用内存池去管理？所存在的问题又有哪些，源码又是如何实现的等等，这些问题都需要去思考。

**OK**，随后开始学习 **APUE**，这本书属于字典型书籍，看起来会非常的痛苦，不需要都记下来，对一些重要的接口如 fork，select，phread熟悉就可以了，手册书籍。

看完实践后，基本上有在 **Linux** 端进行 **C++** 开发的能力了，但是想在 **Linux** 段写个项目还是有一定的难度，所以开启抄之旅，买本陈硕老师的 **Muduo** 库，看完后可以自己尝试写个 **Muduo**或进行二次开发。

开完的过程中，也可以通过一个压测工具，性能工具对不同的库进行对比，这些内容可能就会成为你的简历中的亮点部分了。

在学习 **Muduo** 的过程中，你需要学习 **Linux** 的基本知识及 **GCC** 调试技术和 **Makefile** 的编写，这里可以看 《**程序员的自我修养**》这本书即可。

> 推荐的视频

看视频呢，可以更快的了解知识全貌，这里强烈推荐侯捷老师的课程，B 站上面基本上都有，不过可能没有资料，大家可以找我哪，这些课程包含

- 《C++手把手教学：侯捷》
- 《C++面向对象编程：侯捷》
- 《C++ STL体系结构与内核分析：侯捷》
- 《C++11新特性：侯捷》
- 《C++内存管理：侯捷》

![](https://img-blog.csdnimg.cn/0e9a6a8fd47b456e921abe81c69787f3.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

## 系统编程及网络编程

通过上面基本语法及数据结构算法的理解，开始正式切入到 **Linux** 中学习，期间你会学习 **Linux** 的基本使用，软件的安装等，可以参考我之前的一篇文章。

至此基本上可以比较轻松的学习系统编程了，学习系统编程的时候，重点放在进程，线程，网络编程上面，他们的理论知识在后面的操作系统进行补充，在这里主要针对应用编程，即熟悉在 Linux 中通过相关的系统调用完成任务，比如实现一个 Http。

在学习或练习项目的时候，通过对计算机网络的学习，融入到项目中去理解分布式系统的神髓，这样一步步的前进，下面使馆系统编程及网络编程的书籍及视频。

> 书籍

- UNIX环境高级编程 第3版（APUE）
- Linux/UNIX系统编程手册（上下册）
- 高性能网络编程

> 视频

这一部分没有视频可看的，将上面的书籍源码Download下面仔细分析就差不多了。不过当时我看了黑马的 Linux 系统编程的视频，需要的也可以去看看。

![](https://img-blog.csdnimg.cn/952313ca33694197b182a5365ab392db.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

## 计算机网络

学习计算机网络的时候，大学一般学习谢老师那本教材，通过这本教材你可能能了解什么是 **IP**，如何组建一个局域网等基础知识。计算机网络知识点不难，但是比较杂且多。

此时可以学习 <网络是怎么链接的>这本书，

在学习期间如果对某个知识点有疑问，再去看 TCP/IP详解这本词典。而不是，上来就看 **TCP/IP** 详解，不打瞌睡才怪哦。

简单提一下这些常见的概念，TCP/IP 协议、OSI参考模型及TCP/IP参考模型 、常见的网络协议（网桥、ARP、IP、ICMP、TCP、UDP、DNS、DHCP）、协议的选择 、TCP 三次握手与四次挥手、流量控制 + 拥塞控制、网络相关概念 、socket概念 、socket类型 、 socket信息数据结构 、数据存储优先顺序的转换 、地址格式转化 、名字地址转化、socket编程 、 使用TCP协议的流程图 、单播、广播、组播（多播） 

> 书籍

- 网络是怎么链接的
- 图解 **HTTP**
- 高性能网络编程

> 视频

- 王道考研[直达](https://www.bilibili.com/video/BV19E411D78Q?from=search&seid=13104657832519968714)

考研的视频都会对难点常考点进行详细的讲解，固然可以去看看。

- 韩立刚

韩老师也出了基本书籍，内容的实战性比较强，让大家通过动手实践的方式加深对于网络的理解，想必也是最好的办法了。

[链接直达](https://search.bilibili.com/all?keyword=%E9%9F%A9%E7%AB%8B%E5%88%9A&from_source=webtop_search&spm_id_from=333.788)

## 数据结构与算法

我们知道现在基本上所有的互联网公司都会考察算法能力，最开始学习数据结构可以看《**大话数据结构**》这本书，入门后可以看浙大老师讲授的一门课，视频链接我会在后面的视频推荐部分列出，帮助大家弥补书籍中可能不太了解的内容，随后就可以开始算法练习和应用。

算法练习的时候就可以同时熟悉 C++ 中的 STL，为了提升代码的质量，可以同步学习候杰老师的《STL源码剖析》，其中也有对应的视频，相结合进行学习。

> 那算法练习通过哪些资料呢

可以刷 **LeetCode**，它将各种算法进行了分类，可以从树的习题开始刷，其中难度也分为初级，中级，高级，基本上能够覆盖大部分的面试高频题。

说到算法自然离不开《剑指OFFER》这本书，可以说百分之七十的公司，手撕算法都会涉及到上面的题目，所以建立大家至少刷两遍，培养写代码的感觉。

如果想学习算法的套路，可以看东哥写的《labuladong的算法小抄》，总结各种类型题目的套路解法。

进阶算法的练习可以看左神的写的《程序员代码面试指南》，非常好的一本书，其中讲解的编程题都非常经典，不仅仅限于国内的IT公司，而是面向全球，包含了国外知名IT公司的一些面试高频题，可以帮助开阔视野。

> 刷题的形式一般有哪几种呢

- 想两分钟，直接查看答案

查看答案的时候感觉啥都会了，手撕的时候，虽然可以说出思路，下笔就不知所措，所以，一定要下手写代码。

不过对于初学者而言，这样的方式也有一定的合理性，因为无论是二叉树，动态规划还是并查集，它都有一定的规律即套路

- 追求高质量

对于每一道题目，都想做出最优解，不满足一种解法，分析多种算法的时间空间复杂度。这里要注意，解不出来的题目也不要太花时间在上面，如何去平衡呢，大概1小时都没思路，就可以看看提示并尝试求解。

- 拼速度

一顿暴力操作猛如虎，上来就暴力求解，这样至少在短时间内可以 KO 题目，随后进行优化。

那我其实推荐是第二种方式，第二种方式中，求解一个题目会有事半功倍的效果，每解答一个题，将这个类型做个总结，这就是你的套路，从而了然于胸。

> 书籍

《左程云的算法视频》，非常有用，建议一定要看；

《剑指offer》一本神书，建议至少看两遍，把上面的题目自己写一遍；

《程序员代码面试指南》里面有很多面试高频题，看完左神的视频可以再看看他的这本书

> 视频

![](https://img-blog.csdnimg.cn/04881cbca4eb435cae66ffaf6722249a.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

[直达](https://www.bilibili.com/video/BV15D4y1X7Tt?from=search&seid=5757064881341929016)

左神其实有三套课程，在 B 站没有找到，需要的就私信我(WishForyou1995)吧。

## 操作系统

前面的知识复习起来难度还行，不过对于操作系统，大家可能需要花费更多的时间，理解操作系统的知识可能会让你更快的去学习的新的内容。

看书的话可以考虑 **CSAPP** 和 操作系统精髓与设计原理两本书一起看，因为两本书的内容很多内容是可以互补的。

另外对于操作系统的学习，也是建议大家直接在 Linux 中玩儿，其实熟悉基本命令后就可以玩儿了，大不了玩儿坏了再换呗，问题不大的。

要深刻的理解操作系统的基本原理，中断，内存等核心要点，做实验当然是最快的。可以先看 <Linux内核设计与实现>，很少会从源码的角度分析知识点，没有那么的苦涩，各个模块逐一介绍，让你对整个框架能有个基本认识。

然后再去看其他关于内核的书籍。

> 关于书籍

- 深入理解计算机系统 第3版（CSAPP）
- 操作系统 精髓与设计原理 第8版
- 《Linux内核设计与实现》

- Linux 内核设计与实现（LKD）
- 深入理解Linux内核

> 视频

- 哈工大李治军老师的课程

哈工大的操作系统课是本校CS课程中含金量最高的，尤其是实验课。这八个实验涉及到了操作系统的核心部分，虽然不是在本校待创的如 HITOS 上进行的，但 Linux-0.11 确实是个好的选择。能让我们更加专注于实验，而不是纠结于各种奇怪问题，作为OS入门算是足够了。学完操作系统课只能算是OS入门了，这一点也是李治军老师一直强调的。

![](https://img-blog.csdnimg.cn/dfd3565e5cb442f093eacc8af860c2f5.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

这是大佬部署的环境

[大佬部署的环境](https://github.com/DeathKing/hit-oslab)

这是关于这门课程的笔记

[OS课程笔记](https://github.com/hoverwinter/HIT-OSLab)

![](https://img-blog.csdnimg.cn/666497b6c102487b90913e31946abc91.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

咦，这项把蓝蓝贴心打在公屏上了，一定要好好复习哇。

- 宋宝华系列

《王道考研操作系统》非科班必看；

《宋宝华：打通Linux脉络系列：进程、线程和调度》CSDN直播课；

《宋宝华：Linux内存管理》Linux阅码场。

> 源码

另外就是优秀源码：**xv6**，**MIT** 写的 **OS** 内核，源码可读，有中文文档。

[直达源码阅读](https://github.com/ranxian/xv6-chinese/tree/master/content)

![](https://img-blog.csdnimg.cn/d7df3248b02d468c8160654c9b6c76d4.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)



非常建议作者先看一下 **ucos** 这个小系统，一共 **8000** 行代码，是个成熟的商用系统，麻雀虽小五脏俱全，对你理解后绪的大型内核帮助很大，。万变不离其宗。

## 数据库

数据库的知识面试问的不多，但是数据库对于以后工作是肯定会用到的，如果有时间建议将基础打好，可以先看**数据库系统概念**，了解数据库的基础知识，然后阅读**mysql必知必会**这本书，可以帮助你快速学习 ***mysql*** 的基本语法。

先学习数据库基本 **SQL** 语句，推荐**CodeWithMosh** 的 **10** 小时数据库课程，链接如下

[SQL语句练习](https://www.bilibili.com/video/BV1UE41147KC?from=search&seid=14329729580576766660)

![](https://img-blog.csdnimg.cn/b20322cf9c434f468c0709871d44b3b7.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

看完该视频后可以将牛客上的《数据库SQL实战》刷1-2遍；

> 关于书籍

- 《MySQL必知必会》

- 《高性能MySQL》
- MySQL技术内幕 InnoDB存储引擎
- Redis设计与实现

## 设计模式

对于设计模式，如果没有大型软件的项目经验，这方面的能力很难体现出来，所以可以作为知识点的扩展学习，对其进行了解即可，面试常考的有单例模式、工厂模式等常见的设计模式。

以上知识的学习路线和相关书籍，是我结合自己的学习经历总结的，不一定适合所有同学，但我相信大的方向还是具备通用性的，在学习过程中可以作为参考，也可以根据自己情况灵活调整自己的学习路线，找到自己认为最有效率的学习计划。

## 项目/开源项目

项目部分我直接好家伙，尤其是使用 C++ 岗位的同学，几乎人手一个 Server，确实没有其他的什么项目，为了让自己的项目能有不一样的地方，大家可以根据自己的项目，采用一些性能工具，对多个库进行测试，可视化出来结论，这样不就算一个小的创新了。

有项目自然是好，不多对于应届生而言，基础部分更加的看中了，只是有项目会聊的更自如。

你的项目一定需要融入到自己的想法，因为大家都知道使用 Libevent，Muduo库，如果大家都一样，就没法表现出自己的优点了。可以在上层增加一些业务逻辑或者融入微服务的中间件，这里面就会涉及到分布式的一些算法如raft，自然就突出自己的特点了。

> 推荐一些开源项目

不知道大家学完 **C/C++** 后，做的第一个项目是什么？

我先来，我做的是学生管理系统，没想到吧，当初学的 **Pascal** 语言 然后暑假留下来自学的 **C** 和 **C++**。

别觉得这些项目很拉跨，虽然很简单，但是你在这个过程中一定加强你对链表，指针及内存的内容，另外也可以让自己更加熟悉基本数据结构，但是仅靠这经验去找工作，几乎不可能。

所以，今天给大家推荐几个开源项目，大家最好能够下载下来，然后去跑通并研究源码，这些源码都不多而且非常的易懂，下面就开始吧。

> Cjson 

Json 轻量级数据交换的数据，前后端交换的格式，json居多

Json (JavaScript Object Notation)是一种轻量级的文本数据交换格式，易于让人阅读。同时也易于机器解析和生成。尽管JSON是Javascript的一个子集，但JSON是独立于语言的文本格式，并且采用了类似于C语言家族的一些习惯。**Json** 解析器和 **Json** 库支持许多不同的编程语言。

几乎所有与网页开发相关的语言都有 **Json ** 库。**Json ** 比 **XML** 体量更小、速度更快。

![](https://img-blog.csdnimg.cn/67991ecdcf8441b5bfd3f22fde74c077.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

- 链接

[cJson](https://github.com/faycheng/cJSON)

> TinyHttpd

麻雀虽小，五脏俱全。**Tiny** 为极小的，**Http** 为应用层协议，当我们输入网址回车的那一刻就看到页面上想看到的内容，这里就涉及到HTTP协议。

这个项目可以让你清楚的了解 **Http** 请求头，响应头等细节信息，同时代码中使用多进程的方式对 **Http** 进行了实现。

那么你可以根据它来改造，比如你用多线程的方式来实现更多的 **Http** 公司，这样子，是不是你的简历就会更加的丰富，或者说通过压测工具来测试自己的项目来多维度的提升自己知识的广度

![](https://img-blog.csdnimg.cn/0d4ed3828cd54c7fb78ac5f32cb98914.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

- 链接

[TinyHttpd](https://github.com/EZLippi/Tinyhttpd)

> Cplusplusthings

目前已经 14.2 k的 star，小伙子今年入职腾讯，C++相关的内容总结蛮到位，当然也有一些自实现的内容。

![](https://img-blog.csdnimg.cn/d5a2aefbabe94f8c9259ffbe3eae4e92.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

- 链接

[MyTinySTL](https://github.com/Light-City/CPlusPlusThings)

> MyTinySTL

![](https://img-blog.csdnimg.cn/8faacff00e424209a658727e6babfe3b.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

> Lightweight Web Server

服务端开发中最多的项目就是web servier了，这个项目这样很多技术点

- epoll
- threadpool
- one loop per thread
- 同步互斥
- epoll不同的方式的区别
- 定时器 HTTP长连接的处理
- 线程池的运用

> facebook/folly

![](https://img-blog.csdnimg.cn/d1cbfa22d44041cabe345be11d64e005.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_16,color_FFFFFF,t_70#pic_center)

是对标准库的补充，尤其是大规模高性能的情况下

- 链接

[folly](https://github.com/facebook/folly)

> google levelDB

这是一个关于数据库的开源项目，目前市面上很多分布式存储都会用leveldb作为本地存储引擎，里面的LSM等经典存储结构值得大家学习

![](https://img-blog.csdnimg.cn/d94f7cc85f244054bf22a17f8078a2db.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

[levelDB](https://github.com/google/leveldb)

## 高频关于 C/C++的面试题

- c和C++的区别
- new和malloc的区别
- 堆和栈的理解
- C++和Java的对比
- C++ 智能指针介绍一下
- C++ map底层是啥，为什么红黑树比较好，红黑树的结构详细说一下
- 指针数组和数组指针定义一下
- C/C++是不是类型安全的语言
- const int * ，const * int，cont int *的含义
- 编译器如何处理inline函数
- 如何通过指针访问C++类中的private成员
- struct占用空间的大小
- 模板函数怎么实现的，是编译期间确定的还是运行时确定的
- vector如实现动态增长？
- vector和list区别
- 用类的空指针调用非虚成员函数和虚函数，有啥问题
- static/inline/this的优缺点及应用场景
- 虚函数
- 位域/大小端/#pragma/extern的理解
- 左右值的引用
- 静态动态多态的实现原理
- 纯虚函数的底层逻辑
- 强制类型转换

## 刷题网站

- nowcoder
- cplusplus
- leetcode
- cppreference

## Google开源项目风格指南

[直达Google开源项目风格指南](https://zh-google-styleguide.readthedocs.io/en/latest/google-cpp-styleguide/contents/)

![](https://img-blog.csdnimg.cn/b78e4522d84448f5a6c8a8a0afc4cb3a.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0wxNTUxOTU0MzgzNw==,size_1,color_FFFFFF,t_70#pic_center)

## 最后

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