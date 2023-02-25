package Java;

import java.sql.*;
import java.util.Scanner;

public class AddAnimalInDataBase {
    public void addAnimal() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("введите животное: ");
        String animal = scanner.nextLine();

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите команды которые знает животное: ");
        String commands = scanner.nextLine();

        System.out.print("Ведите год-месяц-дату рождения: ");
        String dateOfBirth = scanner.nextLine();

        try {
            Connection connection = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());

            String sql = "INSERT INTO pets (`animal`,`name`,`commands`,`date of birth`) Values (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, animal);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, commands);
            preparedStatement.setString(4, dateOfBirth);

            int rows = preparedStatement.executeUpdate();

            System.out.printf("%d rows added\n", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...\n");
            System.out.println(ex);
        }

    }


}
