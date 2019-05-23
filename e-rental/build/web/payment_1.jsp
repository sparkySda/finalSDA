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
<form action="#"  method="#">
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
                 <td colspan="2" align="center"><h2>Payment Succeed</h2>
                  
            </tr>
            <tr>
                <td> <img src="img/payment.png" alt="Trulli" width="600" height="350"></td>
                  
            </tr>
            
            
          </table>
          <hr>         
        </div>
        <a href="scanBike.jsp" class="btn btn-danger m-2">Click to generate code</a>
      </div>
    </div>
</div>
</div>
</form>