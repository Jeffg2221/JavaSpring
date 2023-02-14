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
    <title>Add Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-3">
		<div class="d-flex align-items-center justify-content-between">
			<h1>Add a Book to Your Shelf!</h1>
			<a href="/dashboard">back to the book shelves</a>
		</div>
		<div>
			<form:form action="/book/new" method="post" modelAttribute="book" class="mt-3">
			<form:hidden path="creator" value="${user_id }"/>
				<p>
					<form:label path="title">Title:</form:label>
					<form:errors path="title" class="text-danger"/>
					<form:input path="title" class="form-control"/>
				</p>
				<p>
					<form:label path="author">Author:</form:label>
					<form:errors path="author" class="text-danger"/>
					<form:input path="author" class="form-control"/>
				</p>
				<p>
					<form:label path="thoughts">My thoughts:</form:label>
					<form:errors path="thoughts" class="text-danger"/>
					<form:textarea path="thoughts" class="form-control"/>
				</p>
				<p>
					<form:label path="genre">Genre:</form:label>
					<form:errors path="genre" class="text-danger"/>
					<form:input path="genre" class="form-control"/>
				</p>
				<input type="submit" value="Submit" />
			</form:form>
		</div>
	
	</div>

</body>
</html>