package Java;

import java.sql.*;
import java.util.Scanner;

public class DeleteOneObjectFromTheTable {
    public void deleteOneObject() {
        Queries qw = new Queries();
        Scanner scanner = new Scanner(System.in);
        String sql = "DELETE FROM pets WHERE name = (?)";

        System.out.print("Введите имя питомца для удаления из таблицы: ");
        String nameAnimal = scanner.nextLine();
        try {
            qw.query(sql, nameAnimal);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
