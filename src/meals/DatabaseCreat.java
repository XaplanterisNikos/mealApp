
package meals;

/**
 *
 * @author developerTeam_EAP_PLH24
 * 
 */ 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreat {
    
    //Το String για την σύνδεση με τη βάση δεδομένων
    //Η βάση δεδομένων βρίσκεται μέσα στο φάκελο του project
    public static String connectionString = "jdbc:derby:mealDB;create=true";

    //Συνδέεται στη βάση δεδομένων και δημιουργεί πίνακα με βάση τον κώδικα
    //που έχει το String createTableSQL (αν ο πίνακας δεν υπάρχει)
    public static void createTable(String createTableSQL) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString);
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableSQL);
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Δημιουργεί τους πίνακες της βάσης δεδομένων (αν δεν υπάρχουν)
    public static void CreateDatabaseTables() {

        //String για τη δημιουργία του πίνακα meal
        String createTableMeal = "CREATE TABLE meal("
                + "mealId INT NOT NULL GENERATED ALWAYS AS IDENTITY,"
                + "mealName VARCHAR(100) NOT NULL,"
                + "mealCategory VARCHAR(50) NOT NULL,"
                + "mealCountry VARCHAR(50) NOT NULL,"
                + "mealInstructions VARCHAR(5000) NOT NULL,"
                + "mealcounter INT NOT NULL,"
                + "PRIMARY KEY (mealId))";

        //Δημιουργία του πινάκα  meal
        createTable(createTableMeal);
    }
}