<html>
   
   <head>
      <title>Using JavaBeans in JSP</title>
   </head>
   
   <body>
      <center>
         <h2>Using JavaBeans in JSP</h2>
         <jsp:useBean id = "test" class = "action.ex02_TestBean" />
         <jsp:setProperty name = "test"  property = "message" 
            value = "Hello JSP..." />
            
         <p>Got message....</p>
         <jsp:getProperty name = "test" property = "message" />
      </center>

      <h2>Using JavaBeans in JSP sample #2</h2>
      <jsp:useBean id="object" class="action.ex02_TestBean"/>
      <%
      object.setMessage("AlphaPeeler (C) 2022");
      out.println(object.getMessage());
      %>


   </body>
</html>
