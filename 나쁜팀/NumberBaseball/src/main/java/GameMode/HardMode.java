/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMode;

/**
 *
 * @author ASUS
 */
public class HardMode extends NomalMode{
    public HardMode(){
        min = 100;
        max = 1000;
        MAX_SIZE = 3;
        targetNumber = getRandomNumber();
    }
}
