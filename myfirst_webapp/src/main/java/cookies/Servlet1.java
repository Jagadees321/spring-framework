package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cs1")
public class Servlet1 extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         String name=req.getParameter("name");
         System.out.println(name);
         Cookie c=new Cookie("n",name);
         resp.addCookie(c);
         resp.getWriter().write("<a href=cs2>servlet2</a>");
    }
}
