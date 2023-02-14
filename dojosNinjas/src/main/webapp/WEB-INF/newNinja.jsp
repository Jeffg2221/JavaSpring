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
    <title>New Ninja</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>New Ninja</title>
</head>
<body>
<h1>New Ninja</h1>
<a href="/">Dashboard</a>


<form:form action="/add/ninjas" method="post" modelAttribute="ninja">
	<!--- inside the form:form --->
    <!--- Drop down select menu --->
    <form:label path="dojo">Dojo</form:label>
    <form:select path="dojo">
        <c:forEach var="eachDojo" items="${dojolist}">
            <!--- Each option VALUE is the id of the person --->
            <form:option value="${eachDojo.id}">
            <!--- This is what shows to the user as the option --->
              		${eachDojo.name}
            </form:option>
        </c:forEach>
    </form:select>
<!--- ... --->
	


	<div>
		<form:label path="firstName">First Name</form:label>
		<form:input type="text" path="firstName"/>
		<form:errors path="firstName"></form:errors>
	</div>
	<div>
		<form:label path="lastName">Last Name</form:label>
		<form:input type="text" path="lastName"/>
		<form:errors path="lastName"></form:errors>
	</div>
	<div>
		<form:label path="age">Age</form:label>
		<form:input type="number" path="age"/>
		<form:errors path="age"></form:errors>
	</div>
	<button type="submit">Create</button>
</form:form>

</body>

</body>
</html>