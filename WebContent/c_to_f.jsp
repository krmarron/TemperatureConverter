<!-- Kasey Marron -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius to Fahrenheit</title>
</head>
<body>
<h1>Celsius to Fahrenheit Converter</h1>
<form action="getTempServlet" method="post">
Enter the temperature in Celsius: 
<input type="text" name="userTemp" size="10">
<input type="submit" value="Calculate Temp" />
</form>
</body>
</html>