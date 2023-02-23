package Java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class AddAnimalInDataBase {
    public static void addAnimalInDataBase(String url,String username,String password) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("INSERT pets(`animal`,`name`,`commands`,`date of birth`) " +
                        "VALUES ('Кошка', 'Эльза','Спит, ест, мяукает','2022-01-29')");
                System.out.printf("Added %d rows", rows);
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
