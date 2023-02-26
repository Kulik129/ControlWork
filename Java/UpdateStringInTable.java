package Java;

import java.sql.*;
import java.util.Scanner;

public class UpdateStringInTable {
    public void update() {
        Queries qw = new Queries();
        Scanner scanner = new Scanner(System.in);
        String sql = "UPDATE pets SET commands = (?) WHERE name = (?)";

        System.out.print("Введите имя питомца которому хотите добавить новые команды: ");
        String nameAnimal = scanner.nextLine();

        System.out.print("Введите новые команды: ");
        String newCommands = scanner.nextLine();

        try {
            qw.query(sql, nameAnimal, newCommands);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
