
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<title>kuzimba cash management system</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3css.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/cashinyes.css">
<script type="text/javascript" src="js/index.js"></script>
 <script src="js/all.min.js"></script>
 <script type="text/javascript" src="js/SmoothMovement.compressed.js"></script>
 <script type="text/javascript" src="js/anime.js"></script>

  <head>
 	

  </head>
<body id="myPage" class="w3-container w3-center" style="padding: 0; margin: 0; ">

<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/kuzimba"
         user = "root"  password = "fire"/>
      <sql:update dataSource = "${snapshot}" var = "result">
         INSERT INTO kuzimba.purchases  VALUES ('<%=request.getParameter("id")%>','<%=request.getParameter("date")%>', '<%=request.getParameter("item")%>', '<%=request.getParameter("quantity")%>','<%=request.getParameter("tax")%>', '<%=request.getParameter("cashin")%>');
      </sql:update>


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

<div class="w3-container w3-center"  >
 <div class="w3-container w3-half w3-center w3-theme-dark w3-padding-4">
<img src="images/cashpic.jpg">
</div>


<div class="w3-container w3-half w3-center">
<div class="w3-container w3-center w3-padding-4">
<div class="w3-container w3-center " id="heading">
	<h1  class="w3-padding">CASH IN</h1>
	</div>

<div class="w3-container w3-theme w3-center w3-third" style=" margin-top: 10px;">
</div>

</div>

<div class="w3-container  w3-responsive" id="tabl">
	<h3 class="">DATA ENTRY SUCCESS NOTIFICATION</h3>
<br>

<div class="w3-container w3-padding w3-center"   style="background-color: yellow;"><p>You have deposited UGX  <%=request.getParameter("cashin")%>  </p>
    <p>Reason: Purchase of <%=request.getParameter("quantity")%> <%=request.getParameter("item")%></p> </div>
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
out.println("Your New Account Balance is UGX  :" +Countrun);
}
}
catch (Exception e){
e.printStackTrace();
}
%>
          </p>


</div>


<div class="w3-container w3-center w3-padding">
<div class="w3-container w3-half" style="margin-top: 20px;">
   
</div>

<div class="w3-container w3-half" style="margin-top: 20px;">
	<a href="purchase.jsp" class="w3-btn w3-black w3-round" style="width: 150px; margin-left: 20px;">New Purchase</a> <a href="cashin.jsp" class="w3-btn w3-black w3-round" style="width: 150px; margin-left: 20px;">Statement</a>
<a href="cashout.jsp" class="w3-btn w3-black w3-round" style="width: 150px; margin-left: 20px;">Cash Out</a> 
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
