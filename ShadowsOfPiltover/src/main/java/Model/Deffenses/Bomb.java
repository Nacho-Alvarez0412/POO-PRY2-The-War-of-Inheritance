/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Deffenses;

import Model.*;
import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import Model.Enums.WarriorType;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public class Bomb extends Deffense {
    
    public Bomb(int lvl, Piece[][] warzone) {
        super("Bomb", 1, 1, 1, 2, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, warzone, new ArrayList<>(), DeffenseType.Bomb);
        this.setDamage(35+(lvl*2));
        this.setHealth(400);
        this.setDamageXsecond(0);
        this.setFrame(null); // Cambiar!!!!!!
        this.setUnlockLvl(8);
        this.objective.add(WarriorType.Hero);
        this.objective.add(WarriorType.Ranged);
        this.objective.add(WarriorType.Meele);
        this.objective.add(WarriorType.Beast);
    }

    @Override
    public void run(){
        while (getHealth()>0){
            if(getInRange() != null){
                System.out.println("Ready to blow some shit up");
                attack();
            }
            else{
                setInRange(this.radarSwap(ElementType.warrior));
            }
       
            
            try {
                sleep((long)getDamageXsecond() *1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bomb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        die();
    }

    @Override
    public void move() {
    }

    @Override
    public void attack() {
        for(Piece warrior : getInRange()){
            warrior.setHealth(warrior.getHealth()-getDamage());
        }
    }
    

    @Override
    public void die() {
        System.out.println("Explote...");
    }

    @Override
    public void sound() {
    }
    
}
