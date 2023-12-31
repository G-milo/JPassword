/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javapasswd;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtconfirmpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        passchk = new javax.swing.JCheckBox();
        passchk2 = new javax.swing.JCheckBox();
        enterBtn = new javax.swing.JButton();
        Lchar = new javax.swing.JLabel();
        Lnumb = new javax.swing.JLabel();
        LSpechars = new javax.swing.JLabel();
        LUppercase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(209, 65, 164));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fill up the required information to create your password");

        jPanel2.setBackground(new java.awt.Color(229, 214, 227));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel3.setText("Password:");

        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassMouseClicked(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jLabel4.setText("Confirm Password:");

        passchk.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        passchk.setText("Show Password");
        passchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passchkActionPerformed(evt);
            }
        });

        passchk2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        passchk2.setText("Show Password");
        passchk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passchk2ActionPerformed(evt);
            }
        });

        enterBtn.setBackground(new java.awt.Color(204, 0, 204));
        enterBtn.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        enterBtn.setForeground(new java.awt.Color(255, 255, 255));
        enterBtn.setText("ENTER");
        enterBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enterBtn.setBorderPainted(false);
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        Lchar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Lchar.setForeground(new java.awt.Color(255, 0, 0));
        Lchar.setText("*up to 6 - 8 characters");

        Lnumb.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Lnumb.setForeground(new java.awt.Color(255, 0, 0));
        Lnumb.setText("*atleast 1 number");

        LSpechars.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LSpechars.setForeground(new java.awt.Color(255, 0, 0));
        LSpechars.setText("*atleast 1 special character");

        LUppercase.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LUppercase.setForeground(new java.awt.Color(255, 0, 0));
        LUppercase.setText("*atleast 1 uppercase letter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtconfirmpass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Lchar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(LUppercase)
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lnumb)
                                    .addComponent(LSpechars))
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passchk)
                            .addComponent(passchk2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passchk, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lchar)
                    .addComponent(LSpechars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LUppercase)
                    .addComponent(Lnumb))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passchk2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passchk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passchk2ActionPerformed
        if(passchk2.isSelected()) {
            txtconfirmpass.setEchoChar((char)0);
        }else {
            txtconfirmpass.setEchoChar('*');
        }
    }//GEN-LAST:event_passchk2ActionPerformed

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        String password = txtpass.getText();
        String upperCaseChars = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[@,#,$,*,%,',/,.,:,&,!,?].*)";
        
        if(password.matches(upperCaseChars)){
            LUppercase.setForeground(Color.BLUE);            
        }
        if(!password.matches(upperCaseChars)){
            LUppercase.setForeground(Color.red);            
        }
        if(password.matches(numbers)) {
            Lnumb.setForeground(Color.BLUE);
        }
        if(!password.matches(numbers)) {
            Lnumb.setForeground(Color.red);
        }
        if(password.matches(specialChars)) {
            LSpechars.setForeground(Color.BLUE);
        }
        if(!password.matches(specialChars)) {
            LSpechars.setForeground(Color.red);
        }
        if(password.length()>5 && password.length()<9){
            Lchar.setForeground(Color.BLUE);
        }
        if(password.length()>8 || password.length() < 6){
            Lchar.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtpassKeyReleased

    private void passchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passchkActionPerformed
        if(passchk.isSelected()) {
            txtpass.setEchoChar((char)0);
        }else {
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_passchkActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        String name = txtname.getText();
        String password = txtpass.getText();
        String confirm = txtconfirmpass.getText();
        String upperCaseChars = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[@,#,$,*,%,',/,.,:,&,!,?].*)";
        
        if(name.isEmpty() || password.isEmpty() || confirm.isEmpty()){
            JOptionPane.showMessageDialog(null,
                   "Please Input all Data Required!",
                   "Try Again",
                   JOptionPane.ERROR_MESSAGE);
        }else if(password.length()<6 || password.length()>8){
            JOptionPane.showMessageDialog(null,
                   "Password must be 6 up to 8 characters!",
                   "Please Try Again",
                   JOptionPane.ERROR_MESSAGE);            
        }else if(!confirm.matches(password)){
            JOptionPane.showMessageDialog(null,
                   "Password not matched!",
                   "Please Try Again",
                   JOptionPane.ERROR_MESSAGE);
            txtconfirmpass.setText("");
        }else if(!password.matches(upperCaseChars) || !password.matches(numbers) || !password.matches(specialChars)){
            JOptionPane.showMessageDialog(null,
                   "Please follow the required Password format!",
                   "Try Again",
                   JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,
                   "Hello " + name + " your Password is created successfully!",
                   "Password Saved",
                   JOptionPane.INFORMATION_MESSAGE);
            
            txtname.setText("");
            txtpass.setText("");
            txtconfirmpass.setText("");
            passchk.setSelected(false);
            passchk2.setSelected(false);
            LUppercase.setForeground(Color.red);
            Lnumb.setForeground(Color.red);
            LSpechars.setForeground(Color.red);
            Lchar.setForeground(Color.red);
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void txtpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseClicked
       
    }//GEN-LAST:event_txtpassMouseClicked

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
      
    }//GEN-LAST:event_txtpassKeyTyped

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        
    }//GEN-LAST:event_txtpassKeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LSpechars;
    private javax.swing.JLabel LUppercase;
    private javax.swing.JLabel Lchar;
    private javax.swing.JLabel Lnumb;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox passchk;
    private javax.swing.JCheckBox passchk2;
    private javax.swing.JPasswordField txtconfirmpass;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
