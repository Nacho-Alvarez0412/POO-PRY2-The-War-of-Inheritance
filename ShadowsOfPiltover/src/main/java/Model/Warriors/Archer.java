/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Warriors;

import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import Model.Enums.WarriorType;
import Model.Piece;
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
public class Archer extends Warrior {
    public Archer(int lvl){
        super(200,"Archer",1,1,1, 2, lvl, 1, 0, 0, new ArrayList<>(), new ArrayList<>(), null, null,WarriorType.Ranged,2);
        this.setHealth(80+(lvl*0.5));
        this.setDamage(10+(lvl*4));
        this.setDamageXsecond(3);
        loadImages();
 
    }
    
    private void loadImages(){
        ArrayList<ImageIcon> appereance = new ArrayList();
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\ArcherAssets\\ArcherMove.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\ArcherAssets\\ArcherAttack.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\ArcherAssets\\ArcherDie.gif"));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\Images\\Grave.png"));
        setAppereance(appereance);
        this.setFrame(new JLabel()); 
        this.getFrame().setIcon(appereance.get(0));
    }
    
    @Override
    public void sound() {
    }

}
