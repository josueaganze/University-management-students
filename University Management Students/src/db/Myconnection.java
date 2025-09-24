
package db;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author josue
 */
public class Myconnection {
    private static final String username = "";
    private static final String password = "";
    private static final String dataConn = "jdbc:mysql://localhost:3306/student_management";
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataConn,username,password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
       }
        return con;
        
        }
    
    }
    

