/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberbaseball;

/**
 *
 * @author ASUS
 */
public class Player {
    int life;
    public String name;
    public int inputNumber;
    public boolean isRight;
    public Player(String name, int life){
        this.name = name;
        this.life = life;
    }
    
    public boolean getIsRight(int target){
            return target == inputNumber;
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
