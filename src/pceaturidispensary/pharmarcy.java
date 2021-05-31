/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pceaturidispensary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class pharmarcy extends javax.swing.JFrame {

    /**
     * Creates new form pharmarcy
     */
    public pharmarcy() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        medicinetable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        setprice = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        medicinetable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        medicinetable.setForeground(new java.awt.Color(0, 0, 255));
        medicinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "quantity", "price", "time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicinetable.setMinimumSize(new java.awt.Dimension(600, 0));
        medicinetable.setRowHeight(100);
        jScrollPane1.setViewportView(medicinetable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 86, 1310, 570);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 10, 90, 40);

        setprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        setprice.setText("SET PRICE");
        setprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpriceActionPerformed(evt);
            }
        });
        getContentPane().add(setprice);
        setprice.setBounds(590, 10, 140, 40);

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(900, 10, 150, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 120, 70);

        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Purposely made for PCEA Turi Dispensary by Simon Muiruri");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 660, 410, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\pceaturidispensary\\image\\stethescope.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-400, -110, 1750, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void showtable(){
    try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pceaturidispensary" , "root", "");
            PreparedStatement ps = conn.prepareStatement("select * from pharmarcy ORDER BY id DESC");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)medicinetable.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object obj[] = {rs.getString("name"),  rs.getInt("quantity"),rs.getInt("price"), rs.getString("time")};
                tm.addRow(obj);
            }
        }
        catch(Exception ex){
             JOptionPane.showMessageDialog(this, ex);
        }
}
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         showtable();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void setpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setpriceActionPerformed
        price pharmarcy = new price();
        pharmarcy.setVisible(true);
       
        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_setpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hospital pharmarcy = new hospital();
        pharmarcy.setVisible(false);
        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row = medicinetable.getSelectedRow();
        String cell = medicinetable.getModel().getValueAt(row, 0).toString();
        String sql = "DELETE from pharmarcy where id = " +cell;
        try{
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pceaturidispensary" , "root", "");
         PreparedStatement   stmt = conn.prepareStatement(sql);
             stmt.execute();
             JOptionPane.showMessageDialog(null, "Medicine deleted successfully");
             showtable();
        }
        catch (SQLException exe){
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(pharmarcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmarcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmarcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmarcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmarcy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicinetable;
    private javax.swing.JButton setprice;
    // End of variables declaration//GEN-END:variables
}
