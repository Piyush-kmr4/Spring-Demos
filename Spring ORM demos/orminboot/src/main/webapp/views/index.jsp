<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<div align="center"><h1> Welcome to Spring Boot ORM using Hibernate Application</h1></div>
	<div>
		<form action="getAliens" method="get">
			<h4>Click here to get List of all Aliens:  </h4><input type="submit">

		</form>
	</div>
 	<hr>
 	<div>
		<form action="addAlien" method="post">
			Enter your id : <input type="text" name="aid"><br>
			Enter your name : <input type="text" name="aname"><br>
			<input type="submit">
		</form>
	</div>
	<hr>
	<div>
		<form action="getAlien" method="get">
			Enter the desired id : <input type="text" name="aid"><br>
			<input type="submit">
		</form>
	</div>
	<hr>
	<div>
		<form action="removeAlien" method="get">
			Enter the desired id : <input type="text" name="aid"><br>
			<input type="submit">
		</form>
	</div>
	<hr>
	<div>
		<form action="getAlienByName" method="get">
			Enter the desired name : <input type="text" name="aname"><br>
			<input type="submit">
		</form>
	</div>
 	
</body>
</html>