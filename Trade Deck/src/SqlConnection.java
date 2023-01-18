import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SqlConnection {
    public static Connection getConnection() throws ClassNotFoundException{
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/User_information","Admin","Nithin@123");
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
