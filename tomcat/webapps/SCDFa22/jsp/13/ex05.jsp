<%--
Reading All Form Parameters
Following is a generic example which uses getParameterNames() method of HttpServletRequest to read all the available form parameters. This method returns an Enumeration that contains the parameter names in an unspecified order.

Once we have an Enumeration, we can loop down the Enumeration in the standard manner, using the hasMoreElements() method to determine when to stop and using the nextElement() method to get each parameter name.
--%>

<%@ page import = "java.io.*,java.util.*" %>

<html>
   <head>
      <title>HTTP Header Request Example</title>
   </head>

   <body>
      <center>
         <h2>HTTP Header Request Example</h2>
         <table width = "100%" border = "1" align = "center">
            <tr bgcolor = "#949494">
               <th>Param Name</th>
               <th>Param Value(s)</th>
            </tr>
            <%
               Enumeration paramNames = request.getParameterNames();
               while(paramNames.hasMoreElements()) {
                  String paramName = (String)paramNames.nextElement();
                  out.print("<tr><td>" + paramName + "</td>\n");
                  //String paramValue = request.getHeader(paramName);
                  String paramValue = request.getParameter(paramName);
                  out.println("<td> " + paramValue + "</td></tr>\n");
               }
            %>
         </table>
      </center>
   
   </body>
</html>