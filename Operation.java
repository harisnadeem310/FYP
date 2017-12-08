package getstream;

import java.sql.ResultSet;
import getstream.GetData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operation {
    private DBConnect dbc;
    private ResultSet rs;
    
    public void Operation(){
        
    }
    public void saveData(GetData data) throws ClassNotFoundException{
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            String url = data.getURL();
            String FileName = data.getFileName();
            String AudioFile = data.getAudioLocation();
            
            Boolean dataSaved = dbc.insertDataToDB("INSERT INTO FYP_GetStream(URLs,FileName,AudioFile) VALUES('"+url+"','"+FileName+"','"+AudioFile+"')");
            dbc.disconnectFromDB();
            
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            closeDB();
        }
    }
    public void viewData(){
        try{
            dbc = new DBConnect();
            dbc.connectToDB();
            
            Boolean dataViewed = dbc.viewDataFromDB("Select FileName from FYP_GetStream");
            dbc.disconnectFromDB();
            
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void closeDB() {
        try{
        if (rs != null){rs.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}
}
}

