package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStringInTable {
    public static void update(String url,String username,String password) {
        try (Connection conn = DriverManager.getConnection(url, username, password)){
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("UPDATE pets SET commands = 'Лежать, спать, есть' WHERE name = 'Эльза'");
            System.out.printf("Updated %d rows", rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
