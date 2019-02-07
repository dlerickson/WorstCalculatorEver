<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Worst Calculator Ever</title>
</head>
<body>

	<h1>Hello World!</h1>
	
	<h3>I am a terrible calculator.</h3>
	
	<form action="${pageContext.request.contextPath}/getAddSubServlet" method="post">
		<p>Please choose an operation:</p>
		
		<input type="radio" name="addSub" value="add"> Add<br>
		<p></p>
		<input type="radio" name="addSub" value="sub"> Subtract<br>
		<p>&nbsp;</p>
		<input type="submit" value="Submit"> 

	</form>
	

</body>
</html>