//index.jsp  
<html>  
<body>  
  
<%@ page errorPage="ex06_myerror_page.jsp" %>  
  
 <%= 100/0 %>  
  
</body>  
</html>  
<%--
output:
it will redirect to the ex06_myerror_page.jsp
--%> 
