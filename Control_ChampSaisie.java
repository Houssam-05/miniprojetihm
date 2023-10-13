/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agent_champSaisie;

import agent_fenetrePrincipale.Control_PAC;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Wissem
 */
public class Control_ChampSaisie {
    
    private Abstraction_ChampSaisie abstraction_champ; 
    private Presentation_ChampSaisie presentation_champ; 
   
    public Control_ChampSaisie(Abstraction_ChampSaisie abstraction_champ, Presentation_ChampSaisie presentation_champ) {
        this.abstraction_champ = abstraction_champ;
        this.presentation_champ = presentation_champ;
    }
    
    public void control ()
    {    
         
        champsDeSaisieEdite();
              
    }
    
    public void champsDeSaisieEdite()
    {
        float pourcentage = Float.parseFloat(presentation_champ.getChampSaisie().getText()); 
        abstraction_champ.setPourcentage(pourcentage);
    }

   
    
    
    
 
    
}
