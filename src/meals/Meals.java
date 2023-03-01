
package meals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Meals {


    public static void main(String[] args) throws SQLException {
        //Δημιουργία των πινάκων της βάσης δεδομένων αν δεν υπάρχουν 
        DatabaseCreat.CreateDatabaseTables();
        
        
    }
    
}
