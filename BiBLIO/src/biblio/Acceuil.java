
package biblio;

import java.awt.Color;
import java.net.*;
import  java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Acceuil extends javax.swing.JFrame {
static Socket accueil;
static  BufferedReader br;
static PrintWriter pw;
static ObjectInputStream oisa;

 //static ObjectOutputStream oosa;

    public Acceuil() {
    try {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        accueil=new Socket("127.0.0.1", 2018);
        System.out.println("connexion établie avec succés avec le serveur");

     
        br=new BufferedReader(new InputStreamReader(accueil.getInputStream()));
        pw=new PrintWriter(accueil.getOutputStream(), true);
      
      
     
    } 
    catch (Exception ex) 
    {
        System.err.println("Serveur indisponible");
        JOptionPane.showMessageDialog(null, "Serveur indisponible,Veuillez réessayer plus tard");
        new Acceuil().setVisible(false);
        System.exit(0);
     }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inscrire = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        log = new javax.swing.JTextField();
        connecter = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        notification = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(0, 52, Short.MAX_VALUE))
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

        login.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/biblio1.jpg"))); // NOI18N
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 540, 540));

        inscrire.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        inscrire.setForeground(new java.awt.Color(153, 0, 51));
        inscrire.setText("s'inscrire");
        inscrire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscrireMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inscrireMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inscrireMouseExited(evt);
            }
        });
        login.add(inscrire, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 170, 30));

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("Login");
        login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 90, 30));

        log.setBackground(new java.awt.Color(153, 0, 51));
        log.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        login.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 210, 40));

        connecter.setBackground(new java.awt.Color(153, 0, 51));
        connecter.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        connecter.setForeground(new java.awt.Color(255, 255, 255));
        connecter.setText("se connecter");
        connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connecterActionPerformed(evt);
            }
        });
        login.add(connecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 150, 30));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("Password");
        login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 90, 30));

        pass.setBackground(new java.awt.Color(153, 0, 51));
        pass.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        login.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 210, 40));
        login.add(notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 594, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    @Override
    public void setResizable(boolean resizable) {
        super.setResizable(false); //To change body of generated methods, choose Tools | Templates.
    }

    private void inscrireMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrireMouseEntered
        // TODO add your handling code here:
        inscrire.setForeground(Color.blue);
    }//GEN-LAST:event_inscrireMouseEntered

    private void inscrireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrireMouseExited
        // TODO add your handling code here:
        inscrire.setForeground(new Color(153,0,51));
    }//GEN-LAST:event_inscrireMouseExited

    private void inscrireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrireMouseClicked
        // inscription
      
        dispose();
        new InscrptionClient().setVisible(true);
    }//GEN-LAST:event_inscrireMouseClicked

    private void connecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connecterActionPerformed
    try {
            pw.println("connexionemp/"+log.getText()+"*"+pass.getText());
            pw.flush();
            String bre=br.readLine();
            System.out.println(bre);
        if(bre.equals("connecte"))
        {
            System.out.println("ok reussi");
           new ListesDesLivres().setVisible(true);
            dispose();
        }
    } catch (IOException ex) {
        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_connecterActionPerformed

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
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connecter;
    private javax.swing.JLabel inscrire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField log;
    private javax.swing.JPanel login;
    private javax.swing.JLabel notification;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
