<%-- 
    Document   : addBike
    Created on : May 23, 2019, 5:48:23 AM
    Author     : Plutonianaus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="bean.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--<c:if test="${sessionScope.CUSTOMER == null}">
    <% response.sendRedirect(request.getContextPath() + "/customer_logout.jsp"); %>
</c:if>

<jsp:useBean id="CUSTOMER" class="bean.Customer" scope="session" />--%>

<!doctype html>
<html lang="en">
<head>
<!------------------- Script ------------------->
<%@ include file="opensource.jsp" %>
<!------------------- ------ ------------------->
<title>ADD BIKE</title>
</head>
<body background="img/backs.jpg">
<!----------------- Navigation ----------------->
<%@ include file="navibar2.jsp" %>
<!----------------- ---------- ----------------->

<!------------------- Coding ------------------->
<form action="manager_addBike"  method="POST">
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
              <td width="50%" align="right">Bicycle ID : 
              <td class="p-2">
                <input type="number" class="form-control" name="bicycleId" required >
            </tr>
            
            <tr>
              <td width="50%" align="right">Bicycle type : 
              <td class="p-2">
                  <select name="bicycleType" required class="form-control">
                       <option value="BMX">BMX Bicycle</option>
                       <option value="Mountain">Mountain Bicycle</option>
                       <option value="Hybrid">Hybrid Bicycle</option>
                       <option value="Cyclocross">Cyclocross Bicycle</option>
                    </select>
            </tr>
           <tr>
              <td width="50%" align="right">Rent Price per hour RM: 
              <td class="p-2">
                <input type="number" class="form-control" name="price" required >
            </tr>
            
            <tr>
              <td width="50%" align="right">Bike Status: 
              <td class="p-2">
                  <input  type="text" class="form-control" name="status" value="available" readonly="readonly" >
            </tr>
          </table>
          <hr>         
        </div>
        <button type="submit" class="btn btn-success m-2">Add Bicycle</button>
      </div>
    </div>
</div>
</div>
</form>