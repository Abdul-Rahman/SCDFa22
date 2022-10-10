<html>
   <head>
      <title>Setting HTTP Status Code</title>
   </head>
   
   <body>
      <%
         // Set error code and reason.
         response.sendError(407, "Need authentication!!!" );
      %>
   </body>
</html>
<%--

Output:
This site can’t be reachedThe webpage at http://localhost:8080/SCDFa22/jsp/12/ex01.jsp might be temporarily down or it may have moved permanently to a new web address.
ERR_UNEXPECTED_PROXY_AUTH

-->