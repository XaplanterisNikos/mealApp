
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
        //Δημιουργία των πινάκων της βάσης δεδομένων αν δεν υπάρχουν 
        DatabaseCreat.CreateDatabaseTables();
        
        MainForm mf = new MainForm();
        mf.setTitle("Προβολή λίστας γευμάτων");
        mf.setLocationRelativeTo(null);
        mf.setVisible(true);
        
        
    }
    
}
