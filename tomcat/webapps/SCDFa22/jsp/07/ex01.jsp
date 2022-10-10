<%--
Syntax of JSP Directive
<%@ directive attribute="value" %>  

Syntax of JSP page directive
<%@ page attribute="value" %>  

--%>

<html>  
<body>  
  
<%@ page import="java.util.Date" %>  
Today is: <%= new Date() %>  
  
</body>  
</html>  
<%--
Output
Today is: Sun Oct 02 15:39:38 PKT 2022
--%>