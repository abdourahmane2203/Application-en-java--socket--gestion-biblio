
package biblio;
import java.io.*;
public class Livre  implements Serializable {
    
    private String titre;
    private String auteur;
    private String nomlivre;
    private int nisbn;
    private String etat;
    private  String Description;

    public Livre(String titre, String auteur, String nomlivre, int nisbn, String etat, String Description) {
        
        this.titre = titre;
        this.auteur = auteur;
        this.nomlivre = nomlivre;
        this.nisbn = nisbn;
        this.etat = etat;
        this.Description = Description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getNomlivre() {
        return nomlivre;
    }

    public void setNomlivre(String nomlivre) {
        this.nomlivre = nomlivre;
    }

    public int getNisbn() {
        return nisbn;
    }

    public void setNisbn(int nisbn) {
        this.nisbn = nisbn;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
