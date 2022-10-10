<%--
GET Method Example Using URL
The following URL will pass two values to HelloForm program using the GET method.

http://localhost:8080/SCDFa22/jsp/13/ex01.jsp?first_name=AbdulRahman&last_name=Mahmood

Below is the main.jsp JSP program to handle input given by web browser. We are going to use the getParameter() method which makes it very easy to access the passed information 
--%>
<html>
   <head>
      <title>Using GET Method to Read Form Data</title>
   </head>
   
   <body>
      <h1>Using GET Method to Read Form Data</h1>
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p></li>
      </ul>
   
   </body>
</html>

<%--
Output
Using GET Method to Read Form Data
First Name: AbdulRahman
Last Name: Mahmood
--%>