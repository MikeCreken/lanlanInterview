大家好，我是蓝蓝。

为了方便大家查看文章呢，我将文章同步到了网站上面，同时也放在了 **Github**，需要的小伙伴可以自行去查看哦。

> 蓝蓝所有干货同步更新于 https://github.com/MikeCreken/lanlanInterview

当然了，你们也可以自己去搭建属于你们的博客，无论是静态博客还是动态博客，市面上有很多成熟的脚手架，拿来部署就好了。

我的这个博客很简单，采用 **Docsify** 的方式部署，下面是整个部署流程，大家也可以去试试罗。

## 1 windows安装npm教程

由于 **Docsfiy** 依赖于 **Node **，所以我们需要先安装 **Node** 相关环境，按照下面步骤来就好了，基本不会出现什么问题。

在使用之前，先来了解这 3 个内容，明白它们是用来干什么的：

- *npm：* nodejs 下的包管理器。

- *webpack:*它主要用途是通过 **CommonJS**  的语法把所有浏览器端需要发布的静态资源作相应的准备，比如资源的合并和打包。

- *vue-cli：* 用户生成 **Vue** 工程模板。（帮你快速开始一个 **Vue** 的项目，也就是给你一套 **Vue** 的结构，包含基础的依赖库，只需要 **npm install** 就可以安装。

**nodejs** 下载网址：https://nodejs.org/en/   【如果嫌下载的慢，可以下载其他网站上的，别人有现成的，下载的比较快】

