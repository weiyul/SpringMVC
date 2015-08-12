package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.imp.UserService;
import domain.User;

public final class process_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      service.imp.UserService userService = null;
      synchronized (session) {
        userService = (service.imp.UserService) _jspx_page_context.getAttribute("userService", PageContext.SESSION_SCOPE);
        if (userService == null){
          userService = new service.imp.UserService();
          _jspx_page_context.setAttribute("userService", userService, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

request.setCharacterEncoding("utf-8");
String userName= request.getParameter("userName");
String password=request.getParameter("password");
String realName=request.getParameter("realName");
String gender = request.getParameter("gender");
String age=request.getParameter("age");
String personalSignature=request.getParameter("personalSignature");
User user=new User();
user.setUserName(userName);
user.setPassword(password);
user.setRealName(realName);
user.setGender(gender);
user.setAge(Integer.parseInt(age));
user.setPersonalSignature(personalSignature);
try{
	//use the logical layer's service to accomplish the register function, userService maps to the id="userService" in useBean
			userService.addUser(user);

      out.write("\n");
      out.write("<!-- register successfully, jump to the login.jsp -->\n");
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write('\n');
      out.write('\n');
	
}catch(Exception ex){
	ex.printStackTrace();

      out.write("\n");
      out.write("<!-- register unsuccessfully, back to register.jsp -->\n");
      if (true) {
        _jspx_page_context.forward("register.jsp");
        return;
      }
      out.write('\n');
      out.write('\n');

	
}


      out.write("\n");
      out.write("\n");
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
