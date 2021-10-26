
import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pubs", "root", "admin")) {

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM authors");

        resultSet.

        System.out.println("hallo");
        } catch (SQLException e) {
            System.out.println("error");
        } finally{
            System.out.println("Fin");
        }
    }
}