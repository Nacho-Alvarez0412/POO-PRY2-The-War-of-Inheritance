/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public abstract class Deffense extends Element {
    Warriors objective;
    Deffenses type;
    
    Deffense(String name,Deffenses type, ArrayList appereance, int health, int attack, int attackSpeed, int lvl, int unlockLvl, int x, int y, int range,ElementType Etype){
        super(appereance,health,attack,attackSpeed,lvl,unlockLvl,x,y,range,name,Etype);
        this.type = type;
    }
}
