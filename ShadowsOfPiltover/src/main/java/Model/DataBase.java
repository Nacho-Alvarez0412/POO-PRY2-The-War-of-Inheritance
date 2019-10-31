/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Enums.PieceTypes;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class DataBase implements Serializable {
    //Atributos
    ArrayList<User> users;
    ArrayList<int[][]> templates;
    
    public DataBase(){
        DataBase dataBase = (DataBase) FileManager.readObject("DataBase.txt");
        if (dataBase != null){
            this.users = dataBase.users;
            this.templates = dataBase.templates;
        }
        
        else{
            this.users = new ArrayList<>();
            this.templates = new ArrayList<>();
            loadLvls();
        }
        
    }
    
    public boolean authenticate(String username,String password){
        
        for(int i = 0 ; i < users.size() ; i++){
            if(users.get(i).username.equals(username) && users.get(i).password.equals(password))
                return true;
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
    
    public User getUser(String name){
        for(int i = 0 ; i < users.size() ; i++){
            if(users.get(i).username.equals(name))
                return users.get(i);
        }
        return null;
    }
    
    private void loadLvls(){
        TemplateGenerator tg = new TemplateGenerator();
        templates = tg.getTemplates();
    }
    
    public void printLvl(int index){
        int[][] lvl = templates.get(index);
        
        for(int[] i : lvl){
            for(int j : i){
                System.out.print(j);
                System.out.print(",");
            }
            System.out.println("");
        }
    }
    
}