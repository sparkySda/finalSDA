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
<body background="img/backs.jpg">
<!----------------- Navigation ----------------->
<%@ include file="navibar1.jsp" %>
<!----------------- ---------- ----------------->

<!------------------- Coding ------------------->
<form action="paymentBike"  method="get">
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
              <td colspan="2" align="center"><h2>ORDER BICYCLE</h2>
            </tr>
            <tr>
              <td width="50%" align="right">Payment ID : 
              <td class="p-2">
                <input readonly type="name" class="form-control" name="paymentID" value="<jsp:getProperty name="CUSTOMER" property="customerID"/>" required >
                
            </tr>
            <tr>
              <td width="50%" align="right">Payment Amount : 
              <td class="p-2">
                <input type="number" step="0.01" class="form-control" name="amount" required >
            </tr>

            
          </table>
          <hr>         
        <button class="btn btn-lg btn-primary btn-block" type="submit" >Pay Now</button>
    </div>
</div>
</div>
</form>