![nodejs官网](https://img-blog.csdnimg.cn/74a5ef0c8d084bd497e52f24a4ace15c.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

安装过程就非常简单了，基本上下一步下一步就好

![下一步](https://img-blog.csdnimg.cn/df1b11bc619643ef9f9a69f769b5eae9.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

我们直接让其加到 **path** 中去

![添加Path](https://img-blog.csdnimg.cn/cb4d92dbf6274cd58e67a57c33a987a8.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

安装完成以后，我们去看看目录的作用

![查看目录](https://img-blog.csdnimg.cn/3e37aec6c24a486a82a32051170e0d02.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

打开终端查看环境是否正常

![检查环境是否正确](https://img-blog.csdnimg.cn/1a8d899ffcae4b5e9b8c2c43583a11c7.png)

查看当前 **node.js** 的版本

![查看node版本](https://img-blog.csdnimg.cn/d30d8869b8fe47ae900c3e440fe7da0c.png)

再来看看另外 2 个目录，**npm** 的本地仓库跑在系统盘 C 盘的用户目录了(没见到 npm-cache 是因为没有用过，一使用缓存目录就生成了)，我们试图把这 2 个目录移动回到 D:\nodejs

![查看目录](https://img-blog.csdnimg.cn/846fa0c49b924ce88ac6f39444c5e606.png)

然后运行下面两条命令，你就可以看到目录发生了改变

![目录发生改变](https://img-blog.csdnimg.cn/28b6e22fa36b4365b676f42be8125f72.png)

此时我们再来看看 **npm** 的本地仓库，上图输入命令 npm list -global

为了提升我们下载依赖的速度，我们可以配置一个镜像站点

输入命令 配置镜像站

```shell
npm config set registry=http://registry.npm.taobao.org
```

![配置站点](https://img-blog.csdnimg.cn/6cd0d42441524992aa560b89cd37e467.png)

现在查看我们的所有配置信息，输入命令 **npm config list** 显示所有配置信息，我们关注一个配置文件，C:\Users\Administrator\.npmrc

![查看配置文件](https://img-blog.csdnimg.cn/88e5d208f4b54bcaa2d68a7cdee2f1d3.png)

![验证配置是否正确](https://img-blog.csdnimg.cn/f97926dcda244ff9808963953f6379c6.png)

现在测试我们的镜像站点好使不，那就拿 **Vue** 开刀

![测试获取vue信息](https://img-blog.csdnimg.cn/a94f801b6198469a956e1fa09de61121.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

使用 **npm** 安装一个最新 **Vue**

![安装最新vue](https://img-blog.csdnimg.cn/de8f5ce4ff6a4f1f8c15d749e62ee5db.png)

![查看安装列表](https://img-blog.csdnimg.cn/c355150ebfaa4da9939e85dfa7ad0a79.png)

注意，此时，默认的模块 **D:\nodejs\node_modules** 目录

将会改变为 **D:\nodejs\node_global\node_modules** 目录，

如果直接运行 **npm install** 等命令会报错的。

我们需要做 1件事情：

1、增加环境变量NODE_PATH 内容是：

**D:\nodejs\node_global\node_modules**

![新建NodePath](https://img-blog.csdnimg.cn/b832e4823220490387b684511c772aa5.png)

测试安装 vue 和 vue-router和vue-cli脚手架

![测试Vue安装](https://img-blog.csdnimg.cn/652145eb879b4c59a2856b80977a1546.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

这个时候输入**vue**，发现不是内部命令，我们就放在 **path** 中去

![path配置](https://img-blog.csdnimg.cn/28ec2d5670bf4bdbb279beacebe24a79.png)

查看vue版本

![查看vue版本](https://img-blog.csdnimg.cn/f840741940f943b8a1bf1b158065fb61.png)

切换到D盘

![切换到D盘](https://img-blog.csdnimg.cn/2b0a3ab2b7574e2297a83ae5ec1bb4e7.png)

注意，**vue-cli** 工具是内置了模板包括 **webpack** 和 **webpack-simple**，前者是比较复杂专业的项目，

他的配置并不全放在根目录下的 webpack.config.js 中。

![](https://img-blog.csdnimg.cn/7fa58f5e5ea8402694e3c2762e089c5c.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

初始化 安装依赖

![初始化](https://img-blog.csdnimg.cn/0a6f0fe8a5d34b61a64557569dc4b259.png)

运行npm install安装依赖

![安装依赖](https://img-blog.csdnimg.cn/3c9e69f94a404412b95adaf4872e25c4.png)

成功界面，提示打开地址http://localhost:8080

![查看页面](https://img-blog.csdnimg.cn/ccd43162bfc4460d88346a052cb9c9bd.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

随后输入 **npm run build** 生成静态文件，打开 dist 文件夹下新生成的 index.html 文件

![生成静态文件](https://img-blog.csdnimg.cn/54da111312b54992a061d6a0b5adf407.png)

**nmp**下新建出来的 **vue01** 的目录描述：

![查看目录结构](https://img-blog.csdnimg.cn/img_convert/8995e8fd9f6586dfbf3047ba4e1a941f.png)

## 2 安装 docsify-cli

```shell
npm i docsify-cli -g
```

执行完可以发现已经安装到我们之前配置的目录，当然也可以命令查看版本

![在这里插入图片描述](https://img-blog.csdnimg.cn/745ff27093b94a699d9f0486c72d8230.png)



![查看版本](https://img-blog.csdnimg.cn/c2c4ac3ff6054840b85260b9029ef4c9.png)

> 现在开始初始化我们的工程目录

执行 docsify init 命令

```shell
docsify init ./lanlanInterview
```

成功回显

![成功回显](https://img-blog.csdnimg.cn/82388a959c704a5494785755a2c5e31d.png)

进入这个目录我们看看生成了三个文件

![查看当前目录文件](https://img-blog.csdnimg.cn/7a721b7a9b3a43aeba4173c3f7a2fd0e.png)

- `index.html` 入口文件
- `README.md` 会做为主页内容渲染
- `.nojekyll` 用于阻止 GitHub Pages 会忽略掉下划线开头的文件

> 本地预览博客网站

![启动本地serve](https://img-blog.csdnimg.cn/0e39e2715df640068a8b40aa80385fd6.png)

浏览器输入上方的 url 即可访问我们的网站了。不过这个时候还是很空的内容，下面我就逐步进行配置。

> 展示多页文档

假设当前你的目录结构是下面这个样子

```shell
└── docs
    ├── README.md
    ├── Java.md
    └── C++
        ├── README.md
        └── guide.md
```

此时对应访问的页面是这样子

```shell
docs/README.md        => http://domain.com
docs/guide.md         => http://domain.com/Java
docs/C++/README.md  => http://domain.com/C++/
docs/zh-cn/guide.md   => http://domain.com/zh-cn/guide
```

> 定制侧边栏

如果需要侧边栏，则需要创建一个文件，命名为 _sidebar.md，默认情况下侧边栏会通过 Markdown 文件自动生成。先在 HTML 中配置 loadSidebar。

```html
<!-- index.html -->

<script>
  window.$docsify = {
    loadSidebar: true
  }
</script>
<script src="//cdn.jsdelivr.net/npm/docsify/lib/docsify.min.js"></script>
```

然后再 **_sidebar.md** 文件中增加如下内容

```shell
<!-- docs/_sidebar.md -->

* [首页](zh-cn/)
* [Java](zh-cn/Java)
```

注意：需要在 `./docs` 目录创建 `.nojekyll` 命名的空文件，阻止 **GitHub Pages** 忽略命名是下划线开头的文件。

> 开启侧边栏

自定义侧边栏同时也可以开启目录功能。设置 `subMaxLevel` 配置项，

```html
<!-- index.html -->

<script>
  window.$docsify = {
    loadSidebar: true,
    subMaxLevel: 2
  }
</script>
<script src="//cdn.jsdelivr.net/npm/docsify/lib/docsify.min.js"></script>
```

> 设置封面

封面的生成同样是从 **markdown** 文件渲染来的。开启渲染封面功能后在文档根目录创建 **_coverpage.md** 文件。渲染效果如本文档。

先再 index.html 中添加 **coverpage** 参数

```shell
<!-- index.html -->

<script>
  window.$docsify = {
    coverpage: true
  }
</script>
<script src="//cdn.jsdelivr.net/npm/docsify/lib/docsify.min.js"></script>
```

随后在 **_coverpage.md** 中进行配置，大家看到封面中的 **Github** 图标统计量都使用了插件的方式，大家可以看下面注释部分

![在这里插入图片描述](https://img-blog.csdnimg.cn/966b797171ba4c0c926640e528314efd.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

## Gitee部署

现在我们是本地预览，我们希望放在外网去，让更多的人看到怎么办呢。当然，最好能白嫖，那也行啊，即 **Gitee Pages**，我们只需要将代码，文档推送到 Gitee，然后申请开通 Page 就好了。

- 新建 Gitee 仓库

![新建Gitee仓库](https://img-blog.csdnimg.cn/ee6ed8ed69444c4ba8b6882f1c1aef24.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

- 推送代码文档到创建的仓库

```shell
git init //初始化仓库
git add .//add 暂存区
git commit -m "first commit" //提交注释
git remote add gitee 你的路径 
git push -u gitee master //推送
```

如果大家想推送 Gitee 的同时也 推送到 Github，也是没有问题的，可以采取下面几种方案

- 先使用 git remote -v 查看本地仓库的远程库列表
- 假设此时需要添加一个 远程库地址，则新增

```shell
git remote add github git@xxx
```

如果在 add 的时候出现 `error: Could not remove config section ‘remote.xxx’.`一类的错误，通过把仓库下`.git/config` 文件里的 `[remote “xxx”]`删除或者是用其他远程库名即可。

- 再使用 git remote -v查看远程库信息，你会发现多了两个库

![查看远程库信息](https://img-blog.csdnimg.cn/d84b399e88fa423fb5c9525cb81842eb.png)

- 此时就可以开始推送代码和文档了

```shell
git add .
git commit -m "提交日志"
git push github master
git push gitee master
```

还有其他的方法同步 Gitee 和 Github，即使用官方的 Aciton方法 Github Action，使用 CI/CD 的思想，从Github中自动化执行流程，这里就不详细讲解了，有兴趣的可以去看看。

> 开启 pages

这个过程折磨死我了，首先要申请

![开启pages](https://img-blog.csdnimg.cn/aa71c949db514206a2134749a2b230d3.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

申请的时候需要上传身份中正反面及拿着身份证一张，随后上传，大概审核一次一天，我传了三次，也就是等了三四天终于开通。

![申请pages](https://img-blog.csdnimg.cn/6c736776e9814959a1e91d0198638768.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)



就是下面这个样子，哈哈哈，这个大标题属实有些丑，后序再换好了。

![封面首页](https://img-blog.csdnimg.cn/f2e24a1655c94a48be804673ef30dd96.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

那点进来是什么样子呢，当当当~~~~~

![内容页](https://img-blog.csdnimg.cn/340ec298f4cb4668a2f86d4ce8d87c32.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

使用的图标基本上都是吃的，所以搭建的时候我都好饿好饿，于是点了外卖边吃边弄啦。

另外，有趣的是，加了一个点击屏幕就出现offer字的插件，希望看到这个文档的小伙伴有定都能上岸呀，因为这么多篇文章都是自己多少个下班时间及周六周日一步步完成的哦。

![双击屏幕有惊喜](https://img-blog.csdnimg.cn/f62e7498957a4329833ac70108676fcc.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

## 最后

后面会慢慢的迭代这些内容，虽然十一月了，大家也不要放弃哟，机会都是留给准备好的你们呢。好了，拜拜~~~

稍等，记得去我的 Github 点个 Star~~~

蓝蓝的 Github：[点Star就上岸哟](https://github.com/MikeCreken/lanlanInterview)

这里还有一个在线的网站方便大家复习。[蓝蓝的个人博客](https://lanlanbank.gitee.io/lanlan-interview/#/)

Github不知道会做到什么时候，才一个月时间，现在已经有些人那我这丢丢资料去卖给人家，哎，挺无语的，需要的小伙伴可以去下载，记得给我点个 Star 哈。

，不上岸找我，哼~~

![](https://img-blog.csdnimg.cn/bb60cc286d8b42d7ae925e9176a9a65c.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

蓝蓝的公众号：暖蓝笔记

[暖蓝笔记公众号](https://mp.weixin.qq.com/s?__biz=MzAxMDMzOTEwMA==&mid=2453507437&idx=1&sn=7c805cc389e91e7c2da8affa8bcacbbf&chksm=8c98fb1ebbef72089666c7b716637ab9c8d54b84d9345799dd73ee43560bbdedb3cda62bc1e3&token=112701746&lang=zh_CN#rd)


**蓝蓝的星球：蓝蓝银行小分队**

这个星球将给大家进行**简历修改**(针对性的修改)及所有文章**PDF**版本的领取，一定是物有所值的啦。

![](https://img-blog.csdnimg.cn/5b35f132dd5e490abbc64f08aef7cf56.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

![](https://img-blog.csdnimg.cn/3b49ee99608d41438a37458a92be156b.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)

如果你也有想要分享的内容，或者进入银行国企的交流群，我们一起成长，那也可以加我这个专用wx，记得备注"Github"

![](https://img-blog.csdnimg.cn/58213272ee7948e9b910d1f00eae6c35.jpg?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBA5oiR5piv56iL5bqP5ZGY5bCP6LSx,size_1,color_FFFFFF,t_70,g_se,x_16)