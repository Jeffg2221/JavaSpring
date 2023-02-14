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
    <title>Dojos Dashboard</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Create Dojo</title>
</head>
<body>
<h1>Dashboard</h1>

<div class="btn-group">
  <a href="add/dojos" class="btn btn-primary active" aria-current="page">Add Dojo</a>
  <a href="add/ninjas" class="btn btn-primary active" aria-current="page">Add Ninja</a>
</div>

<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th class="text-center">First Name</th>
            <th class="text-center">Last Name</th>
            <th class="text-center">Age</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="eachNinja" items="${ninjaList}">
			<tr>
				<td class="text-center"><c:out value="${eachNinja.firstName}"></c:out></td>
				<td class="text-center"><c:out value="${eachNinja.lastName}"></c:out></td>
				<td class="text-center"><c:out value="${eachNinja.age}"></c:out></td>
			</tr>	
		</c:forEach>
    </tbody>
</table>

<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th class="text-center">Dojo</th>
            <th class="text-center">Total Ninjas</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="eachDojo" items="${dojolist}">
			<tr>
				<td class="text-center"><a href="/dojos/${eachDojo.id}"><c:out value="${eachDojo.name}"></c:out></a></td>
				<td class="text-center"><c:out value="${eachDojo.ninjas.size()}"></c:out></td>
				
			</tr>	
		</c:forEach>
    </tbody>
</table>




</body>
</html>