import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/auth")
public class AuthServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws IOException {

  String username = request.getParameter("username");
  String password = request.getParameter("password");

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();

  if(username.equals("admin") && password.equals("admin123")) {
   out.println("<h2>Access Granted</h2>");
   out.println("<p>Welcome, " + username + "</p>");
  } else {
   out.println("<h2>Access Denied</h2>");
   out.println("<p>Invalid credentials</p>");
  }
 }
}
