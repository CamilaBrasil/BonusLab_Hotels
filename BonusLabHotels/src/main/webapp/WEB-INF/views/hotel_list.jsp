<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table class="$table-row-active-background-color $primary table is-striped is-hoverable" style="padding:40%">
		<thead>
			<tr>
				<th>Name</th>
				<th>City</th>
				<th>Price per night</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="hotel" items="${hotels}">
				<tr>
					<td>${hotel.name}</td>
					<td>${hotel.city}</td>
					<td>${hotel.pricePerNight}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>