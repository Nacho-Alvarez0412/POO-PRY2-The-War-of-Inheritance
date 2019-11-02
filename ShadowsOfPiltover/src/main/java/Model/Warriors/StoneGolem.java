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
public class StoneGolem extends Warrior {

   public StoneGolem(int lvl){
        super(1000,"Stone Golem",1,1,1, 1, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, null,WarriorType.Meele,7);
        this.setHealth(700+(lvl*3.5));
        this.setDamage(15+(lvl*4));
        this.setUnlockLvl(7);
        this.setRange(1);
        this.setDamageXsecond(3);
        loadImages();
    }
   
   
   private void loadImages(){
        ArrayList<ImageIcon> appereance = new ArrayList();
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\GolemAssets\\GolemMove.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\GolemAssets\\GolemAttack.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\GolemAssets\\GolemDie.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\Images\\Grave.png"));
        setAppereance(appereance);
        this.setFrame(new JLabel()); 
        this.getFrame().setIcon(appereance.get(0));
    }

    @Override
    public void sound() {
    }
    
}
