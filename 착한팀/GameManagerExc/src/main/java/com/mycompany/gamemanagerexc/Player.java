/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamemanagerexc;

/**
 *
 * @author kdh12
 */
public class Player {
    int life;
    String name;
    int inputNumber;
    boolean isRight;
    
    public Player(String name, int life){
        this.name = name;
        this.life = life;
    }
    
    public boolean getIsRight(int target){
        return target == inputNumber;
    }
    
    // 스트라이크랑 볼
    public void printResult(int targetNumber){
        if (targetNumber == inputNumber){
            System.out.println("성공");
        }
        else{
            System.out.println("틀렸습니다. 다시 입럭하셈");
        }
    }
}
