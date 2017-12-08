package getstream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBConnect {
    private  Statement stmt = null;
    private  Connection connection ;   
    
    public DBConnect(){  }

    public void connectToDB() throws SQLException, ClassNotFoundException{
        try {
          
            System.out.println("op...");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;user=FinalYearProject;password=fyp007017061;" +
            "databaseName=CapturedStreamContent;";
            
            connection = DriverManager.getConnection(connectionUrl);
            
            System.out.println("Connected database successfully...");
            java.sql.Statement stmt=connection.createStatement();
            
        } catch(SQLException se){System.out.println(se.getMessage());}
          
     }

    
    public void disconnectFromDB(){

    try{
       // if (rs != null){rs.close();}
        if (stmt != null){stmt.close();}
        if (connection != null){connection.close();}
    }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to close connection");
        }
    }

    public boolean insertDataToDB(String query)
     {
        try
        {
            java.sql.Statement stmt=connection.createStatement();
            stmt.executeUpdate(query);
            return true;
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to Insert Data");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
     }
    public boolean viewDataFromDB(String query)
     {
        try
        {
            java.sql.Statement stmt=connection.createStatement();
            stmt.executeUpdate(query);
            return true;
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Unable to View Data");
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
     }
}
