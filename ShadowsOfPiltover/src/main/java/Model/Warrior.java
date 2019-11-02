/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import Model.Enums.WarriorType;
import Model.Warriors.Dragon;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public abstract class Warrior extends Piece {
    public WarriorType type;
    public int armySlots;
    public int cost;
    public ArrayList<DeffenseType> objective;
    public Deffense deffender;

    public Warrior(int cost,String name, int health, int damage, int damageXsecond, int range, int lvl, int unlockLvl, int x, int y, ArrayList<ImageIcon> appereance, ArrayList<File> sounds, JLabel frame, Piece[][] warzone,WarriorType type, int space) {
        super(ElementType.warrior, name, health, damage, damageXsecond, range, lvl, unlockLvl, x, y, appereance, sounds, frame, warzone);
        this.type = type;
        this.objective = new ArrayList<>();
        this.armySlots = space;
        this.cost = cost;
        this.objective.add(DeffenseType.Tower);
        this.objective.add(DeffenseType.Cannon);
        this.objective.add(DeffenseType.Firecracker);
        this.objective.add(DeffenseType.TownHall);
        this.objective.add(DeffenseType.Bomb);
        this.objective.add(DeffenseType.Mortar);
        this.objective.add(DeffenseType.Wall);
    }
    
    
    @Override
    public void deploy(int x, int y,Piece[][] warzone){
        this.setWarzone(warzone);
        this.setX(x);
        this.setY(y);
        warzone[x][y] = this;
        this.start();
    }
    
    public void targetObjective(){
        deffender = null;
        Deffense lastResort = null;
        for(Piece deffense : getInRange()){
            for(DeffenseType type : objective){
                Deffense deffense1 = (Deffense) deffense;
                
                if(deffense1.type != DeffenseType.Wall && deffense1.getHealth()>0){
                    deffender = deffense1;
                    return;
                    
                }
                else if(deffense1.getHealth()>0){
                    lastResort = deffense1;
                }
                
            }
        }
        if(deffender == null)
            deffender = lastResort;
        
    }

    public int getCost() {
        return cost;
    }
    
    static public String  getWarrior(Warrior warrior){
        String  info = "";
        info += "Name: "+warrior.getPieceName()+" \n";
        info += "Damage: "+warrior.getDamage()+" \n";
        info += "Health: "+warrior.getHealth()+" \n";
        info += "Cost: "+warrior.getCost()+" \n";
        info += "Range: "+warrior.getRange()+" \n";
        info += "Damage per Second: "+warrior.getDamageXsecond();
        
        return info;
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
                Logger.getLogger(Dragon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        die();
    }

    @Override
    public void move() {
        this.getFrame().setIcon(appereance.get(0));
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
            this.getFrame().setLocation(x*116, y*66);
        }
    }

    @Override
    public void attack() {
        this.getFrame().setIcon(appereance.get(1));
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
        this.getFrame().setIcon(appereance.get(2));
        
        try {
            sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Warrior.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getFrame().setIcon(appereance.get(3));
        System.out.println(getPieceName()+",Fui Destruido...");
    }
    
}
