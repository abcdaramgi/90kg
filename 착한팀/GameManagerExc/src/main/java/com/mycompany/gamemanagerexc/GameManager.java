/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamemanagerexc;

import GameMode.HardMode;
import GameMode.NomalMode;
import GameMode.VeryHard;

/**
 *
 * @author kdh12
 */
public class GameManager {
    Game game;
    
    public void gamePlay(){
        setLevel();
        game.play();
    }
    
    public void printManual(){
        System.out.println("----------------난이도 설정-----------------");
        System.out.println("---------------레벨 1 : 0 ~ 9---------------");
        System.out.println("--------------레벨 2 : 10 ~ 99--------------");
        System.out.println("-------------레벨 3 : 100 ~ 999-------------");
        System.out.println("------------레벨 4 : 1000 ~ 9999------------");
    }
    
    public void setLevel(){
        int level;
        
        printManual();
        level = Game.getInteger();
        
        switch(level){
            case 1:
                System.out.println("레벨 1 시작합니둥");
                game = new Game();
                break;
            case 2:
                System.out.println("레벨 2 시작합니둥");
                game = new NomalMode();
                break;
            case 3:
                System.out.println("레벨 3 시작합니둥");
                game = new HardMode();
                break;
            case 4:
                System.out.println("레벨 4 시작합니둥");
                game = new VeryHard();
                break;
        }
    }
}
