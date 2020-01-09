<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 输入用户名，进入首页 -->
<h3>欢迎教师登录</h3>
	<form action="loginServlet" method="get">
		请输入姓名：<input type="text" name="userName" value=""/><br/>
		<input type="submit" value="进入首页"/>
	</form>
	<a href="studentServlet?method=all">查询所有学生信息</a>
</body>
</html>