<%-- 
    Document   : piramide
    Created on : 26 abr. 2021, 11:00:40
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
    <% 
      int altura = Integer.valueOf(request.getParameter("alturaPiramide"));
      for(int j=0; j<altura; j++){
        for(int i=0; i<altura-j-1; i++){
          out.print("<img src=\"blanco.png\" width=\"40px\" height=\"auto\"> ");
        }
        for(int x=0; x<(j*2)+1; x++){
          out.print("<img src=\"ladrillo.jpg\" width=\"40px\" height=\"auto\"> ");
        }
        out.print("<br>");
      }
    %>
  </body>
</html>
