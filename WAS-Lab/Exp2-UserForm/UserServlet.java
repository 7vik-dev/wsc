import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
 throws IOException {
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String username = request.getParameter("username");
  out.println("<h2>Hello " + username + "</h2>");
 }
}
