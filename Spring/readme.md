# References
+ [Spring Framework Reference Documentation](https://docs.spring.io/spring/docs/4.3.12.RELEASE/spring-framework-reference/htmlsingle/)
+ [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/1.5.8.RELEASE/reference/htmlsingle/)


### Servlet、JSP、Spring MVC
Java Servlet是Java开发Web应用的底层技术(1996年)。  
JSP(JavaServer Pages)用来简化servlet的开发。  
Web框架(如spring mvc)构建在Servlet和JSP之上。  
JSP页面会被转换和编译为servlet程序。  
Servlet必须运行在Servlet容器中。  
Web服务器和Web客户端通过HTTP通信，Web服务器=HTTP服务器 QQQ  
HTTP连接升级为WebSocket连接  

servlet接口定义了servlet类与servlet容器之间的契约。  
对于用户的一个请求，Servlet容器会调用Servlet的Service方法，并传入一个ServletRequest实例(http请求)和一个ServletResponse实例(http响应)。  
ServletContext实例  
线程安全性 java.util.concurrent.atomic包 QQQ  









### Tips
+ [Creating Servlet Example in Eclipse](https://www.javatpoint.com/creating-servlet-in-eclipse-ide)
+ [Eclipse写Servlet的时候总会遇到404](http://blog.csdn.net/u012966590/article/details/50032591)



