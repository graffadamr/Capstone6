<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task Options</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Create a New Task</h1>
		<form action="add-task">
			<textarea row="3" cols="80" name="description">Your description of the task here . . .</textarea>
			<br> <input type="text" name="duedate" placeholder="Date due">
			<input type="submit" value="Submit">

		</form>
		<br>
		<h1>Your Tasks</h1>
		<table class="table">
			<tr>
				<th>Description</th>
				<th>Due Date</th>
				<th>Mark Complete</th>
			</tr>
			<c:forEach var="t" items="${tasks}">

				<tr>
					<td>"${t.description}"</td>
					<td>"${t.duedate}"</td>
					<td><button type="submit" action="delete"
							class="btn btn-primary">Complete</button>
				</tr>
			</c:forEach>
		</table>




	</div>
</body>
</html>