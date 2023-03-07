
package meals;

/**
 *
 * @author developerTeam_EAP_PLH24
 * 
 */


import java.sql.SQLException;
import view.MainForm;

public class Meals {


    public static void main(String[] args) throws SQLException {
        
        /*Καλούμε την static μέθοδο CreateDatabaseTables() της κλάσης DatabaseCreate για την δημιουργία 
        της βάσης δεδομένων της εφαρμογής */
        DatabaseCreate.CreateDatabaseTables();
        
        //Δημιουργία του MAINFORM , το κεντρικό περιβάλλον εργασίας του χρήστη (GUI)
        MainForm mf = new MainForm();
        mf.setTitle("Meals App");
        mf.setLocationRelativeTo(null);
        mf.setVisible(true);
        
        
    }
    
}
