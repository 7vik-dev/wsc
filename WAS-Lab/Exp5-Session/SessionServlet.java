import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class SessionServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
 throws IOException {
  String username = request.getParameter("username");
  HttpSession session = request.getSession();
  session.setAttribute("user", username);

  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  out.println("<h2>Profile Page</h2>");
  out.println("<h3>Welcome " + session.getAttribute("user") + "</h3>");
 }
}
