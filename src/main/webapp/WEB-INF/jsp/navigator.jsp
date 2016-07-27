<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'navigator.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<ul class="nav nav-pills">
	<c:forEach items="${ret}" var="p">
		@foreach (var item in Model) { if (item.Sons != null &&
		item.Sons.Count > 0) {
		<li class="dropdown"><a data-submenu="" data-toggle="dropdown"
			tabindex="0">@item.MenuName<span class="caret"></span></a>
			<ul class="dropdown-menu">
				@foreach (var sub in item.Sons) { if (sub.Sons != null &&
				item.Sons.Count > 0) {
				<li class="dropdown-submenu"><a tabindex="0">@sub.MenuName</a>
					<ul class="dropdown-menu">
						@foreach (var inner in sub.Sons) {
						<li><a href="@inner.LinkUrl">@inner.MenuName</a></li> }
					</ul></li>
				<li class="divider"></li> } else {
				<li><a href="@sub.LinkUrl">@sub.MenuName</a></li> } }
			</ul></li> } else {
		<li><a href="@item.LinkUrl">@item.MenuName</a></li> } }
		</c:forEach>
	</ul>
</body>
</html>
