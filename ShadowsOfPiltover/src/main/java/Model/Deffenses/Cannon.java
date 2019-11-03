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
public class Cannon extends Deffense{

    public Cannon(int lvl, Piece[][] warzone) {
        super("Cannon", 1, 1, 1, 3, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, warzone, new ArrayList<>(), DeffenseType.Cannon);
        this.setDamage(15+(lvl*2));
        this.setHealth(150+(lvl*2.5));
        this.setDamageXsecond(2);
        
        ArrayList<ImageIcon> appereance = new ArrayList();
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\DeffenseAssets\\Cannon.png"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\DeffenseAssets\\Debris.png"));
        setAppereance(appereance);
        this.setFrame(new JLabel()); 
        this.getFrame().setIcon(appereance.get(0));
        
        this.setUnlockLvl(1);
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
                Logger.getLogger(Cannon.class.getName()).log(Level.SEVERE, null, ex);
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
            attacker = null;
            
        }
    }
    

    @Override
    public void die() {
        getWarzone()[getX()][getY()] = null;
        this.getFrame().setIcon(appereance.get(1));
        System.out.println(getPieceName()+",Fui Destruido...");
    }

    @Override
    public void sound() {
    }
    
}
