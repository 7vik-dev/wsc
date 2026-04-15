import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello") 
public class HelloServlet extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
 throws ServletException, IOException {
  response.setContentType("text/html"); 
  PrintWriter out = response.getWriter(); 
  out.println("<h2>HELLO WORLD</h2>");
 }
}
