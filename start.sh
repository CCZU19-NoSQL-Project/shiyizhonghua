# 生成包之前先删除
mvn clean
mvn install
# 后台启动项目
nohup java  -Xms128m -Xmx256m -jar ./package/shiyizhonghua.jar &