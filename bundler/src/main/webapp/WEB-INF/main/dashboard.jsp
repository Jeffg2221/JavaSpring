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
    <title>Dashboard</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   
<div class="container mt-3">
		<div class="d-flex align-items-center justify-content-between">
			<h1>Hello, <c:out value="${user.userName}" />. Here are some name suggestions.</h1>
			<a href="/logout">Logout</a>
		</div>
		<div class="d-flex justify-content-between">
			<h3>Baby Names</h3>
			
		</div>
		<div>
			<table class="table table-bordered text-center">
				<thead>
					<tr>
						
					
					</tr>
				</thead>
				<tbody>
					<c:forEach var="br" items="${allBundlers}">
						<tr>
							<td><a href="/bundler/display/${br.id}">${br.name}</a></td>
							<td>${br.gender}</td>
							<td>Origin: ${br.origin}</td>
				
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<a href="/bundler/new">< new name</a>
	</div>
	

</body>
</html>