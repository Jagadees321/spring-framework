package hiddenform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hif1")
public class Servlet1  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name=req.getParameter("name");
         System.out.println(name);
         PrintWriter pw=resp.getWriter();
         pw.write("<html><body><form action=hif2>");
         pw.write("<input type=text type='hidden' name=n value= ' "+name+" '>");
         pw.write("<input type=submit value=servlet2>");
         pw.write("</form></body></html>");

    }
}