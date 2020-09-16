package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class cashinyes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_update_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_update_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_update_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html>\n");
      out.write("<title>kuzimba cash management system</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/w3css.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Ubuntu+Condensed&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@700&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/cashinyes.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/index.js\"></script>\n");
      out.write(" <script src=\"js/all.min.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"js/SmoothMovement.compressed.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"js/anime.js\"></script>\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write(" \t\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("<body id=\"myPage\" class=\"w3-container w3-center\" style=\"padding: 0; margin: 0; \">\n");
      out.write("\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      ");
      //  sql:update
      org.apache.taglibs.standard.tag.rt.sql.UpdateTag _jspx_th_sql_update_0 = (org.apache.taglibs.standard.tag.rt.sql.UpdateTag) _jspx_tagPool_sql_update_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.UpdateTag.class);
      _jspx_th_sql_update_0.setPageContext(_jspx_page_context);
      _jspx_th_sql_update_0.setParent(null);
      _jspx_th_sql_update_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snapshot}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_sql_update_0.setVar("result");
      int[] _jspx_push_body_count_sql_update_0 = new int[] { 0 };
      try {
        int _jspx_eval_sql_update_0 = _jspx_th_sql_update_0.doStartTag();
        if (_jspx_eval_sql_update_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_sql_update_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_push_body_count_sql_update_0[0]++;
            _jspx_th_sql_update_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_sql_update_0.doInitBody();
          }
          do {
            out.write("\n");
            out.write("         INSERT INTO kuzimba.purchases  VALUES ('");
            out.print(request.getParameter("id"));
            out.write("','");
            out.print(request.getParameter("date"));
            out.write("', '");
            out.print(request.getParameter("item"));
            out.write("', '");
            out.print(request.getParameter("quantity"));
            out.write("','");
            out.print(request.getParameter("tax"));
            out.write("', '");
            out.print(request.getParameter("cashin"));
            out.write("');\n");
            out.write("      ");
            int evalDoAfterBody = _jspx_th_sql_update_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_sql_update_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_sql_update_0[0]--;
        }
        if (_jspx_th_sql_update_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sql_update_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sql_update_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sql_update_0.doFinally();
        _jspx_tagPool_sql_update_var_dataSource.reuse(_jspx_th_sql_update_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-container\" id=\"main\">\n");
      out.write("<div class=\"w3-container  w3-padding\"  id=\"maininner\">\n");
      out.write("  <div class=\"w3-bar\" style=\"width: 100%; \">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <a href=\"index.jsp\" class=\"w3-bar-item w3-btn w3-red   w3-right\" style=\"text-decoration: none;\">Log Out </a>\n");
      out.write("  <a href=\"cashout.jsp\" class=\"w3-bar-item w3-btn w3-white   w3-right\" style=\"text-decoration: none;\">Cash Out </a>\n");
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
      out.write(" <div class=\"w3-container w3-half w3-center w3-theme-dark w3-padding-4\">\n");
      out.write("<img src=\"images/cashpic.jpg\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-half w3-center\">\n");
      out.write("<div class=\"w3-container w3-center w3-padding-4\">\n");
      out.write("<div class=\"w3-container w3-center \" id=\"heading\">\n");
      out.write("\t<h1  class=\"w3-padding\">CASH IN</h1>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-theme w3-center w3-third\" style=\" margin-top: 10px;\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container  w3-responsive\" id=\"tabl\">\n");
      out.write("\t<h3 class=\"\">DATA ENTRY SUCCESS NOTIFICATION</h3>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-padding w3-center\"   style=\"background-color: yellow;\"><p>You have deposited UGX  ");
      out.print(request.getParameter("cashin"));
      out.write("  </p>\n");
      out.write("    <p>Reason: Purchase of ");
      out.print(request.getParameter("quantity"));
      out.write(' ');
      out.print(request.getParameter("item"));
      out.write("</p> </div>\n");
      out.write("     <p>\n");
      out.write("         ");

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

      out.write("\n");
      out.write("          </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-center w3-padding\">\n");
      out.write("<div class=\"w3-container w3-half\" style=\"margin-top: 20px;\">\n");
      out.write("   \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-half\" style=\"margin-top: 20px;\">\n");
      out.write("\t<a href=\"purchase.jsp\" class=\"w3-btn w3-black w3-round\" style=\"width: 150px; margin-left: 20px;\">New Purchase</a> <a href=\"cashin.jsp\" class=\"w3-btn w3-black w3-round\" style=\"width: 150px; margin-left: 20px;\">Statement</a>\n");
      out.write("<a href=\"cashout.jsp\" class=\"w3-btn w3-black w3-round\" style=\"width: 150px; margin-left: 20px;\">Cash Out</a> \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"w3-container w3-center\" id=\"footer\">\n");
      out.write("  <p>Created by Ephrance, Winnie & Alfred</a></p>    \n");
      out.write("</footer>\n");
      out.write("<script src=\"js/jquery-3.1.0.min.js\"></script>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("snapshot");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/kuzimba");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("fire");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }
}
