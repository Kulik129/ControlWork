package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStringInTable {
    public void update() {
        try {
            Connection conn = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("UPDATE pets SET commands = 'Лежать, спать, есть' WHERE name = 'Эльза'");
            System.out.printf("Updated %d rows\n", rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
