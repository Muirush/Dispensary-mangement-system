/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pceaturidispensary;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import pceaturidispensary.hospital;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class Login extends javax.swing.JFrame {
public static Connection conn;
public static Connection conne;
public static Connection con;
public static int ritwa;
int attempts = 3;

    /**
     * Creates new form Login
     */
    public Login() {
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
        Jusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jpassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        forgotpassword = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("PCEA TURI DISPENSARY ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 305, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 180, 20);

        Jusername.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Jusername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(Jusername);
        Jusername.setBounds(170, 90, 290, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 170, 29);

        Jpassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Jpassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Jpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JpasswordKeyPressed(evt);
            }
        });
        getContentPane().add(Jpassword);
        Jpassword.setBounds(170, 160, 290, 40);

        login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login.setText("LogIn");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(30, 290, 120, 37);

        cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(190, 290, 130, 40);

        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(350, 290, 110, 37);

        forgotpassword.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        forgotpassword.setText("Forgot Password?");
        forgotpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(forgotpassword);
        forgotpassword.setBounds(190, 290, 130, 40);

        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Purposely made for PCEA Turi Dispensary by Simon Muiruri");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 350, 330, 14);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 34, 34, 0);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-400, -110, 940, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public Connection getConnection(){
    try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pceaturidispensary", "root", "");
            return conn;
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}
 
 public boolean checkDetails(String usr, String  pwd){
        
        try {
            conn = getConnection();
            
            PreparedStatement ps;
            ps = conn.prepareStatement("SELECT * FROM login WHERE username = ? AND password = ?");
            ps.setString(1, usr);
            ps.setString(2, pwd);
            
            ResultSet result = ps.executeQuery();
            
            return result.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String password = Jpassword.getText();
        String username = Jusername.getText();
        String usr = Jusername.getText();
        String pwd = Jpassword.getText();
        
        
        
        if(attempts !=0){
            if (checkDetails(usr, pwd))

        {
            Jusername.setText(null);
            Jpassword.setText(null);
            
            hospital Login = new hospital();
            Login.setVisible(true);
             dispose();
           
        }
       else
        {
            
            JOptionPane.showMessageDialog(null, "!Wrong Credentials!", " Error", JOptionPane.ERROR_MESSAGE);
            Jusername.setText(null);
            Jpassword.setText(null);
            
            
            attempts--;
        }
            
        }
        if(attempts == 0){
            Jusername.setText("Kindly Check");
           
            cancel.setVisible(false);
            forgotpassword.setVisible(true);
        }
       

        
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Jusername.setText(null);
        Jpassword.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void forgotpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpasswordActionPerformed
        // TODO add your handling code here:
       forgotpassword Login = new forgotpassword();
       Login.setVisible(true);
       dispose();

    }//GEN-LAST:event_forgotpasswordActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    forgotpassword.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void JpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JpasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JpasswordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Jpassword;
    private javax.swing.JTextField Jusername;
    private javax.swing.JButton cancel;
    private javax.swing.JButton exit;
    private javax.swing.JButton forgotpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
