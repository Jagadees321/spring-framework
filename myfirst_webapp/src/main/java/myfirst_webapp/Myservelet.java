package myfirst_webapp;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/mg")
public class Myservelet implements Servlet{

	static {
		System.out.println("i am static");
	}
	
	{
		System.out.println("non static");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("i am init");
         

		
	}

	@Override
	public ServletConfig getServletConfig() {

        System.out.println("i am getservlet comfiguration");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

       System.out.println("i am service");
		
	}

	@Override
	public String getServletInfo() {

        System.out.println("i am getservletinfo");
		return null;
	}

	@Override
	public void destroy() {

       System.out.println("destroy");
		
	}

}
