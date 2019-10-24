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
    
    public DataBase(){
        DataBase dataBase = (DataBase) FileManager.readObject("DataBase.txt");
        if (dataBase != null){
            this.lvls = dataBase.lvls;
            this.users = dataBase.users;
        }
        
        else{
            this.lvls = new ArrayList<int[][]>();
            this.users = new ArrayList<User>();
        }
        
    }
    
    public boolean authenticate(String username,String password){
        
        for(int i = 0 ; i < users.size() ; i++){
            if(users.get(i).username.equals(username)){
                if(users.get(i).password.equals(password))
                    return true;
                return false;
            }
        }
        return false;
    }
    
    public boolean isValid(String name){
        for(int i = 0 ; i < users.size() ; i++){
            if(users.get(i).username.equals(name))
                return false;
        }
        return true;
    }
    
    public boolean createUser(String name,String password){
        User user = new User(name,password);
        
        if(isValid(name)){
            users.add(user);
            return true;
        }
        return false;
    }
    
    public void closeDataBase(){
        FileManager.writeObject(this, "DataBase.txt");
    }
    
    @Override
    public String  toString(){
        return users.toString();
    }
    
    public User getUser(String name){
        for(int i = 0 ; i < users.size() ; i++){
            if(users.get(i).username.equals(name))
                return users.get(i);
        }
        return null;
    }
    
}