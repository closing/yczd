## 需要安装的工具  
* Java8
* Eclipse
* Maven
* PostMan（浏览器插件）
----
## 开发软件说明  
Java  
&ensp; 用1.8,小版本号暂时没有要求  
Eclipse  
&ensp; 用Eclipse Java EE IDE for Web Developers.  
&ensp; 版本>=4.7.3  
Maven版本没有限制  
PostMan 版本没有限制    

----

## 关于项目目录  
项目使用的工具和项目工程文件目录最好大家统一,例如像下面的例子  
&ensp;D:\yczd\eclipse\
&ensp;D:\yczd\workspace\  
&ensp;D:\yczd\eclipse_workspace\xxx-prj  
&ensp;D:\yczd\eclipse_workspace\yyyy-prj
&ensp;D:\yczd\miniide\  
&ensp;D:\yczd\mini_workspace\aa-prj  
&ensp;D:\yczd\mini_workspace\bb-prj  
&ensp;D:\yczd\document  
&ensp;D:\yczd\tool\java  
&ensp;D:\yczd\tool\maven    
## 关于上面的说明
暂时可以不统一，但最好是随着项目的进展大家尽量像相同的方向统一 

----

## 导入Eclipse
1.把代码下载到本地电脑  
&ensp;https://github.com/closing/yczd,Clone or Download  
2.在Eclipse下以maven工程导入到Eclipse工作空间    
&ensp;Eclipse->Import->Maven->Existing Maven Projects    
&ensp;只导入yczd-api-aio  
2.选中导入的yczd-api-aio，右键单击，选maven->Update Project  
3.选中项目下pom.xml文件，右键单击，选运行方式->Maven Install    
4.选中工程，右键单击，选运行方式->Spring Boot App     
5.访问localhost:8080/v1/goods确认    
## 项目说明
1.主要使用的框架Spring Boot + Spring FrameWork + MyBatis  
2.大体运行流程，项目启动后,以url(+http method)方式访问项目资源&ensp;  
&ensp;例如:locahost:8080/v1/goods    
&ensp;GoodController->GoodService->GoodRepository(GoodDao)->GoodMapper
