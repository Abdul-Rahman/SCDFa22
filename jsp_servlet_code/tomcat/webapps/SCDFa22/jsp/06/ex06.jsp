<%! int fontSize; %> 
<html> 
   <head><title>FOR LOOP Example</title></head> 
   
   <body>
      <%for ( fontSize = 1; fontSize <= 3; fontSize++){ %>
         <font color = "green" size = "<%= fontSize %>">
            JSP Copyright(C) AlphaPeeler
      </font><br />
      <%}%>
   </body> 
</html> 
<%-- 
Output:
JSP Copyright(C) AlphaPeeler
JSP Copyright(C) AlphaPeeler
JSP Copyright(C) AlphaPeeler
--%> 
