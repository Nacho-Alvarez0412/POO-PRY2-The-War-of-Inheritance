/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Enums.ElementType;
import Model.Piece;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public class WarzoneWindow extends javax.swing.JFrame {

    Piece[][] warzone;
    
    
    public WarzoneWindow(Piece[][] warzone) {
        initComponents();
        this.warzone = warzone;
        this.setSize(437*4,249*4);
        
        printWarBase();
        printBackground();
    }
    
    public void printBackground(){
        int x = 0;
        int y = 0;
        
        int height = 249;
        int lenght = 437;
        
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1 ; j<=4 ; j++){
                JLabel label = new JLabel();
                label.setSize(lenght,height);
                label.setIcon(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\Images\\GrassField.jpg"));
                this.add(label).setLocation(x, y);
                x+= 437;
            }
            x = 0;
            y += 249;
        }
    }
    
    public void printWarBase(){
        int x = 25;
        int y = 25;
        for(int i = 0 ; i<15 ; i++){
            for(int j = 0 ; j<15 ; j++){
                if(warzone[i][j] != null && warzone[i][j].getElementType() == ElementType.deffense){
                    JLabel element =warzone[i][j].getFrame();
                    element.setSize(250,250);
                    this.add(element).setLocation(j*70,i*40);
                    x+=7;
                }
                y+=7;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(WarzoneWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarzoneWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarzoneWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarzoneWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarzoneWindow(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}