package Java;

import java.sql.*;
import java.util.Scanner;

public class AddAnimalInDataBase {
    public void addAnimal() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вид питомца: ");
        String animal = scanner.nextLine();

        System.out.print("Введите имя питомца: ");
        String name = scanner.nextLine();

        System.out.print("Введите команды которые знает питомец: ");
        String commands = scanner.nextLine();

        System.out.print("Ведите год-месяц-дату рождения: ");
        String dateOfBirth = scanner.nextLine();

        try {
            String sql = "INSERT INTO pets (`animal`,`name`,`commands`,`date of birth`) Values (?, ?, ?, ?)";

            Connection connection = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, animal);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, commands);
            preparedStatement.setString(4, dateOfBirth);

            int rows = preparedStatement.executeUpdate();

            System.out.printf("%d питомец добавлен\n", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...\n");
            System.out.println(ex);
        }
    }
}
