import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		//set the transmitted content format to be html
		resp.setContentType("text/html");
		//get output stream on user browser
		PrintWriter out = resp.getWriter();
		//send html code to user browser
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>HelloWorld</title></head>");
		out.println("<Body>");
		out.println("Hello, world!"+ new java.util.Date());
		out.println(", using the GET method");
		out.println("</Body></html>");
		//clear the output stream
		out.flush();
		//close the output stream
		out.close();
	}

	
}
