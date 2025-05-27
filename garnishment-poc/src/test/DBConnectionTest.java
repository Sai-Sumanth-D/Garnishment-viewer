

package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
    public static void main(String[] args) {
        // Update with your DB details
        String url = "jdbc:postgresql://localhost:5432/pocdb";
        String user = "postgres";
        String password = "DLakshmi@123";

        try {
            // Load the PostgreSQL driver
            Class.forName("org.postgresql.Driver");
            // Try to establish a connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to the PostgreSQL database successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ PostgreSQL JDBC Driver not found!");
            e.printStackTrace();
        }
    }
}
