package Java;

import java.sql.SQLException;
import java.util.Scanner;

public class AskAction {
    public static void ask() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Human_Friends";
        String username = "root";
        String password = "12345678";
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Нажмите 1 если желаете записать новое животное\n" +
                "Нажмите 2 если желаете посмотреть команды которые знает животное\n"+
                "Нажмите 3 если желаете update\n"+
                "Нажмите 4 если желаете del\n"
        );
        int as = in.nextInt();

        if (as == 1) {
            AddAnimalInDataBase.addAnimal(url, username, password);
            ask();
        }
        if (as == 2) {
            GetCommands.outputOfCommands(url, username, password);
            ask();
        }
        if (as == 3) {
            UpdateStringInTable.update(url, username, password);
            ask();
        }
        if (as == 4) {
            DeleteOneObjectFromTheTable.deleteOneObject(url, username, password);
            ask();
        }
    }
}
