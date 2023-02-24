package Java;

import java.sql.*;
import java.util.Scanner;

public class AddAnimalInDataBase {
    public static void addAnimal(String url, String username, String password) {
        try {
            Scanner scanner = new Scanner(System.in);

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            System.out.print("введите животное: ");
            String animal = scanner.nextLine();

            System.out.print("Введите имя животного: ");
            String name = scanner.nextLine();

            System.out.print("Введите команды которые знает животное: ");
            String commands = scanner.nextLine();

            System.out.print("Ведите год-месяц-дату рождения: ");
            String dateOfBirth = scanner.nextLine();

            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "INSERT INTO pets (`animal`,`name`,`commands`,`date of birth`) Values (?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, animal);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, commands);
                preparedStatement.setString(4, dateOfBirth);

                int rows = preparedStatement.executeUpdate();

                System.out.printf("%d rows added", rows);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }



}
