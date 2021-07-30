/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher.GameMode;

import com.sang.numberbaseball.GameLauncher.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ssy02
 */
public class HardModeTest {
    
    public HardModeTest() {
    }
    @Test 
    public void testCheckInputReduplication(){
        HardMode hd = new HardMode();
        
        boolean actual = hd.checkInputReduplication(299);
        
        assertEquals(false, actual);
    }

    @Test
    public void testGetStrike() {
        HardMode hd = new HardMode();
        System.out.println("targetNumber : " + hd.targetNumber);
        hd.targetNumber = 321;
        
        int expected = 2;
        int actual = hd.getStrike(341);
        
        assertEquals(expected, actual);
    }

    /**
     * Test of getBall method, of class HardMode.
     */
    @Test
    public void testGetBall() {
        HardMode hd = new HardMode();
        System.out.println("targetNumber : " + hd.targetNumber);
        hd.targetNumber = 124;
        
        int expected = 2;
        int actual = hd.getBall(341);
        
        assertEquals(expected, actual);
    }
    
}
