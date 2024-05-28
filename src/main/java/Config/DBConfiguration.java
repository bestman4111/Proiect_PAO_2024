package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfiguration {
    private static Connection con;
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/proiectpao2024";
    private static final String USER = "Tibi";
    private static final String PASS = "parola";

    private DBConfiguration() {

    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(DATABASE_URL, USER, PASS);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return con;
    }

    public static void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
