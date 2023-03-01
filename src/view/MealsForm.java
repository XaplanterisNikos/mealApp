
package view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import meals.MealJpaController;
import okhttp3.OkHttpClient;
import okhttp3.Request;


public class MealsForm extends javax.swing.JFrame {


    
    //Entity Manager & Controllers
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MealsPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    MealJpaController mealController = new MealJpaController(emf);
    
    public MealsForm() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Αναζήτηση Γεύματος:");

        jLabel2.setText("Κατηγορία Γεύματος:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            String meal = jTextField4.getText();
            //Το url που θα καλέσουμε
            String urlToCall = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + meal;

            //Δημιουργούμε ένα αντικείμενο OkHttpClient 
            OkHttpClient client = new OkHttpClient();

            //Δημιουργούμε ένα αντικείμενο Request με όρισμα το url που θα καλέσουμε 
            Request request = new Request.Builder().url(urlToCall).build();

            //Ξεκινάμε και ζητάμε το url και ελέγχουμε εάν μας φέρνει αποτελέσματα
            try (okhttp3.Response response = client.newCall(request).execute()) {

                if (response.isSuccessful() && response.body() != null) {

                    //Καταχωρούμε σε ένα String το αποτέλεσμα
                    String responseString = response.body().string();
                    //System.out.println(responseString);

                    //Δημιουργούμε ένα αντικείμενο GsonBuilder
                    GsonBuilder builder = new GsonBuilder();
                    builder.setPrettyPrinting();
                    Gson gson = builder.create();

                    //Πέρνουμε τα αποτελέσματα σε JsonObject 
                    JsonObject json = gson.fromJson(responseString, JsonObject.class);
                    System.out.println(json);

                    //Δημιουργούμε ένα JsonArray
                    JsonArray mealsArray = json.get("meals").getAsJsonArray();
                    System.out.println(mealsArray);

                    //Δημιουργώ ένα Model
                    DefaultComboBoxModel model = new DefaultComboBoxModel();

                    //Διαπερνάω τα meals
                    for (JsonElement jsonElement : mealsArray) {
                        JsonObject m = jsonElement.getAsJsonObject();
                        String name = m.get("strMeal").getAsString();
                        System.out.println(name);
                        model.addElement(name);
                    }
                    //Προσθέτω τα meals στο jComboBox1
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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
