package myfirst_webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ex")
public class Excerise extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name =req.getParameter("n");
		String age =req.getParameter("a");
		String gender=req.getParameter("g");
		String mail=req.getParameter("m");
		PrintWriter pw=res.getWriter();
//		pw.write("<html><body><pre><h1>"+"name   = "+name+"</h1></pre></body></html>");
//		pw.write("<html><body><pre><h1>"+"age    = "+age+"</h1></pre></body></html>");
//		pw.write("<html><body><pre><h1>"+"gender = "+gender+"</h1></pre></body></html>");
//		pw.write("<html><body><pre><h1>"+"mail   = "+mail+"</h1></pre></body></html>");
//		pw.write("thank you");
		pw.write("<html><body>");
		pw.write("<pre><h1>personal details</h1></pre>");
		pw.write("<pre><h3>"+"name   = "+name+"</h3></pre>");
		pw.write("<pre><h3>"+"age    = "+age+"</h3></pre>");
		pw.write("<pre><h3>"+"gender = "+gender+"</h3></pre>");
		pw.write("<pre><h3>"+"mail   = "+mail+"</h3></pre>");
		
		pw.write("</body></html>");
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(mail);
		
	}

}
