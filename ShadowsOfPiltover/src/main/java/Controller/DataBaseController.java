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

/**
 *
 * @author diego
 */
public class DataBaseController implements ActionListener{
    private MainWindow view;
    private DataBase model;

    public DataBaseController(MainWindow vista, DataBase model) {
        this.view = vista;
        this.model = model;
        _init_();
    }
    
    public void _init_(){
        view.NewUserButton.addActionListener(this);
        view.jButton1.addActionListener(this);
        view.setTitle("Dead Tides");
        view.setSize(1100, 800);
        view.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.NewUserButton)){
            boolean created = model.createUser(view.UsernameTextField.getText(), view.PasswordTextField.getText());
            if(created){
                JOptionPane.showMessageDialog(view, "User created Succesfully");
            }
            
            else{
                JOptionPane.showMessageDialog(view, "Username not valid or available");
            }
        }
        
        else if(e.getSource().equals(view.jButton1)){
            boolean authentication = model.authenticate(view.UsernameTextField.getText(), view.PasswordTextField.getText());
            if(authentication){
                User user = model.getUser(view.UsernameTextField.getText());
                
                UserMenuController userMenu = new UserMenuController(new MenuUser(),user);
                view.setVisible(false);
                view.dispose();
                userMenu._init_();
            }
            else{
                JOptionPane.showMessageDialog(view, "Invalid username or password");
            }
        }
      
    }
    
}
