<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bonus Lab Hotels only page</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css">
</head>
<body>

	<%-- 	<form action="/results" method="post">
		<select name="city">
			<c:forEach var="city" items="${cities}">
				<option value="${city}">${city}</option>
			</c:forEach>
		</select> <input type="submit" value="Go!">
	</form>     --%>


	<form action="/results" method="post">
		<div class="field" style="padding: 5%">
			<div class="control">
				<div class="select is-medium is-rounded is-warning">
					<select name="city">
						<c:forEach var="city" items="${cities }">
							<option value="${city }">${city }</option>
						</c:forEach>
					</select> <br> <br>
					<div class="control">
						<button type="submit" class="button is-rounded is-primary">Search</button>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>