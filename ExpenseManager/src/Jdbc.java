import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jbdc {
    public static void main(String[] args) throws SQLException {

        String url = "jbdc:mysql://localhost:3306/expensecalculator";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
            //to insert the data into table
            String insert = "insert into expensetb(expencetype,expenseamount,incomeamount)" + "values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, 500);
            ps.setString(2, "Travel");
            ps.setInt(3, 100);
            ps.executeUpdate();

        }
        catch (SQLException e) {
            throw new SQLException();
        }


    }
}
