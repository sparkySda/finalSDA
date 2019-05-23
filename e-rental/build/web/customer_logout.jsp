<%-- 
    Document   : logout
    Created on : Dec 16, 2018, 9:31:33 PM
    Author     : SyahIIIr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    session.invalidate();
    response.sendRedirect("customer_login.jsp"); 
%>
