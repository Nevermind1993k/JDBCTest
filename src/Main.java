import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// write your code here

        Connection connection = DriverManager.getConnection("jdbc:derby:C:\\Dev\\MyDB\\BD1");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT name, Favorite_Food FROM pets");
        while (resultSet.next()){
            String nm = resultSet.getString("name");
            String ff = resultSet.getString("Favorite_Food");
            System.out.println(nm +" " + ff);
        }
        connection.close();
    }
}
