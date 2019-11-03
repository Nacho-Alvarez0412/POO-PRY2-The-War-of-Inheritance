/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.sound.sampled.Clip;


/**
 *
 * @author diego
 */
public class DataBaseController implements ActionListener{
    private MainWindow view;
    private DataBase model;
    private boolean evento;
    
    

    public DataBaseController(MainWindow vista, DataBase model) {
        this.view = vista;
        this.model = model;
        _init_();
        evento = false;
    }
    
    public void _init_(){
        view.NewUserButton.addActionListener(this);
        view.jButton1.addActionListener(this);
        view.Administrate.addActionListener(this);
        view.setTitle("Dead Tides");
        view.setSize(1100, 800);
        view.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(evento){
            evento = !evento;
            return;
        }
        
        else if (e.getSource().equals(view.NewUserButton)){
            evento = true;
            boolean created = model.createUser(view.UsernameTextField.getText(), view.PasswordTextField.getText());
            if(created){
                JOptionPane.showMessageDialog(view, "User created Succesfully");
                model.closeDataBase();
            }
            
            else{
                JOptionPane.showMessageDialog(view, "Username not valid or available");
            }
        }
        
        else if(e.getSource().equals(view.jButton1)){
            evento = true;
            boolean authentication = model.authenticate(view.UsernameTextField.getText(), view.PasswordTextField.getText());
            if(authentication){
                User user = model.getUser(view.UsernameTextField.getText());
                
                UserMenuController userMenu = new UserMenuController(new MenuUser(),user,model);
                view.setVisible(false);
                view.dispose();
                userMenu._init_();
            }
            else{
                JOptionPane.showMessageDialog(view, "Invalid username or password");
            }
        }
        
        else if (e.getSource().equals(view.Administrate)){
            evento = true;
            AdministrateWindow window = new AdministrateWindow(model.warriorTemplate);
            window.setVisible(true);
            model.closeDataBase();
            
            
        }
      
    }
    
}
