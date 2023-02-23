package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOneObjectFromTheTable {
    public static void deleteOneObject(String url,String username,String password) {
        try (Connection conn = DriverManager.getConnection(url, username, password)){

            Statement statement = conn.createStatement();

            int rows = statement.executeUpdate("DELETE FROM pets WHERE Id = ");
            System.out.printf("%d row(s) deleted", rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
