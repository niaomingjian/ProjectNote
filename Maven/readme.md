### References
+ [POM Reference](https://maven.apache.org/pom.html)
+ [Maven CLI Options Reference](http://maven.apache.org/ref/3.1.0/maven-embedder/cli.html)

### Tricks
+ install a jar to local repository   
`mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.2.0 -Dpackaging=jar -Dfile=e:\ojdbc6.jar`  
[Guide to installing 3rd party JARs](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html)

+ maven打包时跳过测试  
`mvn install -Dmaven.test.skip=true`  
`mvn install -DskipTests`  

+ `mvn install:install-file -DgroupId=jdk.tools -DartifactId=jdk.tools -Dpackaging=jar -Dversion=1.8 -Dfile=tools.jar -DgeneratePom=true`

# Maven实战

### 建议
+ 显示声明项目中直接用到的依赖



### Questions
+ 自动生成的项目报告，帮助项目成员了解项目状况，促进项目交流？
+ Maven发布的项目报告站点？
+ 

### practices
+ mvn help:system
+ ping repol.maven.org 检查网络
+ telnet 218.14.100.100 3180 检查该地址的端口是否通畅
+ ctrl+]，然后q，回车，可退出
+ MAVEN_OPTS
+ mvn clean compile
+ mvn clean test
+ 配置maven-compiler-plugin支持Java5
+ mvn clean package
+ mvn clean install
+ 配置maven-shade-plugin生成可执行jar文件
+ mvn archetype:generate  maven-archetype-plugin
+ mvn dependency:list查看当前项目的已解析依赖
+ mvn dependency:tree查看当前项目的依赖树
+ mvn dependency:analyze分析依赖树



