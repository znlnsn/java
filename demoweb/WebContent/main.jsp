<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String userName=(String)request.getAttribute("userName"); %>
<h3><%=userName %>,登录成功</h3>
</body>
</html>