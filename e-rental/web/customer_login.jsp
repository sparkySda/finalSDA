<!doctype html>
<html lang="en">
<head>
<!------------------- Script ------------------->
<%@ include file="opensource.jsp" %>
<!------------------- ------ ------------------->
<title>CH - Login</title>
</head>
<body >
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
<form action="customer_login" class="form-signin" method="GET">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1><hr>
      <input type="text" name="userID" class="form-control" placeholder="CUSTOMER ID" required autofocus >
      <br>
      <input type="password" name="password" class="form-control" placeholder="CUSTOMER Password" required><br>
      <button class="btn btn-lg btn-primary btn-block" type="submit"  onClick="validation()">Sign in</button>
      <br>
     
  <div class="col-12">
    <hr>
     <p class="lead"> Dont have an account? Sign Up <a href="customer_signup.jsp">Here! </a></p>
    <hr>
    
     <hr>
     <p class="lead"> Manager Sign in <a href="manager_login.jsp">Here! </a></p>
    <hr>
  </div>
      

     
    </form>




</body>
</html>













