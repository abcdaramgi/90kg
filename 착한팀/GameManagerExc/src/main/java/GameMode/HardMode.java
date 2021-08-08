/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMode;

/**
 *
 * @author kdh12
 */
public class HardMode extends NomalMode {
    public HardMode(){
        this.min = 100;
        this.max = 1000;
        this.MAX_SIZE = 3;
        this.targetNumber = getRandomNumber();
    }
    
}
