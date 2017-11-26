# References
+ [Spring Framework Reference Documentation](https://docs.spring.io/spring/docs/4.3.12.RELEASE/spring-framework-reference/htmlsingle/)
+ [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/1.5.8.RELEASE/reference/htmlsingle/)


### Servlet、JSP、Spring MVC
#### Servlet and JSP
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
transient 修饰符   
ServletResponse隐藏了向浏览器发送响应的复杂过程  
ServletResponse.getWriter()  
将一个应用程序同时部署到多个容器的分布式环境中 QQQ  

#### Sessions
+ 状态保持技术
  + URL重写
  + 隐藏域
  + cookies
  + HTTPSession对象  

隐藏域技术仅当网页有表单时有效  
Cookies自动在浏览器和Web服务器之间交互，Cookies作为HTTP header的一部分  
javax.servlet.http.Cookie类  
一个用户有且最多有一个HttpSession  
HttpSession对象在用户第一次访问网站时自动被创建  
放入到HttpSession中的值是存储在内存中的  
可以将实现了java.io.Serializable的任何java对象放到HttpSession中  
HttpSession的数据不会发送到客户端，只会通过URL或Cookies自动发送一个唯一标识  

#### JavaServer Pages  








### Tips
+ [Creating Servlet Example in Eclipse](https://www.javatpoint.com/creating-servlet-in-eclipse-ide)
+ [Eclipse写Servlet的时候总会遇到404](http://blog.csdn.net/u012966590/article/details/50032591)


