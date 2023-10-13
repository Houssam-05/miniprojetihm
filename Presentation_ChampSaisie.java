/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agent_champSaisie;

import javafx.scene.control.TextField;

/**
 *
 * @author Wissem
 */
public class Presentation_ChampSaisie {
    
    private TextField champSaisie; 
    
    public Presentation_ChampSaisie()
    {
        champSaisie = new TextField(); 
    }
    

    public TextField getChampSaisie() {
        return champSaisie;
    }

    public void setChampSaisie(String texte) {
        champSaisie.setText(texte);
    }
    
    
}
