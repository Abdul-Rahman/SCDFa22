<%@page import="alphapeeler.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="object" class="alphapeeler.Demo"/>
	<%
	int m = object.cube(5);
	out.println("cube of 5 is : " + m);
	%>

	<jsp:useBean id="object2" class="alphapeeler.Employee"/>
	<%
	object2.setId(1);
	out.println(object2.getId());
	
	object2.setName("Abdul Rahman");
	out.println(object2.getName());
	%>
	
	<jsp:useBean id="object3" class="alphapeeler.Driver"/>
	<%
	object3.useEmployee();
	%>

</body>
</html>