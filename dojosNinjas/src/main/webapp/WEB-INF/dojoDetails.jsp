<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dojos Details</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Dojo Details</title>
</head>
<body>
<a href="/">Dashboard</a>
<h1><c:out value="${dojo.name }"></c:out></h1>
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th class="text-center">First Name</th>
            <th class="text-center">Last Name</th>
            <th class="text-center">Age</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="eachNinja" items="${dojo.ninjas}">
			<tr>
				<td class="text-center"><c:out value="${eachNinja.firstName}"></c:out></td>
				<td class="text-center"><c:out value="${eachNinja.lastName}"></c:out></td>
				<td class="text-center"><c:out value="${eachNinja.age}"></c:out></td>
			</tr>	
		</c:forEach>
    </tbody>
</table>

</body>
</html>