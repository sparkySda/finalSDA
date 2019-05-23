<%-- 
<%-- 
    Document   : manager_view_bikes
    Created on : May 23, 2019, 6:20:12 AM
    Author     : Plutonianaus
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Bike" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>





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
<title>BMX</title>
</head>
<body background="img/backs.jpg">
<!----------------- Navigation ----------------->
<%@ include file="navibar2.jsp" %>
<!----------------- ---------- ----------------->

<!------------------- Coding ------------------->

<div class="container">
  <div class="row justify-content-lg-center">
    <div class="col col-lg-8">
      <div class="card card-outline-secondary my-4" style="background-color:#E6E6FA">
        <div class="card-header">
          Bike List
        </div>
        <div class="card-body" >
          <!----------------------------------------------------->  
          
         <table class="table table-bordered" align="center">
                     <tr>
                            <td>BIKE ID</td>
                            <td>PRICE PER HOUR</td>
                            <td>BIKE TYPE</td>
                            <td>BIKE STATUS</td>
                     </tr> 
          <c:forEach items="${sessionScope.BMX}" var="orderlist" varStatus="loop">
                     
                     <tr>
                            <td><c:out value="${orderlist.bikeID}" /></td>
                            <td><c:out value="${orderlist.bikePrice}" /></td>
                            <td><c:out value="${orderlist.bikeType}" /></td>
                            <td><c:out value="${orderlist.bikeStatus}" /></td>
                            
                            
                     </tr>
           </c:forEach>

          </table>
   <form action="change_status" method="POST">
   Enter return Bicycle ID<br>
  <input type="number" name="bikeID"><br>
    <input type="submit" value="SUBMIT">
    </form> 
               
        </div>
      </div>
    </div>
</div>
</div>
</body>
