package Java;

import java.sql.SQLException;

public class Main {
    public static void main(String args[]) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Human_Friends";
        String username = "root";
        String password = "12345678";
//        AddAnimalInDataBase.addAnimal(url,username,password);
        GetCommands.outputOfCommands(url,username,password);
//        DeleteOneObjectFromTheTable.deleteOneObject(url,username,password);
//        UpdateStringInTable.update(url,username,password);
    }
}