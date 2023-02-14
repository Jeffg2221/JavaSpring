<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import= "java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> JSTL DEMO</h1>
<h2><c:out value="${jspName}"/></h2>
<p>${jspAge}</p>
<p>${jspIsHungry}</p>
<p><c:out value= "${test}"/></p>




</body>
</html>