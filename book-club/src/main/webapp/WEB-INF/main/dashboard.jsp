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
			<h1>Welcome, <c:out value="${user.userName}" /></h1>
			<a href="/logout">Logout</a>
		</div>
		<div class="d-flex justify-content-between">
			<p>Books from everyone's shelves:</p>
			<a href="/book/new">+Add a book to my shelf</a>
		</div>
		<div>
			<table class="table table-bordered text-center">
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Author Name</th>
						<th>Posted By</th>
						<th>Genre</th>
						<th>Actions</th>
					
					</tr>
				</thead>
				<tbody>
					<c:forEach var="bk" items="${allBooks}">
						<tr>
							<td>${bk.id}</td>
							<td><a href="/book/display/${bk.id}">${bk.title}</a></td>
							<td>${bk.author}</td>
							<td>${bk.creator.userName}</td>
							<td>${bk.genre}</td>
						
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	
	</div>
	
<%-- 	<td><a href="/books/${bk.id}"><c:out value="${bk.title}"/></a></td> --%>
</body>
</html>