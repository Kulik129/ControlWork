package Java;

import java.util.Scanner;

public class AskAction extends AppendInFileOrReadFile {
    static void ask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Нажмите 1 если желаете записать новое животное\nНажмите 2 если желаете считать список животных");
        int as = in.nextInt();

        if (as == 1) {
            System.out.println("Введите животное, напр.(Собака)");
            String animal = in.next();
            System.out.println("Введите имя животного, напр.(Мухтар)");
            String nameAnimal = in.next();
            System.out.println("Введите команды которые питомец знает, напр.(сидеть, фас)");
            String knowsCommands = in.next();
            AppendInFileOrReadFile.addNewAnimal(animal, nameAnimal, knowsCommands);
        }
        if (as == 2) {
            AppendInFileOrReadFile.readFile();
        }
    }
}