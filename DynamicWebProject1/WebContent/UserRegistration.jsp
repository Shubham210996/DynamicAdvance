<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>

</head>
<body>
	<form action="UserController" method="post">
		<fieldset style="margin-left: 36%; margin-top:100px; padding-top: 50px; height: 200px; width: 280px;">
			<table>
				<tr>
					<th>First Name : </th>
					<td><input type="text" name="firstName" placeholder="Enter First Name"></td>
				</tr>
				<tr>
					<th>Last Name : </th>
					<td><input type="text" name="lastName" placeholder="Enter Last Name"></td>
				</tr>
				<tr>
					<th>Login ID : </th>
					<td><input type="text" name="loginId" placeholder="Enter Login ID"></td>
				</tr>
				<tr>
					<th>Password : </th>
					<td><input type="password" name="password" placeholder="Enter Password"></td>
				</tr>
				<tr>
					<th>Address : </th>
					<td><input type="text" name="address" placeholder="Enter Address"></td>
				</tr>
			</table>
			<br>
			<input type="submit" name="Operation" value="Register" style="margin-left:38%">
		</fieldset>
	</form>
</body>
</html>