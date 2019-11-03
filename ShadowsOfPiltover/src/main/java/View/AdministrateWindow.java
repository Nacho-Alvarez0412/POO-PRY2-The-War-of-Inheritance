/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DummyWarriorTemplate;
import Model.Enums.WarriorType;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author nacho
 */
public class AdministrateWindow extends javax.swing.JFrame {
    DummyWarriorTemplate dummy;
    /**
     * Creates new form AdministrateWindow
     * @param dummy
     */
    public AdministrateWindow(DummyWarriorTemplate dummy) {
        initComponents();
        this.setSize(1138, 736);
        this.dummy = dummy;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(830, 340, 260, 250);

        NameTextField.setText("Name");
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextField);
        NameTextField.setBounds(70, 70, 190, 30);

        jTextField1.setText("Image Attack");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 130, 190, 30);

        jTextField2.setText("Image Move");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(70, 190, 190, 30);

        jTextField3.setText("Image Die");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(70, 250, 190, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Range");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 440, 41, 16);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(310, 460, 60, 26);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Health");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 440, 37, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Attack");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 440, 38, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Attack Speed");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 440, 80, 16);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(68, 460, 50, 26);
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(148, 460, 50, 26);
        getContentPane().add(jSpinner4);
        jSpinner4.setBounds(228, 460, 50, 26);

        jTextField4.setText("Sound");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(70, 300, 190, 30);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 50, 260, 250);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(830, 50, 260, 250);

        jButton1.setText("Create Warrior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 550, 220, 70);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Size");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(420, 440, 50, 20);
        getContentPane().add(jSpinner5);
        jSpinner5.setBounds(410, 460, 60, 26);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cost");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(500, 440, 50, 20);
        getContentPane().add(jSpinner6);
        jSpinner6.setBounds(490, 460, 60, 26);

        jTextField5.setText("Warrior Type");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(70, 350, 190, 30);

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 640, 63, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\Images\\UserMenuBackground.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1180, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = this.NameTextField.getText();
        String attack = this.jTextField1.getText();
        String move = this.jTextField2.getText();
        String die = this.jTextField3.getText();
        String sound = this.jTextField4.getText();
        String warriorType = this.jTextField5.getText();
        
        int range = (int)this.jSpinner2.getValue();
        int health = (int)this.jSpinner2.getValue();
        int damage = (int)this.jSpinner2.getValue();
        int attackspeed = (int)this.jSpinner2.getValue();
        int size = (int)this.jSpinner2.getValue();
        int cost = (int)this.jSpinner2.getValue();
        
        ArrayList<ImageIcon> appereance = new ArrayList();
        appereance.add(new ImageIcon(move));
        appereance.add(new ImageIcon(attack));
        appereance.add(new ImageIcon(die));
        appereance.add(new ImageIcon("C:\\Users\\nacho\\Desktop\\Proyectos\\Java\\The-War-of-Inheritance\\ShadowsOfPiltover\\src\\main\\java\\View\\Images\\Grave.png"));
       
        if(warriorType == "Meele")
            dummy.Load(name, health, damage, damage, range, cost, range, WarriorType.Meele, appereance, null);
        else if(warriorType == "Ranged")
            dummy.Load(name, health, damage, damage, range, cost, range, WarriorType.Ranged, appereance, null);
        else if(warriorType == "Airborne")
            dummy.Load(name, health, damage, damage, range, cost, range, WarriorType.Airborne, appereance, null);
        else if(warriorType == "Hero")
            dummy.Load(name, health, damage, damage, range, cost, range, WarriorType.Hero, appereance, null);
        else
            dummy.Load(name, health, damage, damage, range, cost, range, WarriorType.Beast, appereance, null);
        
        this.jLabel8.setIcon(new ImageIcon(move));
        this.jLabel9.setIcon(new ImageIcon(attack));
        this.jLabel2.setIcon(new ImageIcon(die));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrateWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdministrateWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}