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
public class TemplateGenerator {
    private ArrayList<int[][]> templates;

    public TemplateGenerator() {
        this.templates = new ArrayList<>();
        templates.add(lvl1());
        templates.add(lvl2());
        templates.add(lvl3());
        templates.add(lvl4());
        templates.add(lvl5());
        templates.add(lvl6());
        templates.add(lvl7());
        templates.add(lvl8());
        templates.add(lvl9());
        templates.add(lvl10());
        //templates.add(lvl11());
        //templates.add(lvl12());
        //templates.add(lvl13());
        //templates.add(lvl14());
        //templates.add(lvl15());
    }

    public ArrayList<int[][]> getTemplates() {
        return templates;
    }

    private int[][]lvl1() {
        int[][] template = new int[15][15];
        
        template[8][8] = 2;
        template[9][9] = 3;
        template[10][10] = 2;
        
        return template;
    }

    private int[][] lvl2() {
        int[][] template = new int[15][15];
        
        template[7][9] = 2;
        
        template[8][8] = 4;
        template[8][9] = 4;
        template[8][10] = 4;
        
        template[9][7] = 2;
        template[9][8] = 4;
        template[9][9] = 3;
        template[9][10] = 4;
        template[9][11] = 2;
        
        template[10][8] = 4;
        template[10][9] = 4;
        template[10][10] = 4;
        
        template[11][9] = 2;
        
        return template;
    }

    private int[][] lvl3() {
        int[][] template = new int[15][15];
                
        template[8][8] = 2;
        template[8][9] = 4;
        template[8][10] = 2;
        
        template[9][8] = 4;
        template[9][9] = 3;
        template[9][10] = 4;
        
        template[10][8] = 2;
        template[10][9] = 4;
        template[10][10] = 2;
        
        return template;
    }

    private int[][] lvl4() {
        int[][] template = new int[15][15];
                
        template[7][7] = 4;
        template[7][8] = 4;
        template[7][9] = 4;
        template[7][10] = 4;
        template[7][11] = 4;
        
        template[8][7] = 4;
        template[8][8] = 2;
        template[8][9] = 0;
        template[8][10] = 2;
        template[8][11] = 4;
        
        template[9][7] = 4;
        template[9][8] = 0;
        template[9][9] = 3;
        template[9][10] = 0;
        template[9][11] = 4;
        
        template[10][7] = 4;
        template[10][8] = 2;
        template[10][9] = 0;
        template[10][10] = 2;
        template[10][11] = 4;
        
        template[11][7] = 4;
        template[11][8] = 4;
        template[11][9] = 4;
        template[11][10] = 4;
        template[11][11] = 4;
        
        return template;
    }

    private int[][] lvl5() {
        int[][] template = new int[15][15];
                
        template[8][7] = 4;
        template[8][8] = 4;
        template[8][9] = 0;
        template[8][10] = 4;
        template[8][11] = 4;
        
        template[9][7] = 4;
        template[9][8] = 2;
        template[9][9] = 3;
        template[9][10] = 2;
        template[9][11] = 4;
        
        template[10][7] = 4;
        template[10][8] = 4;
        template[10][9] = 0;
        template[10][10] = 4;
        template[10][11] = 4;
        
        return template;
    }

    private int[][] lvl6() {
        int[][] template = new int[15][15];
                
        template[6][8] = 4;
        template[6][9] = 4;
        template[6][10] = 4;
        
        template[7][8] = 4;
        template[7][9] = 2;
        template[7][10] = 4;
        
        template[8][8] = 4;
        template[8][9] = 4;
        template[8][10] = 4;
        
        template[9][8] = 4;
        template[9][9] = 3;
        template[9][10] = 4;
        
        template[10][8] = 4;
        template[10][9] = 4;
        template[10][10] = 4;
        
        template[11][8] = 4;
        template[11][9] = 2;
        template[11][10] = 4;
        
        template[12][8] = 4;
        template[12][9] = 4;
        template[12][10] = 4;
        
        return template;
    }

