package Java;
public class Main {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/Human_Friends";
        String username = "root";
        String password = "12345678";
//        AddAnimalInDataBase.addAnimalInDataBase(url,username,password);
//        DeleteOneObjectFromTheTable.deleteOneObject(url,username,password);
        UpdateStringInTable.update(url,username,password);
    }
}