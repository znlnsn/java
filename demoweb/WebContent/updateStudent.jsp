<%@page import="demoweb.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改学生信息</title>
<%Student stu=(Student)request.getAttribute("student"); %>
</head>
<body>
<form action="studentServlet">
	<input type="hidden" name="method" value="update">
	学号：<input type="text" name="sno" value="<%=stu.getSno()%>"/><br/>
	姓名：<input type="text" name="sname" value="<%=stu.getSname()%>"/><br/>
	年龄：<input type="text" name="sage" value="<%=stu.getSage()%>"/><br/>
	性别：<input type="text" name="ssex" value="<%=stu.getSsex()%>"/><br/>
	<input type="submit" value="修改"/>
	</form>
</body>
</html>