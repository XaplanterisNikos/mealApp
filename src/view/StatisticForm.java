
package view;


/**
 *
 * @author developerTeam_EAP_PLH24
 * 
 */


import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Element;
import meals.MealJpaController;
import model.Meal;


public class StatisticForm extends javax.swing.JFrame {

    /**
     * Creates new form StatisticForm
     */
    
     //Το μοντέλο του πίνακα 
     private   DefaultTableModel model;
    
     //Entity Manager & Controllers
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MealsPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    MealJpaController mealController = new MealJpaController(emf);
    
    
    //Constructor της φόρμας
    public StatisticForm() {
        initComponents();
        
        setTitle("Προβολή Στατιστικών και Εκτύπωση");
 
        //Κεντράρισμα της φόρμας
        setLocationRelativeTo(null);

        //Αρχικοποίηση κειμένου της ετικέτας και των δύο πλήκτρων
        jLabel1.setText("Προβολές Γευμάτων:");
        jButton1.setText("Εκτύπωση PDF");
        jButton2.setText("Επιστροφή"); 
        
        model = new DefaultTableModel();
         //Προσθέτουμε τις στήλες του μοντέλου
        model.addColumn("Γεύμα");
        model.addColumn("Κατηγορία");
        model.addColumn("Χώρα");
        model.addColumn("Συνταγή");
        model.addColumn("Προβολές");
        jTable2.setModel(model);
        
        //Προσθέτουμε το περιεχομενο της Βασης Δεδομένων
        List<Meal> list = mealController.getMealsOrderedByViews();
         for (Meal m : list){
             model.addRow(new Object[]{m.getMealname(), m.getMealcategory(), m.getMealcountry(), m.getMealinstructions(), m.getMealcounter()});
         }
        
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Προβολές Γευμάτων:");

        jButton1.setText("Εκτύπωση PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Επιστροφή");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(26, 26, 26))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(mealController.getMealsOrderedByViews().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Δεν υπάρχουν αποθηκευμένα γεύματα στη βάση δεδομένων",
                    "Μήνυμα", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            Document document = new Document(PageSize.A4.rotate());
            OutputStream outputStream = new FileOutputStream(new File("MealStatistics.pdf"));
            PdfWriter.getInstance(document, outputStream);
            document.open();
            
            //Καταχώριση της συμβολοσειράς Arial με χρήση αρχείου arial.ttf που βρίσκεται στο φάκελο του project
            FontFactory.register("arial.ttf", "Arial");

            Font font = FontFactory.getFont("Arial", "Cp1253", true);

            Paragraph par = new Paragraph("Γευμάτα που είναι αποθηκευμένα στη βάση δεδομένων:", font);

            par.setAlignment(Element.ALIGN_CENTER);
            document.add(par);
            document.add(new Paragraph("\n"));
            //Δημιουργία πίνακα με 5 στήλες
            PdfPTable table = new PdfPTable(5);

            table.addCell(new Paragraph("Γεύμα", font));
            table.addCell(new Paragraph("Κατηγορία", font));
            table.addCell(new Paragraph("Χώρα", font));
            table.addCell(new Paragraph("Συνταγή", font));
            table.addCell(new Paragraph("Προβολές", font));

            //Προσθήκη όλων των προβολών γευμάτων στον πίνακα
            for (Meal meal : mealController.getMealsOrderedByViews()) {
                table.addCell(meal.getMealname());
                table.addCell(meal.getMealcategory());
                table.addCell(meal.getMealcountry());
                table.addCell(meal.getMealname());
                table.addCell(String.valueOf(meal.getMealcounter()));
            }
            //Προσθήκη του πίνακα στο PDF
            document.add(table);

            document.close();
            outputStream.close();

            //Εμφάνιση μηνύματος για την δημιουργία αρχείου PDF
            JOptionPane.showMessageDialog(this,
                    "Δημιουργήθηκε το αρχείο MealStatistics.pdf",
                    "Επιτυχία αποθήκευσης αρχείου", JOptionPane.INFORMATION_MESSAGE);


        } catch (Exception e) {            
            JOptionPane.showMessageDialog(this,
                    "Πρόβλημα στην δημιουργία του αρχείου MealStatistics.pdf\n" + e.getMessage(),
                    "Αποτυχία αποθήκευσης αρχείου", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // Επιστρέφει στο αρχικό menu
        MainForm mf = new MainForm();
        mf.setTitle("Προβολή λίστας γευμάτων");
        mf.setLocationRelativeTo(null);
        mf.setVisible(true);
         //Κλείνουμε την αρχική φόρμα
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
