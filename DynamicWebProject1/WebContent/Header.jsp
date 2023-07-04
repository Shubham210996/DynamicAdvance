<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header.jsp</title>
</head>
<body>
<img align="right" src="Images/customLogoOuterglow.png" style="height: 12%; width:12%;">
	<div style="height: 80px;" class="bg-primary bg-opacity-50" ><br>
		<%
			String fname = (String) session.getAttribute("firstname");
		%>
		<%
			if (fname != null) {
		%> 
		<h3 style="color: black;">&nbsp;&nbsp;
			Hii, <%=fname%></h3>
			<a href="UserListCtl.do">User List</a>|
			<a href="LoginController?Operation=logout">Logout</a>
		<%
			} else {
		%>
		<h3 style="color: black;">&nbsp;&nbsp;Hi, Guest</h3>
		<%
			}
		%>
	</div>
	
</body>
</html>