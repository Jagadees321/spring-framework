package servlet_cal2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/div")
public class Div extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double n1=Double.parseDouble(req.getParameter("n1"));
		double n2=Double.parseDouble(req.getParameter("n2"));
		
		PrintWriter p=res.getWriter();
		p.write("<h1>div is:"+ (n1/n2)+"</h1>");
		
	}

}
