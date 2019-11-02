/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nacho
 */
public class Game extends Thread {
    User user;
    int lvl;
    Piece[][] warzone;
    double porcentage;
    int gold;
    ArrayList<Deffense> deffenses;
    ArrayList<Warrior> army;
    
    
    public Game(User user,Piece[][] warzone){
        army = user.getArmy();
        this.user = user;
        this.warzone = warzone;
        lvl = user.getCurrentLvl();
        gold = 250*(2*(lvl-1));
        porcentage = 0;
    }
    
    public void setDeffenses(){
        Deffense deffense;
        for(Piece[] line : warzone) {
            for(Piece element : line){
                if(element.getElementType()== ElementType.deffense){
                    deffense = (Deffense) element;

                    if(deffense.type != DeffenseType.Wall)
                        deffenses.add(deffense);
                }
            }
        }
    }
    
    @Override
    public void run(){
        
    }
    
    boolean isFighting(){
        return army.stream().anyMatch((warrior) -> (warrior.getHealth() > 0 ));
    }
    
    boolean isTownHallDestroyed(){
        return deffenses.stream().anyMatch((deffense) -> (deffense.getHealth() < 0 && deffense.type == DeffenseType.TownHall ));
    }
    
    boolean isDefending(){
        return deffenses.stream().anyMatch((deffense) -> (deffense.getHealth() > 0 ));
    }
        
    
    
    public void activateDeffenses(){
        for(int i = 0 ; i<= 14 ; i++){
            for(int j = 0 ; j <= 14 ; j++){
                if(warzone[i][j] != null && warzone[i][j].getElementType() == ElementType.deffense){
                    warzone[i][j].deploy(i, j,warzone);
                }
            }
        }
    }
        
   
        
}
