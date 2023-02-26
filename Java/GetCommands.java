package Java;

import java.sql.*;

public class GetCommands {
    public void outputOfCommands(String url, String username, String password) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            int getId = 0;
            String select = "SELECT name, commands FROM pets WHERE id > ?";

            PreparedStatement preparedStatement = conn.prepareStatement(select);
            preparedStatement.setInt(1, getId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String commands = resultSet.getString("commands");
                System.out.printf("%s\t знает команды: \t%s \n", name, commands);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...\n");
            System.out.println(ex);
        }
    }
}
