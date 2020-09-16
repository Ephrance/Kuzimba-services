<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<title>kuzimba cash management system</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3css.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/loggedin.css">
<script type="text/javascript" src="js/index.js"></script>
 <script src="js/all.min.js"></script>
 <script type="text/javascript" src="js/SmoothMovement.compressed.js"></script>
 <script type="text/javascript" src="js/anime.js"></script>
  <head>
 	

  </head>
<body id="myPage" class="w3-container w3-center" style="padding: 0; margin: 0; ">




<div class="w3-container" id="main">
<div class="w3-container  w3-padding"  id="maininner">
  <div class="w3-bar" style="width: 100%; ">


  <a href="index.jsp" class="w3-bar-item w3-btn w3-red   w3-right" style="text-decoration: none;">Log Out </a>
  <a href="cashin.jsp" class="w3-bar-item w3-btn w3-white   w3-right" style="text-decoration: none;">Cash In </a>
    <a class="w3-bar-item   w3-left"><img src="images/icon.png" width="100px"> </a>
  
</div>
  
  <div class="w3-center" style="" >
  
  <h4 style="font-weight: normal; color: #fff; " id="myHeaderText">KUZIMBA CASH MANAGEMENT SYSTEM<br>
<i>A better way to manage your business cash flow</i>
  </h4>

  </div>
</div>


<div class="w3-container w3-center w3-padding-4">
<div class="w3-container w3-center w3-third" id="heading">
	<h1  class="w3-padding">CASH OUT</h1>
	<p>For the month of January</p>
	  <form action="month.jsp" id="formdesign" >
      <select class="w3-select" name="option" style="max-width: 300px;" id="opts">
  <option class="w3-padding" value="" disabled selected>Another Month</option>
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
<button  class="w3-btn w3-black w3-round" style="width: 100px; margin-left: 20px;">Choose</button></p>



  </form>
</div>

<div class="w3-container w3-theme w3-center w3-third" style=" margin-top: 50px;">

		
		</div>

<div class="w3-container w3-theme w3-center w3-third" style="border:1px solid #000; background-color: #f0f0a8;margin-top: 10px;">
	<p style="padding-top: 0px; padding-bottom: 0px;font-size: 12px;">Cash Flow Statement for January</p>
		<a href="docs/january.pdf" class="w3-btn w3-black">Download Pdf <i class="fas fa-file-pdf"></i></a>
		</div>

</div>

<div class="w3-container  w3-responsive" id="tabl">
	<h3 class="">DATA ENTRY FOR NEW WITHDRAW</h3>
<br>
<table class="w3-table w3-white w3-striped w3-bordered  ">
<tr class="w3-theme-d4" style="font-family: 'Ubuntu Condensed', sans-serif; font-size: 120%;">
  <th>Date</th>
  <th>Item</th>
  <th>Quantity</th>
  <th>Tax</th>
  <th>Cash Out</th>
</tr>
<tr>
<td><input type="" name=""> </td>
  <td><input type="" name=""></td>
<td><input type="" name=""></td>
  <td><input type="" name=""></td>
  <td><input type="" name=""></td>
</tr>



<tr id="totalamt" style="border-right: none;">
	<td></td>
  <td></td>
<td></td>
  <td></td>
<td style=" text-align: center;"><button  class="w3-btn w3-black w3-round" style="width: 100px; margin-left: 20px; " ><a href="cashoutyes.jsp">Enter </a>  </button> </td>	
		</tr>
</table>

</div>


<div class="w3-container w3-center w3-padding">

<div class="w3-container w3-half">
	<button  class="w3-btn w3-black w3-round" style="width: 100px; margin-left: 20px;">Edit <i class="fas fa-pen"></i> </button> <button  class="w3-btn w3-black w3-round" style="width: 100px; margin-left: 20px;">Cash In </button>
</div>


</div>

<footer class="w3-container w3-center" id="footer">
  <p>Created by Ephrance, Winnie & Alfred</a></p>    
</footer>
<script src="js/jquery-3.1.0.min.js"></script>
</div>
</body>
</html>

