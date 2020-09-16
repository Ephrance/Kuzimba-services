<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
   <title>kuzimba cash management system</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3css.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/login.css">
<script type="text/javascript" src="js/index.js"></script>
 <script src="js/all.min.js"></script>
 <script type="text/javascript" src="js/SmoothMovement.compressed.js"></script>
 <script type="text/javascript" src="js/anime.js"></script>
<body id="myPage" class="w3-container w3-center" style="padding: 0; margin: 0; background-color: #fff;">
<div class="w3-container" id="main">
  <div class="w3-container w3-white"  id="maininner1">

<!-- Header -->
<div class="w3-container  w3-padding"  id="maininner">
  <div class="w3-bar" style="width: 100%; ">

    <a class="w3-bar-item   w3-left"><img src="images/icon.png" width="100px"> </a>
  
</div>
  
  <div class="w3-center" style="" >
  
  <h4 style="font-weight: normal; color: #fff; " id="myHeaderText">KUZIMBA CASH MANAGEMENT SYSTEM<br>
<i>A better way to manage your business cash flow</i>
  </h4>

  </div>
</div>

<div class="w3-container w3-center"  >
  <div class="w3-container w3-half w3-center w3-theme-dark w3-padding-4">
<img src="images/cashpic.jpg">
</div>
<div class="w3-container w3-half w3-center w3-theme-dark w3-padding-4" >
<div class="w3-container w3-center">
	<h1 id="heading" class="w3-padding">LOGIN</h1>
<div class="w3-container">
	<form action="account.jsp" class="w3-center"  onsubmit="return validateForm()" method="post" name="myForm" id="mainright">
		Company UserName<br> <input class="w3-padding-4 w3-round w3-validate" type="text" name="username" placeholder="username" id="user"><br>
		Password<br> <input placeholder="Password" id="pass" class="w3-round w3-validate" type="password" name=""> <br>
    <a href="forgot.jspl">forgot password?</a><input  class="w3-btn w3-black w3-round" id="loginbtn" type="submit" value="ENTER" name="" style="margin-left:10px;">
	</form>

</div>

</div>
  <br>
 <a href="login.jsp" class="w3-btn w3-blue w3-round">New Account?</a>
</div>
</div>

<footer class="w3-container w3-center" id="footer">
  <p>Created by Ephrance, Winnie & Alfred</a></p>    
</footer>
</div>
</div>
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/login.js"></script>
</body>
</html>