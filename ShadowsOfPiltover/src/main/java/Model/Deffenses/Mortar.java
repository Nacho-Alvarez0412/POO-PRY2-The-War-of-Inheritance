/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Deffenses;

import Model.Deffense;
import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import Model.Enums.WarriorType;
import Model.Piece;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public class Mortar extends Deffense {
    
    public Mortar(int lvl,Piece[][] warzone) {
        super("Mortar", 1, 1, 1, 8, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, warzone, new ArrayList<>(), DeffenseType.Mortar);
        this.setDamage(40+(lvl*2));
        this.setHealth(80+(lvl*2.5));
        this.setDamageXsecond(4);
        this.setFrame(null); // Cambiar!!!!!!
        this.setUnlockLvl(6);
        this.objective.add(WarriorType.Hero);
        this.objective.add(WarriorType.Ranged);
        this.objective.add(WarriorType.Meele);
        this.objective.add(WarriorType.Beast);
    }

    @Override
    public void run(){
        while (getHealth()>0){
            if(attacker != null){
                System.out.println(getPieceName()+",Targeted: "+ attacker.getPieceName());
                attack();
            }
            else{
                setInRange(this.radarSwap(ElementType.warrior));
                targetObjective();
            }
       
            try {
                sleep((long)getDamageXsecond() *1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mortar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        die();
    }

    @Override
    public void move() {
    }

    @Override
    public void attack() {
        if(attacker.getHealth()>0){
            attacker.setHealth(attacker.getHealth()-getDamage());
        }
        else{
            attacker = null;
        }
    }
    

    @Override
    public void die() {
        System.out.println(getPieceName()+",Fui Destruido...");
    }

    @Override
    public void sound() {
    }
    
}
