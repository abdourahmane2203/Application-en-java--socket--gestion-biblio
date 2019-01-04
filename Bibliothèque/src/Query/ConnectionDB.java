/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

import java.sql.*;
import javax.swing.*;
/*
 /**
 *
 * @author abdourahmane diallo
 */

public class ConnectionDB extends JFrame {

    private  static Connection connect =null;
   
//Methode pour la connexion à la base de données
    public static Connection connexionBD() {
        
        if (connect == null){
            String url = "jdbc:mysql://localhost/bibliotheque";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url,"root","");
            System.out.println( "Connexion à la base de données reussie");
            //JOptionPane.showMessageDialog(null, "Connexion a la base bien reussie");
           
        } catch (Exception e) {
            String echec = "impossible de se connecter à la base de données !";
            
        }
        }
        return connect;
    }
    
    //Cette methode ferme la connexion à la base de données
         public Connection closeConnection(){
              
             try {

                  connect.close();

              } catch (SQLException ex) {
                  System.err.println(ex.getMessage());
              }
              return connect;
         }

}

