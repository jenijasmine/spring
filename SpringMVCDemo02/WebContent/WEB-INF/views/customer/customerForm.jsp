<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.error {
	color: red;
}
</style>
<title>Customer Form</title>
</head>
<body>
	<h1>Customer form</h1>
	<form:form action="processForm" modelAttribute="customer">
   Name:<form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br />
		<br />
   Country:
   <form:select path="country">
			<%--    <form:option value="IN">India</form:option> --%>
			<%--    <form:option value="JP">Japan</form:option> --%>
			<%--    <form:option value="RJ">Russia</form:option> --%>
			<%--    <form:option value="BR">Brazil</form:option> --%>
			<%--    <form:option value="FR">France</form:option> --%>
			<form:options items="${customer.countryList}" />
		</form:select>
		<br />
		<br />
   Favourite Cuisine:
   <br />
		<fieldset name="Cuisine">
			<%--    <form:radiobutton path="favCuisine" value="Punjabi"/> Punjabi --%>
			<%--    <form:radiobutton path="favCuisine" value="South Indian" checked="checked"/> South Indian --%>
			<%--    <form:radiobutton path="favCuisine" value="Goan"/> Goan --%>
			<%--    <form:radiobutton path="favCuisine" value="Malabari"/> Malabari --%>
			<form:radiobuttons path="favCuisine" items="${customer.cuisineList}" />
		</fieldset>
		<br />
		<br />
		<fieldset>
			<legend>Select books to buy</legend>
			
			<form:checkbox path="books" value="Brief history of time" />
			Brief history of time
			<form:checkbox path="books" value="Grand Design" />
			Grand Design
			<form:checkbox path="books" value="David Copperfriend" />
			David Copperfriend
			<form:errors path="books" cssClass="error" />
		</fieldset>
		<br />
		<br />
		<form:label path="" >
		Number of discount coupons:
		<form:input path="discountCoupons"/>
		<form:errors path="discountCoupons" cssClass="error" />
		</form:label>
		<br/><br/>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>