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
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public class Bomb extends Deffense {
    
    public Bomb(int lvl, Piece[][] warzone) {
        super("Bomb", 1, 1, 1, 2, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, warzone, new ArrayList<>(), DeffenseType.Bomb);
        this.setDamage(100+(lvl*2));
        this.setHealth(400);
        this.setDamageXsecond(0);
        
        ArrayList<ImageIcon> appereance = new ArrayList();
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\DeffenseAssets\\Bomb.png"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\DeffenseAssets\\Debris.png"));
        setAppereance(appereance);
        this.setFrame(new JLabel()); 
        this.getFrame().setIcon(appereance.get(0));
        
        
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
                while(pause){
                    sleep(1);
                }
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
        setHealth(0);
    }
    

    @Override
    public void die() {
        getWarzone()[getX()][getY()] = null;
        this.getFrame().setIcon(appereance.get(1));
        System.out.println("Explote...");
    }

    @Override
    public void sound() {
    }
    
}
