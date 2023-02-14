<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import= "java.util.Date"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container"><h1>Fruit Store</h1>
<table class="container">
<tbody>
<tr>
<th>Name</th>
<th>Price</th>
</tr>
<tr>
<c:forEach var= "fruit" items="${fruits}">
<td><c:out value = "${fruit.getName()}"></c:out></td>
<td><c:out value = "${fruit.getPrice()}"></c:out></td>
</c:forEach>

</tr>

<tr>
<td></td>
<td></td>
</tr>
</tbody>



</table>
</div>


</body>
</html>