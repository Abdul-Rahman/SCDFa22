<%--
buffer
The buffer attribute sets the buffer size in kilobytes to handle output generated by the JSP page.The default size of the buffer is 8Kb.
--%>
<html>  
<body>  
  
<%@ page buffer="16kb" %>  
Today is: <%= new java.util.Date() %>  
  
</body>  
</html>  
<%--
output:
Today is: Sun Oct 02 15:55:53 PKT 2022
--%>