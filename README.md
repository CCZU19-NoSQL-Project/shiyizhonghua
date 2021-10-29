# shiyizhonghua

## 简介
中华诗词一站式搜索

## 开发环境

- JDK1.8

- maven3.6.3
  
- MySQL5.7

- MongoDB5.0

- IDEA2021.1

## 技术栈

> 前端

- jquery

- vue

- bootstrap

> 后端

- springboot 2.1.7.RELEASE

- spring data jpa

- mongodb

- mysql + mybatis

- lombok

- websocket

- logback

- thymeleaf

## 快速开始

1. 克隆项目到本地或者服务器

```shell
git clone https://github.com/CCZU19-NoSQL-Project/shiyizhonghua.git
```

2. 导入maven依赖。

打开maven依赖文件`pom.xml`，鼠标右键，点击maven -> Reload project。


3. 修改`application.properties`的运行环境。

项目一共配置了三个环境`dev|test|prod`，分别是`开发|测试|生产`环境。

- `application.properties` 运行配置，包含公共的环境配置和运行环境的选择。

- `application-dev.properties` 开发环境配置，一般配置本地的数据源，日志级别为debug。

- `application-test.properties` 测试环境，一般与远程生产环境一样，用于上线前的测试。

- `application-prod.properties` 生产配置，运行在服务器的配置，包含远程数据源的配置，日志级别为warn，日志输出内容更少，只包含最重要的警告和测试内容。

默认为开发环境。

```properties
# 运行环境
spring.profiles.active=dev
```

4. 修改各环境的配置。

主要修改各个环境的数据源，例如mysql和mongodb，以及日志输出文件的位置和名字。

（如果嫌麻烦可以只修改自己运行环境使用的配置）

5. 启动springboot。

## 常见问题

1. 想pull request，但是远程分支可能已经变了，不是你原来fork的分支了，怎么办？

> 一个比较low的方法就是：删除你fork的仓库，重新fork，然后提交代码，最后pull request。 
> 
> 另一种方法就是为源仓库设置一个本地分支，然后每次提交之前先merge一下，提交push之后在pull request。

具体操作如下：

1、查看当前设置的远程仓库

```shell
git remote -v
```

如果没有将原仓库设置为远程仓库，应该只有一个origin。

```shell
$ git remote -v
origin  https://github.com/zhuaowei/shiyizhonghua.git (fetch)
origin  https://github.com/zhuaowei/shiyizhonghua.git (push)
```

2、将原仓库地址添加为远程仓库

```shell
git remote add upstream https://github.com/CCZU19-NoSQL-Project/shiyizhonghua.git
```

然后在执行`git remote -v`应该会显示两个远程仓库，分别是origin和upstream。

```shell
$ git remote -v
origin  https://github.com/zhuaowei/shiyizhonghua.git (fetch)
origin  https://github.com/zhuaowei/shiyizhonghua.git (push)
upstream        https://github.com/CCZU19-NoSQL-Project/shiyizhonghua.git (fetch)
upstream        https://github.com/CCZU19-NoSQL-Project/shiyizhonghua.git (push)
```

3、然后执行正常的添加，提交，push命令，将代码提交到自己fork的远程仓库。

```shell
git status
git add <filename>
git commit -m 'comment'
git push origin main
git status
```

4、抓取原仓库的代码到本地。

```shell
git fetch upstream
```

5、切换本地当前分支为main分支。

```shell
git checkout main
```

6、将抓取的原仓库的代码与本地当前分支的代码合并。

```shell
git merge upstream/main
```

这一步如果有冲突则在本地解决冲突，删除冲突标记，然后重新提交，push。

7、如果合并并没有产生冲突，则进行正常的提交。

`git push`不带参数会将本地所有分支推上远程仓库。

```shell
git push
```

8、pull request。

现在fork仓库与原仓库代码不同步的问题已经解决了，可以向原仓库发起pull request了。

> 之后每次写完代码提交的时候，都要执行类似 3 - 8 的操作。
> 
> 如果pull request之后，作者还没有操作，你有对代码有了修改，并且push到了远程仓库，这部分修改的代码会自动添加到pull request中，不必关闭pull request再发起。