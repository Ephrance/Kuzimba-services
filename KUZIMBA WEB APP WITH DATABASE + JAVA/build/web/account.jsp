<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<title>kuzimba cash management system</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3css.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/account.css">
<script type="text/javascript" src="js/index.js"></script>
 <script src="js/all.min.js"></script>
 <script type="text/javascript" src="js/SmoothMovement.compressed.js"></script>
 <script type="text/javascript" src="js/anime.js"></script>
<body id="myPage" class="w3-container w3-center" style="padding: 0; margin: 0;">
<div class="w3-container" id="main">
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

<div class="w3-container w3-center w3-theme-dark w3-padding-4">
<div class="w3-container">
  <h1 id="heading" class="w3-padding">CHOOSE ACCOUNT</h1>
<div class="w3-container " >
  <form action="cashin.jsp" id="formdesign">
    <p><label class="w3-validate">Cash</label>
<input class="w3-radio" type="radio" name="cash" value="cash">
</p>

<p><label class="w3-validate">Mobile Money</label>
<input class="w3-radio" type="radio" name="mm" value="mm">
</p>

<p><label class="w3-validate">Credit Card</label>
<input class="w3-radio" type="radio" name="cc" value="cc">
</p>
  <select class="w3-select" name="option" style="max-width: 300px;" id="opts">
  <option class="w3-padding" value="" disabled selected>Choose Month</option>
  <option class="w3-padding" value="1">January</option>
  <option class="w3-padding" value="2">February</option>
  <option class="w3-padding" value="3">March</option>
  <option class="w3-padding" value="4">April</option>
  <option class="w3-padding" value="5">May</option>
  <option class="w3-padding" value="6">June</option>
   <option class="w3-padding" value="7">July</option>
  <option class="w3-padding" value="8">August</option>
  <option class="w3-padding" value="9">September</option>
  <option class="w3-padding" value="10">October</option>
  <option class="w3-padding" value="11">November</option>
  <option class="w3-padding" value="12">December</option>
</select>

<p>
<input class="w3-check" type="checkbox" name="cashin">
<label class="w3-validate"> Cash In</label>
<input class="w3-check" type="checkbox" name="cashout">
<label class="w3-validate"> Cash Out</label> <button  class="w3-btn w3-black w3-round" style="width: 100px; margin-left: 20px;">Enter</button></p>



  </form>
</div>

</div>

</div>
</div>
</div>





<footer class="w3-container w3-center" id="footer">
  <p>Created by Ephrance, Winnie & Alfred</a></p>    
</footer>
<script src="js/jquery-3.1.0.min.js"></script>
</div>
</body>
</html>
