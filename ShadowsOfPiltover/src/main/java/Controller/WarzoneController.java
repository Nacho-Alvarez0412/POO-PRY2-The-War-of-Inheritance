/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BoardGenerator;
import Model.DataBase;
import Model.Game;
import Model.Piece;
import Model.User;
import Model.Warrior;
import Model.Warriors.Skeleton;
import View.WarzoneWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class WarzoneController implements ActionListener {
    Piece[][] warzone;
    Game gameController;
    User user;
    DataBase database;
    WarzoneWindow view;
    boolean evento;
    
    WarzoneController(User user,DataBase database){
        this.user = user;
        this.database = database;
        this.evento = false;
        warzone = BoardGenerator.generateBoard(database.templates.get(user.getCurrentLvl()-1), user.getCurrentLvl());
        gameController = new Game(user,warzone,view,this);
        gameController._init_();
        gameController.start();
        deployArmy();
    }
    
    public void _init_(){
        view = new WarzoneWindow(warzone);
        view.setVisible(true);
        view.jButton1.addActionListener(this);
        view.jButton2.addActionListener(this);
        
    }
    
    public void deployArmy(){
        boolean deploy = false;
        Random rand = new Random();
        for(Warrior warrior : user.getArmy()){
            while(!deploy){
                int i = rand.nextInt(15);
                int j = rand.nextInt(15);
                
                if(warzone[i][j] == null){
                    warrior.deploy(i, j, warzone);
                    deploy = !deploy;
                }
            }
            deploy = !deploy;
        }
    }
    
    public void endGame(){
        gameController.stopGame();
        SelectArmyController armySelect = new SelectArmyController(user,database);
        armySelect._init_();
        this.view.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(evento){
            evento = !evento;
            return;
        }
        
        else if (e.getSource().equals(view.jButton1)){
            evento = true;
            gameController.pause();
        }
        
        else if(e.getSource().equals(view.jButton2)){
            evento = true;
            endGame();
        }
    }
    
}
