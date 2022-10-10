<%--
We can ignore the Expression Language (EL) in jsp by the isELIgnored attribute. By default its value is false i.e. Expression Language is enabled by default.
--%>
<html>  
<body>  
  
<%@ page isELIgnored="false" %>
EL expression result is: ${2 * 4 + 3 * 4}
  
</body>  
</html>  
<%--
output:
EL expression result is: 20 //isELIgnored="false"
EL expression result is: ${2 * 4 + 3 * 4}  //  isELIgnored="true"
--%> 