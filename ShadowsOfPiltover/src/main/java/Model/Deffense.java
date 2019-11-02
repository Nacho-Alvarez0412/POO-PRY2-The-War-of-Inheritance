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
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public abstract class Deffense extends Piece {
    public DeffenseType type;
    public ArrayList<WarriorType> objective;
    public Warrior attacker;

    public Deffense(String name, int health, int damage, int damageXsecond, int range, int lvl, int unlockLvl, int x, int y, ArrayList<ImageIcon> appereance, ArrayList<File> sounds, JLabel frame, Piece[][] warzone,ArrayList<WarriorType> objective, DeffenseType type) {
        super(ElementType.deffense, name, health, damage, damageXsecond, range, lvl, unlockLvl, x, y, appereance, sounds, frame, warzone);
        this.objective = objective;
        this.type = type;
    }
    
    
    @Override
    public void deploy(int x, int y,Piece[][] warzone){
        this.setWarzone(warzone);
        this.setX(x);
        this.setY(y);
        this.start();
    }
    
    public void targetObjective(){
        for(Piece warrior : getInRange()){
            for(WarriorType type : objective){
                Warrior warrior1 = (Warrior) warrior;
                
                if(warrior1.type == type && warrior1.getHealth()>0){
                    attacker = warrior1;
                    return;
                }
            }
        }
        attacker = null;
    }
    
}
