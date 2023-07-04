<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login View</title>
<link rel="stylesheet" href="BootStrap-Bundles/bootstrap.min.css">
<script src="BootStrap-Bundles/bootstrap.bundle.min.js"></script>
</head>
<body class="bg-gradient bg-opacity-10">
	<%@ include file="Header.jsp"%>
	<form action="LoginController" method="post">
		<%
			String key = (String) request.getAttribute("key");
			String msg = (String) request.getAttribute("msg");
			String uri = (String) request.getAttribute("uri");
		%>
		<input type="hidden" name = "uri" value="<%=uri%>">
		<h1
			style="font-family: cursive; margin-top: 2%; font-size: 50px; text-align: center;">Welcome
			to Login Page...!!!</h1>
		<%
			if (msg != null) {
		%>
		<h1 style="color:red; font-family:san-serrif; margin-top: 2%; font-size: 20px; text-align: center;"><%=msg%></h1>
		<%
			}
		%>
		<fieldset
			style="height: 150px; width: 330px; margin-top: 30px; margin-left: 520px; padding: 25px; border: double;"
			class="border-primary bg-dark bg-opacity-10">
			<table>

				<tr>
					<th>Login ID :</th>
					<td><input type="text" name="loginId"
						placeholder="Enter Email ID"></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th>Password :</th>
					<td><input type="password" name="password"
						placeholder="Enter Password"></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="Submit"
						style="margin-left: 25px"></td>
				</tr>
			</table>
		</fieldset>
		<%
			if (key != null) {
		%>
		<br>
		<h6 style="color: red; text-align: center;"><%=key%></h6>

		<%
			}
		%>
	</form>
</body>
</html>