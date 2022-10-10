<%--
Jsp Include Directive
Include directive
Advantage of Include directive
Example of include directive
The include directive is used to include the contents of any resource it may be jsp file, html file or text file. The include directive includes the original content of the included resource at page translation time (the jsp page is translated only once so it will be better to include static resource).

Advantage of Include directive
Code Reusability

Syntax of include directive
<%@ include file="resourceName" %>  

--%>
<html>  
<body>  

<%@ include file="ex07_header.html" %>  

Today is: <%= java.util.Calendar.getInstance().getTime() %>  

</body>  
</html>  

<%--
output:

1	2	3
1	2	3

Today is: Sun Oct 02 19:13:52 PKT 2022

--%> 