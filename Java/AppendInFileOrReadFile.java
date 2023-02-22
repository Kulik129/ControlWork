package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppendInFileOrReadFile {

    static void addNewAnimal(String animal, String nameAnimal, String knowsCommands) {
        List<Constructor> addNewAnimal = new ArrayList<>();
        addNewAnimal.add(new Constructor(animal, nameAnimal, knowsCommands));
        System.out.println("Животное добавлено!");

        try (FileWriter writer = new FileWriter("/Users/mitya.kulikbk.ru/Desktop/atest/Java/registry_of_pets.txt", true)) {
            String text = addNewAnimal.toString();
            writer.append(text);
            writer.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void readFile() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/mitya.kulikbk.ru/Desktop/atest/Java/registry_of_pets.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Такого файла не найдено!");
        }
    }
}
