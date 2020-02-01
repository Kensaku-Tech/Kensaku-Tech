<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>
	<%!int substraction(int a, int b) {
		return a - b;
	}%>
	<h1>
		125-15=<%=substraction(125, 15)%></h1>
	<h1>
		17-21=<%=substraction(17, 21)%></h1>
</body>
</html>