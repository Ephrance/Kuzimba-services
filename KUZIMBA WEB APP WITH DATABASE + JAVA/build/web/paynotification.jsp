<%@page import="java.io.BufferedReader"%>

<%@page import="java.io.InputStreamReader"%>
<%@page import=" java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@page import="org.json.JSONObject"%>
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
	<h1 id="heading" class="w3-padding">PAY FOR PRODUCTS</h1>
<div class="w3-container w3-padding" style="background-color: yellow;">

<p>SUCCESS ! </p>
<p>You have paid 45000 EURO to 0773913902</p>
</div>
              <p>
         <%

	
     try {
         call_me();
        } catch (Exception e) {
         e.printStackTrace();
       }
     }
	   
public static void call_me() throws Exception {
     String url = "http://api.ipinfodb.com/v3/ip-city/?key=d64fcfdfacc213c7ddf4ef911dfe97b55e4696be3532bf8302876c09ebd06b&ip=74.125.45.100&format=json";
     URL obj = new URL(url);
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
     // optional default is GET
     con.setRequestMethod("GET");
     //add request header
     con.setRequestProperty("User-Agent", "Mozilla/5.0");
     int responseCode = con.getResponseCode();
     System.out.println("\nSending 'GET' request to URL : " + url);
     System.out.println("Response Code : " + responseCode);
     BufferedReader in = new BufferedReader(
             new InputStreamReader(con.getInputStream()));
     String inputLine;
     StringBuffer response = new StringBuffer();
     while ((inputLine = in.readLine()) != null) {
     	response.append(inputLine);
     }
     in.close();
     //print in String
     System.out.println(response.toString());
     //Read JSON response and print
     JSONObject myResponse = new JSONObject(response.toString());
     System.out.println("result after Reading JSON Response");
     System.out.println("statusCode- "+myResponse.getString("statusCode"));
     System.out.println("statusMessage- "+myResponse.getString("statusMessage"));
     System.out.println("ipAddress- "+myResponse.getString("ipAddress"));
     System.out.println("countryCode- "+myResponse.getString("countryCode"));
     System.out.println("countryName- "+myResponse.getString("countryName"));
     System.out.println("regionName- "+myResponse.getString("regionName"));
     System.out.println("cityName- "+myResponse.getString("cityName"));
     System.out.println("zipCode- "+myResponse.getString("zipCode"));
     System.out.println("latitude- "+myResponse.getString("latitude"));
     System.out.println("longitude- "+myResponse.getString("longitude"));
     System.out.println("timeZone- "+myResponse.getString("timeZone"));  

%>
          </p>

</div>
  <br>

      <a href="pay.jsp" class="w3-btn w3-black" style="text-decoration: none;">New Payment</a> 
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
