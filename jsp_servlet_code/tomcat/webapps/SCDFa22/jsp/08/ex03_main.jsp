<%--
The <jsp:forward> Action
The forward action terminates the action of the current page and forwards the request to another resource such as a static page, another JSP page, or a Java Servlet.

Following is the syntax of the forward action −

<jsp:forward page = "Relative URL" />
--%>

<html>
   <head>
      <title>The include Action Example</title>
   </head>
   
   <body>
      <center>
         <h2>The include action Example</h2>
         <jsp:forward page = "ex03_date.jsp" />
      </center>
   </body>
</html>

<%--
Output:

Today's date: 03-Oct-2022, 1:22:46 am
--%>