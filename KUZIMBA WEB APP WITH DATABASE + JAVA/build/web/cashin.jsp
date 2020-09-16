<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

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
 <script src="js/all.min.js"></script>
 <script type="text/javascript" src="js/SmoothMovement.compressed.js"></script>
 <script type="text/javascript" src="js/anime.js"></script>
  <head>
 	

  <script type="text/javascript" src="js/canvasjs.min.js"></script>
 </head>
<body id="myPage" class="w3-container w3-center" style="padding: 0; margin: 0; ">


 <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/kuzimba"
         user = "root"  password = "fire"/>
      <sql:query dataSource = "${snapshot}" var = "listUsers">
        SELECT*FROM kuzimba.purchases;
      </sql:query>

<div class="w3-container" id="main">
<div class="w3-container  w3-padding"  id="maininner">
  <div class="w3-bar" style="width: 100%; ">
   <a href="index.jsp" class="w3-bar-item w3-btn w3-red   w3-right" style="text-decoration: none;">Log Out </a>
  <a href="cashout.jsp" class="w3-bar-item w3-btn w3-white   w3-right" style="text-decoration: none;">Cash Out </a>
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
	<h1  class="w3-padding">CASH IN</h1>
	<p>For the month of January</p>
	  <form action="cashin.jsp" id="formdesign" >
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
	<h3 style="">STATEMENT</h3>
	<a href="purchase.jsp" class="w3-btn w3-black w3-round" style="min-width: 100px; " >New Purchase</a> 
	<h3>Chosen Account: <i> Cash</i> </h3>
		
		</div>

<div class="w3-container w3-theme w3-center w3-third" style="border:1px solid #000; background-color: #f0f0a8;margin-top: 10px;">
	<p style="padding-top: 0px; padding-bottom: 0px;font-size: 12px;">Cash Flow Statement for January</p>
		<a href="#" onclick="HTMLtoPDF()" class="w3-btn w3-black">Download Pdf <i class="fas fa-file-pdf"></i></a>
		</div>

</div>

<div class="w3-container  w3-responsive" id="HTMLtoPDF">
    <h2 id="ttle" style="display: none"></h2>
  <h4 id="ttle2" style="display: none"></h4>
  <h5 id="ttle3" style="display: none"></h5>
<br>
<table class="w3-table w3-white w3-striped w3-bordered  ">
    
<tr class="w3-theme-d4" style="font-family: 'Ubuntu Condensed', sans-serif; font-size: 120%;">
  <th>Date</th>
  <th>Item</th>
  <th>Quantity</th>
  <th>Tax</th>
  <th>Cash In</th>
</tr>
       
        <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.item}" /></td>
                    <td><c:out value="${user.quantity}" /></td>
                    <td><c:out value="${user.tax}"/></td>
                    <td><c:out value="${user.cashin}"/></td>
                </tr>
            </c:forEach>
    

    <script type="text/javascript" src="js/cashin.js"></script>
    <script>
        <json:object>
  <json:property name="numeric3" value="${user.cashin}"/>
</json:object>
    </script>

<tr id="totalamt" style="border-right: none;">
<td></td>
  <td></td>
<td></td>
  <td></td>
  <td style="font-family: 'Ubuntu Condensed', sans-serif; font-size: 120%; font-weight: bold; text-align: center;">Total Cash In For January<br> 
  <p>
         <%
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kuzimba","root","fire");
Statement st=con.createStatement();
String strQuery = "SELECT SUM(cashin) FROM kuzimba.purchases";
ResultSet rs = st.executeQuery(strQuery);
String Countrun="";
while(rs.next()){
Countrun = rs.getString(1);
out.println("Total Cash In :" +Countrun);
}
}
catch (Exception e){
e.printStackTrace();
}
%>
          </p> </td>	
		</tr>

</table>
   

</div>


<div class="w3-container w3-center w3-padding">
<div class="w3-container w3-center w3-half w3-white">
	<h3 class="w3-padding">Cash-In Performance Graph </h3>
	<p>For the month of January</p>
        <a onclick="cinputGraph()" class="w3-btn w3-black w3-round" style="min-width: 100px; margin-left: 20px;">Load Graph</a>
<div class="w3-container" id="chartContainer" style="height: 370px; max-width: 920px; margin: 0px auto;">
	 
</div>
</div>

<div class="w3-container w3-half">
	<a href="purchase.jsp"  class="w3-btn w3-black w3-round" style="width: 100px; margin-left: 20px;"> Edit</a> <i class="fas fa-pen"></i>  <a href="cashout.jsp" class="w3-btn w3-black w3-round" style="width: 100px; margin-left: 20px;">Cash Out</a>  
</div>


</div>

<footer class="w3-container w3-center" id="footer">
  <p>Created by Ephrance, Winnie & Alfred</a></p>    
</footer>
<script src="js/jquery-3.1.0.min.js"></script>
</div>
<!-- these js files are used for making PDF -->
  <script src="js/jspdf.js"></script>
  <script src="js/jquery-2.1.3.js"></script>
  <script src="js/pdfFromHTML.js"></script>
</body>
</html>
