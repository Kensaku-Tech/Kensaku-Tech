<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@page import="java.text.SimpleDateFormat"%>
	<%@page import="java.util.Date"%>

	<%!Date date = new Date();%>
	<%!SimpleDateFormat today = new SimpleDateFormat("yyyy年MM月dd日");%>

	<%!int count = 0;%>
	<%
		count++;
	%>

	<h1>
		訪問回数:<%=count%></h1>

	<%
		out.print("今日の日付:" + today.format(date));
	%>



</body>
</html>