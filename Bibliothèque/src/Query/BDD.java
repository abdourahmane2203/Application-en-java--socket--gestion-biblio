
package Query;
import java.sql.*;
/**
 *
 * @author Diallo
 */
public class BDD {
    Statement stm;
    Connection connect = new ConnectionDB().connexionBD();
    String SQL;
   
   
        //Methode pour executer des requetes
        public ResultSet executionQuery (String sql){
           
            new ConnectionDB().connexionBD();
            ResultSet rs = null;

            try {

                 Statement statement = connect.createStatement();
                 rs = statement.executeQuery(sql);
                 System.out.println(sql);

             } catch (SQLException ex) {
                 System.err.println(ex.getMessage());
             }
             return rs;
        }
    
        //Pour execution de requete UPDATE
         public String executionUpdate(String sql){
            
             new ConnectionDB().connexionBD();
             String resultat = "";

             try {

                  Statement statement = connect.createStatement();
                  statement.executeUpdate(sql);
                  resultat = sql;
                  
              } catch (SQLException ex) {
                  resultat = ex.toString();
              }

              return resultat;

         }
   
        //Methode pour afficher le contenu d'une table

        public ResultSet querySelectAll(String nomTable){
            
            new ConnectionDB().connexionBD();
            SQL = "SELECT * FROM "+ nomTable;
            System.out.println(SQL);
            return this.executionQuery(SQL);
        }   
  
  
  //Methode pour afficher toute une table avec une precision d'etat.
  
  public ResultSet querySelectAll(String nomTable, String etat){
     
      new ConnectionDB().connexionBD(); 
      SQL = "SELECT * FROM "+nomTable +" WHERE "+ etat;
      System.out.println(SQL);
      return this.executionQuery(SQL);
  }
  
  //Methode pour selectionner plusieurs colonne dans une table ex : SELECT prenom, nom, adresse FROM eleve
        public ResultSet querySelect (String  nomTable, String [] nomColonne){
            
            new ConnectionDB().connexionBD(); 
            int i;
            SQL = "SELECT ";

            for (i = 0; i <= nomColonne.length - 1; i++){
                SQL +=nomColonne[i];
                if (i < nomColonne.length - 1){
                    SQL += ",";
                }
            }

            SQL += " FROM "+nomTable;
            return this.executionQuery(SQL);
        }
  
        //Methode pour selectionner plusieurs colonne dans une table ex : SELECT prenom, nom, adresse FROM eleve WHRE etat
        //Avec precision d'etat.
       public ResultSet querySelect (String [] nomColone, String nomTable, String etat){
            
           new ConnectionDB().connexionBD();
            int i;
            SQL = "SELECT ";

            for (i = 0; i <= nomColone.length - 1; i++){
                SQL +=nomColone[i];
                if (i < nomColone.length - 1){
                    SQL += ", ";
                }
            }

            SQL += " FROM "+nomTable + " WHERE "+ etat;
            return this.executionQuery(SQL);
        } 
       
       //Methode d'insertion de données.
       public String queryInsert(String nomTable, String [] contenuTable){
           
           new ConnectionDB().connexionBD();
           int i;
           SQL = "INSERT INTO " +nomTable+ " VALUES(";
           
           for (i = 0; i <= contenuTable.length - 1; i++){
               SQL += " ' " +contenuTable[i]+ " ' ";
               if (i <= contenuTable.length - 1){
                   SQL += ", ";
               }
           }
           
           SQL += ") ";
        return this.executionUpdate(SQL);
       }
       
       //Methode pour inserer des données avec précision de colonne.
       public String queryInsert(String nomTable, String [] nomColonne, String [] contenuTable){
           
           new ConnectionDB().connexionBD();
           SQL = "INSERT INTO "+ nomTable +"(";
           int i;
           
           for (i = 0; i <= nomColonne.length - 1; i++){
               SQL += nomColonne[i];
               
               if (i <= nomColonne.length  - 1){
                   SQL += ", ";
               }
           }
           
           SQL += ") VALUES (";
           
           for (i = 0; i <= contenuTable.length - 1; i++){
               SQL += " ' " +contenuTable[i]+ " ' ";
               if (i <= contenuTable.length - 1){
                   SQL += ", ";
               }
           }
           
           SQL += ") ";
           return this.executionUpdate(SQL);
       }
     
       //Methode pour mettre à jour une ou plusieurs colonne(s) ou bien une table entier.
        public String queryUpdate(String nomTable, String [] nomColonne, String [] contenuTable, String etat){
            
           new ConnectionDB().connexionBD();
            int i;
            SQL = "UPDATE "+nomTable +" SET "; 
            
            for (i = 0; i <= nomColonne.length - 1; i++){
                SQL += nomColonne[i] +"='"+ contenuTable[i]+ "'";
                
                if (i < nomColonne.length - 1){
                    SQL += ",";
                }
            }
           
            SQL += " WHERE "  +etat;
         return this.executionUpdate(SQL);   
        }
  
        //Methode pour une requète de suppression sans parametre
        public String queryDelete(String nomTable){
            
            new ConnectionDB().connexionBD();
            SQL = "DELETE FROM " +nomTable;
            
            return this.executionUpdate(SQL);
        }
      
        //Methode de suppression avec parametre
        public String queryDelete (String nomTable, String etat){
            
            new ConnectionDB().connexionBD();
            SQL = "DELETE FROM " +nomTable+ " WHERE " +etat;
            return this.executionUpdate(SQL);
        }
}
