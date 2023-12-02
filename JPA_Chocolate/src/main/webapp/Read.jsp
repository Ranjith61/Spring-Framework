<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read page</title>
</head>
<body>
	<h1>List of Chocolates</h1>
	<c:forEach items="${list}" var="dto">
		<h2>${dto.name}</h2>
		<h2>${dto.price}</h2>
		<h2>${dto.quantity}</h2>
		<h2>${dto.manufacturer}</h2>
	</c:forEach>
</body>
</html>