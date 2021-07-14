/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher;

/**
 *
 * @author ssy02
 */
public class Player {
    private String name;
    private int inputNumber;
    private int life;

    public Player(String name, int inputNumber, int life) {
        this.name = name;
        this.inputNumber = inputNumber;
        this.life = life;
    }
    
    @Override
    public String toString(){
        String playerInfo = "";
        playerInfo += "name : " + this.name + "\n";
        playerInfo += "inputNumber : " + this.inputNumber + "\n";
        playerInfo += "life : " + this.life + "\n";
        
        return playerInfo;
    }
    
    public void decreaseLife(){
        life--;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }
}
