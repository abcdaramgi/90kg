/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher.GameMode;

import com.sang.numberbaseball.GameLauncher.GameManager;

/**
 *
 * @author ssy02
 */
public class VeryHardMode extends GameManager implements Game{
    @Override
    public void play(){
        
    }
    @Override
    public int getRandomNumber(){
        int randomNumber= (int) (Math.random()*1000);
        
        return randomNumber;
    }
}
