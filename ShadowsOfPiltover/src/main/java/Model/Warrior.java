/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import Model.Enums.WarriorType;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

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

    public Warrior(int cost,String name, int health, int damage, int damageXsecond, int range, int lvl, int unlockLvl, int x, int y, ArrayList<Icon> appereance, ArrayList<File> sounds, JLabel frame, Piece[][] warzone,WarriorType type, int space) {
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
    public void deploy(int x, int y){
        this.setX(x);
        this.setY(y);
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
    
}
