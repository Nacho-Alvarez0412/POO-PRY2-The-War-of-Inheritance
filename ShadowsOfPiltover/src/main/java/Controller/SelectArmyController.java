/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.Warriors.Archer;
import Model.Warriors.Dragon;
import View.ArmySelectionWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class SelectArmyController implements ActionListener{
    
    ArmySelectionWindow vista;
    User user;
    JLabel lvl;
    JLabel cantGold;
    JLabel armySpace;
    boolean evento;
    
    public SelectArmyController(User user){
        vista = new ArmySelectionWindow();
        this.user = user;
        _init_();
    }
    
    public void _init_(){
        vista.Warrior1.addActionListener(this);
        vista.Warrior2.addActionListener(this);
        vista.Warrior3.addActionListener(this);
        vista.Warrior4.addActionListener(this);
        vista.Warrior5.addActionListener(this);
        vista.Warrior6.addActionListener(this);
        vista.Warrior7.addActionListener(this);
        vista.Warrior8.addActionListener(this);
        vista.FightButton.addActionListener(this);
        vista.CantGoldLabel.setText(String.valueOf(user.getGold()));
        vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
        vista.CantLvlLabel.setText(String.valueOf(user.getCurrentLvl()));
        
        vista.setVisible(true);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(evento){
            evento = !evento;
            return;
        }
        
        if (e.getSource().equals(vista.Warrior1)){
            Archer warrior = new Archer(user.getCurrentLvl());
            
            if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){
                user.addWarrior(warrior);
                System.out.println("Arquera Agregada");
                user.setCampSize(user.getCampSize()-warrior.armySlots);
            }
            else
                JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
        }
        
        else if (e.getSource().equals(vista.Warrior2)){
            Dragon warrior = new Dragon(user.getCurrentLvl());
            
            if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){
                user.addWarrior(warrior);
                System.out.println("Dragon Agregada");
                user.setCampSize(user.getCampSize()-warrior.armySlots);
            }
            else
                JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
        }
    }
    
}
