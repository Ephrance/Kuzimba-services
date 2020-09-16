package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class paynotification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<title>kuzimba cash management system</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/w3css.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/index.js\"></script>\n");
      out.write(" <script src=\"js/all.min.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"js/SmoothMovement.compressed.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"js/anime.js\"></script>\n");
      out.write("<body id=\"myPage\" class=\"w3-container w3-center\" style=\"padding: 0; margin: 0; background-color: #fff;\">\n");
      out.write("<div class=\"w3-container\" id=\"main\">\n");
      out.write("  <div class=\"w3-container w3-white\"  id=\"maininner1\">\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<div class=\"w3-container  w3-padding\"  id=\"maininner\">\n");
      out.write("  <div class=\"w3-bar\" style=\"width: 100%; \">\n");
      out.write("\n");
      out.write("    <a class=\"w3-bar-item   w3-left\"><img src=\"images/icon.png\" width=\"100px\"> </a>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-center\" style=\"\" >\n");
      out.write("  \n");
      out.write("  <h4 style=\"font-weight: normal; color: #fff; \" id=\"myHeaderText\">KUZIMBA CASH MANAGEMENT SYSTEM<br>\n");
      out.write("<i>A better way to manage your business cash flow</i>\n");
      out.write("  </h4>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-center\"  >\n");
      out.write("  <div class=\"w3-container w3-half w3-center w3-theme-dark w3-padding-4\">\n");
      out.write("<img src=\"images/cashpic.jpg\">\n");
      out.write("</div>\n");
      out.write("<div class=\"w3-container w3-half w3-center w3-theme-dark w3-padding-4\" >\n");
      out.write("<div class=\"w3-container w3-center\">\n");
      out.write("\t<h1 id=\"heading\" class=\"w3-padding\">PAY FOR PRODUCTS</h1>\n");
      out.write("<div class=\"w3-container w3-padding\" style=\"background-color: yellow;\">\n");
      out.write("\n");
      out.write("<p>SUCCESS ! </p>\n");
      out.write("<p>You have paid 45000 EURO to 0773913902</p>\n");
      out.write("</div>\n");
      out.write("              <p>\n");
      out.write("         ");


	
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



      out.write("\n");
      out.write("          </p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("  <br>\n");
      out.write("\n");
      out.write("      <a href=\"pay.jsp\" class=\"w3-btn w3-black\" style=\"text-decoration: none;\">New Payment</a> \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"w3-container w3-center\" id=\"footer\">\n");
      out.write("  <p>Created by Ephrance, Winnie & Alfred</a></p>    \n");
      out.write("</footer>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"js/jquery-3.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/login.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
