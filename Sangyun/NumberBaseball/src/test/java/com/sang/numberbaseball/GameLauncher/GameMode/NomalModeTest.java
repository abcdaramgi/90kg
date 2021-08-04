/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher.GameMode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ssy02
 */
public class NomalModeTest {
    
    public NomalModeTest() {
    }

    @Test
    public void testGetRandomNumber() {
        NomalMode nd = new NomalMode();
        
        System.out.println("testGetRandomNumber randomNumber : " + nd.getRandomNumber());
    }
    
    @Test
    public void testGetStrike() {
        NomalMode nd = new NomalMode();
        System.out.println("testGetStrike targetNumber : " + nd.targetNumber);
        nd.targetNumber = 21;
        
        int expected = 1;
        int actual = nd.getStrike(31);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetBall() {
        NomalMode nd = new NomalMode();
        System.out.println("testGetBall targetNumber : " + nd.targetNumber);
        nd.targetNumber = 24;
        
        int expected = 1;
        int actual = nd.getBall(41);
        
        assertEquals(expected, actual);
    }
}
