<%-- 
    Document   : display.jsp
    Created on : 26 abr. 2021, 12:48:52
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="style/style.css">
  </head>
  <body>
    <table>
      <%
        boolean check = false;
        String color = "Gray";
        int numMax = Integer.valueOf(request.getParameter("numMax"));
        for(int i=1; i<=numMax; i++){
          if(i%10==1){
            out.print("<tr>");
          }
          check = false;
          for(int j=2; j<i&&!check; j++){
            if(i%j==0){
              check = true;
            }
          }
          if(!check && i!=1){
            color = request.getParameter("color");
          }else{
            color = "Gray";
          }
          out.print("<td style=\"background-color:" + color + "\"" + ">" + i + "</td>");
          if(i%10==0 || i==numMax){
            out.print("</tr>");
          }
        }
      %>
    </table>
  </body>
</html>
