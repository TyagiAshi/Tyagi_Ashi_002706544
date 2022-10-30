/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Community;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author ashit
 */
public class CommunityAdminPage extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdminPage
     */
    public CommunityAdminPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        communityTextField = new javax.swing.JTextField();
        homeAdressTextField = new javax.swing.JTextField();
        communityCreateButton = new javax.swing.JButton();
        communityUpdateButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCommunityTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        pinCodeTextField = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        jlabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Community Admin");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("City");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Community");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Home Address");

        communityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityTextFieldActionPerformed(evt);
            }
        });

        communityCreateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        communityCreateButton.setText("Create");
        communityCreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                communityCreateButtonMouseClicked(evt);
            }
        });
        communityCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityCreateButtonActionPerformed(evt);
            }
        });

        communityUpdateButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        communityUpdateButton2.setText("Update");
        communityUpdateButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                communityUpdateButton2MouseClicked(evt);
            }
        });
        communityUpdateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityUpdateButton2ActionPerformed(evt);
            }
        });

        jCommunityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "Community", "HomeAddress", "ZipCode"
            }
        ));
        jCommunityTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCommunityTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jCommunityTable);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PinCode");

        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        jlabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlabel6.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pinCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(homeAdressTextField)
                    .addComponent(communityTextField)
                    .addComponent(cityTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(communityCreateButton)
                        .addGap(57, 57, 57)
                        .addComponent(communityUpdateButton2)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityCreateButton)
                    .addComponent(communityUpdateButton2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pinCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void communityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityTextFieldActionPerformed

    private void communityCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityCreateButtonActionPerformed
        // TODO add your handling code here:
        String city = cityTextField.getText();
        String community = communityTextField.getText();
        String homeAddress = homeAdressTextField.getText();
        Integer zipCode = Integer.valueOf(pinCodeTextField.getText());
        String strZipCode= Integer.toString(zipCode);
        
         if(city.isEmpty() || strZipCode.isEmpty()|| community.isEmpty() || homeAddress.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "Please Enter all fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
        } else{
            if(strZipCode.length()!= 5){
                JOptionPane.showMessageDialog(this,
                "Invalid Zip Code Entered",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
                 pinCodeTextField.setText(null);
            }
            else{
                DefaultTableModel table= (DefaultTableModel)jCommunityTable.getModel();
                table.addRow(new Object[]{city, community, homeAddress , zipCode});
            }
        cityTextField.setText("");
         communityTextField.setText("");
         homeAdressTextField.setText("");
         pinCodeTextField.setText("");
         }  
    }//GEN-LAST:event_communityCreateButtonActionPerformed

    private void communityUpdateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityUpdateButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityUpdateButton2ActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
         DefaultTableModel table= (DefaultTableModel)jCommunityTable.getModel();
        String search= searchTextField.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(table);
        jCommunityTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void communityUpdateButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_communityUpdateButton2MouseClicked
        // TODO add your handling code here:
         DefaultTableModel tb1Model= (DefaultTableModel)jCommunityTable.getModel();
         if(jCommunityTable.getSelectedRowCount()==1){
             String city= cityTextField.getText();
             String community= communityTextField.getText();
             String homeAddress=  homeAdressTextField.getText();
             Integer zipCode= Integer.valueOf(pinCodeTextField.getText());
             
            tb1Model.setValueAt(city,jCommunityTable.getSelectedRow(),0);
            tb1Model.setValueAt(community,jCommunityTable.getSelectedRow(),1);
            tb1Model.setValueAt(homeAddress,jCommunityTable.getSelectedRow(),2);
            tb1Model.setValueAt(zipCode,jCommunityTable.getSelectedRow(),3);
            
            JOptionPane.showMessageDialog(this, "Updated");    
        }else{
             if(jCommunityTable.getRowCount()==0){
                 JOptionPane.showMessageDialog(this,"Empty Table");
             }else{
                 JOptionPane.showMessageDialog(this,"Select a Single Row");
             }
         }
         
         cityTextField.setText("");
         communityTextField.setText("");
         homeAdressTextField.setText("");
         pinCodeTextField.setText("");
    }//GEN-LAST:event_communityUpdateButton2MouseClicked

    private void communityCreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_communityCreateButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_communityCreateButtonMouseClicked

    private void jCommunityTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCommunityTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb1Model= (DefaultTableModel)jCommunityTable.getModel();
        
        String city = tb1Model.getValueAt(jCommunityTable.getSelectedRow(), 0).toString();
        String community = tb1Model.getValueAt(jCommunityTable.getSelectedRow(), 1).toString();
        String homeAddress = tb1Model.getValueAt(jCommunityTable.getSelectedRow(), 2).toString();
        String zipCode = tb1Model.getValueAt(jCommunityTable.getSelectedRow(), 3).toString();
        
       cityTextField.setText(city);
        communityTextField.setText(community);
        homeAdressTextField.setText(homeAddress);
        pinCodeTextField.setText(zipCode);
      
        
    }//GEN-LAST:event_jCommunityTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton communityCreateButton;
    private javax.swing.JTextField communityTextField;
    private javax.swing.JButton communityUpdateButton2;
    private javax.swing.JTextField homeAdressTextField;
    private javax.swing.JTable jCommunityTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel6;
    private javax.swing.JTextField pinCodeTextField;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
