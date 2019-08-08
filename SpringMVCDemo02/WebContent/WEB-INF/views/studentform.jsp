<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>
    <h2>Student Form</h2>
	<form action="processStudentFormV3" method="POST">
	<label for="firstName">
	FirstName: <input type="text" id="firstName" name="firstName"/>
	</label>
	<br/><br/>
	<label for="lastName">
	LastName: <input type="password" id="lastName" name="lastName"/>
	</label>
	<br/><br/>
	<label for="courseId">
	Course Id:
	<input type="text" id="courseId" name="courseId"/>
	</label>
	<br/><br/>
	<label for="prime">
	Seed:
	<input type="text" id="prime" name="prime"/>
	</label>
	<br/><br/>
	<button type="submit">Submit</button>
	</form>
</body>
</html>