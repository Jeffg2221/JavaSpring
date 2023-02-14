<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Expense Details</title>
</head>
<body>

<h2><a href="/dashboard">Go Back</a></h2>

<h1>Project Details</h1>
<table>
    <tbody>
    	<tr>
            <td>Expense Name: <c:out value="${project.title}"></c:out></td>
        </tr>
        
        <tr>
            <td>Expense Description: <c:out value="${project.description}"></c:out></td>
        </tr>
        
        <tr>
            <td>Due Date: <fmt:formatDate value="${project.dueDate}" pattern="MMMM dd"/></td>
        </tr>
    </tbody>
</table>
<h5><a href="/projects/${project.id}/tasks">See Tasks</a></h5>
<c:if test = "${project.lead.id==userId}">
    <h2><a href="/projects/delete/${project.id}">Delete Project</a></h2>
</c:if>
</body>
</html>