package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx {

    public static void main(String[] args) {
      
        String url = "jdbc:mysql://localhost:3306/Company";
        String user = "root";
        String password = "root";

        Connection con = null;

        try {
      
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connection created");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } finally {
            // Close the connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
    }
}
