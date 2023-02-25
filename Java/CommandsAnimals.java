package Java;

import java.sql.*;

public class CommandsAnimals extends AddAnimalInDataBase {
    public void knowCommands() {
        String query = "SELECT name, commands FROM pets WHERE id > ?";
        int getId = 0;

        try {
            // opening database connection to MySQL server
            Connection connection = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
            // getting Statement object to execute query
            Statement statement = connection.createStatement();
            // executing SELECT query
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, getId);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                String name = result.getString("name");
                String commands = result.getString("commands");
                System.out.printf("%s\t знает команды: \t%s \n", name, commands);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...\n");
            System.out.println(ex);
        }
    }
}
