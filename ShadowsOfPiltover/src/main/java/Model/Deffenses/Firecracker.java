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
public class Firecracker extends Deffense{
    
    public Firecracker(int lvl,Piece[][] warzone) {
        super("Firecracker", 1, 1, 1, 6, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, warzone, new ArrayList<>(), DeffenseType.Firecracker);
        this.setDamage(30+(lvl*2));
        this.setHealth(160+(lvl*2.5));
        this.setDamageXsecond(2);
        this.setFrame(null); // Cambiar!!!!!!
        this.setUnlockLvl(3);
        this.objective.add(WarriorType.Airborne);
        this.attacker = null;
        
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
                Logger.getLogger(Firecracker.class.getName()).log(Level.SEVERE, null, ex);
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
            System.out.println(attacker.getPieceName()+",Objetivo abatido");
            attacker = null;        }
    }
    

    @Override
    public void die() {
        System.out.println(getPieceName()+",Fui Destruido...");
    }

    @Override
    public void sound() {
    }
    
}
