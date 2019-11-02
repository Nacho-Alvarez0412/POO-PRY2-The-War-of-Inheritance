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
import View.WarzoneWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
    
    public void _init_(){
        view = new WarzoneWindow(warzone);
        gameController.printWarzone();
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
