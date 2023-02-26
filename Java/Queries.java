package Java;

import java.sql.*;

public class Queries {
    public void query(String query, String nameAnimal, String newCommands) throws SQLException {
        Connection connection = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, newCommands);
        preparedStatement.setString(2, nameAnimal);
        int rows = preparedStatement.executeUpdate();
        System.out.printf("Новые команды добавлены! Изменено %d строки\n", rows);
    }

    public void query(String query, String nameAnimal) throws SQLException {
        Connection connection = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nameAnimal);
        int rows = preparedStatement.executeUpdate();
        System.out.printf("%d Питомец удален из таблицы\n", rows);
    }

    public ResultSet query(String query, int getId) throws SQLException {
        Connection connection = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, getId);
        ResultSet result = preparedStatement.executeQuery();
        return result;
    }
}
