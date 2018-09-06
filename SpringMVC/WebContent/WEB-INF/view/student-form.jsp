<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--     Reference spring MVC form tag -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name : <form:input path="firstName"/> <br><br>
	Last name : <form:input path="lastName"/> <br><br>
	Country : 
		<form:select path="country">
		   <form:option value="NONE" label="--- Select Country ---"/>
		   <form:options items="${student.countryOptions}" />
		</form:select><br><br>
	Favorite Language :
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/><br><br>
	Operating System :
		<form:checkboxes path="operatingSystems" items="${student.operatingSystemOptions}"/><br><br>
			
	<br><br>
	<input type="submit" value="Submit">
	</form:form>
</body>
</html>