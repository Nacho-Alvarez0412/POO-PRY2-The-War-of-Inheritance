/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author nacho
 */
public class User implements Serializable {
    //Atributos
    String username;
    String password;
    int currentLvl;
    
    
    //Constructor

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.currentLvl = 1;
    }
    
    
}
