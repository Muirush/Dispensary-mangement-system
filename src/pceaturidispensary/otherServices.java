/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pceaturidispensary;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class otherServices extends javax.swing.JFrame {

    /**
     * Creates new form otherServices
     */
    public otherServices() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        ServiceName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        receipt = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 550));
        setPreferredSize(new java.awt.Dimension(900, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PCEA TURI DISPENSARY LABORATORY SERVICES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 20, 390, 17);

        price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price);
        price.setBounds(273, 111, 163, 30);

        ServiceName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ServiceName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ServiceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceNameActionPerformed(evt);
            }
        });
        getContentPane().add(ServiceName);
        ServiceName.setBounds(28, 111, 163, 30);

        screen.setColumns(20);
        screen.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        screen.setRows(5);
        jScrollPane1.setViewportView(screen);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(463, 111, 370, 330);

        receipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        receipt.setText("RECEIPT");
        receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptActionPerformed(evt);
            }
        });
        getContentPane().add(receipt);
        receipt.setBounds(87, 227, 190, 40);

        print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(664, 459, 110, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ENTER PRICE OF THE SERVICE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 90, 250, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ENTER SERVICE NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 170, 17);

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(480, 460, 100, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(80, 460, 100, 40);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-10, 0, 940, 900);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        //price.setText(selector.getSelectedItem().toString());

        //System.out.prinln(q);

        //       String medname = display.getSelectedItem().toString();
        //       int q_text = Integer.parseInt(medquantity.getText());
        //
        //       int newQ = getmedicine(medname) - q_text;
        //       updateMedicine(newQ, medname);
        //       int costi = getprice(medname)*q_text;
        //       String testa = Integer.toString(costi);
        //       screen_display.setText(testa);

        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void ServiceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiceNameActionPerformed

    private void receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptActionPerformed
        screen.setText("*******************************************\n");
        screen.setText(screen.getText()+ "\t *PCEA TURI DISPENSARY*\n");
        screen.setText(screen.getText()+ "*******************************************\n");
        java.util.Date obj = new java.util.Date();
        String date = obj.toString();
        screen.setText(screen.getText()+"\n\t" +date+"\n\n");
        screen.setText(screen.getText()+"\t Service offered:" +ServiceName.getText()+"\n");
        screen.setText(screen.getText()+"\t Total cost:" + "Ksh" +price.getText()+"\n");
        screen.setText(screen.getText()+"\t\t Official Stamp \n");
        // TODO add your handling code here:
    }//GEN-LAST:event_receiptActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        if(screen.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Screen is empty", "error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
            screen.print();

        }catch(Exception exec){

        }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        screen.setText("*******************************************\n");
        screen.setText(screen.getText()+ "\t *PCEA TURI DISPENSARY*\n");
        screen.setText(screen.getText()+ "*******************************************\n");
        java.util.Date obj = new java.util.Date();
        String date = obj.toString();
        screen.setText(screen.getText()+"\n\t" +date+"\n\n");
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        screen.setText("");
        price.setText("");
        ServiceName.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       hospital  otherServices = new hospital();
       otherServices.setVisible(false);
       dispose();
            // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(otherServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(otherServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(otherServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(otherServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new otherServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ServiceName;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JButton receipt;
    private javax.swing.JTextArea screen;
    // End of variables declaration//GEN-END:variables
}
