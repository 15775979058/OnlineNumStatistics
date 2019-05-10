<%@page import="java.util.*,java.text.*"%>
<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>ListenerTest</title>
</head>
<body>
	<h2>
		当前在线人数为：<%=utils.OnlineCounter.getOnline()%></h2>
	<h2>
		历史访问人数为：<%=application.getAttribute("count")%></h2>
</body>
</html>