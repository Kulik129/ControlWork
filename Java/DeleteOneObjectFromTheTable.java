package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOneObjectFromTheTable {
    public void deleteOneObject() {
        try {
            Connection conn = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
            Statement statement = conn.createStatement();

            int rows = statement.executeUpdate("DELETE FROM pets WHERE name = 'Эльза'");
            System.out.printf("%d row(s) deleted\n", rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
