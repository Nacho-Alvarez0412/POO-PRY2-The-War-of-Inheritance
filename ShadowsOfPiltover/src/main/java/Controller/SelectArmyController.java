/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataBase;
import Model.DummyWarriorTemplate;
import Model.User;
import Model.Warrior;
import Model.Warriors.Archer;
import Model.Warriors.Bear;
import Model.Warriors.Dragon;
import Model.Warriors.DummyWarrior;
import Model.Warriors.Skeleton;
import Model.Warriors.StoneGolem;
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
    DataBase database;
    int originalSpaces;
    int originalGold;
    
    public SelectArmyController(User user,DataBase database){
        vista = new ArmySelectionWindow();
        this.user = user;
        this.database = database;
        this.originalSpaces = user.getCampSize();
        this.originalGold = user.getGold();
        database.closeDataBase();
        _init_();
    }
    
    public void _init_(){
        vista.Warrior4.addActionListener(this);
        vista.Warrior2.addActionListener(this);
        vista.Warrior3.addActionListener(this);
        vista.Warrior6.addActionListener(this);
        vista.Warrior5.addActionListener(this);
        vista.Warrior1.addActionListener(this);
        vista.Warrior7.addActionListener(this);
        vista.Warrior8.addActionListener(this);
        vista.FightButton.addActionListener(this);
        vista.CantGoldLabel.setText(String.valueOf(user.getGold()));
        vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
        vista.CantLvlLabel.setText(String.valueOf(user.getCurrentLvl()));
        
        vista.setVisible(true);
        
        vista.Warrior1.setToolTipText(Warrior.getWarrior(new Skeleton(user.getCurrentLvl())));
        vista.Warrior2.setToolTipText(Warrior.getWarrior(new Archer(user.getCurrentLvl())));
        vista.Warrior3.setToolTipText(Warrior.getWarrior(new Bear(user.getCurrentLvl())));
        vista.Warrior4.setToolTipText(Warrior.getWarrior(new Dragon(user.getCurrentLvl())));
        vista.Warrior5.setToolTipText(Warrior.getWarrior(new StoneGolem(user.getCurrentLvl())));
        
        if(database.warriorTemplate.isLoaded()){
            vista.Warrior6.setToolTipText(Warrior.getWarrior(new DummyWarrior(database.warriorTemplate,user.getCurrentLvl())));
            vista.Warrior6.setIcon(database.warriorTemplate.appereance.get(1));
        }
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(evento){
            evento = !evento;
            return;
        }
        
        else if (e.getSource().equals(vista.Warrior1)){
            Skeleton warrior = new Skeleton(user.getCurrentLvl());
            evento = true;
            
            if(user.getCurrentLvl() >= warrior.getUnlockLvl()){
            
                if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){
                    evento = true;
                    user.addWarrior(warrior);
                    user.setCampSize(user.getCampSize()-warrior.armySlots);
                    user.setGold(user.getGold()-warrior.getCost());
                    vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
                    vista.CantGoldLabel.setText(String.valueOf(user.getGold()));
                }
                else
                    JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
            }
            else
                    JOptionPane.showMessageDialog(vista, "You dont have enough level to invoke this warrior");
        }
        
        else if (e.getSource().equals(vista.Warrior2)){
            Archer warrior = new Archer(user.getCurrentLvl());
            evento = true;
            
            if(user.getCurrentLvl() >= warrior.getUnlockLvl()){
            
                if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){

                    user.addWarrior(warrior);
                    user.setCampSize(user.getCampSize()-warrior.armySlots);
                    user.setGold(user.getGold()-warrior.getCost());
                    vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
                    vista.CantGoldLabel.setText(String.valueOf(user.getGold()));

                }
                else
                    JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
            }
            else
                JOptionPane.showMessageDialog(vista, "You dont have enough level to invoke this warrior");
        }
        
        else if (e.getSource().equals(vista.Warrior3)){
            Bear warrior = new Bear(user.getCurrentLvl());
            evento = true;
            
            if(user.getCurrentLvl() >= warrior.getUnlockLvl()){
            
                if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){

                    user.addWarrior(warrior);
                    user.setCampSize(user.getCampSize()-warrior.armySlots);
                    user.setGold(user.getGold()-warrior.getCost());
                    vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
                    vista.CantGoldLabel.setText(String.valueOf(user.getGold()));

                }
                else
                    JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
            }
            else
                JOptionPane.showMessageDialog(vista, "You dont have enough level to invoke this warrior");
        }
        
        else if (e.getSource().equals(vista.Warrior4)){
            Dragon warrior = new Dragon(user.getCurrentLvl());
            evento = true;
            
            if(user.getCurrentLvl() >= warrior.getUnlockLvl()){
            
                if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){

                    user.addWarrior(warrior);
                    user.setCampSize(user.getCampSize()-warrior.armySlots);
                    user.setGold(user.getGold()-warrior.getCost());
                    vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
                    vista.CantGoldLabel.setText(String.valueOf(user.getGold()));

                }
                else
                    JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
            }
            else
                JOptionPane.showMessageDialog(vista, "You dont have enough level to invoke this warrior");
        }
        
        else if (e.getSource().equals(vista.Warrior5)){
            StoneGolem warrior = new StoneGolem(user.getCurrentLvl());
            evento = true;
            
            if(user.getCurrentLvl() >= warrior.getUnlockLvl()){
            
                if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){

                    user.addWarrior(warrior);
                    user.setCampSize(user.getCampSize()-warrior.armySlots);
                    user.setGold(user.getGold()-warrior.getCost());
                    vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
                    vista.CantGoldLabel.setText(String.valueOf(user.getGold()));

                }
                else
                    JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
            }
            else
                JOptionPane.showMessageDialog(vista, "You dont have enough level to invoke this warrior");
        }
        
        else if (e.getSource().equals(vista.FightButton)){
            evento = true;
            
            user.setCampSize(originalSpaces);
            user.setGold(originalGold);
            
            WarzoneController controller = new WarzoneController(user, database);
            controller._init_();
            this.vista.dispose();
            
            
        }
        
        else if (e.getSource().equals(vista.Warrior6)){
            DummyWarrior warrior = new DummyWarrior(database.warriorTemplate,user.getCurrentLvl());
            evento = true;
            
            if(database.warriorTemplate.isLoaded()){
            
                if(user.getCampSize()>=warrior.armySlots && user.getGold()>=warrior.getCost()){

                    user.addWarrior(warrior);
                    user.setCampSize(user.getCampSize()-warrior.armySlots);
                    user.setGold(user.getGold()-warrior.getCost());
                    vista.CanrArmyLabel.setText(String.valueOf(user.getCampSize()));
                    vista.CantGoldLabel.setText(String.valueOf(user.getGold()));

                }
                else
                    JOptionPane.showMessageDialog(vista, "There is no more room in your barracks or enough money in your wallet");
            }
        }
         
    }
    
    
    
}
