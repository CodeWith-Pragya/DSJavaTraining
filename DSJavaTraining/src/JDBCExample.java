import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {
    private static Connection Conn;

    public static void main(String[] args) throws SQLException {
        //establish the database connection
        // 1. url, username password database name
        String username = "root";
        String password = "";
        String url = "jdbc:mysql;//localhost:3306/javatraining";
        //to make the connection
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("database connection established");
            String name = "Cathy";
            String email = "Jones@gmail.com";
            String mobile = "1234567890";
            String technology = "Java";
            String address = "lucknow";
            String query = "INSERT INTO Trainer VALUES(?,?,?,?,?)";
            Connection mysqlConnection;
            PreparedStatement stmt = Conn.prepareStatement(query);
            stmt.setString(1, "Cathy");
            stmt.setString(2,"Jones@gmail.com");
            stmt.setString(3,"1234567890");
            stmt.setString(4,"Java");
            stmt.setString(5,"lucknow");
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Db not connected" + e);
        }
    }
}



