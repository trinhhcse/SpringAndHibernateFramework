<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customers</title>
<link type="text/css"
	 rel="stylesheet" 
	 href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<input class="add-button" type="button" value="Add Customer" onclick="location.href='showFormForAdd';"> 
			<table id="table">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="customer" items="${customers}">
					<!-- Url for delete -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${customer.id}"/>
					</c:url>
					<!-- Url for delete -->
					<c:url var="deleteLink" value="/customer/deleteCustomer">
						<c:param name="customerId" value="${customer.id}"/>
					</c:url>
					<tr>
						<td> ${customer.firstName} </td>
						<td> ${customer.lastName} </td>
						<td> ${customer.email} </td>
						<td> <a href="${updateLink}" style="text-decoration: none;">Update</a> </td>
						<td> <a href="${deleteLink}" style="text-decoration: none;">Delete</a> </td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>

</body>
</html>