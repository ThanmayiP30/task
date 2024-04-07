package dynamic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/multiplication")
public class Multiplication extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no1=arg0.getParameter("sub1");
		String no2=arg0.getParameter("sub2");
		int n1=Integer.parseInt(no1);
		int n2=Integer.parseInt(no2);
		int r=n1*n2;
		arg1.getWriter().print("<h1 style=\"background-color: azure; color: cornflowerblue;\">"+"The sum of"+" "+"<span  style='color :green' > "+n1+"</span>"+" and "+"<span  style='color :green' > "+n2+"</span>"+" is "+"<span  style='color :green' > "+r+"</span>"+"</h1>");

	}

}
