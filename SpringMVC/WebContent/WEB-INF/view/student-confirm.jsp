<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--     Reference JSTL tag library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Student Confirm: ${student.firstName} ${student.lastName} from ${student.country}</p>
	<p>Student Favorite language: ${student.favoriteLanguage}</p>
	Operating System:
	<ul>
			<c:forEach var="operating" items="${student.operatingSystems}">
				<li>${operating}</li>
			</c:forEach>
	</ul>
</body>
</html>