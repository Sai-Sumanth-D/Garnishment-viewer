
// Shared utilities like DB connection

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/pocdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "DLakshmi@140528";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
