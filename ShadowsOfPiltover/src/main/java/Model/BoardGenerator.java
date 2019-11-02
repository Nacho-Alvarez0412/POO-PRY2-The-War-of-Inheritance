/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Deffenses.*;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class BoardGenerator {
    
    /**
     *
     * @param template
     * @param lvl
     * @return A gameboard with the deffenses set
     */
    public static Piece[][] generateBoard(int[][] template,int lvl){
        Random randomGenerator = new Random();
        Piece[][] board = new Piece[15][15];
        
        for(int i = 0 ; i < 15 ; i++){
            for(int j = 0 ; j < 15 ; j++){
                if(template[i][j] != 0){
                    if(template[i][j] == 4){
                        board[i][j] = new Wall(lvl,board);
                        board[i][j].setX(j);
                        board[i][j].setY(i);
                        
                        
                    }
                    
                    else if(template[i][j] == 3){
                        
                        board[i][j] = new TownHall(lvl,board);
                        board[i][j].setX(j);
                        board[i][j].setY(i);
                        System.out.println(board[i][j].getX());System.out.println(board[i][j].getY());
                    }
                    
                    else if(template[i][j] == 2){
                        int randomInt = randomGenerator.nextInt(5);
                        
                        switch (randomInt){
                            case 4: //Creates Bomb
                                if(lvl>=8){
                                    board[i][j] = new Bomb(lvl-8,board);
                                    board[i][j].setX(j);
                                    board[i][j].setY(i);
                                    break;
                                }
                                else
                                    randomInt = 3;
                            case 3: //Creates Mortar
                                if(lvl>=6){
                                    board[i][j] = new Mortar(lvl-5,board);
                                    board[i][j].setX(j);
                                    board[i][j].setY(i);
                                    break;
                                }
                                else
                                    randomInt = 2;
                            case 2: //Creates Tower
                                if(lvl>=4){
                                    board[i][j] = new Tower(lvl-3,board);
                                    board[i][j].setX(j);
                                    board[i][j].setY(i);
                                    break;
                                }
                                else
                                    randomInt = 1;
                            case 1: //Creates Firecracker
                                if(lvl>=3){
                                    board[i][j] = new Firecracker(lvl-2,board);
                                    board[i][j].setX(j);
                                    board[i][j].setY(i);
                                    break;
                                }
                                else
                                    randomInt = 0;
                            default: //Creates Cannon
                                board[i][j] = new Cannon(lvl,board);
                                board[i][j].setX(j);
                                board[i][j].setY(i);
                                break;                                
                        }
                    }
                }  
            }
        }
        return board;
    }
    
}
