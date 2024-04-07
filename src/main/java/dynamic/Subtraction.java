package dynamic;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sub")
public class Subtraction implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no1=arg0.getParameter("sub1");
		String no2=arg0.getParameter("sub2");
		int n1=Integer.parseInt(no1);
		int n2=Integer.parseInt(no2);
		int r=n1-n2;
		arg1.getWriter().print("<h1 style=\"background-color: azure; color: cornflowerblue;\">"+"The sum of"+" "+"<span  style='color :green' > "+n1+"</span>"+" and "+"<span  style='color :green' > "+n2+"</span>"+" is "+"<span  style='color :green' > "+r+"</span>"+"</h1>");

	}

}
