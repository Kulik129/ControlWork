package Java;

import java.sql.*;

public class CommandsAnimals extends AddAnimalInDataBase {
    public void knowCommands() {
        String query = "SELECT name, commands FROM pets WHERE id > ?";
        int getId = 0;
        Queries qw = new Queries();

        try {
            ResultSet res = qw.query(query, getId);
            while (res.next()) {
                String name = res.getString("name");
                String commands = res.getString("commands");
                System.out.printf("%s\t знает команды: \t%s \n", name, commands);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...\n");
            System.out.println(ex);
        }
    }
}
