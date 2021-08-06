/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamemode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class HardModeTest {
    
    public HardModeTest() {
    }

    @Test
    public void testSomeMethod() {
        
    }
     @Test
    public void testCheckReduplication() {
        HardMode hm = new HardMode();
        
        boolean actual = hm.checkReduplication(251);
        
        assertEquals(true, actual);
    }
    @Test
    public void testGetRandomNumber() {
        HardMode hm = new HardMode();
        
        int actual = hm.getRandomNumber();
        
        System.out.println("randomNumber = " + actual);
    }
    
    @Test
    public void testcheckInputNumber(){
        HardMode hm = new HardMode();
        
        boolean actual = hm.checkInputRange(132);
        
        assertEquals(true, actual);
    }
    
    @Test
    public void testGetStrike(){
        HardMode hm = new HardMode();
        int expected = 3;
        int actual = hm.getStrike(213, 213);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testGetball(){
        HardMode hm = new HardMode();
        int expected = 1;
        int actual = hm.getBall(293, 123);
        assertEquals(expected,actual);
    }
}
