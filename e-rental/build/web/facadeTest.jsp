<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bean.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${sessionScope.CUSTOMER == null}">
    <% response.sendRedirect(request.getContextPath() + "/customer_logout.jsp"); %>
</c:if>


<jsp:useBean id="bayar" class="bean.Payment" scope="session" />
<jsp:useBean id="C" class="bean.BikeBookingPaymentContext" scope="session" />

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
      <div class="card card-outline-secondary my-4" style="background-color:#E6E6FA">
        <div class="card-header">
          Info
        </div>
        <div class="card-body" >
          <!----------------------------------------------------->  
         <table class="table table-bordered" align="center">
            <tr>
              <td colspan="2" align="center"><h2>Payment Details</h2>
            </tr>
            <tr>
              <td width="50%" align="right">Payment ID : 
              <td class="p-2">
                <input readonly type="number" class="form-control" name="paymentID" value="<jsp:getProperty name="bayar" property="paymentID"/>" required >
                
            </tr>
            <tr>
              <td width="50%" align="right">Amount Paid RM : 
              <td class="p-2">
                <input readonly type="name" class="form-control" name="amount" value="<jsp:getProperty name="bayar" property="amount"/>" protected >
            </tr>

            
          </table>
          <hr>         
        </div>
        <a href="payment_1.jsp" class="btn btn-danger m-2">Click to pay</a>
      </div>
    </div>
</div>
</div>
</form>
