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

	<h1>Donation: <c:out value="${oneDonation.donationName }"></c:out></h1>
	<h4>Quantity: <c:out value="${oneDonation.quantity }"></c:out></h4>
	<h4>Donor: <c:out value="${oneDonation.donor }"></c:out></h4>
	<h4>CreatedAt: <c:out value="${oneDonation.createdAt }"></c:out></h4>

</body>
</html>