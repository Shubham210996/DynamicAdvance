<%@page import="in.co.rays.bean.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserListView</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<br>
	<form>
		<%
			List list = (List) request.getAttribute("list");
			Iterator it = list.iterator();
		%>

		<table border="1">
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Login Id</th>
				<th>Password</th>
				<th>Address</th>
				<th>Edit</th>
			</tr>
			<%
				while (it.hasNext()) {
					UserBean bean = (UserBean) it.next();
			%>
			<tr>
				<td><%=bean.getId()%></td>
				<td><%=bean.getFirstName()%></td>
				<td><%=bean.getLastName()%></td>
				<td><%=bean.getLoginId()%></td>
				<td><%=bean.getPassword()%></td>
				<td><%=bean.getAddress()%></td>
				<td><a href="UserController?id=<%=bean.getId()%>">Edit</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</form>
</body>
</html>