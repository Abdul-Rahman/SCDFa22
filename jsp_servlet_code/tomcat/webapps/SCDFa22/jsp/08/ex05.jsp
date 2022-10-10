<%--
The <jsp:element>, <jsp:attribute> and <jsp:body> actions are used to define XML elements dynamically. The word dynamically is important, because it means that the XML elements can be generated at request time rather than statically at compile time.

Following is a simple example to define XML elements dynamically
--%>


<%@page language = "java" contentType = "text/html"%>
<html xmlns = "http://www.w3c.org/1999/xhtml"
   xmlns:jsp = "http://java.sun.com/JSP/Page">
   
   <head><title>Generate XML Element</title></head>
   
   <body>
      <jsp:element name = "xmlElement">
         <jsp:attribute name = "xmlElementAttr">
            Value for the attribute
         </jsp:attribute>
         
         <jsp:body>
            Body for XML element
         </jsp:body>
      
      </jsp:element>
   </body>
</html>

<%--

Renders as : 
============
Body for XML element



This would produce the following HTML code at run time
View Source:
=============
<html xmlns = "http://www.w3c.org/1999/xhtml"
   xmlns:jsp = "http://java.sun.com/JSP/Page">
   
   <head><title>Generate XML Element</title></head>
   
   <body>
      <xmlElement xmlElementAttr="Value for the attribute">
            Body for XML element
         </xmlElement>
   </body>
</html>
--%>