/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-08-17 09:47:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AjaxJson_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"application/javascript\">\r\n");
      out.write("function loadJSON()\r\n");
      out.write("{\r\n");
      out.write("\tvar data_file=\"Data.json\";\r\n");
      out.write("\tvar http_request= new XMLHttpRequest();\r\n");
      out.write("\tif(window.XMLHttpRequest)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\txmlhttp=new XMLHttpRequest();\r\n");
      out.write("\t\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\txmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");//IE\r\n");
      out.write("\t}\r\n");
      out.write("xmlhttp.onreadystatechange=function()\r\n");
      out.write("\t{\r\n");
      out.write("\tif(xmlhttp.readyState==4 && xmlhttp.status==200)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\tdocument.getElementById(\"t\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\thttp_request.onreadystatechange= function()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(http_request.readyState==4)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\tvar jsonObj = JSON.parse(http_request.responseText);\r\n");
      out.write("\t\t\tdocument.getElementById(\"Name\").innerHTML= jsonObj.name;\r\n");
      out.write("\t\t\tdocument.getElementById(\"Country\").innerHTML= jsonObj.country;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("}\r\n");
      out.write("http_request.open(\"GET\",data_file,true);\r\n");
      out.write("http_request.send();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1> Cricketer Details</h1>\r\n");
      out.write("<table border =\"1\">\r\n");
      out.write("<tr><th>Name</th><th>Country</th></tr>\r\n");
      out.write("<tr><td><div id=\"Name\">Sachin</div></td>\r\n");
      out.write("<td><div id=\"Country\">India</div></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div class=\"central\">\r\n");
      out.write("<button type=\"button\" onclick=\"loadJSON()\">Update Details</button>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
