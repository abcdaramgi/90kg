/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberbaseball;

import GameMode.NomalMode;
import GameMode.HardMode;
import GameMode.VeryHardMode;

/**
 *
 * @author ASUS
 */
public class Gamemanager {
    Game game;  
    //getRandomNumber 바뀌여야딤
    //-> 중복x override
    //입력숫자도 중복 x
    //난이도설
    public void gameStart(){
        printLevel();
        setLevel();
        game.play();
    }
    
    public void printLevel(){
        System.out.println("난이도를 설정하세요.");
        System.out.println("EasyMode 0 ~ 9  (1)");
        System.out.println("NomalMode 10 ~ 99  (2)");
        System.out.println("HardMode 100 ~ 999  (3)");
        System.out.println("VeryHardMode 1000 ~ 9999  (4)");
    }
    
    public void setLevel(){
        int level = Game.getInteger();
        
        switch(level){
            case 1:
                game = new Game();
                System.out.println("EasyMode로 접속하셧습니다");
                break;
            case 2:
                game = new NomalMode();
                System.out.println("NomalMode로 접속하셧습니다");
                break;
            case 3:
                game = new HardMode();
                System.out.println("HardMode로 접속하셧습니다");
                break;
            case 4:
                game = new VeryHardMode();
                System.out.println("VeryHardMode로 접속하셧습니다");
                break;
        }
    }
   
}