    private int[][] lvl7() {
        int[][] template = new int[15][15];
                
        template[7][7] = 2;
        template[7][8] = 4;
        template[7][9] = 4;
        template[7][10] = 4;
        template[7][10] = 2;
        
        template[8][7] = 4;
        template[8][8] = 4;
        template[8][9] = 2;
        template[8][10] = 4;
        template[8][10] = 4;
        
        template[9][7] = 4;
        template[9][8] = 2;
        template[9][9] = 3;
        template[9][10] = 2;
        template[9][10] = 4;
        
        template[10][7] = 4;
        template[10][8] = 4;
        template[10][9] = 2;
        template[10][10] = 4;
        template[10][10] = 4;
        
        template[11][7] = 2;
        template[11][8] = 4;
        template[11][9] = 4;
        template[11][10] = 4;
        template[11][10] = 2;
        
        
        
        return template;
    }

    private int[][] lvl8() {
        int[][] template = new int[15][15];
                
        template[7][8] = 4;
        template[7][9] = 4;
        template[7][10] = 4;
        
        template[8][6] = 4;
        template[8][7] = 4;
        template[8][8] = 4;
        template[8][9] = 2;
        template[8][10] = 4;
        template[8][11] = 4;
        template[8][12] = 4;
        
        template[9][6] = 4;
        template[9][7] = 2;
        template[9][8] = 4;
        template[9][9] = 3;
        template[9][10] = 4;
        template[9][11] = 2;
        template[9][12] = 4;
        
        template[10][6] = 4;
        template[10][7] = 4;
        template[10][8] = 4;
        template[10][9] = 2;
        template[10][10] = 4;
        template[10][11] = 4;
        template[10][12] = 4;
        
        template[11][8] = 4;
        template[11][9] = 4;
        template[11][10] = 4;
         
        return template;
    }

    private int[][] lvl9() {
        int[][] template = new int[15][15];
                
        template[7][7] = 4;
        template[7][8] = 4;
        template[7][9] = 4;
        
        template[8][4] = 4;
        template[8][5] = 4;
        template[8][6] = 4;
        template[8][7] = 4;
        template[8][8] = 2;
        template[8][9] = 4;
        template[8][10] = 4;
        template[8][11] = 4;
        template[8][12] = 4;
        
        template[9][4] = 4;
        template[9][5] = 2;
        template[9][6] = 2;
        template[9][7] = 4;
        template[9][8] = 3;
        template[9][9] = 4;
        template[9][10] = 2;
        template[9][11] = 2;
        template[9][12] = 4;
        
        template[10][4] = 4;
        template[10][5] = 4;
        template[10][6] = 4;
        template[10][7] = 4;
        template[10][8] = 2;
        template[10][9] = 4;
        template[10][10] = 4;
        template[10][11] = 4;
        template[10][12] = 4;
        
        template[11][7] = 4;
        template[11][8] = 4;
        template[11][9] = 4;
         
        return template;
    }

    private int[][] lvl10() {
        int[][] template = new int[15][15];
                
        template[4][8] = 4;
        template[4][9] = 4;
        template[4][10] = 4;
        
        template[5][8] = 4;
        template[5][9] = 2;
        template[5][10] = 4;
        
        template[6][7] = 4;
        template[6][8] = 4;
        template[6][9] = 4;
        template[6][10] = 4;
        template[6][11] = 4;
        
        template[7][5] = 4;
        template[7][6] = 4;
        template[7][7] = 4;
        template[7][8] = 2;
        template[7][9] = 0;
        template[7][10] = 2;
        template[7][11] = 4;
        template[7][12] = 4;
        template[7][13] = 4;
        
        template[8][5] = 4;
        template[8][6] = 2;
        template[8][7] = 4;
        template[8][8] = 0;
        template[8][9] = 3;
        template[8][10] = 0;
        template[8][11] = 4;
        template[8][12] = 2;
        template[8][13] = 4;
        
        template[9][5] = 4;
        template[9][6] = 4;
        template[9][7] = 4;
        template[9][8] = 2;
        template[9][9] = 0;
        template[9][10] = 2;
        template[9][11] = 4;
        template[9][12] = 4;
        template[9][13] = 4;
        
        template[10][7] = 4;
        template[10][8] = 4;
        template[10][9] = 4;
        template[10][10] = 4;
        template[10][11] = 4;
        
        template[11][8] = 4;
        template[11][9] = 2;
        template[11][10] = 4;
        
        template[12][8] = 4;
        template[12][9] = 4;
        template[12][10] = 4;
         
        return template;
    }

    private int[][] lvl11() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int[][] lvl12() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int[][] lvl13() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int[][] lvl14() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int[][] lvl15() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
