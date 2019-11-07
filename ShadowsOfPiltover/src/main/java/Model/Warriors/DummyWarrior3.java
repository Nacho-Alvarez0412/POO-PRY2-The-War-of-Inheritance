/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Warriors;

import Model.DummyWarriorTemplate;
import Model.Enums.WarriorType;
import Model.Piece;
import Model.Warrior;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public class DummyWarrior3 extends Warrior {

    public DummyWarrior3(DummyWarriorTemplate dummy,int lvl) {
        super(0, "", 0, 0, 0, 0, 1, 1, 0, 0, null, null, new JLabel(), null, WarriorType.Meele, 0);
        Load(dummy,lvl);
    }
    
    public void Load(DummyWarriorTemplate dummy,int lvl){
        this.appereance = dummy.appereance;
        this.armySlots = dummy.getSize();
        this.cost = dummy.getCost();
        this.type = dummy.getType();
        this.name = dummy.getName();
        this.health = dummy.getHealth();
        this.damage = dummy.getDamage();
        this.damageXsecond = dummy.getDamageXsecond();
        this.lvl = lvl;
    }

    @Override
    public void sound() {
    }
}