package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class cashin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
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
      out.write(" \n");
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
      out.write("<link rel=\"stylesheet\" href=\"css/loggedin.css\">\n");
      out.write(" <script src=\"js/all.min.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"js/SmoothMovement.compressed.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"js/anime.js\"></script>\n");
      out.write("  <head>\n");
      out.write(" \t\n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\" src=\"js/canvasjs.min.js\"></script>\n");
      out.write(" </head>\n");
      out.write("<body id=\"myPage\" class=\"w3-container w3-center\" style=\"padding: 0; margin: 0; \">\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-container\" id=\"main\">\n");
      out.write("<div class=\"w3-container  w3-padding\"  id=\"maininner\">\n");
      out.write("  <div class=\"w3-bar\" style=\"width: 100%; \">\n");
      out.write("   <a href=\"index.jsp\" class=\"w3-bar-item w3-btn w3-red   w3-right\" style=\"text-decoration: none;\">Log Out </a>\n");
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
      out.write("\n");
      out.write("<div class=\"w3-container w3-center w3-padding-4\">\n");
      out.write("<div class=\"w3-container w3-center w3-third\" id=\"heading\">\n");
      out.write("\t<h1  class=\"w3-padding\">CASH IN</h1>\n");
      out.write("\t<p>For the month of January</p>\n");
      out.write("\t  <form action=\"cashin.jsp\" id=\"formdesign\" >\n");
      out.write("      <select class=\"w3-select\" name=\"option\" style=\"max-width: 300px;\" id=\"opts\">\n");
      out.write("  <option class=\"w3-padding\" value=\"\" disabled selected>Another Month</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"1\">January</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"2\">February</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"3\">March</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"4\">April</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"5\">May</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"6\">June</option>\n");
      out.write("   <option class=\"w3-padding\" value=\"7\">July</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"8\">August</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"9\">September</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"10\">October</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"11\">November</option>\n");
      out.write("  <option class=\"w3-padding\" value=\"12\">December</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<button  class=\"w3-btn w3-black w3-round\" style=\"width: 100px; margin-left: 20px;\">Choose</button></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-theme w3-center w3-third\" style=\" margin-top: 50px;\">\n");
      out.write("\t<h3 style=\"\">STATEMENT</h3>\n");
      out.write("\t<a href=\"purchase.jsp\" class=\"w3-btn w3-black w3-round\" style=\"min-width: 100px; \" >New Purchase</a> \n");
      out.write("\t<h3>Chosen Account: <i> Cash</i> </h3>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-theme w3-center w3-third\" style=\"border:1px solid #000; background-color: #f0f0a8;margin-top: 10px;\">\n");
      out.write("\t<p style=\"padding-top: 0px; padding-bottom: 0px;font-size: 12px;\">Cash Flow Statement for January</p>\n");
      out.write("\t\t<a href=\"#\" onclick=\"HTMLtoPDF()\" class=\"w3-btn w3-black\">Download Pdf <i class=\"fas fa-file-pdf\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container  w3-responsive\" id=\"HTMLtoPDF\">\n");
      out.write("    <h2 id=\"ttle\" style=\"display: none\"></h2>\n");
      out.write("  <h4 id=\"ttle2\" style=\"display: none\"></h4>\n");
      out.write("  <h5 id=\"ttle3\" style=\"display: none\"></h5>\n");
      out.write("<br>\n");
      out.write("<table class=\"w3-table w3-white w3-striped w3-bordered  \">\n");
      out.write("    \n");
      out.write("<tr class=\"w3-theme-d4\" style=\"font-family: 'Ubuntu Condensed', sans-serif; font-size: 120%;\">\n");
      out.write("  <th>Date</th>\n");
      out.write("  <th>Item</th>\n");
      out.write("  <th>Quantity</th>\n");
      out.write("  <th>Tax</th>\n");
      out.write("  <th>Cash In</th>\n");
      out.write("</tr>\n");
      out.write("       \n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/cashin.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        ");
      if (_jspx_meth_json_object_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("<tr id=\"totalamt\" style=\"border-right: none;\">\n");
      out.write("<td></td>\n");
      out.write("  <td></td>\n");
      out.write("<td></td>\n");
      out.write("  <td></td>\n");
      out.write("  <td style=\"font-family: 'Ubuntu Condensed', sans-serif; font-size: 120%; font-weight: bold; text-align: center;\">Total Cash In For January<br> \n");
      out.write("  <p>\n");
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
out.println("Total Cash In :" +Countrun);
}
}
catch (Exception e){
e.printStackTrace();
}

      out.write("\n");
      out.write("          </p> </td>\t\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-center w3-padding\">\n");
      out.write("<div class=\"w3-container w3-center w3-half w3-white\">\n");
      out.write("\t<h3 class=\"w3-padding\">Cash-In Performance Graph </h3>\n");
      out.write("\t<p>For the month of January</p>\n");
      out.write("        <a onclick=\"cinputGraph()\" class=\"w3-btn w3-black w3-round\" style=\"min-width: 100px; margin-left: 20px;\">Load Graph</a>\n");
      out.write("<div class=\"w3-container\" id=\"chartContainer\" style=\"height: 370px; max-width: 920px; margin: 0px auto;\">\n");
      out.write("\t \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-container w3-half\">\n");
      out.write("\t<a href=\"purchase.jsp\"  class=\"w3-btn w3-black w3-round\" style=\"width: 100px; margin-left: 20px;\"> Edit</a> <i class=\"fas fa-pen\"></i>  <a href=\"cashout.jsp\" class=\"w3-btn w3-black w3-round\" style=\"width: 100px; margin-left: 20px;\">Cash Out</a>  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<footer class=\"w3-container w3-center\" id=\"footer\">\n");
      out.write("  <p>Created by Ephrance, Winnie & Alfred</a></p>    \n");
      out.write("</footer>\n");
      out.write("<script src=\"js/jquery-3.1.0.min.js\"></script>\n");
      out.write("</div>\n");
      out.write("<!-- these js files are used for making PDF -->\n");
      out.write("  <script src=\"js/jspdf.js\"></script>\n");
      out.write("  <script src=\"js/jquery-2.1.3.js\"></script>\n");
      out.write("  <script src=\"js/pdfFromHTML.js\"></script>\n");
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

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snapshot}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("listUsers");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        SELECT*FROM kuzimba.purchases;\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("user");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listUsers.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                    <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.item}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.tax}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.cashin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_json_object_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:object
    atg.taglib.json.JsonObjectTag _jspx_th_json_object_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonObjectTag.class) : new atg.taglib.json.JsonObjectTag();
    _jspx_th_json_object_0.setJspContext(_jspx_page_context);
    _jspx_th_json_object_0.setJspBody(new cashin_jspHelper( 0, _jspx_page_context, _jspx_th_json_object_0, null));
    _jspx_th_json_object_0.doTag();
    return false;
  }

  private boolean _jspx_meth_json_property_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  json:property
    atg.taglib.json.JsonPropertyTag _jspx_th_json_property_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(atg.taglib.json.JsonPropertyTag.class) : new atg.taglib.json.JsonPropertyTag();
    _jspx_th_json_property_0.setJspContext(_jspx_page_context);
    _jspx_th_json_property_0.setParent(_jspx_parent);
    _jspx_th_json_property_0.setName("numeric3");
    _jspx_th_json_property_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.cashin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_json_property_0.doTag();
    return false;
  }

  private class cashin_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public cashin_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n");
      out.write("  ");
      if (_jspx_meth_json_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write('\n');
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
