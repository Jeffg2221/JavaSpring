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
    <title>Add Name</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-3">
		<div class="d-flex align-items-center justify-content-between">
			<h1>Add a Name!</h1>
			
		</div>
		<div>
			<form:form action="/bundler/edit/${bundler.id}" method="post" modelAttribute="bundler" class="mt-3">
			<input type="hidden" name="_method"  value="put"/>
			<form:hidden path="creator" value="${user_id }"/>
				<p>
					<form:label path="name">New Name:</form:label>
					<form:errors path="name" class="text-danger"/>
					<form:input path="name" class="form-control"/>
				</p>
				<p>
					<form:label path="gender">Typical Gender:</form:label>
					<form:errors path="gender" class="text-danger"/>
					<form:select path="gender" class="form-control">
						<form:option value="Neutral">Neutral</form:option>
						<form:option value="Male">Male</form:option>
						<form:option value="Female">Female</form:option>
					</form:select>
				</p>
				<p>
					<form:label path="origin">Origin:</form:label>
					<form:errors path="origin" class="text-danger"/>
					<form:textarea path="origin" class="form-control"/>
				</p>
				<p>
					<form:label path="meaning">Meaning:</form:label>
					<form:errors path="meaning" class="text-danger"/>
					<form:input path="meaning" class="form-control"/>
				</p>
				
				
				<input type="submit" value="Submit" />
			</form:form>
			
			<div class="btn-group">
				<a class="btn btn-primary" href="/dashboard">Cancel</a>
				<form action="/bundler/delete/${bundler.id}" method="post">
										<input type="hidden" name="_method" value="delete" />
										<input type="submit" value="Delete" class="btn btn-danger" />
									</form>
				</div>						
		</div>
	
	</div>

</body>
</html>