<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--     Reference spring MVC form tag -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customer-form</title>
<style>
	.error{
		color: red
	}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First name : <form:input path="firstName"/> <br><br>
		Last name : <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/><br><br>
		Age : <form:input path="age" />
		<form:errors path="age" cssClass="error"/><br><br>
		Post Code : <form:input path="postCode"/>
		<form:errors path="postCode" cssClass="error"/><br><br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>