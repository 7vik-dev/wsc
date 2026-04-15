import java.sql.*;

public class JDBCExample {
 public static void main(String[] args) {
  try {
   Class.forName("com.mysql.cj.jdbc.Driver");

   Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/JDBCDB", "root", "admin");

   Statement stmt = con.createStatement();

   stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Student(Id INT PRIMARY KEY, Name VARCHAR(50), Course VARCHAR(50))");

   stmt.executeUpdate("INSERT IGNORE INTO Student VALUES (1, 'Durga Prasad', 'Cyber Security')");
   stmt.executeUpdate("INSERT IGNORE INTO Student VALUES (2, 'Chandu', 'Cyber Security')");

   ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

   while(rs.next()) {
    System.out.println(rs.getInt("Id") + " " + rs.getString("Name") + " " + rs.getString("Course"));
   }

   con.close();
  } catch(Exception e) {
   System.out.println(e);
  }
 }
}
