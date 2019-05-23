<%-- 
    Document   : index
    Created on : Mar 20, 2019, 7:39:09 PM
    Author     : Plutonianaus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% response.sendRedirect(request.getContextPath() + "/customer_login.jsp"); %>
    </body>
</html>
