<%--
Example of info attribute
--%>
<html>  
<body>  
  
<%@ page info="page authored by Engr. Abdul Rahman Mahmood" %>  
Today is: <%= new java.util.Date() %>  

<BR>
<%=getServletInfo() %>
  
</body>  
</html>  


<%--

output:
Today is: Sun Oct 02 15:55:53 PKT 2022
page authored by Engr. Abdul Rahman Mahmood

The web container will create a method getServletInfo() in the resulting servlet.For example:
public String getServletInfo() {  
  return "composed by Sonoo Jaiswal";   
}  
\
--%>