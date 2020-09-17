/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Mail {
    private int id ;
    private String date ;
    private String objet ;
    private String corps ;
    private Vente unVente;
    private ArrayList<PiecesJointes> lesPiecesJointes ;

    public Mail() {
    }

    public Mail(int id, String date, String objet, String corps) {
        this.id = id;
        this.date = date;
        this.objet = objet;
        this.corps = corps;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getObjet() {
        return objet;
    }

    public String getCorps() {
        return corps;
    }

    public ArrayList<PiecesJointes> getLesPiecesJointes() {
        return lesPiecesJointes;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Vente getUnVente() {
        return unVente;
    }

    public void setUnVente(Vente unVente) {
        this.unVente = unVente;
    }

    
    public void setLesPiecesJointes(ArrayList<PiecesJointes> lesPiecesJointes) {
        this.lesPiecesJointes = lesPiecesJointes;
    }
    
          
    public void addUnePiecesJointes(PiecesJointes unePiecesJointes){
        if (lesPiecesJointes == null){
            lesPiecesJointes = new ArrayList<PiecesJointes>();
        }
        lesPiecesJointes.add(unePiecesJointes);
    }
}
