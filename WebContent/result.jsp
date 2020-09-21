<!-- Kasey Marron -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userTempLog.getTemp()} Temperature Conversion: <br />
Temp in Fahrenheit: ${userTempLog.getFahrenheit()} <br />
Temp in Celsius: ${userTempLog.getCelsius()} <br />
</p>
<a href="index.jsp">Convert another temperature</a>
</body>
</html>