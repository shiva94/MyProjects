/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-08-21 12:19:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Date_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>jsDatePick Javascript example</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"js/jsDatePick_ltr.min.css\" />\r\n");
      out.write("<link  rel=\"stylesheet\" type=\"text/css\" href=\"style/styles.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jsDatePick.min.1.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.onload = function(){\r\n");
      out.write("\t\tnew JsDatePick({\r\n");
      out.write("\t\t\tuseMode:2,\r\n");
      out.write("\t\t\ttarget:\"fromDate\",\r\n");
      out.write("\t\t\tdateFormat:\"%d-%M-%Y\"\r\n");
      out.write("\t\t\t/*selectedDate:{\t\t\t\tThis is an example of what the full configuration offers.\r\n");
      out.write("\t\t\t\tday:5,\t\t\t\t\t\tFor full documentation about these settings please see the full version of the code.\r\n");
      out.write("\t\t\t\tmonth:9,\r\n");
      out.write("\t\t\t\tyear:2006\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tyearsRange:[1978,2020],\r\n");
      out.write("\t\t\tlimitToToday:false,\r\n");
      out.write("\t\t\tcellColorScheme:\"beige\",\r\n");
      out.write("\t\t\tdateFormat:\"%m-%d-%Y\",\r\n");
      out.write("\t\t\timgPath:\"img/\",\r\n");
      out.write("\t\t\tweekStartDay:1*/\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>   \r\n");
      out.write("<form name=\"pickerForm\" action=\"servlet\"  method=\"post\">\r\n");
      out.write("    FromDate <input type=\"text\" size=\"12\" id=\"fromDate\" /> &nbsp;&nbsp;\r\n");
      out.write("\t <input type=\"submit\" class=\"vzbtn\" id=\"buttonID\" value=\"suspend\" name=\"buttonID\"/>\r\n");
      out.write("\t </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
