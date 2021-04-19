<%-- 
    Document   : displayDatos
    Created on : 19 abr. 2021, 18:12:19
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Bienvenido <% out.print(request.getParameter("nombreUser") + " " + request.getParameter("apeUser")); %> </h1>
  </body>
</html>
