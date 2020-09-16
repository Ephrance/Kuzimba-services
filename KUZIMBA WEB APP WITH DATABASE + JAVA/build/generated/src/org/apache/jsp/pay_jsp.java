package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<title>kuzimba cash management system</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/w3css.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/pay.js\"></script>\n");
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
      out.write("<div class=\"w3-container\">\n");
      out.write("\t<form action=\"OkHttpPut.java\" class=\"w3-center\"  onsubmit=\"return validateForm()\" method=\"post\" name=\"myForm\" id=\"mainright\">\n");
      out.write("                Amount<br> <input class=\"w3-padding-4 w3-round w3-validate\" type=\"number\" name=\"amount\" placeholder=\"Enter Amount\" id=\"user\"><br>\n");
      out.write("     <select class=\"w3-select\" name=\"option\" style=\"max-width: 250px;\" id=\"opts\">\n");
      out.write("  <option class=\"w3-padding\" value=\"EURO\">EURO</option>\n");
      out.write("  </select>\n");
      out.write("  <br>\n");
      out.write("\t\tMOBILE MONEY PIN<br> <input placeholder=\"your PIN\" id=\"pin\" class=\"w3-round w3-validate\" type=\"password\" name=\"pin\"> <br>\n");
      out.write("    <input  class=\"w3-btn w3-black w3-round\" id=\"loginbtn\" type=\"submit\" value=\"ENTER\" name=\"\" style=\"margin-left:10px;\">\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("  <br>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"w3-container w3-center\" id=\"footer\">\n");
      out.write("  <p>Created by Ephrance, Winnie & Alfred</a></p>    \n");
      out.write("</footer>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"js/jquery-3.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/pay.js\"></script>\n");
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
