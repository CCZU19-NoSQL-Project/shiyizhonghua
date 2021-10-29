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