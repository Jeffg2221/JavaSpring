<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import= "java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Show All Donations</h1>
<table>
	<thead>
		<tr>
			<th>Donation</th>
			<th>Quantity</th>
			<th>Donor</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var ="donation" items="${allDonations }">
		<tr>
			<td><a href="/donation/show/${donation.id}"><c:out value="${donation.donationName }"></c:out></a></td>
			<td><c:out value="${donation.quantity }"></c:out></td>
			<td><c:out value="${donation.donor }"></c:out></td>
		</tr>
		
		
		
		</c:forEach>
		
		</tbody>
		
	</table>
			













<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>