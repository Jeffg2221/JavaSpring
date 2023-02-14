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
    <title>Show Name</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-3">
		<div class="d-flex align-items-center justify-content-between">
			<h1>${bundler.name}</h1>
			<h2>(added by ${bundler.creator.userName})</h2>
			<a href="/dashboard">back to names</a>
		</div>
		<div class="mt-5">
	
			<p>Gender: ${bundler.gender}</p>
			<p>Origin: ${bundler.origin}</p>
		</div>
		<div>
			<span class="border-top border-4"><c:out value="${bundler.meaning}"/></span>
		</div>
		<div>
		<br>
		<c:if test="${user_id == bundler.creator.id }" >
		<a class="btn btn-success" href="/bundler/edit/${bundler.id }">Edit</a>
									
								</c:if>
		</div>
		
	</div>

</body>
</html>