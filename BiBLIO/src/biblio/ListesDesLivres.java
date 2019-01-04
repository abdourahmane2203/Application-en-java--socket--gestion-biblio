
package biblio;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.table.DefaultTableModel;

public class ListesDesLivres extends javax.swing.JFrame {
    private BufferedReader listin;
    private PrintWriter listout;
    
    DefaultTableModel model=new DefaultTableModel();
    private String titrel;
    private String typel;
    private int sbn;
    private String etatl;
    private String description;
    private String auteur;
    private String dispo;
    private String id;
    public ListesDesLivres() {
        try {
            try {
                initComponents();
                setLocationRelativeTo(null); //fixer au milieu de l'ecran
                Acceuil.br=new BufferedReader(new InputStreamReader(Acceuil.accueil.getInputStream()));
                listin=Acceuil.br;
                Acceuil.pw=new PrintWriter(Acceuil.accueil.getOutputStream(),true);
                listout=Acceuil.pw;
               
            } catch (Exception ex) {
                Logger.getLogger(ListesDesLivres.class.getName()).log(Level.SEVERE, null, ex);
            }
            //modification des titres des colonnes
            model.addColumn("Titre");
            model.addColumn("Auteur");
            model.addColumn("ISBN");
            model.addColumn("Type");
            model.addColumn("Etat");
            model.addColumn("Description");
            model.addColumn("Disponible");
            model.addColumn("#");
            listout.println("listelivre/");
            listout.flush();
            int nb = Integer.parseInt(listin.readLine());
            for (int i = 0; i <nb; i++) {
            String table=listin.readLine();
            System.out.println(table);
            int l1=table.indexOf("/");
            String t1=table.substring(0, l1);
            if(t1.equals("oktable"))
            {
                int l2=table.indexOf("*");
                 titrel=table.substring(l1+1,l2);
                int l3=table.indexOf("&");
                 typel=table.substring(l2+1,l3);
                int l4=table.indexOf("#");
                 sbn=Integer.parseInt(table.substring(l3+1, l4));
                int l5=table.indexOf("$");
                 etatl=table.substring(l4+1, l5);
                int l6=table.indexOf("^");
               description=table.substring(l5+1, l6);
                int l7=table.indexOf("|");
                 auteur=table.substring(l6+1,l7);
                 int l8=table.indexOf("@");
                dispo=table.substring(l7+1,l8);
                 id=table.substring(l8+1);
                model.addRow(new Object[]{id,titrel,auteur,sbn,typel,etatl,description,dispo});
            
            }
                
            }
            table.setModel(model);
        } catch (IOException ex) {
            Logger.getLogger(ListesDesLivres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titre = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ido = new javax.swing.JLabel();
        emprunter = new javax.swing.JButton();
        reservation = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        etat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idoo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        auteur1 = new javax.swing.JTextField();
        disponi = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        description2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        notiempreserv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTES DES LIVRES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Books_96px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 87, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Books_96px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 87, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel15.setText("Connecté:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 120, 30));

        nom.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 114, 220, 40));

        Date.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Date.setForeground(new java.awt.Color(51, 51, 255));
        jPanel2.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 114, 230, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 160));

        jPanel3.setBackground(new java.awt.Color(153, 0, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 70, 50));

