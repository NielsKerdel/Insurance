/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.avans.ivh5.client.presentation;

import edu.avans.ivh5.client.businesslogic.LoginManager;

/**
 *
 * @author startklaar
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUII
     */
    private final LoginManager loginManager;
    
    public LoginGUI() {
        loginManager = new LoginManager();
        this.setVisible(true);
        initComponents();
        errorLabel.setVisible(false);
        
        loginButtonActionPerformed();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        gebruikersnaamLabel = new javax.swing.JLabel();
        wachtwoordLabel = new javax.swing.JLabel();
        gebruikersnaamField = new javax.swing.JTextField();
        wachtwoordField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginLabel.setText("Log in");

        gebruikersnaamLabel.setText("Gebruikersnaam");

        wachtwoordLabel.setText("Wachtwoord");

        gebruikersnaamField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gebruikersnaamFieldActionPerformed(evt);
            }
        });

        wachtwoordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wachtwoordFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Inloggen");

        errorLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gebruikersnaamLabel)
                            .addComponent(wachtwoordLabel)
                            .addComponent(loginLabel))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorLabel)
                            .addComponent(gebruikersnaamField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wachtwoordField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gebruikersnaamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gebruikersnaamLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wachtwoordLabel)
                    .addComponent(wachtwoordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed() {
        // TODO add your handling code here:
        loginButton.addActionListener(e -> {
            errorLabel.setVisible(false);
            
            if (gebruikersnaamField.getText().length() == 0 || wachtwoordField.getText().length() == 0) {
                errorLabel.setText("naam en/of wachtwoord is leeg");
                errorLabel.setVisible(true);
            } else if (loginManager.login(gebruikersnaamField.getText(), wachtwoordField.getText())) {
                System.out.println("Je bent succesvol ingelogt");
                MainGUI mainGUI = new MainGUI();
                mainGUI.setVisible(true);
            } else {
                errorLabel.setText("inloggegevens zijn onjuist");
                errorLabel.setVisible(true);
            }
        });
    }

    private void gebruikersnaamFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gebruikersnaamFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gebruikersnaamFieldActionPerformed

    private void wachtwoordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wachtwoordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wachtwoordFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField gebruikersnaamField;
    private javax.swing.JLabel gebruikersnaamLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField wachtwoordField;
    private javax.swing.JLabel wachtwoordLabel;
    // End of variables declaration//GEN-END:variables
}
