/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Lieu;
import modele.Vente;

/**
 *
 * @author sio2
 */
public class VenteTest {
    
    public static void main(String[] args) {
        
        Vente unVente = new Vente(1, "dupont", "luc");
        unVente.setUnLieu(new Lieu(1, "FRANCE"));
        System.out.println(unVente.toString());
        System.out.println(unVente.getNom() + "  " + unVente.getUnLieu().getVille());
        
        
    }
    
    
    
    
}
