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
<h1>Heres Your Omikuji!</h1>
<h3> Times refreshed: ${count}</h3>
<p> In <span>${number}</span> years, you will live in <span> <c:out value="${city}"></c:out> </span> with <span><c:out value="${realPerson}"></c:out></span> as your roommate,<span><c:out value="${hobby}"></c:out></span> for a living. The next time you see a <span><c:out value="${thing}"></c:out></span> ,you will have good luck. Also, <span><c:out value="${textarea}"></c:out></span></p>

<a>Go Back</a>
</body>
</html>