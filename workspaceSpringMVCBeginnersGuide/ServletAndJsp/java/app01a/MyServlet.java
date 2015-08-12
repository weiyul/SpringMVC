package app01a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet (name="MyServlet", urlPatterns = {"/my"})
public class MyServlet implements Servlet {
	private transient ServletConfig servletConfig;
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My Servlet";
	}
	
	public void init(ServletConfig arg0) throws ServletException {
		this.servletConfig= arg0;
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		String servletName = servletConfig.getServletName();
		arg1.setContentType("text/html");
		PrintWriter writer = arg1.getWriter();
		writer.print("<html><head></head>"+ "<body>Hello from "+ servletName+"</body></html>");
		
	}

}
