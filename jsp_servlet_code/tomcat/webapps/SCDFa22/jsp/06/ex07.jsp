<%! int fontSize; %> 
<html> 
   <head><title>WHILE LOOP Example</title></head> 
   <body> 
   		<% out.println(String.format("%s = %d <BR>", "fontSize", fontSize)); %>
   		<% fontSize++; %>
   		<% out.println(String.format("%s = %d <BR>", "fontSize", fontSize)); %>

      <%while ( fontSize <= 3){ %>
      	 <% out.println(String.format("%s = %d", "fontSize", fontSize)); %>
         <font color = "green" size = "<%= fontSize %>">
            JSP Copyright(C) AlphaPeeler
         </font><br />
         <%fontSize++;%>
      <%}%>
   </body> 
</html> 
<%--
Output:
fontSize = 0
fontSize = 1
fontSize = 1 JSP Copyright(C) AlphaPeeler
fontSize = 2 JSP Copyright(C) AlphaPeeler
fontSize = 3 JSP Copyright(C) AlphaPeeler
--%>
