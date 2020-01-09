<%@page import="demoweb.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息一览</title>
<%List<Student> list=(List<Student>)request.getAttribute("list"); %>
<style type="text/css">
div{
	margin-left: 500px;
	margin-top: 150px;
}

</style>
</head>
<body>
	<div>
	<table border="">
	<tr>
	<th>学号</th>
	<th>姓名</th>
	<th>年龄</th>
	<th>性别</th>
	<th>操作</th>
	</tr>
	<%for(int i=0;i<list.size();i++){%>
		<tr>
		<td><%=list.get(i).getSno() %></td>
		<td><%=list.get(i).getSname() %></td>
		<td><%=list.get(i).getSage() %></td>
		<td><%=list.get(i).getSsex() %></td>
		<td>
		<a href="studentServlet?method=delete&sno=<%=list.get(i).getSno() %>">删除</a>
		<a href="studentServlet?method=one&sno=<%=list.get(i).getSno() %>">修改</a>
		</td>
		</tr>
	<%} %>
	
	</table>
	<a href="addStudent.jsp">添加</a>
	</div>
	
</body>
</html>