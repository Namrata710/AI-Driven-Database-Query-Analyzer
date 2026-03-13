package optimizer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static final String URL = "jdbc:mysql://localhost:3306/ai_db_optimizer";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static Connection connect() {

        Connection conn = null;

        try {

            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}