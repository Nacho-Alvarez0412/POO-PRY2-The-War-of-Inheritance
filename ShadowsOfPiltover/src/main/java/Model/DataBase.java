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
    ArrayList<ElementType[][]> lvls;
    ArrayList<User> users;
    
    public DataBase(){
        DataBase dataBase = (DataBase) FileManager.readObject("DataBase.txt");
        if (dataBase != null){
            this.lvls = dataBase.lvls;
            this.users = dataBase.users;
        }
        
        else{
            this.lvls = new ArrayList<>();
            this.users = new ArrayList<>();
            loadLvls();
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
        
    private void loadLvls(){
        ArrayList<ElementType[][]> levels = (ArrayList<ElementType[][]>) FileManager.readObject("Levels.txt");
        
        if(levels != null){
            this.lvls = levels;
        }
        
        else{
            LevelGenerator lg = new LevelGenerator();
            lg.lvl1();
            lg.lvl2();
            lg.lvl3();
            lg.lvl4();
            lg.lvl5();
            lg.lvl6();
            lg.lvl7();
            lg.lvl8();
            lg.lvl9();
            lg.lvl10();
            lvls = lg.getLvls();
        }
    }
    
    public void printLvl(int index){
        ElementType[][] lvl = lvls.get(index);
        
        for(ElementType[] fila : lvl){
            for(ElementType columna : fila ){
                System.out.print(columna.ordinal());
                System.out.print(",");
            }
            System.out.println("\n");
        }
    }
    
}