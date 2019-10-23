/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class DataBase implements Serializable {
    //Atributos
    ArrayList<int[][]> lvls;
    ArrayList<User> users;
    
    DataBase(){
        DataBase dataBase = (DataBase) FileManager.readObject("DataBase.txt");
        if (dataBase != null){
            this.lvls = dataBase.lvls;
            this.users = dataBase.users;
        }
        
        else{
            System.out.println("Entre");
            this.lvls = new ArrayList<int[][]>();
            this.users = new ArrayList<User>();
        }
        
    }
    
    boolean authenticate(String username,String password){
        
        for(int i = 0 ; i < users.size() ; i++){
            if(users.get(i).username.equals(username)){
                if(users.get(i).password.equals(password))
                    return true;
                return false;
            }
        }
        return false;
    }
    
    boolean isValid(String name){
        for(int i = 0 ; i < users.size() ; i++){
            if(users.get(i).username.equals(name))
                return false;
        }
        return true;
    }
    
    boolean createUser(String name,String password){
        User user = new User(name,password);
        
        if(isValid(name)){
            users.add(user);
            return true;
        }
        return false;
    }
    
    void closeDataBase(){
        FileManager.writeObject(this, "DataBase.txt");
    }
    
    @Override
    public String  toString(){
        return users.toString();
    }
    
}