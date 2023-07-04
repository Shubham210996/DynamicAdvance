<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h1>Hello Welcome Page</h1>
	
	<%=request.getParameter("firstName") %>
	<%=request.getParameter("lastName") %>
	<%=request.getParameter("loginId") %>
	<%=request.getParameter("password") %>
	<%=request.getParameter("address") %>
	
</body>
</html>