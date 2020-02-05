<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jsp.FortuneBean"%>
<!DOCTYPE html>
<html>
<head>
<%
	FortuneBean fortunebean = (FortuneBean) request.getAttribute("URANAU");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>↓<%=fortunebean.getToday()%>↓</h1>
	<h1><%=fortunebean.getFortune()%></h1>
</body>
</html>