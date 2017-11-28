# References
+ [Spring Framework Reference Documentation](https://docs.spring.io/spring/docs/4.3.12.RELEASE/spring-framework-reference/htmlsingle/)
+ [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/1.5.8.RELEASE/reference/htmlsingle/)


## Servlet、JSP、Spring MVC
### Servlet and JSP
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

### Sessions
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

### JavaServer Pages  
Servlet/JSP容器  
1.JSP页面转换为JSP页面实现类(Javax.servlet.jsp.JspPage接口或Javax.servlet.jsp.HttpJspPage)  
2.Servlet/JSP容器编译Servlet该类  
jsp-api.jar  
编写JSP页面时更关心Servlet API，而非JSP API  
除了javax.servlet.jsp.tagext，很少直接使用 JSP API  
JSP页面=模板数据+语法元素(如：'<%')  
JSP页面不同于Servlet的一点是：JSP不需要添加注解或在部署描述符中配置映射URL  
page指令的import属性  
JSP中有一些隐式对象可用(Servlet中本可以使用的一些对象等)  
PageContext可以获取和设置四种范围的属性 QQQ  
+ JSP概念
  + 指令
  + 脚本元素
  + 动作
JSP的指令  

定义在一个脚本程序中的变量可以被后续的脚本程序使用  
'<%' => 脚本元素  
'<%=' => 表达式  
'<%!' => 可以声明能在JSP页面中使用的变量和方法  
可以使用声明来重写JSP的init和destory方法  
JSP2.0推荐使用EL来访问服务器端对象且不写Java代码，而禁用脚本元素  
动作会被转换为Java代码来执行操作  
自定义标签就属于动作的范畴  
+ 分离表示层和业务逻辑的手段  
  + useBean动作
  + 自定义标签
  + 表达式语言  
+ 标准动作
  + useBean
  + setProperty/getProperty
  + include  
  + forward
+ include指令 pk include动作  

### 表达式语言
EL用于编写免脚本的JSP页面  
EL风格的隐式对象  

### JSTL(JSP标准标签库)

### 监听器
+ 监听器接口
  + ServletContext
  + HttpSession
  + ServletRequest
+ 添加监听器的方法
  + @WebListener
  + 部署描述文档  
AtomicInteger保证同步操作  
HttpSessionAttributeListener和HttpSessionBindingListener的区别  
如何给Session绑定属性 QQQ  

### Filters  
拦截Request请求  
可用于日志记录，加解密，Session检查，图像文件保护  
如何处理线程安全问题 QQQ  
java.util.concurrent.ExecutorService  

###  修饰Request和Response
ServletRequest and ServletRequestWrapper  
ServletResponse and ServletResponseWrapper  
XXXWrapper用于修饰Servlet请求或响应  
Decorator模式  

### 异步处理

### 安全
如何截获数据包 QQQ  
如何配置Tomcat使用JDBC来验证用户身份  
声明一个安全约束 => 只是简单地想保护资源不被未经授权的用户访问  
+ 身份验证方法  
  由于使用声明式的安全约束元素的方式获取资源，因此可以使用  
    + HTTP1.1提供的方案：基本访问认证和摘要访问身份验证
    + 基于表单的访问认证  
+ 基本访问身份验证(基本认证)  
  接受用户名和密码的HTTP身份验证 401 未经授权 Base64算法 弱  
+ 摘要访问认证  
  
### Tips
+ [Creating Servlet Example in Eclipse](https://www.javatpoint.com/creating-servlet-in-eclipse-ide)
+ [Eclipse写Servlet的时候总会遇到404](http://blog.csdn.net/u012966590/article/details/50032591)
+ [JSP Hello World Example using Eclipse IDE and Tomcat web server](http://www.srccodes.com/p/article/2/JSP-Hello-World-Program-using-Eclipse-IDE-and-Tomcat-web-server)
+ [How to Create Dynamic Web Project using Maven in Eclipse?](http://crunchify.com/how-to-create-dynamic-web-project-using-maven-in-eclipse/)

