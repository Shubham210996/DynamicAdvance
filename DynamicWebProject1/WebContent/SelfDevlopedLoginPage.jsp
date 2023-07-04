<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<body>
	<img src="Images/customLogoOuterglow.png" style="height: 8%; width: 8%">
	<div
		style="padding-top: 15px; margin-left: 430px; height: 430px; width: 250px;">
		<form action="" method="get">
			<fieldset
				style="width: 350px; height: 520px; margin-left: 12px; border-style: double;">
				<h2 align="center">Register</h2>
				<h6 align="center">kindly fill in this form to register.</h6>
				<lable style="margin-left: 7.8%;"> <b>First Name</b></lable>
				<br> <input
					style="border-style: hidden; background-color: lightgray; padding-right: 34%; padding-left: 2%; padding-top: 2%; padding-bottom: 2%; margin-left: 8%;"
					type="text" name="firstName" placeholder="Enter Your First Name">
				<br> <br>
				<lable style="margin-left: 7.8%;"> <b>Last Name</b></lable>
				<br> <input
					style="border-style: hidden; background-color: lightgray; padding-right: 34%; padding-left: 2%; padding-top: 2%; padding-bottom: 2%;; margin-left: 8%;"
					type="text" name="lastName" placeholder="Enter Your Last Name">
				<br> <br>
				<lable style="margin-left: 7.8%;"> <b>Login ID</b></lable>
				<br> <input
					style="border-style: hidden; background-color: lightgray; padding-right: 34%; padding-left: 2%; padding-top: 2%; padding-bottom: 2%; margin-left: 8%;"
					type="text" name="userName" placeholder="Enter Your Email Id"> <br> <br>
				<lable style="margin-left: 7.8%;"> <b>Password</b></lable>
				<br> <input
					style="border-style: hidden; background-color: lightgray; padding-right: 34%; padding-left: 2%; padding-top: 2%; padding-bottom: 2%; margin-left: 8%;"
					type="password" name="password" placeholder="Enter Your Password"> <br> <br>
					<lable style="margin-left: 7.8%;"> <b>Address</b></lable>
				<br> <input
					style="border-style: hidden; background-color: lightgray; padding-right: 34%; padding-left: 2%; padding-top: 2%; padding-bottom: 2%; margin-left: 8%;"
					type="text" name="id" placeholder="Enter Your Address"> <br>
				<br>
				<input
					style="margin-left: 7.8%; padding-left: 38%; padding-right: 31.5%; padding-top: 3%; padding-bottom: 3%; color: white; background-color: blue;"
					type="submit" value="Register">
				<h6 align="center">
					Already have an account? <u><a href="">Log in</a></u>
				</h6>
			</fieldset>
		</form>
	</div>
</body>
</html>