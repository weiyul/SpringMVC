package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("<title>Community Main Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"outer\">\n");
      out.write("\t<div id=\"upbg\"></div>\n");
      out.write("\t<div id=\"inner\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<h1><span>Simple Community</span></h1>\n");
      out.write("\t\t\t<h2>By Community group</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"splash\"></div>\n");
      out.write("\t\t<div id=\"menu\"></div>\n");
      out.write("\t\t<div id=\"primarycontent\">\n");
      out.write("\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t\t<h3>Personal Information</h3>\n");
      out.write("\t\t\t\t\t<div class=\"date\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t<form action=\"process_register.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<table id=\"userInfo_table\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><label>User Name</label></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"userName\" class=\"textInput\"/></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><label>Gender</label></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><select name=\"gender\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"m\" selected=\"selected\">male</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"f\">female</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><label>Real Name</label></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"realName\" class=\"textInput\"/></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><label>Password</label></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" class=\"textInput\"/></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><label>Age</label></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"age\" class=\"textInput\"></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><label>Your Signature</label></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><textarea rows=\"3\" cols=\"18\" name=\"personalSignature\"></textarea></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"left\"><input type=\"submit\" value=\"Register\" /></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"readmore\"><a href=\"login.jsp\">Back</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- primary content end -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t&copy; Community Group. All rights reserved. Design by Community Group\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
