<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<title>SignUp</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="css/signup.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/signup.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/signup.css">
</head>
<body background="C:\28March\FinalProject\ScaleUp\src\main\resources\static\images/blog-img-02.jpg"> 
  <div class="container">
    <div class="row" style="padding-top: 109px">
      <div class="col-lg-10 col-xl-9 mx-auto">
        <div class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
          <!-- <div class="card-img-left d-none d-md-flex">
            Background image for card set in CSS!
          </div> -->
          <div class="card-body p-4 p-sm-5">
            <h3 class="card-title text-center mb-5 fw-light fs-5">Scale-Up Login</h3>
            <form th:action="@{/onlogin}"th:object="${merchant}" method="post">
              <div class="form-floating mb-3">
              <label for="floatingInputEmail">Email</label>
                <input type="text" class="form-control" id="email" placeholder="name@example.com">
                
              </div>
              <hr>

              <div class="form-floating mb-3">
              <label for="floatingPassword">Password</label>
                <input type="password" class="form-control" id="password" placeholder="Password">
                
              </div>

              <div class="d-grid mb-2">
                <button class="btn btn-lg btn-primary btn-login fw-bold text-uppercase" type="submit" href="/index">Login</button>
                </div>

              <a class="d-block text-center mt-2 small" href="signup">Not Registered Yet? Sign Up</a>

              <hr class="my-4">
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>