<%-- 
    Document   : Ejercicio01.jsp
    Created on : 26 abr. 2021, 12:48:22
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
    <form method="POST" action="display.jsp">
      <h2>Introduzca el número de celdas que desea</h2>
      <input type="text" name="numMax">
      <h2>Seleccione el color que desea para los números primos</h2>
      <select name="color">
        <option value="yellow">Amarillo</option>
        <option value="green">Verde</option>
        <option value="blue">Azul</option>
      </select>
      <input type="submit" value="Enviar">
    </form>
  </body>
</html>
