/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.WarzoneController;
import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import View.WarzoneWindow;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class Game extends Thread {
    WarzoneController controller;
    User user;
    int lvl;
    Piece[][] warzone;
    double porcentage;
    int gold;
    ArrayList<Deffense> deffenses;
    ArrayList<Warrior> army;
    boolean victory;
    WarzoneWindow view;
    
    
    public Game(User user,Piece[][] warzone,WarzoneWindow view,WarzoneController controller){
        army = user.getArmy();
        this.user = user;
        this.warzone = warzone;
        lvl = user.getCurrentLvl();
        gold = 150*(2*(lvl-1));
        porcentage = 0;
        victory = false;
        deffenses = new ArrayList<>();
        this.view = view;
        this.controller = controller;
    }
    
    public void _init_(){
        activateDeffenses();
        setDeffenses();
    }
    
    
    public void setDeffenses(){
        Deffense deffense;
        for(Piece[] line : warzone) {
            for(Piece element : line){
                if(element != null){
                    if(element.getElementType()== ElementType.deffense){
                        deffense = (Deffense) element;

                        if(deffense.type != DeffenseType.Wall)
                            deffenses.add(deffense);
                    }
                }
            }
        }
    }
    
    public void getPorcentage(){
        int defenseSize = deffenses.size();
        for(Deffense defense : deffenses){
            if(defense.getHealth()<=0){
                porcentage +=  (1.0/defenseSize)*100;
            }
        }
    }
    
    @Override
    public void run(){
        while(isFighting() && isDefending() &&!isTownHallDestroyed()){               
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        getPorcentage();
        System.out.println(porcentage);
        
        if(isDefending() && porcentage < 50){
            JOptionPane.showMessageDialog(view, "Such a Dissapointment...");
        }
        else{
            gold = (int)(gold*(porcentage/100));
            user.levelUp(gold);
            JOptionPane.showMessageDialog(view, "ARRRR Great job Captain!");
        }
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
    
    public void pause(){
        for(Warrior warrior : army){
            warrior.pause = !warrior.pause;
        }
        
        for(Deffense defense : deffenses){
            defense.pause = !defense.pause;
        }
    }
    
    public void stopGame(){
        for(Warrior warrior : army){
            warrior.setHealth(0);
        }
        
        for(Deffense defense : deffenses){
            defense.setHealth(0);
        }
        
        
    }
        
   
        
}
