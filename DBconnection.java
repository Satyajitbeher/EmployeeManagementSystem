import java.sql.Connection;
import java.sql.DriverManager;

class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/employeee_db";
    private static final String USER = "root"; 
    private static final String PASSWORD = "system";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

