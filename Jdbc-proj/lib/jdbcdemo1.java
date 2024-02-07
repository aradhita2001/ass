import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcdemo1 {
    // Replace these variables with your database information
   private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/test";
   private static final String USER = "root";
   private static final String PASSWORD = "root";

   public static void main(String[] args) {
       Connection connection = null;

       try {
           // Register JDBC driver
           Class.forName("com.mysql.cj.jdbc.Driver");

           // Open a connection
           System.out.println("Connecting to database...");
           connection = DriverManager.getConnection(JDBC_URL,USER, PASSWORD);
           System.out.println("Connected to the database.");

       } catch (ClassNotFoundException e) {
           System.err.println("Error loading JDBC driver: " + e.getMessage());
       } catch (SQLException e) {
           System.err.println("Error connecting to the database: " + e.getMessage());
       } finally {
           try {
               // Close the connection
               if (connection != null) {
                   connection.close();
                   System.out.println("Connection closed.");
               }
           } catch (SQLException e) {
               System.err.println("Error closing the connection: " + e.getMessage());
           }
       }
   }
}

