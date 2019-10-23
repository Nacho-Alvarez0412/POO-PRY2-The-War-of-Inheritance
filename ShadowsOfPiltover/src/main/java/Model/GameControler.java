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
public class GameControler extends Thread {
    // Atributos
    ArrayList matrix;
    boolean running;
    boolean pause;
    
    //Constructor
    void init(ArrayList matrix){
        running = true;
        pause = false;
        this.matrix = matrix;
    }
    
    boolean checkWin(){
        return false;
    }
    boolean checkDefeat(){
        return false;
    }
    int checkScore(){
        return 0;
    }
}
