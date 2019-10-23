/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nacho
 */
public class Main {
    public static void main(String[] args){
        DataBase dataBase = new DataBase();
        System.out.println(dataBase.createUser("Juan", "password"));
        System.out.println(dataBase.authenticate("Juan", "lopez123"));
        dataBase.closeDataBase();
        
    }
}