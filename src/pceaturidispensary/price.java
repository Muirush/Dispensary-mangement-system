/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pceaturidispensary;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class price extends javax.swing.JFrame {

    /**
     * Creates new form price
     */
    public price() {
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
        selector = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("SELECT MEDICINE YOU WANT TO MODIFY ITS PRICE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 40, 340, 30);

        selector.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });
        getContentPane().add(selector);
        selector.setBounds(20, 140, 180, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("PRICE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 110, 90, 16);

        quantity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(quantity);
        quantity.setBounds(260, 140, 180, 50);

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(210, 240, 120, 50);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 60, 40);

        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Purposely made for PCEA Turi Dispensary by Simon Muiruri");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 350, 320, 14);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-260, -260, 940, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed

    }//GEN-LAST:event_selectorActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(quantity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The quantity cannot be empty, Please Fill", "Empty blank!", JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pceaturidispensary" , "root", "");
            PreparedStatement ps;
//           ps = conn.prepareStatement("UPDATE login SET username = ? , password = ?" );
//            ps.setString(1, nusername);
//            ps.setString(2, npassword);
            String sql =  "update  pharmarcy set price = ? where name = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            
            try{
                int x = Integer.parseInt(quantity.getText());
                if(x <= 0){
                    JOptionPane.showMessageDialog(null, "Value too low","Error", JOptionPane.ERROR_MESSAGE);
                    
                }
                else{
                    stmt.setInt(1, x);
                }
                
                
            }
            catch(NumberFormatException exe){
                JOptionPane.showMessageDialog(null, "Please Check the  Quantity", "Error", JOptionPane.ERROR_MESSAGE);
            }
            String value = selector.getSelectedItem().toString();
            stmt.setString(2, value);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved", "success", JOptionPane.INFORMATION_MESSAGE);
            pharmarcy price = new pharmarcy();
            price.setVisible(true);
            dispose();
        }catch(SQLException exe){
            JOptionPane.showMessageDialog(null, exe);
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
           Connection conn;
           Statement st;
           ResultSet rs;
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pceaturidispensary" , "root", "");
            st = conn.createStatement();
            String s = "select * from pharmarcy ORDER BY id DESC";
            rs = st.executeQuery(s);
            while(rs.next()){
                selector.addItem(rs.getString(2));
            }
            
            
        }catch(SQLException e){
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new price().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField quantity;
    private javax.swing.JComboBox<String> selector;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
