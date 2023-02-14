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
			<h1>${book.title}</h1>
			<a href="/dashboard">back to the book shelves</a>
		</div>
		<div class="mt-5">
	
			<p><c:out value="${book.creator.userName}"/> read <c:out value="${book.title}"/> by <c:out value="${book.author}"/>.</p>
			<p>Here are <c:out value="${book.creator.userName}"/>'s thoughts:</p>
		</div>
		<div>
			<span class="border-top border-4"><c:out value="${book.thoughts}"/></span>
		</div>
		<div>
		<c:if test="${user_id == book.creator.id }" >
		<a class="btn-warning btn-outline--primary" href="/book/edit/${book.id }">Edit</a>
									<form action="/book/delete/${book.id}" method="post">
										<input type="hidden" name="_method" value="delete" />
										<input type="submit" value="Delete" class="btn btn-link" />
									</form>
								</c:if>
		</div>
		
		
		<%-- <a class="btn-warning btn-outline--primary" href="/book/edit/${book.id }">Edit</a>
		<form action="/book/delete/${book.id }" method="post">
			<input type="hidden" name="_method" value="delete"/>
			<input type="submit" value="Delete" class="btn btn-danger btn-outline-dark"/>
		</form> --%>
	</div>

</body>
</html>