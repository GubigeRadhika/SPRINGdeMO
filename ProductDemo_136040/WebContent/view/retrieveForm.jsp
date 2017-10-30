<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Trainee Info</h1>
		<table border="1">
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Product Cost</th>
			</tr>
			<tr>
				<td>${Product.productId}</td>
				<td>${Product.productName}</td>
				<td>${Product.productCost}</td>
			</tr>
			<tr>
				<td colspan="4"><a href="showHomePage.obj">Go to Home</a></td>
			</tr>
		</table>
</body>
</html>