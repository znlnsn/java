<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生信息</title>
<style type="text/css">
div{
	margin-left: 500px;
	margin-top: 150px;
}
</style>
</head>
<body>
	<div>
	<form action="studentServlet">
	<input type="hidden" name="method" value="add">
	学号：<input type="text" name="sno" value=""/><br/>
	姓名：<input type="text" name="sname" value=""/><br/>
	年龄：<input type="text" name="sage" value=""/><br/>
	性别：<input type="text" name="ssex" value=""/><br/>
	<input type="submit" value="添加"/>
	</form>
	</div>
</body>
</html>