        jPanel4.setBackground(new java.awt.Color(153, 0, 51));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Undo_52px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 70, 50));

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Titre du livre :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 30));

        titre.setBackground(new java.awt.Color(153, 0, 51));
        titre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        titre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titreActionPerformed(evt);
            }
        });
        jPanel1.add(titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, 30));

        isbn.setBackground(new java.awt.Color(153, 0, 51));
        isbn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        isbn.setForeground(new java.awt.Color(255, 255, 255));
        isbn.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });
        jPanel1.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 170, 30));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("ISBN :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 30));

        ido.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        ido.setForeground(new java.awt.Color(153, 0, 51));
        ido.setText("#                 :");
        jPanel1.add(ido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 20));

        emprunter.setBackground(new java.awt.Color(153, 0, 51));
        emprunter.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        emprunter.setForeground(new java.awt.Color(255, 255, 255));
        emprunter.setText("Emprunter");
        emprunter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprunterActionPerformed(evt);
            }
        });
        jPanel1.add(emprunter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 130, 40));

        reservation.setBackground(new java.awt.Color(153, 0, 51));
        reservation.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        reservation.setForeground(new java.awt.Color(255, 255, 255));
        reservation.setText("Reservation");
        reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationActionPerformed(evt);
            }
        });
        jPanel1.add(reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 140, 40));

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("Etat   :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 30));

        type.setBackground(new java.awt.Color(153, 0, 51));
        type.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 170, 30));

        etat.setBackground(new java.awt.Color(153, 0, 51));
        etat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        etat.setForeground(new java.awt.Color(255, 255, 255));
        etat.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        etat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etatActionPerformed(evt);
            }
        });
        jPanel1.add(etat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 170, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Shutdown_30px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 50, -1));

        idoo.setEditable(false);
        idoo.setBackground(new java.awt.Color(153, 0, 51));
        idoo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idoo.setForeground(new java.awt.Color(255, 255, 255));
        idoo.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        idoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idooActionPerformed(evt);
            }
        });
        jPanel1.add(idoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 170, 30));

        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("Description :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 120, 30));

        jLabel12.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 51));
        jLabel12.setText("Type du livre :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 30));

        jLabel13.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 51));
        jLabel13.setText("Auteur        :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 30));

        auteur1.setBackground(new java.awt.Color(153, 0, 51));
        auteur1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        auteur1.setForeground(new java.awt.Color(255, 255, 255));
        auteur1.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        auteur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auteur1ActionPerformed(evt);
            }
        });
        jPanel1.add(auteur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, 30));

        disponi.setBackground(new java.awt.Color(153, 0, 51));
        disponi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        disponi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Non", "Oui" }));
        jPanel1.add(disponi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 170, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 51));
        jLabel14.setText("LISTE DES LIVRES");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 300, 30));

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("Disponibilité :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 130, 30));

        description2.setBackground(new java.awt.Color(153, 0, 51));
        description2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        description2.setForeground(new java.awt.Color(255, 255, 255));
        description2.setSelectedTextColor(new java.awt.Color(153, 0, 0));
        description2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                description2ActionPerformed(evt);
            }
        });
        jPanel1.add(description2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 170, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Titre", "Auteur", "ISBN", "Type", "Etat", "Description", "Disponibilité"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 650, 340));

        notiempreserv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(notiempreserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 480, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
        IntClient in=new IntClient();
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        new Acceuil().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void titreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titreActionPerformed

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnActionPerformed

    private void emprunterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprunterActionPerformed
        try {
            //on envoie l'id du livre
            listout.println("emprunt/"+idoo.getText());
            listout.flush();
            String recuemp=listin.readLine();
            if(recuemp.equals("emprunt ok"))
            {
                notiempreserv.setText("Bravo votre emprunt a été éffectué avec succés!!");
            
            }
        } catch (IOException ex) {
            Logger.getLogger(ListesDesLivres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_emprunterActionPerformed

    private void reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationActionPerformed
        // TODO add your handling code here:
          listout.println("reservation/"+idoo.getText());
        listout.flush();
        
        
    }//GEN-LAST:event_reservationActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void etatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etatActionPerformed

    private void idooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idooActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idooActionPerformed

    private void auteur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auteur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_auteur1ActionPerformed

    private void description2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_description2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_description2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            int ligne=table.getSelectedRow();
            String clic=(table.getModel().getValueAt(ligne,0).toString());
            System.out.println(clic);
            listout.println("clic/"+clic);
            listout.flush();
            String recuclic=listin.readLine();
             System.out.println(recuclic);
             int slash=recuclic.indexOf("/");
             String emp=recuclic.substring(0, slash);
            if(emp.equals("ok"))
            {
                int emp1=recuclic.indexOf("*");
                String id1=recuclic.substring(slash+1, emp1);
                System.out.println(id1);
                int emp2=recuclic.indexOf("@");
                String titre1=recuclic.substring(emp1+1, emp2);
                System.out.println(titre1);
                int emp3=recuclic.indexOf("&");
                String type1=recuclic.substring(emp2+1, emp3);
                System.out.println(type1);
                int emp4=recuclic.indexOf("#");
                String sbn1=recuclic.substring(emp3+1, emp4);
                System.out.println(sbn1);
                int emp5=recuclic.indexOf("^");
                String etat1=recuclic.substring(emp4+1, emp5);
                System.out.println(etat1);
                int emp6=recuclic.indexOf("|");
                String description1=recuclic.substring(emp5+1, emp6);
                System.out.println(description1);
                int emp7=recuclic.indexOf("$");
                String auteu=recuclic.substring(emp6+1, emp7);
                System.out.println(auteu);
                String disponib=recuclic.substring(emp7+1);
                System.out.println(disponib);
                 idoo.setText(id1);
                 titre.setText(titre1);
                 auteur1.setText(auteu);
                 isbn.setText(sbn1);
                 type.setText(type1);
                etat.setText(etat1);
                description2.setText(description1);
                disponi.setSelectedItem(disponib.toString());
            
            }
        } catch (IOException ex) {
            Logger.getLogger(ListesDesLivres.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             
             
    }//GEN-LAST:event_tableMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JTextField auteur1;
    private javax.swing.JTextField description2;
    private javax.swing.JComboBox disponi;
    private javax.swing.JButton emprunter;
    private javax.swing.JTextField etat;
    private javax.swing.JLabel ido;
    private javax.swing.JTextField idoo;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel notiempreserv;
    private javax.swing.JButton reservation;
    private javax.swing.JTable table;
    private javax.swing.JTextField titre;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
