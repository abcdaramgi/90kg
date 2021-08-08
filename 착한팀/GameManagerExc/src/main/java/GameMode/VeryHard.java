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
public class VeryHard extends NomalMode{
    public VeryHard(){
        this.min = 1000;
        this.max = 10000;
        this.MAX_SIZE = 4;
        this.targetNumber = getRandomNumber();
        }
}
