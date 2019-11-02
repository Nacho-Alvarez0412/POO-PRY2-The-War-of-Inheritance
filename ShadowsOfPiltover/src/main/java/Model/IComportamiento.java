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
public interface IComportamiento {
    public void move();
    public void attack();
    public void die();
    public void sound();
    public void deploy(int x,int y,Piece[][] warzone);
}
