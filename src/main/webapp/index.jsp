<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <base href="<%=basePath%>">
 </head>
<body>
<h2>Hello World!</h2>
<hr>
 <a href="login.action?username=fansy&age=23">登录</a>
 <br>
  <a href="query">查询</a>
</body>
</html>
