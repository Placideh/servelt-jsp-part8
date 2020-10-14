<%@page import="com.placide.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student data</title>
</head>
<body style=background-color:#ddd>
	<%
	
		Student s1=(Student)request.getAttribute("student"); 
		
	%> 
	${student}
	
</body>
</html>