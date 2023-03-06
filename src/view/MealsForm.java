
package view;


/**
 *
 * @author developerTeam_EAP_PLH24
 * 
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.ComponentOrientation;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import meals.MealJpaController;
import model.Meal;
import okhttp3.OkHttpClient;
import okhttp3.Request;


public class MealsForm extends javax.swing.JFrame {


    
    //Δημιουργούμε αντικείμενο για Entity Manager και Controller
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MealsPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    MealJpaController mealController = new MealJpaController(emf);
    
    public MealsForm() {
        initComponents();
        
        /*στην μέθοδο showCategory() κάνουμε εμφάνιση σε ένα comboBox τις κατηγορίες γευμάτων 
          όπου μπορούμε με την επιλογή κάποιας να δούμε όλα τα γεύματα αυτής της κατηγορίας  */
        showCategory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Κατηγορίες Γευμάτων");

        jLabel2.setText("Γεύματα:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setSelectedIndex(-1);

        jButton4.setText("Αναζήτηση");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setText("Αποθήκευση");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Εμφάνιση");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Εμφάνιση");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jLabel3.setText("Γεύματα :");

        jLabel4.setText("Αναζήτηση Γεύματος / Κατηγορίας :");

        jLabel5.setText("meal ID");

        jLabel6.setText("Όνομα γεύματος:");

        jLabel7.setText("Κατηγορία γεύματος:");

        jLabel8.setText("Χώρα:");

        jLabel9.setText("Οδηγίες Παρασκευής:");

        jButton5.setText("Επεξεργασία");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Διαγραφή");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Επιστροφή");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(362, 362, 362))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(195, 195, 195))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        /*Μπορούμε να εισάγουμε ένα γεύμα ή μια κατηγορία γεύματος σε ένα textfield και να πατώντας αναζήτηση νας μας τα
        εμφανίση σε ένα comboBox όπου γίνεται και η τελική επιλογή του γεύματος*/
        
        try {
            
            String meal = jTextField4.getText();// μεταβλητή γεύμα απο την είσοδο του χρήστη
            // χρησιμοποιούμε το URL και προσθέτουμε στο PHP αρχείο το όνομα που εισήγαγε ο χρήστης για να γίνει η αναζήτηση
            String mealAppURL = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + meal; 

            // Δημιουργούμε αντικείμενο OkHttpClient
            OkHttpClient httpClient = new OkHttpClient();

             // Δημιουργούμε αντικείμενο Reguest και βάζουμε σαν όρισμα το URL
            Request request = new Request.Builder().url(mealAppURL).build();

            // Κάνουμε call request για να εμφανιστούν τα αποτελέσματα
            try (okhttp3.Response response = httpClient.newCall(request).execute()) {

                if (response.isSuccessful() && response.body() != null) {
                    String resultResponce = response.body().string(); // Μεταβλητή για το αποτέλσμα απο το responce
                    
                    //Δημιουργούμε αντικείμενο GsonBuilder
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setPrettyPrinting();
                    Gson gson = gsonBuilder.create();

                    // Παίρνουμε τα αποτελέσματα σε JsonObject και εκτυπώνουμε στην console
                    JsonObject jsonObject = gson.fromJson(resultResponce, JsonObject.class);
                    System.out.println("Console logcat jsonObject : " +jsonObject);

                   // Δημιουργούμε JsonArray και το εκτυπώνουμε στην console
                    JsonArray mealsArray = jsonObject.get("meals").getAsJsonArray();
                    System.out.println("Console logcat jsonArray : " + mealsArray);

                    // δημιουργούμε αντικείμενο DefaultComboBoxModel
                    DefaultComboBoxModel model = new DefaultComboBoxModel();

                   // Διαπερνάμε το array με for και προσθέτουμε τα δεδομένα στο model (εκτυπώνουμε τα αποτελέσματα στο console)
                    for (JsonElement jsonElement : mealsArray) {
                        JsonObject meals = jsonElement.getAsJsonObject();
                        String name = meals.get("strMeal").getAsString();
                        System.out.println("Console logcat meal name : " + name);
                        model.addElement(name);
                    }
                   
                    //Περνάμε τα δεδομένα στο comboBox
                    jComboBox1.setModel(model);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
                                            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Αποθήκευση στη βάση δεδομένων 
        
        // Απο το textfield παίρνουμε το id του γεύματος (το εκτυπώνουμε στην console)
        Integer mealId = Integer.valueOf(jTextField1.getText());
        System.out.println("Console logcat ID MEAL : " +mealId);
        
        //Δημιουργούμε ερώτημα στην βάση για έλεγχο με το findByMealid
        Query query = em.createNamedQuery("Meal.findByMealid");
        query.setParameter("mealid", mealId);
        
        //Ξεκινάμε τον έλεγχο - Εάν δεν υπάρχει στην βάση 
        if (query.getResultList().isEmpty()) {
            try {
                //Πέρνουμε τα δεδομένα από τα textField σε μεταβλητές
                String dmeal = jTextField2.getText();
                String dcategory = jTextField3.getText();
                String darea = jTextField5.getText();
                String dinstructions = jTextArea1.getText();

                //Δημιουργούμε αντικείμενο meal και Χρησιμοποιούμε τον κατασκευστή με ορίσματα τα δεδομένα απο τα textfield
                Meal meal = new Meal(mealId, dmeal, dcategory, darea, dinstructions);

                //Κάνουμε create με τον controller και στέλνουμε το αντικείμενο meal στη βάση
                mealController.create(meal);
                // Εμφανίζουμε Μήνυμα στον χρήστη για την επιτυχημένη καταχώρηση
                JOptionPane.showMessageDialog(null, "Το γεύμα  "+dmeal +" καταχωρήθηκε με επιτυχία ", "Ενημερωτικό Μήνυμα", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.out.println(e);
            }
            // Εάν υπάρχει το γεύμα στη βάση
        } else {
            String dmeal = jTextField2.getText();
            // Εμφανίζουμε Μήνυμα στον χρήστη για οτι γεύμα υπάρχει
            JOptionPane.showMessageDialog(null, "Το γεύμα "+dmeal +" υπάρχει ήδη  ", "Ενημερωτικό Μήνυμα", JOptionPane.WARNING_MESSAGE);
        }
                    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Εμφάνιση αποτελεσμάτων με βάση επιλογής απο το comboBox
        
        try {
            //Δημιουργούμε ενα query με βάση το id του γεύματος
            Query query = em.createNamedQuery("Meal.findByMealname");
            query.setParameter("mealname", jComboBox1.getSelectedItem().toString());

            // Κάνουμε έλεγχο αν υπάρχουν δεδομένα στην βάση
            if (query.getResultList().isEmpty()) {
                try {
                    String meal = jComboBox1.getSelectedItem().toString();// μεταβλητή γεύμα απο την επιλογή του χρήστη
                   // χρησιμοποιούμε το URL και προσθέτουμε στο PHP αρχείο το όνομα που επέλεξε ο χρήστης για να γίνει η αναζήτηση
                    String mealAppURL = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + meal;

                 // Δημιουργούμε αντικείμενο OkHttpClient
                    OkHttpClient httpClient = new OkHttpClient();
                  // Δημιουργούμε αντικείμενο Reguest και βάζουμε σαν όρισμα το URL
                    Request request = new Request.Builder().url(mealAppURL).build();

                   // Ελέγχουμε αν θα μας επιστραφεί αποτέλεσμα 
                    try (okhttp3.Response response = httpClient.newCall(request).execute()) {

                        if (response.isSuccessful() && response.body() != null) {
                            String resultResponce = response.body().string();// Μεταβλητή για το αποτέλσμα απο το responce
                          
                            //Δημιουργούμε αντικείμενο GsonBuilder
                            GsonBuilder gsonBuilder = new GsonBuilder();
                            gsonBuilder.setPrettyPrinting();
                            Gson gson = gsonBuilder.create();
                            
                            // Παίρνουμε τα αποτελέσματα σε JsonObject και εκτυπώνουμε στην console
                            JsonObject jsonObject = gson.fromJson(resultResponce, JsonObject.class);
                            System.out.println("Console logcat jsonObject : " +jsonObject);

                          
                            // Δημιουργούμε JsonArray και το εκτυπώνουμε στην console
                            JsonArray mealsArray = jsonObject.get("meals").getAsJsonArray();
                            System.out.println("Console logcat jsonArray : " + mealsArray);

                          // Διαπερνάμε το array με for και προσθέτουμε τα δεδομένα σε κάθε textfiled 
                            for (JsonElement jsonElement : mealsArray) {
                                JsonObject meals = jsonElement.getAsJsonObject();
                              
                                String idMeal = meals.get("idMeal").getAsString();
                                jTextField1.setText(idMeal);
                                String nameMeal = meals.get("strMeal").getAsString();
                                jTextField2.setText(nameMeal);
                                String categoryMeal = meals.get("strCategory").getAsString();
                                jTextField3.setText(categoryMeal);
                                String countryMeal = meals.get("strArea").getAsString();
                                jTextField5.setText(countryMeal);
                                String instructionsMeal = meals.get("strInstructions").getAsString();
                                jTextArea1.setText(instructionsMeal);
                                jTextArea1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                                jTextArea1.setCaretPosition(0);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } 
            // Το γεύμα βρέθηκε στην βάση δεδομένων
            else {
               // Βρίσκουμε την εγγφραφή με αναζήτηση στη βάση
                Meal meal = (Meal) query.getSingleResult();
               
                //Καλούμε την addMealCounter() για να προσθέσει στον μετρητή την προβολή
                meal.addMealCounter();
               // Ενημερώνουμε τη βάση
                mealController.edit(meal);
                
                 // Προσθέτουμε τα δεδομένα σε κάθε textfiled 
                String idMeal = meal.getMealid().toString();
                jTextField1.setText(idMeal);
                String nameMeal = meal.getMealname();
                jTextField2.setText(nameMeal);
                String categoryMeal = meal.getMealcategory();
                jTextField3.setText(categoryMeal);
                String countryMeal = meal.getMealcountry();
                jTextField5.setText(countryMeal);
                String instructionsMeal = meal.getMealinstructions();
                jTextArea1.setText(instructionsMeal);
                jTextArea1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                jTextArea1.setCaretPosition(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
                                           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Εμφάνιση των γευμάτων απο τις κατηγορίες
        
        String category = jComboBox2.getSelectedItem().toString();
        
        try {
           // χρησιμοποιούμε το URL και προσθέτουμε στο PHP αρχείο το όνομα της κατηγορίας γευμάτων
            String mealAppURL = "https://www.themealdb.com/api/json/v1/1/filter.php?c="+category;

           // Δημιουργούμε αντικείμενο OkHttpClient
            OkHttpClient httpClient = new OkHttpClient();
          // Δημιουργούμε αντικείμενο Reguest και βάζουμε σαν όρισμα το URL
            Request request = new Request.Builder().url(mealAppURL).build();

           // Ελέγχουμε αν θα μας επιστραφεί αποτέλεσμα 
            try (okhttp3.Response response = httpClient.newCall(request).execute()) {

                if (response.isSuccessful() && response.body() != null) {
                    String resultResponce = response.body().string(); // Μεταβλητή για το αποτέλσμα απο το responce
                 
                    //Δημιουργούμε αντικείμενο GsonBuilder
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setPrettyPrinting();
                    Gson gson = gsonBuilder.create();

                    // Παίρνουμε τα αποτελέσματα σε JsonObject και εκτυπώνουμε στην console
                    JsonObject jsonObject = gson.fromJson(resultResponce, JsonObject.class);
                    System.out.println("Console logcat jsonObject : " +jsonObject);

                    // Δημιουργούμε JsonArray και το εκτυπώνουμε στην console
                    JsonArray mealsArray = jsonObject.get("meals").getAsJsonArray();
                     System.out.println("Console logcat jsonArray : " + mealsArray);

                    // δημιουργούμε αντικείμενο DefaultComboBoxModel
                    DefaultListModel model = new DefaultListModel();

                    // Διαπερνάμε το array με for και προσθέτουμε τα δεδομένα στο model (εκτυπώνουμε τα αποτελέσματα στο console)
                    for (JsonElement jsonElement : mealsArray) {
                        JsonObject meals = jsonElement.getAsJsonObject();
                        String categoryName = meals.get("strMeal").getAsString();
                        System.out.println("Console logcat meal name : " + categoryName);
                        model.addElement(categoryName);
                    }
                    
                   //Προσθέτουμε τις εγγραφές στο List
                    jList1.setModel(model);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
                                            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        // Επεξεργασία δεδομένων γεύματος
        
        // Εμφανίζουμε μύνημα στο χρήστη με επιλογές YES / NO για την επεξεργασία εγγραφής
        int epilogi = JOptionPane.showConfirmDialog(null, "Επεξεργασία εγγραφής γεύματος " +  jTextField2.getText() + ". Είστε σίγουρος/η ;",
                "Επεξεργασία Δεδομένων", JOptionPane.YES_NO_OPTION);
        
            //Εάν επιλέξει Yes   
        if (epilogi == JOptionPane.YES_OPTION) {
            try {
                //Αποθηκεύουμε σε μεταβλητές τις όποιες αλλαγές έχουν γίνει απο τα textfield
                Integer idmeal = Integer.valueOf(jTextField1.getText());
                String nameMeal = jTextField2.getText();
                String categoryMeal = jTextField3.getText();
                String countryMeal = jTextField5.getText();
                String instructionsMeal = jTextArea1.getText();
                
                 //Δημιουργούμε αντικείμενο meal και Χρησιμοποιούμε τον κατασκευστή με ορίσματα τα δεδομένα απο τα textfield
                Meal meal = new Meal(idmeal, nameMeal, categoryMeal, countryMeal, instructionsMeal);
                // Ενημερώνουμε τη βάση
                mealController.edit(meal);

                //Εμφανίζουμε μήνυμα στο χρήστη για την επιτυχία της επεξεργασίας
                JOptionPane.showMessageDialog(null, "Το γεύμα τροποποιήθηκε", "Ενημερωτικό Μήνυμα",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                System.out.println(e);
                //Εάν σε περίπτωση το textfiled είναι null τότε εμφανίζουμε μήνυμα 
                JOptionPane.showMessageDialog(null, "Επιλέξτε ένα γεύμα ", "Ενημερωτικό Μήνυμα",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Επιστρέφει στο αρχικό menu
        MainForm mf = new MainForm();
        mf.setTitle("Προβολή λίστας γευμάτων");
        mf.setLocationRelativeTo(null);
        mf.setVisible(true);
         //Κλείνουμε την αρχική φόρμα
        this.dispose();  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Επιλογή για διαγραφή γεύματος απο την βάση 
        
        // Εμφανίζουμε μύνημα στο χρήστη με επιλογές YES / NO για την διαγραφή εγγραφής
        int epilogi = JOptionPane.showConfirmDialog(null, "θα γίνει διαγραφή το γεύμα " + jTextField2.getText() + ". Είστε σίγουρος/η ;",
                "Διαγραφή Γεύματος", JOptionPane.YES_NO_OPTION);
        //Εάν επιλέξει Yes
        if (epilogi == JOptionPane.YES_OPTION) {
            try {
                tx.begin();
                //Αποθηκεύουμε το id σε μεταβλητή
                Integer mealId = Integer.valueOf(jTextField1.getText());
              
                //Δημιουργούμε query delete με το mealid
                Query query = em.createQuery("DELETE FROM Meal m WHERE m.mealid = :mealid");
                query.setParameter("mealid", mealId).executeUpdate();
                
                //εκτελούμε
                tx.commit();
                //Εμφανίζουμε μήνυμα στο χρήστη οτι η διαγραφή ολοκληρώθηκε
                JOptionPane.showMessageDialog(null, "Το " + jTextField2.getText() + " γεύμα διαγράφηκε με επιτυχία ", "Διαγραφή Γεύματος",
                        JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                System.out.println(e);
                //Εάν σε περίπτωση το textfiled είναι null τότε εμφανίζουμε μήνυμα 
                JOptionPane.showMessageDialog(null, "Επιλέξτε ένα γεύμα ", "Ενημερωτικό Μήνυμα",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

              
    }//GEN-LAST:event_jButton6ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void showCategory() {
        // Εμφάνιση κατηγοριών γευμάτων
        
        try {
            // χρησιμοποιούμε το URL με το αρχείο categories.php
            String mealAppURL = "https://www.themealdb.com/api/json/v1/1/categories.php";

             // Δημιουργούμε αντικείμενο OkHttpClient
            OkHttpClient httpClient = new OkHttpClient();
            // Δημιουργούμε αντικείμενο Reguest και βάζουμε σαν όρισμα το URL
            Request request = new Request.Builder().url(mealAppURL).build();

          // Ελέγχουμε αν θα μας επιστραφεί αποτέλεσμα 
            try (okhttp3.Response response = httpClient.newCall(request).execute()) {

                if (response.isSuccessful() && response.body() != null) {
                    String resultResponce = response.body().string(); // Μεταβλητή για το αποτέλσμα απο το responce
                  
                     //Δημιουργούμε αντικείμενο GsonBuilder
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setPrettyPrinting();
                    Gson gson = gsonBuilder.create();

                   // Παίρνουμε τα αποτελέσματα σε JsonObject και εκτυπώνουμε στην console
                    JsonObject jsonObject = gson.fromJson(resultResponce, JsonObject.class);
                    System.out.println("Console logcat jsonObject : " +jsonObject);

                   // Δημιουργούμε JsonArray και το εκτυπώνουμε στην console
                    JsonArray categoriesArray = jsonObject.get("categories").getAsJsonArray();
                    System.out.println("Console logcat jsonArray : " + categoriesArray);

                   // δημιουργούμε αντικείμενο DefaultComboBoxModel
                    DefaultComboBoxModel model = new DefaultComboBoxModel();

                    // Διαπερνάμε το array με for και προσθέτουμε τα δεδομένα στο model (εκτυπώνουμε τα αποτελέσματα στο console)
                    for (JsonElement jsonElement : categoriesArray) {
                        JsonObject meal = jsonElement.getAsJsonObject();
                        String categoryName = meal.get("strCategory").getAsString();
                        System.out.println("Console logcat meal name : " + categoryName);
                        model.addElement(categoryName);
                    }
                    
                   //Προσθέτουμε τις εγγραφές στο comboBox
                    jComboBox2.setModel(model);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }

   
    
}
