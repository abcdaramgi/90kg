/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher;

import com.sang.numberbaseball.GameLauncher.GameMode.HardMode;

/**
 *
 * @author ssy02
 */
public class NumberBaseball {
    public static void main(String[] args){
        GameManager gm = new GameManager();
        gm.gameStart();
    }
}
