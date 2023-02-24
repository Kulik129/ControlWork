package Java;

import java.sql.*;

public class GetCommands {
    public static void outputOfCommands(String url, String username, String password) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            int getId = 0;
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT commands FROM pets WHERE id > ?");
            preparedStatement.setInt(1, getId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String commands = resultSet.getString("commands");
                System.out.printf("%s \n", commands);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
