/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Deffenses;

import Model.Deffense;
import Model.Enums.DeffenseType;
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
public class Wall extends Deffense {
    
    public Wall(int lvl,Piece[][] warzone) {
        super("Wall", 1, 1, 1, 1, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, warzone, null, DeffenseType.Wall);
        this.setDamage(0);
        this.setHealth(300);
        this.setRange(0);
        this.setDamageXsecond(0);
        this.setFrame(null); // Cambiar!!!!!!
    }
    
    @Override
    public void run(){
        while(getHealth()>0){
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Wall.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        die();
    }
    
    @Override
    public void move() {
    }

    @Override
    public void attack() {
    }

    @Override
    public void die() {
        System.out.println("Fui Destruido...");
        getWarzone()[getX()][getY()] = null;
    }

    @Override
    public void sound() {
    }
    
}
