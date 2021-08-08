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
public class VeryHardMode extends NomalMode {
     public VeryHardMode(){
        min = 1000;
        max = 10000;
        MAX_SIZE = 4;
        targetNumber = getRandomNumber();
    }
}
