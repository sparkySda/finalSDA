<%-- 
    Document   : payment
    Created on : Mar 20, 2019, 4:24:34 PM
    Author     : Plutonianaus
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bean.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${sessionScope.CUSTOMER == null}">
    <% response.sendRedirect(request.getContextPath() + "/customer_logout.jsp"); %>
</c:if>

<jsp:useBean id="CUSTOMER" class="bean.Customer" scope="session" />

<!doctype html>
<html lang="en">
<head>
<!------------------- Script ------------------->
<%@ include file="opensource.jsp" %>
<!------------------- ------ ------------------->
<title>BH - CUSTOMER</title>
</head>
<body>
<!----------------- Navigation ----------------->
<%@ include file="navibar1.jsp" %>
<!----------------- ---------- ----------------->

<!------------------- Coding ------------------->
<form action="customer_orderbus"  method="GET">
<div class="container">
  <div class="row justify-content-lg-center">
    <div class="col col-lg-8">
      <div class="card card-outline-secondary my-4">
        <div class="card-header">
        </div>
        <div class="card-body">
          <!----------------------------------------------------->  
         <table class="table table-bordered" align="center">
            <tr>
              <td colspan="2" align="center"><h2>Bike Unlock!!!</h2>
            </tr>
            <tr>
              <td colspan="2" align="center">Please have fun
            </tr>
            
            
          </table>       

    </div>
</div>
</div>
</form>
