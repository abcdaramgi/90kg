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
public class HardModeTest {
    
    public HardModeTest() {
    }

    @Test
    public void testGetRandomNumber() {
        HardMode hm = new HardMode();
        
        int actual = hm.getRandomNumber();
        
        System.out.println("randomNumber = " + actual);
    }
    @Test
    public void testGetStrike() {
        HardMode hm = new HardMode();
        hm.targetNumber = 736;
        
        int expected = 2;
        Player p = new Player("", 10);
        
        p.inputNumber  = 726;
        int actual = hm.getStrike(p);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetBall() {
        HardMode hm = new HardMode();
        hm.targetNumber = 543;
        
        int expected = 2;
        Player p = new Player("", 10);
        
        p.inputNumber  = 654;
        int actual = hm.getBall(p);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCheckInputReduplication() {
        HardMode hm = new HardMode();
        
        Player p = new Player("", 10);
        
        p.inputNumber  = 654;
        boolean actual = hm.checkInputReduplication(p);
        
        assertEquals(true, actual);
    }
    

    
}
