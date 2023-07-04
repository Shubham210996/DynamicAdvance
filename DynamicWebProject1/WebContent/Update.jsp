<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>

</head>
<body>
<% UserBean bean1 = (UserBean) request.getAttribute("bn"); %>
	<form action="UserController" method="post">
		<fieldset style="margin-left: 36%; margin-top:100px; padding-top: 50px; height: 200px; width: 280px;">
			<table>
			<input type="hidden" name="id" value="<%= bean1.getId() %>">
				<tr>
					<th>First Name : </th>
					<td><input type="text" name="firstName" value="<%=bean1.getFirstName()%>" placeholder="Enter First Name"></td>
				</tr>
				<tr>
					<th>Last Name : </th>
					<td><input type="text" name="lastName" value="<%=bean1.getLastName()%>" placeholder="Enter Last Name"></td>
				</tr>
				<tr>
					<th>Login ID : </th>
					<td><input type="text" name="loginId" value="<%=bean1.getLoginId()%>" placeholder="Enter Login ID"></td>
				</tr>
				<tr>
					<th>Password : </th>
					<td><input type="password" name="password" value="<%=bean1.getPassword()%>" placeholder="Enter Password"></td>
				</tr>
				<tr>
					<th>Address : </th>
					<td><input type="text" name="address" value="<%=bean1.getAddress()%>" placeholder="Enter Address"></td>
				</tr>
			</table>
			<br>
			
			<input type="submit" name="Operation" value="Update" style="margin-left:38%">
		</fieldset>
	</form>
</body>
</html>