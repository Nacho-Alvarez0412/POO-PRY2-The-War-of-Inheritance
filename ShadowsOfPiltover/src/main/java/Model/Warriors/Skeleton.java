/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Warriors;

import Model.*;
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
public class Skeleton extends Warrior {

    public Skeleton(int lvl,Piece[][] warzone){
        super("Skeleon",1,1,1, 1, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, warzone,WarriorType.Meele,1);
        this.setHealth(60+(lvl*0.5));
        this.setDamage(10+(lvl*4));
    }

   @Override
    public void run(){
        while (getHealth()>0){
            if(deffender != null){
                System.out.println(getPieceName()+",Target: "+deffender.getPieceName());
                attack();
            }
            else{
                setInRange(radarSwap(ElementType.deffense));
                
                if(getInRange().isEmpty()){
                    move();
                }
                else
                    targetObjective();
            }
       
            try {
                sleep((long)getDamageXsecond() *1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        die();
    }

    @Override
    public void move() {
        int x = getX();
        int y = getY();
        
        if(x<getTownHallX())
            x++;
        else if(x>getTownHallX())
            x--;
        
        if(y<getTownHallY())
            y++;
        else if(y>getTownHallY())
            y--;
        
        if(getWarzone()[x][y] == null){
            getWarzone()[x][y] = this;
            getWarzone()[getX()][getY()] = null;
            setX(x);
            setY(y);
        }
    }

    @Override
    public void attack() {
        if(deffender.getHealth()>0){
            deffender.setHealth(deffender.getHealth()-getDamage());
        }
        else{
            System.out.println(deffender.getPieceName()+" abatido");
            getInRange().remove(deffender);
            deffender = null;
            
            
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