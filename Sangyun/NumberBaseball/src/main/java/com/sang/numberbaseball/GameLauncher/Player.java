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
    private boolean isRight;
    
    public Player(int inputNumber){
        this.inputNumber = inputNumber;
    }

    public Player(String name) {
        this.inputNumber = -1;
        this.name = name;
    }
    
    public Player(String name, int life){
        this.inputNumber = -1;
        this.name = name;
        this.life = life;
    }
    
    @Override
    public String toString(){
        String playerInfo = "";
        playerInfo += "name : " + this.name + "\n";
        playerInfo += "inputNumber : " + this.inputNumber + "\n";
        playerInfo += "life : " + this.life + "\n";
        playerInfo += "성공 여부 : " + this.isRight;        
        return playerInfo;
    }
    public boolean compareInputNumberWith(int targetNumber){
        return inputNumber == targetNumber;
    }
    
    public boolean getIsRight(){
        return isRight;
    }
    
    public void setIsRight(boolean isRight){
        this.isRight = isRight;
    }
    
    public int getLife(){
        return life;
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
