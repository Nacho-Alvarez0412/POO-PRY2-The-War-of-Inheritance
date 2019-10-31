/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class User implements Serializable {
    //Atributos
    String username;
    String password;
    int currentLvl;
    ArrayList<Warrior> army;
    
    
    //Constructor

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.currentLvl = 1;
        this.army = new ArrayList<>();
    }

    public ArrayList<Warrior> getArmy() {
        return army;
    }

    public void setArmy(ArrayList<Warrior> army) {
        this.army = army;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCurrentLvl() {
        return currentLvl;
    }

    public void setCurrentLvl(int currentLvl) {
        this.currentLvl = currentLvl;
    }
    
    
}
