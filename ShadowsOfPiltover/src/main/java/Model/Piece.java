/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Enums.DeffenseType;
import Model.Enums.ElementType;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public abstract class Piece extends Thread implements IComportamiento {
    private String name;
    private double health;
    private double damage;
    private double damageXsecond;
    private int range;
    private int lvl;
    private int unlockLvl;
    
    private int x;
    private int y;
    private ArrayList<Icon> appereance;
    private ArrayList<File> sounds;
    private JLabel frame;
    private Piece[][] warzone;
    private ElementType elementType;
    private ArrayList<Piece> inRange;

    public Piece(ElementType elementType,String name, int health, int damage, int damageXsecond, int range, int lvl, int unlockLvl, int x, int y, ArrayList<Icon> appereance, ArrayList<File> sounds, JLabel frame,Piece[][] warzone) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.damageXsecond = damageXsecond;
        this.range = range;
        this.lvl = lvl;
        this.unlockLvl = unlockLvl;
        this.x = x;
        this.y = y;
        this.appereance = appereance;
        this.sounds = sounds;
        this.frame = frame;
        this.warzone = warzone;
        this.elementType = elementType;
        this.inRange = null;
    }

    public ArrayList<Piece> getInRange() {
        return inRange;
    }

    public void setInRange(ArrayList<Piece> inRange) {
        this.inRange = inRange;
    }

    public String getPieceName() {
        return name;
    }

    public void setPieceName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamageXsecond() {
        return damageXsecond;
    }

    public void setDamageXsecond(double damageXsecond) {
        this.damageXsecond = damageXsecond;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getUnlockLvl() {
        return unlockLvl;
    }

    public void setUnlockLvl(int unlockLvl) {
        this.unlockLvl = unlockLvl;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Icon> getAppereance() {
        return appereance;
    }

    public void setAppereance(ArrayList<Icon> appereance) {
        this.appereance = appereance;
    }

    public ArrayList<File> getSounds() {
        return sounds;
    }

    public void setSounds(ArrayList<File> sounds) {
        this.sounds = sounds;
    }

    public JLabel getFrame() {
        return frame;
    }

    public void setFrame(JLabel frame) {
        this.frame = frame;
    }

    public Piece[][] getWarzone() {
        return warzone;
    }

    public void setWarzone(Piece[][] warzone) {
        this.warzone = warzone;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }
    
    public ArrayList<Piece> radarSwap(ElementType type){
        ArrayList<Piece> objectives = new ArrayList<>();
        int xi = getX() - getRange();
        int xf = getX() + getRange();
        int yi = getY() - getRange();
        int yf = getY() + getRange();
        int xp = xi;
        int yp = yi;    
        
        while(xp<=xf && yp<=yf){
            if((xp>=0 && xp<=14) && (yp>=0 && yp<=14)){
                if(getWarzone()[xp][yp] != null && getWarzone()[xp][yp].elementType == type){
                    if(getWarzone()[xp][yp].getHealth()>0)
                        objectives.add(getWarzone()[xp][yp]);
                }
                
                yp++;
                
                if(yp > yf){
                    xp++;
                    yp = yi;
                } 
            }
            else{
                xp++;
                yp++;
            }
            
        }
        
        return objectives;
    }
    
    public int getTownHallX(){
        Deffense deffense;
        for(int i = 0 ; i<=14 ; i++){
            for(int j = 0 ; j<= 14 ; j++){
                if(getWarzone()[i][j] != null){
                    if(getWarzone()[i][j].elementType == ElementType.deffense){
                         deffense = (Deffense) getWarzone()[i][j];
                         if(deffense.type == DeffenseType.TownHall)
                             return i;
                    }
                }
                
            }
        }
        return 0;
    }
    
    public int getTownHallY(){
        Deffense deffense;
        for(int i = 0 ; i<=14 ; i++){
            for(int j = 0 ; j<= 14 ; j++){
                if(getWarzone()[i][j] != null){
                    if(getWarzone()[i][j].elementType == ElementType.deffense){
                         deffense = (Deffense) getWarzone()[i][j];
                         if(deffense.type == DeffenseType.TownHall)
                             return j;
                    }
                }
                
            }
        }
        return 0;
    }
    
    
    public void printWarzone(){
        for(Piece[] i : warzone){
            for(Piece j : i){
                if(j == null)
                    System.out.print("free,");
                else
                    System.out.print(j.getPieceName()+",");
            }
            System.out.println("");
        }
    }
 
}
