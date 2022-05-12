 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>SignUp</title>
<script type="text/javascript">
    document.getElementById("signup").onclick = function () {
        location.href = "/login";
    };
</script>
<link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="css/signup.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/signup.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/signup.css">
</head>
<body> 
  <div class="container">
    <div class="row" style="padding-top: 109px">
      <div class="col-lg-10 col-xl-9 mx-auto">
        <div class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
          
          <div class="card-body p-4 p-sm-5">
            <h1 class="card-title text-center mb-5 fw-light fs-5">Sign-Up</h1>
            <form th:action="@{/onsignup}"th:object="${merchant}" method="post">
			
              <div class="form-floating mb-3">
              <label for="floatingPasswordConfirm">Merchant Name</label>
                <input type="text" class="form-control" id="merchant_name" placeholder="Merchant Name" name="merchant_name">
                
              </div>
              
              <div class="form-floating mb-3">
              <label for="floatingPasswordConfirm">Name of Firm</label>
                <input type="text" class="form-control" id="name_of_firm" placeholder="name of firm " name="name_of_firm">
                
              </div>
              
              <div class="form-floating mb-3">
              <label for="floatingInputUsername">GST Number</label>
                <input type="text" class="form-control" id="gstno" placeholder="GST Number" name="gstno" required autofocus>
                
              </div>

              <div class="form-floating mb-3">
              <label for="floatingInputEmail">Address</label>
                <input type="text" class="form-control" id="address" placeholder="Address" name="address">
                
              </div>
              <hr>

              <div class="form-floating mb-3">
              <label for="floatingPassword">Email</label>
                <input type="email" class="form-control" id="email" placeholder="Email"name="email">
              </div>
              
              <div class="form-floating mb-3">
              <label for="floatingPasswordConfirm">Mobile Number</label>
                <input type="text" class="form-control" id="mobile_no" placeholder="mobile number" name="mobile_no">
                
              </div>
              
              <div class="form-floating mb-3">
              <label for="floatingPasswordConfirm">Password</label>
                <input type="password" class="form-control" id="password" placeholder="Password" name="password">
                
              </div>

              <div class="d-grid mb-2">
                <button class="btn btn-lg btn-primary btn-login fw-bold text-uppercase" type="submit" id="signup">
                SignUp</button>
              </div>

              <a class="d-block text-center mt-2 small" href="login">Have an account? Sign In</a>

              <hr class="my-4">

            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html> 