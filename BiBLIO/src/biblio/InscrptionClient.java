
package biblio;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class InscrptionClient extends javax.swing.JFrame {
  BufferedReader bre;
  PrintWriter pwe;
    public InscrptionClient() {
      try {
          initComponents();
          setLocationRelativeTo(null);
          Acceuil.br=new BufferedReader(new InputStreamReader(Acceuil.accueil.getInputStream()));
          bre=Acceuil.br;
          Acceuil.pw=new PrintWriter(Acceuil.accueil.getOutputStream());
          pwe=Acceuil.pw;
      } catch (IOException ex) {
          Logger.getLogger(InscrptionClient.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cni = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        adre = new javax.swing.JTextField();
        teleph = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filiere = new javax.swing.JTextField();
        ufr = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btn_valider = new javax.swing.JButton();
        annuler1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENUE DANS VOTRE BIBLIOTECHQUE");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Books_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        cni.setBackground(new java.awt.Color(153, 0, 51));
        cni.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cni.setForeground(new java.awt.Color(255, 255, 255));
        cni.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        cni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cniActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("Num CNI     :");

        jLabel13.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("Adresse        :");

        adre.setBackground(new java.awt.Color(153, 0, 51));
        adre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        adre.setForeground(new java.awt.Color(255, 255, 255));
        adre.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        adre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adreActionPerformed(evt);
            }
        });

        teleph.setBackground(new java.awt.Color(153, 0, 51));
        teleph.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        teleph.setForeground(new java.awt.Color(255, 255, 255));
        teleph.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        teleph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("Telephone :");

        jLabel12.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("Filiere   :");

        filiere.setBackground(new java.awt.Color(153, 0, 51));
        filiere.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        filiere.setForeground(new java.awt.Color(255, 255, 255));
        filiere.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        filiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filiereActionPerformed(evt);
            }
        });

        ufr.setBackground(new java.awt.Color(153, 0, 51));
        ufr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ufr.setForeground(new java.awt.Color(255, 255, 255));
        ufr.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        ufr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufrActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("UFR  :");

        code.setBackground(new java.awt.Color(153, 0, 51));
        code.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        code.setForeground(new java.awt.Color(255, 255, 255));
        code.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("Code Permanant :");

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("email     :");

        email.setBackground(new java.awt.Color(153, 0, 51));
        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        nom.setBackground(new java.awt.Color(153, 0, 51));
        nom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("Nom       :");

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Prenom    :");

        prenom.setBackground(new java.awt.Color(153, 0, 51));
        prenom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ins.jpg"))); // NOI18N

        pass.setBackground(new java.awt.Color(153, 0, 51));
        pass.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("Password      :");

        btn_valider.setBackground(new java.awt.Color(153, 0, 51));
        btn_valider.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        btn_valider.setForeground(new java.awt.Color(255, 255, 255));
        btn_valider.setText("Valider");
        btn_valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_validerMouseClicked(evt);
            }
        });
        btn_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validerActionPerformed(evt);
            }
        });

        annuler1.setBackground(new java.awt.Color(153, 0, 51));
        annuler1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        annuler1.setForeground(new java.awt.Color(255, 255, 255));
        annuler1.setText("Annuler");
        annuler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annuler1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ufr, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filiere, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teleph, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cni, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addComponent(annuler1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(btn_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(ufr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(filiere, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(teleph, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annuler1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_valider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cniActionPerformed

    private void adreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adreActionPerformed

    private void telephActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephActionPerformed

    private void filiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filiereActionPerformed

    private void ufrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufrActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void btn_validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_validerMouseClicked
        // TODO add your handling code here:
        System.out.println("bol"); 
    }//GEN-LAST:event_btn_validerMouseClicked

    private void btn_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validerActionPerformed
        // TODO add your handling code here:
  pwe.println("inscription/"+prenom.getText()+"&"+nom.getText()+"+"+email.getText()+"^"+code.getText()+"$"+ufr.getText()+"#"+filiere.getText()
        +"|"+teleph.getText()+"-"+adre.getText()+" "+cni.getText()+"*"+pass.getText());
        pwe.flush();
      
        JOptionPane.showMessageDialog(this," Bravo votre inscription a été éffectuée avec succés!!");
        vider();
    }//GEN-LAST:event_btn_validerActionPerformed
  public void vider()
  {
     prenom.setText("");
     nom.setText("");
     email.setText("");
     code.setText("");
      ufr.setText("");
      filiere.setText("");
      teleph.setText("");
      adre.setText("");
      cni.setText("");
      pass.setText("");
  }
    private void annuler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annuler1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_annuler1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InscrptionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InscrptionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InscrptionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InscrptionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InscrptionClient().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adre;
    private javax.swing.JButton annuler1;
    private javax.swing.JButton btn_valider;
    private javax.swing.JTextField cni;
    private javax.swing.JTextField code;
    private javax.swing.JTextField email;
    private javax.swing.JTextField filiere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nom;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField teleph;
    private javax.swing.JTextField ufr;
    // End of variables declaration//GEN-END:variables
}
