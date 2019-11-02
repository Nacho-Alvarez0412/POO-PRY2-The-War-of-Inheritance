/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Warriors;

import Model.Enums.ElementType;
import Model.Enums.WarriorType;
import Model.Warrior;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public class Bear extends Warrior{

    public Bear(int lvl){
        super(400,"Bear",1,1,1, 1, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, null,WarriorType.Meele,3);
        this.setHealth(100+(lvl*0.5));
        this.setDamage(35+(lvl*4));
        this.setUnlockLvl(5);
        this.setRange(1);
        this.setDamageXsecond(2);
        loadImages();
    }
    
    private void loadImages(){
        ArrayList<ImageIcon> appereance = new ArrayList();
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\BearAssets\\BearMove.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\BearAssets\\BearAttack.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\BearAssets\\BearDie.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\Images\\Grave.png"));
        setAppereance(appereance);
        this.setFrame(new JLabel()); 
        this.getFrame().setIcon(appereance.get(0));
    }

    @Override
    public void sound() {
    }
}
