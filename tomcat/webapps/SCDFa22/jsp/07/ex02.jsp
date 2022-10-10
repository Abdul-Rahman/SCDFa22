<%--
contentType
The contentType attribute defines the MIME(Multipurpose Internet Mail Extension) type of the HTTP response.The default value is "text/html;charset=ISO-8859-1".
--%>

<html>  
<body>  
  
<%@ page contentType="application/msword" %>  
Today is: <%= new java.util.Date() %>  
  
</body>  
</html>  

<%--
Output

It will send the output as a downloadable file whos contents will be: 
<html>  
<body>    
Today is: Sun Oct 02 15:47:47 PKT 2022  
</body>  
</html>  

--%>