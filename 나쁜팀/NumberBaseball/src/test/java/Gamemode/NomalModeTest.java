/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamemode;

import GameMode.NomalMode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class NomalModeTest {
    
    public NomalModeTest() {
    }

    /**
     * Test of checkReduplication method, of class NomalMode.
     */
    @Test
    public void testCheckReduplication() {
        NomalMode nm = new NomalMode();
        
        boolean actual = nm.checkReduplication(25);
        
        assertEquals(true, actual);
    }
    @Test
    public void testGetRandomNumber() {
        NomalMode nm = new NomalMode();
        
        int actual = nm.getRandomNumber();
        
        System.out.println("randomNumber = " + actual);
    }
    
    @Test
    public void testcheckInputNumber(){
        NomalMode nm = new NomalMode();
        
        boolean actual = nm.checkInputRange(13);
        
        assertEquals(true, actual);
    }
    
    @Test
    public void testGetStrike(){
        NomalMode nm = new NomalMode();
        int expected = 2;
        int actual = nm.getStrike(21, 21);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testGetball(){
        NomalMode nm = new NomalMode();
        int expected = 1;
        int actual = nm.getBall(29, 12);
        assertEquals(expected,actual);
    }
}
