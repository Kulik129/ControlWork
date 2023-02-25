package Java;

import java.sql.SQLException;
import java.util.Scanner;

public class AskAction {
    public void ask() throws SQLException {
        CommandsAnimals commandsAnimals = new CommandsAnimals();
        AddAnimalInDataBase addAnimal = new AddAnimalInDataBase();
        UpdateStringInTable update = new UpdateStringInTable();
        DeleteOneObjectFromTheTable delete = new DeleteOneObjectFromTheTable();

        Scanner in = new Scanner(System.in);
        System.out.println(
                "Нажмите 1 если желаете записать новое животное\n" +
                        "Нажмите 2 если желаете посмотреть команды которые знает животное\n" +
                        "Нажмите 3 если желаете update\n" +
                        "Нажмите 4 если желаете del\n"
        );
        int as = in.nextInt();

        if (as == 1) {
            addAnimal.addAnimal();
            ask();
        }
        if (as == 2) {
            commandsAnimals.knowCommands();
            ask();
        }
        if (as == 3) {
            update.update();
            ask();
        }
        if (as == 4) {
            delete.deleteOneObject();
            ask();
        }
    }
}
