/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Enums.WarriorType;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author nacho
 */
public class DummyWarriorTemplate implements Serializable {
    private String name;
    private double health;
    private double damage;
    private double damageXsecond;
    private int range;
    private int cost;
    private int size;
    private WarriorType type;
    public ArrayList<ImageIcon> appereance;
    private ArrayList<File> sounds;
    private boolean loaded;
    
    public DummyWarriorTemplate(){
        loaded = false;
    }
    

    public void Load(String name, double health, double damage, double damageXsecond, int range, int cost, int size, WarriorType type, ArrayList<ImageIcon> appereance, ArrayList<File> sounds) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.damageXsecond = damageXsecond;
        this.range = range;
        this.cost = cost;
        this.size = size;
        this.type = type;
        this.appereance = appereance;
        this.sounds = sounds;
        this.loaded = true;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public double getDamageXsecond() {
        return damageXsecond;
    }

    public int getRange() {
        return range;
    }

    public int getCost() {
        return cost;
    }

    public int getSize() {
        return size;
    }

    public WarriorType getType() {
        return type;
    }

    public ArrayList<ImageIcon> getAppereance() {
        return appereance;
    }

    public ArrayList<File> getSounds() {
        return sounds;
    }

    public boolean isLoaded() {
        return loaded;
    }
}
