/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.ElementType.*;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class  LevelGenerator {
    private ArrayList<ElementType[][]> lvls;

    public ArrayList<ElementType[][]> getLvls() {
        return lvls;
    }
    
    LevelGenerator(){
        lvls = new ArrayList<>();
    }
    
    void lvl1(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        lvl[3][3] = delimitation;
        lvl[3][4] = delimitation;
        lvl[3][5] = delimitation;
        
        lvl[4][3] = delimitation;
        lvl[4][4] = deffense;
        lvl[4][5] = delimitation;
        lvl[4][6] = delimitation;
        
        lvl[5][3] = delimitation;
        lvl[5][4] = delimitation;
        lvl[5][5] = deffense;
        lvl[5][6] = delimitation;
        lvl[5][7] = delimitation;
        
        lvl[6][4] = delimitation;
        lvl[6][5] = delimitation;
        lvl[6][6] = deffense;
        lvl[6][7] = delimitation;
        
        lvl[7][5] = delimitation;
        lvl[7][6] = delimitation;
        lvl[7][7] = delimitation;
        
        lvls.add(lvl);
    }
    
    void lvl2(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        lvl[3][4] = delimitation;
        lvl[3][5] = deffense;
        lvl[3][6] = delimitation;
        
        lvl[4][3] = delimitation;
        lvl[4][4] = wall;
        lvl[4][5] = wall;
        lvl[4][6] = wall;
        lvl[4][7] = delimitation;
        
        lvl[5][3] = deffense;
        lvl[5][4] = wall;
        lvl[5][5] = deffense;
        lvl[5][6] = wall;
        lvl[5][7] = deffense;
        
        lvl[6][3] = delimitation;
        lvl[6][4] = wall;
        lvl[6][5] = wall;
        lvl[6][6] = wall;
        lvl[6][7] = delimitation;
        
        lvl[7][4] = delimitation;
        lvl[7][5] = deffense;
        lvl[7][6] = delimitation;
        
        lvls.add(lvl);
    }
    
    void lvl3(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        lvl[3][4] = delimitation;
        lvl[3][5] = delimitation;
        
        lvl[4][3] = delimitation;
        lvl[4][4] = deffense;
        lvl[4][5] = wall;
        lvl[4][6] = deffense;
        lvl[4][7] = delimitation;
        
        lvl[5][3] = delimitation;
        lvl[5][4] = wall;
        lvl[5][5] = deffense;
        lvl[5][6] = wall;
        lvl[5][7] = delimitation;
        
        lvl[6][3] = delimitation;
        lvl[6][4] = deffense;
        lvl[6][5] = wall;
        lvl[6][6] = deffense;
        lvl[6][7] = delimitation;
        
        lvl[7][4] = delimitation;
        lvl[7][5] = delimitation;
        
        lvls.add(lvl);
    }
    
    void lvl4(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        lvl[3][3] = wall;
        lvl[3][4] = wall;
        lvl[3][5] = wall;
        lvl[3][6] = wall;
        lvl[3][7] = wall;

        
        lvl[4][3] = wall;
        lvl[4][4] = deffense;
        lvl[4][5] = delimitation;
        lvl[4][6] = deffense;
        lvl[4][7] = wall;
        
        lvl[5][3] = wall;
        lvl[5][4] = delimitation;
        lvl[5][5] = deffense;
        lvl[5][6] = delimitation;
        lvl[5][7] = wall;
        
        lvl[6][3] = wall;
        lvl[6][4] = deffense;
        lvl[6][5] = delimitation;
        lvl[6][6] = deffense;
        lvl[6][7] = wall;
        
        lvl[7][3] = wall;
        lvl[7][4] = wall;
        lvl[7][5] = wall;
        lvl[7][6] = wall;
        lvl[7][7] = wall;
        
        lvls.add(lvl);
    }
    
    void lvl5(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        lvl[3][3] = delimitation;
        lvl[3][4] = delimitation;
        lvl[3][6] = delimitation;
        lvl[3][7] = delimitation;

        lvl[4][2] = delimitation;
        lvl[4][3] = wall;
        lvl[4][4] = wall;
        lvl[4][5] = delimitation;
        lvl[4][6] = wall;
        lvl[4][7] = wall;
        lvl[4][8] = delimitation;
        
        lvl[5][2] = delimitation;
        lvl[5][3] = wall;
        lvl[5][4] = deffense;
        lvl[5][5] = deffense;
        lvl[5][6] = deffense;
        lvl[5][7] = wall;
        lvl[5][8] = delimitation;
        
        lvl[6][2] = delimitation;
        lvl[6][3] = wall;
        lvl[6][4] = wall;
        lvl[6][5] = delimitation;
        lvl[6][6] = wall;
        lvl[6][7] = wall;
        lvl[6][8] = delimitation;
        
        lvl[7][3] = delimitation;
        lvl[7][4] = delimitation;
        lvl[7][6] = delimitation;
        lvl[7][7] = delimitation;
        
        lvls.add(lvl);
    }
    
    void lvl6(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        
        lvl[1][3] = delimitation;
        lvl[1][4] = delimitation;
        lvl[1][5] = delimitation;
        lvl[1][6] = delimitation;
        lvl[1][7] = delimitation;
        
        lvl[2][3] = delimitation;
        lvl[2][4] = wall;
        lvl[2][5] = wall;
        lvl[2][6] = wall;
        lvl[2][7] = delimitation;
        
        
        lvl[3][3] = delimitation;
        lvl[3][4] = wall;
        lvl[3][5] = deffense;
        lvl[3][6] = wall;
        lvl[3][7] = delimitation;

        lvl[4][3] = delimitation;
        lvl[4][4] = wall;
        lvl[4][5] = wall;
        lvl[4][6] = wall;
        lvl[4][7] = delimitation;
        
        lvl[5][3] = delimitation;
        lvl[5][4] = wall;
        lvl[5][5] = deffense;
        lvl[5][6] = wall;
        lvl[5][7] = delimitation;
        
        lvl[6][3] = delimitation;
        lvl[6][4] = wall;
        lvl[6][5] = wall;
        lvl[6][6] = wall;
        lvl[6][7] = delimitation;
        
        lvl[7][3] = delimitation;
        lvl[7][4] = wall;
        lvl[7][5] = deffense;
        lvl[7][6] = wall;
        lvl[7][7] = delimitation;
        
        lvl[8][3] = delimitation;
        lvl[8][4] = wall;
        lvl[8][5] = wall;
        lvl[8][6] = wall;
        lvl[8][7] = delimitation;
        
        lvl[9][3] = delimitation;
        lvl[9][4] = delimitation;
        lvl[9][5] = delimitation;
        lvl[9][6] = delimitation;
        lvl[9][7] = delimitation;
        
        lvls.add(lvl);
    }
    
    void lvl7(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        
        
        lvl[2][2] = delimitation;
        lvl[2][3] = delimitation;
        lvl[2][4] = delimitation;
        lvl[2][5] = delimitation;
        lvl[2][6] = delimitation;
        lvl[2][7] = delimitation;
        lvl[2][8] = delimitation;
        
        
        lvl[3][2] = delimitation;
        lvl[3][3] = deffense;
        lvl[3][4] = wall;
        lvl[3][5] = wall;
        lvl[3][6] = wall;
        lvl[3][7] = deffense;
        lvl[3][8] = delimitation;

        lvl[4][2] = delimitation;
        lvl[4][3] = wall;
        lvl[4][4] = wall;
        lvl[4][5] = deffense;
        lvl[4][6] = wall;
        lvl[4][7] = wall;
        lvl[4][8] = delimitation;
        
        lvl[5][2] = delimitation;
        lvl[5][3] = wall;
        lvl[5][4] = deffense;
        lvl[5][5] = deffense;
        lvl[5][6] = deffense;
        lvl[5][7] = wall;
        lvl[5][8] = delimitation;
        
        lvl[6][2] = delimitation;
        lvl[6][3] = wall;
        lvl[6][4] = wall;
        lvl[6][5] = deffense;
        lvl[6][6] = wall;
        lvl[6][7] = wall;
        lvl[6][8] = delimitation;
        
        lvl[7][2] = delimitation;
        lvl[7][3] = deffense;
        lvl[7][4] = wall;
        lvl[7][5] = wall;
        lvl[7][6] = wall;
        lvl[7][7] = deffense;
        lvl[7][8] = delimitation;
        
        lvl[8][2] = delimitation;
        lvl[8][3] = delimitation;
        lvl[8][4] = delimitation;
        lvl[8][5] = delimitation;
        lvl[8][6] = delimitation;
        lvl[8][7] = delimitation;
        lvl[8][8] = delimitation;
        
        lvls.add(lvl);
    }
    
    
    void lvl8(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        
        
        
        lvl[2][4] = delimitation;
        lvl[2][5] = delimitation;
        lvl[2][6] = delimitation;
        
        
        lvl[3][2] = delimitation;
        lvl[3][3] = delimitation;
        lvl[3][4] = wall;
        lvl[3][5] = wall;
        lvl[3][6] = wall;
        lvl[3][7] = delimitation;
        lvl[3][8] = delimitation;

        lvl[4][1] = delimitation;
        lvl[4][2] = wall;
        lvl[4][3] = wall;
        lvl[4][4] = wall;
        lvl[4][5] = deffense;
        lvl[4][6] = wall;
        lvl[4][7] = wall;
        lvl[4][8] = wall;
        lvl[4][9] = delimitation;
        
        lvl[5][1] = delimitation;
        lvl[5][2] = wall;
        lvl[5][3] = deffense;
        lvl[5][4] = wall;
        lvl[5][5] = deffense;
        lvl[5][6] = wall;
        lvl[5][7] = deffense;
        lvl[5][8] = wall;
        lvl[5][9] = delimitation;
        
        lvl[6][1] = delimitation;
        lvl[6][2] = wall;
        lvl[6][3] = wall;
        lvl[6][4] = wall;
        lvl[6][5] = deffense;
        lvl[6][6] = wall;
        lvl[6][7] = wall;
        lvl[6][8] = wall;
        lvl[6][9] = delimitation;
        
        lvl[7][2] = delimitation;
        lvl[7][3] = delimitation;
        lvl[7][4] = wall;
        lvl[7][5] = wall;
        lvl[7][6] = wall;
        lvl[7][7] = delimitation;
        lvl[7][8] = delimitation;
        
        lvl[8][4] = delimitation;
        lvl[8][5] = delimitation;
        lvl[8][6] = delimitation;
        
        lvls.add(lvl);
    }
    
    
    void lvl9(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        
        
        
        lvl[2][3] = delimitation;
        lvl[2][4] = delimitation;
        lvl[2][5] = delimitation;
        
        lvl[3][0] = delimitation;
        lvl[3][1] = delimitation;
        lvl[3][2] = delimitation;
        lvl[3][3] = wall;
        lvl[3][4] = wall;
        lvl[3][5] = wall;
        lvl[3][6] = delimitation;
        lvl[3][7] = delimitation;
        lvl[3][8] = delimitation;
        lvl[3][9] = delimitation;

        lvl[4][0] = wall;
        lvl[4][1] = wall;
        lvl[4][2] = wall;
        lvl[4][3] = wall;
        lvl[4][4] = deffense;
        lvl[4][5] = wall;
        lvl[4][6] = wall;
        lvl[4][7] = wall;
        lvl[4][8] = wall;
        lvl[4][9] = delimitation;
        
        lvl[5][0] = wall;
        lvl[5][1] = deffense;
        lvl[5][2] = delimitation;
        lvl[5][3] = wall;
        lvl[5][4] = deffense;
        lvl[5][5] = wall;
        lvl[5][6] = delimitation;
        lvl[5][7] = deffense;
        lvl[5][8] = wall;
        lvl[5][9] = delimitation;
        
        lvl[6][0] = wall;
        lvl[6][1] = wall;
        lvl[6][2] = wall;
        lvl[6][3] = wall;
        lvl[6][4] = deffense;
        lvl[6][5] = wall;
        lvl[6][6] = wall;
        lvl[6][7] = wall;
        lvl[6][8] = wall;
        lvl[6][9] = delimitation;
        
        lvl[7][0] = delimitation;
        lvl[7][1] = delimitation;
        lvl[7][2] = delimitation;
        lvl[7][3] = wall;
        lvl[7][4] = wall;
        lvl[7][5] = wall;
        lvl[7][6] = delimitation;
        lvl[7][7] = delimitation;
        lvl[7][8] = delimitation;
        lvl[7][9] = delimitation;
        
        lvl[8][3] = delimitation;
        lvl[8][4] = delimitation;
        lvl[8][5] = delimitation;
        
        lvls.add(lvl);
    }
    
    
    void lvl10(){
        ElementType[][] lvl = {{free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free},
                                {free,free,free,free,free,free,free,free,free,free,free}};
        
        
        
        lvl[0][3] = delimitation;
        lvl[0][4] = wall;
        lvl[0][5] = wall;
        lvl[0][6] = wall;
        lvl[0][7] = delimitation;
        
        lvl[1][3] = delimitation;
        lvl[1][4] = wall;
        lvl[1][5] = deffense;
        lvl[1][6] = wall;
        lvl[1][7] = delimitation;
        
        lvl[2][1] = delimitation;
        lvl[2][2] = delimitation;
        lvl[2][3] = wall;
        lvl[2][4] = wall;
        lvl[2][5] = wall;
        lvl[2][6] = wall;
        lvl[2][7] = wall;
        lvl[2][8] = delimitation;
        lvl[2][9] = delimitation;
        
        lvl[3][0] = delimitation;
        lvl[3][1] = wall;
        lvl[3][2] = wall;
        lvl[3][3] = wall;
        lvl[3][4] = deffense;
        lvl[3][5] = delimitation;
        lvl[3][6] = deffense;
        lvl[3][7] = wall;
        lvl[3][8] = wall;
        lvl[3][9] = wall;
        lvl[3][10] = delimitation;
        
        lvl[4][0] = delimitation;
        lvl[4][1] = wall;
        lvl[4][2] = deffense;
        lvl[4][3] = wall;
        lvl[4][4] = delimitation;
        lvl[4][5] = deffense;
        lvl[4][6] = delimitation;
        lvl[4][7] = wall;
        lvl[4][8] = deffense;
        lvl[4][9] = wall;
        lvl[4][10] = delimitation;
        
        lvl[5][0] = delimitation;
        lvl[5][1] = wall;
        lvl[5][2] = wall;
        lvl[5][3] = wall;
        lvl[5][4] = deffense;
        lvl[5][5] = delimitation;
        lvl[5][6] = deffense;
        lvl[5][7] = wall;
        lvl[5][8] = wall;
        lvl[5][9] = wall;
        lvl[5][10] = delimitation;
        
        lvl[6][1] = delimitation;
        lvl[6][2] = delimitation;
        lvl[6][3] = wall;
        lvl[6][4] = wall;
        lvl[6][5] = wall;
        lvl[6][6] = wall;
        lvl[6][7] = wall;
        lvl[6][8] = delimitation;
        lvl[6][9] = delimitation;
        
        lvl[7][3] = delimitation;
        lvl[7][4] = wall;
        lvl[7][5] = deffense;
        lvl[7][6] = wall;
        lvl[7][7] = delimitation;
        
        lvl[8][3] = delimitation;
        lvl[8][4] = wall;
        lvl[8][5] = wall;
        lvl[8][6] = wall;
        lvl[8][7] = delimitation;
        
        lvl[9][3] = delimitation;
        lvl[9][4] = delimitation;
        lvl[9][5] = delimitation;
        lvl[9][6] = delimitation;
        
        lvls.add(lvl);
    }
    
}
