<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% User loginUser = (User) session.getAttribute("loginUser"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン結果</title>
</head>
<body>
<% if(loginUser != null) { %>
	<p>ログインに成功</p>
	<p>ようこそ<%= loginUser.getId() %></p>
	<a href="/docoTsubu/Main">つぶやき画面へ</a>
<% } else { %>
	ログイン失敗
	<a href="/docoTsubu/Login">top</a>
<% } %>
</body>
</html>