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

interface IComportamiento {
    void move();
    void attack(Element piece);
    void die();
    void deploy();
}


public abstract class Element extends Thread implements IComportamiento {
    
    //Atributos    
    ArrayList appereance;
    int health;
    int attack;
    int attackSpeed;
    int lvl;
    int occupancy;
    int unluckLvl;
    int x;
    int y;
    int range;
    boolean pause;
    boolean running;
    boolean attacking;
    boolean moving;
    String name;
    
    //Metodos

    public Element(ArrayList appereance, int health, int attack, int attackSpeed, int lvl, int occupancy, int unluckLvl, int x, int y, int range, String name) {
        this.appereance = appereance;
        this.health = health;
        this.attack = attack;
        this.attackSpeed = attackSpeed;
        this.lvl = lvl;
        this.occupancy = occupancy;
        this.unluckLvl = unluckLvl;
        this.x = x;
        this.y = y;
        this.range = range;
        this.pause = false;
        this.running = true;
        this.attacking = false;
        this.moving = false;
        this.name = name;
    }
    
    
    abstract void init();
    
    void pause(){
        pause =  !pause;
    }

}
