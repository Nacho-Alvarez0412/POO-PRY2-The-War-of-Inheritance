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
import View.WarzoneWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
    
    WarzoneController(User user,DataBase database){
        this.user = user;
        this.database = database;
        warzone = BoardGenerator.generateBoard(database.templates.get(user.getCurrentLvl()-1), user.getCurrentLvl());
        gameController = new Game(user,warzone);
        gameController.run();
        deployArmy();
    }
    
    public void _init_(){
        view = new WarzoneWindow(warzone);
        view.setVisible(true);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
