/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Zakina
 */
public class Lieu {
    private int id ;
    private String ville ;
    private String nbBoxes ;
    private String commentaires ;
    private Vente unVente ;

    public Lieu() {
    }

    public Lieu(int id, String ville, String nbBoxes, String commentaires) {
        this.id = id;
        this.ville = ville;
        this.nbBoxes = nbBoxes;
        this.commentaires = commentaires;
    }

    public Lieu(int i, String france) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

    public String getNbBoxes() {
        return nbBoxes;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setNbBoxes(String nbBoxes) {
        this.nbBoxes = nbBoxes;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Vente getUnVente() {
        return unVente;
    }

    public void setUnVente(Vente unVente) {
        this.unVente = unVente;
    }


  
    
    
}
