/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Enums.ElementType;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Game extends Thread {
    User user;
    int lvl;
    Piece[][] warzone;
    double porcentage;
    int gold;
    ArrayList<Warrior> army;
    DataBase dataBase;
    
    Game(User user,DataBase dataBase){
        this.lvl = user.getCurrentLvl();
        this.dataBase = dataBase;
        warzone = BoardGenerator.generateBoard(dataBase.templates.get(lvl-1), lvl);
        gold = 5+(2*(lvl-1));
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
    
    public void activateDeffenses(){
        for(int i = 0 ; i<= 14 ; i++){
            for(int j = 0 ; j <= 14 ; j++){
                if(warzone[i][j] != null && warzone[i][j].getElementType() == ElementType.deffense){
                    warzone[i][j].deploy(i, j);
                }
            }
        }
    }
        
}
