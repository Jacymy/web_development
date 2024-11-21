<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>拦截器</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <a href="hello.do">请求拦截测试（被UserInterceptor和MyInterceptor拦截）</a><br>   
   <a href="hello1.do">请求放行测试（仅被全局拦截器UserInterceptor拦截）</a><br>  
    <h3>${msg}</h3> 
</body>
</html>
