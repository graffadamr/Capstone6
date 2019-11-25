<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task Manager Welcome</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>Welcome to Your Handy Task Manager</h1>
	
	<h4>Sign in:</h4>
	<form action="sign-in">
	<input name="username" type="text" placeholder="Username" required> 
	<input name="password" type="password" placeholder="Password" required>
	<input type="submit" value="Submit">
	</form>
	<br>
	<h4>Create new account:</h4>
	<form action="create-account">
	<input name="username" type="text" placeholder="Username" required>
	<input name="email" type="text" placeholder="E-mail" required> 
	<input name="password" type="password" placeholder="Password" required>
	<input type="submit" value="Submit">
	
	
	</form>
	</div>
</body>
</html>