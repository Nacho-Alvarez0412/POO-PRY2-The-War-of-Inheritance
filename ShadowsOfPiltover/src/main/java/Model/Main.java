/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DataBaseController;
import Model.Warriors.Archer;
import Model.Warriors.Dragon;
import Model.Warriors.Skeleton;
import View.MainWindow;

/**
 *
 * @author nacho
 */
public class Main {
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               MainWindow main = new MainWindow();
                DataBase dataBase = new DataBase();
//                User user = new User("Nacho","1234");
//                user.currentLvl = 5;
//                Piece[][] warzone = BoardGenerator.generateBoard(dataBase.templates.get(4), 4);
//                Game game = new Game(user,warzone);
//                game.warzone[2][2] = new Skeleton(5);
//                game.warzone[4][10] = new Dragon(5);
//                game.warzone[1][1] = new Archer(5);
//                game.warzone[3][5] = new Archer(5);
//                game.warzone[6][4] = new Dragon(5);
//                
//                
//                
//                
//                game.printWarzone();
//                
//                
//                game.warzone[1][1].deploy(1,1,warzone);
//                game.warzone[2][2].deploy(2,2,warzone);
//                game.warzone[4][10].deploy(4,10,warzone);
//                game.warzone[3][5].deploy(3,5,warzone);
//                game.warzone[6][4].deploy(6,4,warzone);
//                game.activateDeffenses();

                DataBaseController db = new DataBaseController(main,dataBase);
                db._init_();
                                
            }
        });
    }
}