/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher.GameMode;

import com.sang.numberbaseball.GameLauncher.Game;

/**
 *
 * @author ssy02
 */
public class VeryHardMode extends HardMode{
    public VeryHardMode(){
        MAX_SIZE = 2;
        min = 10;
        max = 100;
        targetNumber = getRandomNumber();
    }
}
