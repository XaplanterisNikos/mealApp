/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.ComponentOrientation;



/**
 *
 * @author developerTeam_EAP_PLH24
 * 
 */
public class InfoForm extends javax.swing.JFrame {

    /**
     * Creates new form InfoForm
     */
    public InfoForm() {
        initComponents();
        allText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Επιστροφή");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // Επιστρέφει στο αρχικό menu
        MainForm mf = new MainForm();
        mf.setTitle("Προβολή λίστας γευμάτων");
        mf.setLocationRelativeTo(null);
        mf.setVisible(true);
         //Κλείνουμε την αρχική φόρμα
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void allText() {
        
       String infoText = "mealsApp ver 1.0.1 2023\n"
               + "Ομαδική Εργασία Ε.Α.Π. ΠΛΗ24\n"
               + "Κ-Σ ΑΔΑΜΟΠΟΥΛΟΣ ΔΙΟΝΥΣΙΟΣ\n"
               + "Ομάδα Εργασίας:\nΖερβογιάννη Χριστίνα - Μπίλλιαρη Ελένη -Ζραφκόπουλος Συμεών - Ξαπλαντέρης Νικόλαος\n\n"
               + "Με την εφαρμογή mealsApp μπορούμε να αναζητήσουμε γεύματα απο την ιστοσελίδα\n"
               + " https://themealdb.com/ και να αποθηκεύσουμε τις επιλογές μας σε μια τοπική βάση δεδομένων.\n"
               + "Η εφαρμογή μπορεί να καταγράψει τις επιλογές μας και να μας τις εμφανίσει ανάλογα με το πλήθος των\n"
               + "επιλογών μας(ανά γεύμα), να αποθηκεύσει τις επιλογές μας , να τις διαγράψει και τέλος να τις επεξεργαστεί.\n\n"
               + "--------------------------------------------------------------------------------------------------------------------------------------------\n"
               + "Απο το κεντρικό μενού ο χρήστης μπορεί να επιλέξει :\n\n"
               + "1. Προβολή Γευμάτων \n"
               + "2. Προβολή Στατιστικών και Εκτύπωση\n"
               + "3. Πληροφορίες\n"
               + "4. Έξοδος\n"
               + "--------------------------------------------------------------------------------------------------------------------------------------------\n"
               + "\n"
               + "Η προβολή γευμάτων δίνει τις επιλογές στον χρήστη :\n"
               + "1.Να επιλέξει απο τις κατηγορίες των γευμάτων και να δεί όλα τα γέυματα.\n"
               + "2.Να εισάγει ο χρήστης είτε την κατηγορία είτε το γεύμα και να του εμφανίσει \n"
               + "όλα τα δεδομένα του γεύματος.\n"
               + "3.Να αποθηκεύσει το γεύμα στην βάση δεδομένων.\n"
               + "4.Να διαγράψει το γεύμα απο την βάση δεδομένων.\n"
               + "5.Να τροποποιήσει τα δεδομένα του γεύματος και να κάνει εκ νέου αποθήκευση.\n"
               + "\n"
               + "--------------------------------------------------------------------------------------------------------------------------------------------\n"
               + "\n"
               + "Η Προβολή Στατιστικών και Εκτύπωση δίνει τις επιλογές στον χρήστη :\n"
               + "1.Να μπορεί να ελέγξει ο χρήστης αν η βάση έχει δεδομένα.\n"
               + "2.Να δει πόσες φορές έχει επιλέξει κάποιο γεύμα.\n"
               + "3.Να εκτυπώσει σε μορφή pdf τα αποτελέσματα των επιλογών του.\n"
               + "\n"
               + "";
       
       
       
       
       jLabel1.setText("mealsAPP");
       jLabel2.setText("3η Εργασία ΠΛΗ24");
       jTextArea1.setText(infoText);
       jTextArea1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
       jTextArea1.setCaretPosition(0);
               
    
    }
}
