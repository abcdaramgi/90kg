/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher;

import com.sang.numberbaseball.GameLauncher.GameMode.HardMode;
import com.sang.numberbaseball.GameLauncher.GameMode.NomalMode;
import com.sang.numberbaseball.GameLauncher.GameMode.VeryHardMode;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ssy02
 */
public class GameManager {
    Game game;
    
    public void gameStart(){
        setLevel();
        game.start();
    }
    
    public void printManual(){
        System.out.println("난이도를 선택해 주세요");
        System.out.println("LEVEL 1 : 0 ~ 9         (1)");
        System.out.println("LEVEL 2 : 10 ~ 99       (2)");
        System.out.println("LEVEL 3 : 100 ~ 999     (3)");
        System.out.println("LEVEL 4 : 1000 ~ 9999   (4)");
    }
    
    public void setLevel(){
        printManual();
        int level = Game.getInteger();
        
        switch (level){
            case 1:
                game = new Game();
                System.out.println("Easy mode를 선택하셨습니다.");
                break;
            case 2:
                game = new NomalMode();
                System.out.println("Nomal mode를 선택하셨습니다.");
                break;
            case 3:
                game = new HardMode();
                System.out.println("Hard mode를 선택하셨습니다.");
                break;
            case 4:
                game = new VeryHardMode();
                System.out.println("Very Hard mode를 선택하셨습니다.");
                break;
            default:
                setLevel();
                break;

        }
    }
}
