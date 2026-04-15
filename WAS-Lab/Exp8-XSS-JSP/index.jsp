<%@ page language="java" %>
<html>
<body>
 <h2>Enter Input</h2>
 <form method="post">
 Input: <input type="text" name="data"><br><br>
 <input type="submit" value="Submit">
 </form>

 <%
 String data = request.getParameter("data");
 if(data != null) {
 %>

 <h3>Output:</h3>
 <%= data %>

 <%
 }
 %>
</body>
</html>
