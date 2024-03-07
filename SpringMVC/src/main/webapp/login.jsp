<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg} 
<form action="./index">
username<input type="text" size="20" name="uname"><br><br>
password<input type="text" size="20" name="upwd"><br><br>
<input type="submit" value="login"><br><br>
</form>
</body>
</html>