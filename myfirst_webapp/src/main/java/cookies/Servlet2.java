package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cs2")
public class Servlet2 extends HttpServlet{
      @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          Cookie arr[]=req.getCookies();
          for(Cookie c: arr) {
        	  System.out.println(c.getValue());
        	  PrintWriter p=resp.getWriter();
              p.write(c.getValue());
              
          }
          
           
    }
}
