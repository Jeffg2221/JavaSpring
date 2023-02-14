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
<div class="container">

<h1>Send an Omikuji!</h1><br>

<h3>You have visited this page ${count} times</h3>

<form action="/omikuji/form" method= "post">

<label for="quantity">Pick a number between 5 and 25:</label><br>
<input type="number" id="quantity" name="number" min="5" max="25"><br>
            
<label>Enter name of any city</label><br>
<input type="text" name="city"><br>

<label>Enter name of any real person.</label><br>
<input type="text" name="realPerson"><br>

<label>Enter professional endeavor or hobby.</label><br>
<input type="text" name="hobby"><br>

<label>Enter any type of living thing.</label><br>
<input type="text" name="thing"><br>

<label>Say something nice to someone:</label><br>
<textarea name="textarea" rows="5" cols="40"></textarea><br>

<p>Send to a friend!</p><br>

<button type="submit">Send</button>
</form>

</div>

</body>
</html>