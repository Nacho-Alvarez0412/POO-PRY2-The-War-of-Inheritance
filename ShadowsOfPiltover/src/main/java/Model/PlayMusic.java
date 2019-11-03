/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.Serializable;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Joaquin
 */
public class PlayMusic implements Serializable{
    
    public boolean pauseMainMusic = false;
    private Clip mainTheme;
    private long mainThemePos;
    
    
    
    public void playMainMusic(String pathFile){
        try{
            File musicPath = new File(pathFile);
            
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                mainTheme = AudioSystem.getClip();
                mainTheme.open(audioInput);
                mainTheme.start();
                mainTheme.loop(1);      
            }
            else {
                System.out.println("Path Not Found");
            }
        } 
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void pauseMainTheme(){
        
        if(!pauseMainMusic){
            mainThemePos = mainTheme.getMicrosecondPosition();
            mainTheme.stop();
            pauseMainMusic = true;
        }
        else {
            mainTheme.setMicrosecondPosition(mainThemePos);
            mainTheme.start();
            pauseMainMusic = false;
        }
    }
        
    
}
