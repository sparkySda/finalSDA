<%@ page import="java.util.Random"%>
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

		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="img/elements/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Bicycles</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/owl.carousel.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/nice-select.css">			
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/main.css">
<!------------------- Script ------------------->

<!------------------- ------ ------------------->
<title>BH - CUSTOMER</title>
</head>
<body background="img/backs.jpg">
<%@page language="java"%>
    
    

<!----------------- Navigation ----------------->
<%@ include file="navibar1.jsp" %>
<!----------------- ---------- ----------------->
<% int duration=Integer.parseInt(request.getParameter("rentDuration"));
   int time=Integer.parseInt(request.getParameter("startRent")); 
    int t=duration+time;
%>


<!------------------- Coding ------------------->
<form action="customer_orderBicycles" class="form-signin" method="POST">
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
              <td colspan="2" align="center"><h2>ORDER BICYCLE</h2>
            </tr>
            <tr>
              <td width="50%" align="right">Name : 
              <td class="p-2">
                <input readonly type="name" class="form-control" name="custName" value="<jsp:getProperty name="CUSTOMER" property="customerName"/>" required >
                
            </tr>
            <tr>
              <td width="50%" align="right">Customer ID : 
              <td class="p-2">
                <input readonly type="name" class="form-control" name="custId" value="<jsp:getProperty name="CUSTOMER" property="customerID"/>" protected >
            </tr>
            <tr>
              <td width="50%" align="right">Contact Number : 
              <td class="p-2">
                <input readonly type="name" class="form-control" name="custContact" value="<jsp:getProperty name="CUSTOMER" property="customerPhone"/>" protected >
            </tr>
            
            <tr>
              <td width="50%" align="right">Bicycle ID : 
              <td class="p-2">
                <%= request.getParameter("bookID")%>
            </tr>
            
            <tr>
              <td width="50%" align="right">Pickup time : 
              <td class="p-2">
                <%= request.getParameter("startRent")%> PM
            </tr>
            
            <tr>
              <td width="50%" align="right">Duration rent : 
              <td class="p-2">
                <%= request.getParameter("rentDuration")%> Hours
            </tr>
            
             <tr>
              <td width="50%" align="right">Return time : 
              <td class="p-2">
               <%out.print(t);%> PM
            </tr>
               
            <input hidden type="name" class="form-control" name="bookID" value="<%= request.getParameter("bookID")%>">
            <input hidden type="name" class="form-control" name="startRent" value="<%= request.getParameter("startRent")%>">
            <input hidden type="name" class="form-control" name="rentDuration" value="<%= request.getParameter("rentDuration")%>">
            <input hidden type="name" class="form-control" name="bType" value="<%= request.getParameter("bType")%>">
           
            
          </table>
          <hr>         
        </div>
        <button type="submit" class="btn btn-success m-2">Rent Bicycle</button>
        <a href="bicycles.jsp" class="btn btn-danger m-2">Cancel</a>
      </div>
    </div>
</div>
</div>
</form>