<%-- 
    Document   : index
    Created on : 19 abr. 2021, 13:44:24
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
      <form method="GET" action="displayDatos.jsp">
        <div>
          <h1>Introduzca su nombre</h1>
          <input type="text" name="nombreUser">
          <h1>Introduzca su apellido</h1>
          <input type="text" name="apeUser">
        </div>
        <input type="submit" value="Enviar"></input>
      </form>
    </body>
</html>
