<!doctype html>
<html lang="en">
<head>
<!------------------- Script ------------------->
<%@ include file="opensource.jsp" %>
<!------------------- ------ ------------------->
<title>CH - Sign Up</title>
</head>
<body>
<!----------------- Navigation ----------------->
<%-- include file="navibar.jsp" --%>
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
<div class="container-fluid">
  <a class="navbar-brand" href="#"><img src="img/logo.png" width="150px"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarResponsive">
    <ul class="navbar-nav mr-auto">
        <li class="nav-item"><a class="nav-link" href="#"><i class="fas fa-user-cog"></i> CUSTOMER</a></li>
    </ul>
    <ul class="navbar-nav ml-auto">
        <li class="nav-item active"><a class="nav-link" href="customer_login.jsp"><i class="fas fa-sign-in-alt"></i> Log In</a></li>
    </ul>
  </div>
</div>
</nav>
<!----------------- ---------- ----------------->

<!------------------- Coding ------------------->
<form action="cust_signUp" class="form-signin" method="get">
      <h1 class="h3 mb-3 font-weight-normal">Sign Up With Us</h1><hr>
      <input type="text" name="username" class="form-control" placeholder="Your Name" required autofocus >
      <br>
      <input type="text" name="userid" class="form-control" placeholder="Your ID" required autofocus >
      <br>
      <input type="text" name="address" class="form-control" placeholder="Your Address" required autofocus >
      <br>
      <input type="text" name="phone" class="form-control" placeholder="phone Number" required autofocus >
      <br>
      <input type="password" name="password" class="form-control" placeholder="Password" required><br>
      <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign Up Now</button>
 
    </form>




</body>
</html>













