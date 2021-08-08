/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMode;

import com.mycompany.gamemanagerexc.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kdh12
 */
public class NomalModeTest {
    
    public NomalModeTest() {
    }

    /**
     * Test of getRandomNumber method, of class NormalMode.
     */
    @org.junit.jupiter.api.Test
    public void testGetRandomNumber() {
        NomalMode nm = new NomalMode();
        
        int actual = nm.getRandomNumber();
        
        System.out.println("randomNumber = " + actual);
    }
    
    @Test
    public void testGetBall(){
        NomalMode nm = new NomalMode();
        nm.targetNumber = 73;
        
        int expected = 0;
        Player p = new Player("", 10);
        
        p.inputNumber  = 72;
        int actual = nm.getBall(p);
        
        assertEquals(expected, actual);
    }
    @Test
    public void testGetStrike(){
        NomalMode nm = new NomalMode();
        nm.targetNumber = 58;
        
        int expected = 0;
        Player p = new Player("", 10);
        
        p.inputNumber  = 16;
        int actual = nm.getStrike(p);
        
        assertEquals(expected, actual);
    }
    @Test
    public void testCheckInputReduplication() {
        HardMode hm = new HardMode();
        
        Player p = new Player("", 10);
        
        p.inputNumber  = 23;
        boolean actual = hm.checkInputReduplication(p);
        
        assertEquals(true, actual);
    }
}
