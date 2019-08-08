<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student JSTL Form</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="processStudentFormV3" modelAttribute="student">

		<form:label path="">
FirstName:
 <form:input path="firstName" />
		</form:label>
		<br/><br/>
		<form:label path="">
		LastName:
		<form:input path="lastName"/>
		</form:label>
		<br/><br/>
		<form:label path="">
		Course ID:
		<form:input path="courseId"/>
		<form:errors path="courseId" cssClass="error"/>
		</form:label>
		<br/><br/>
		<form:label path="">
		Prime:
		<form:input path="prime"/>
		<form:errors path="prime" cssClass="error"/>
		</form:label>
		<br/><br/>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>