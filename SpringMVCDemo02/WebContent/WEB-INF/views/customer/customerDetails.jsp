<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer details</title>
</head>
<body>
	<h1>Customer Details</h1>
	Customer Name is : ${customer.name}
	<br />
	<br /> Customer Country is : ${customer.country}
	<br />
	<br /> Favourite Cuisine: ${customer.favCuisine}
	<br />
	<br /> Books to buy:
	<br />
	<ul>
		<c:forEach var="book" items="${customer.books}">
			<li>${book}</li>
		</c:forEach>
	</ul>
</body>
</html>