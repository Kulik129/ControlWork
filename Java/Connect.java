package Java;

public class Connect {
    private static String url = "jdbc:mysql://localhost:3306/Human_Friends";
    private static String user = "root";
    private static String password = "12345678";

    public static String getUrl() {
        return url;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }
}
