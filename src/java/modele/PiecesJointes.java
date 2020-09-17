/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author sio2
 */
public class PiecesJointes {
    
    private String id;
    private String cheminAcces;
    
    
  public PiecesJointes() {
    }

    public PiecesJointes(String id) {
        this.id = id;
    }

    public PiecesJointes(String id, String cheminAcces) {
        this.id = id;
        this.cheminAcces = cheminAcces;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheminAcces() {
        return cheminAcces;
    }

    public void setCheminAcces(String cheminAcces) {
        this.cheminAcces = cheminAcces;
    } 
    
}
