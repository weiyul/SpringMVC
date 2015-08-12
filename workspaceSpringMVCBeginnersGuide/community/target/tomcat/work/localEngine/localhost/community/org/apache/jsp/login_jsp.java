package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String path=request.getContextPath();
String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<title>Login</title>\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"process_login.jsp\" method=\"post\">\n");
      out.write("\t<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"7\" width=\"234\">\n");
      out.write("\t\t<tr align=\"center\"><a href=\"register.jsp\">register to be a new member</a></tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td align=\"left\" valign=\"middle\" width=\"26\">\n");
      out.write("\t\t\t\t<img src=\"css/images/jiantou3.jpg\" width=\"11\" height=\"10\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td align=\"center\" valign=\"middle\" width=\"60\">\n");
      out.write("\t\t\t\t<img src=\"css/images/user.jpg\" width=\"47\" height=\"15\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td align=\"center\" valign=\"middle\" width=\"148\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"username\"/>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td align=\"left\" valign=\"middle\" width=\"26\">\n");
      out.write("\t\t\t\t<img src=\"css/images/jiantou3.jpg\" width=\"11\" height=\"10\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td align=\"center\" valign=\"middle\" width=\"60\">\n");
      out.write("\t\t\t\t<img src=\"css/images/pass.jpg\" width=\"47\" height=\"15\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td align=\"center\" valign=\"middle\" width=\"148\">\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"password\"/>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td align=\"left\"><input type=\"submit\" value=\"enter\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
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
