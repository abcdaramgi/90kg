/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import com.sang.numberbaseball.GameLauncher.Player;

/**
 *
 * @author ssy02
 */
public class InputResult {
    public Player player;
    public int inputNumber;
    public int strike;
    public int ball;
    
    public InputResult(Player p, int strike, int ball){
        this.player = p;
        this.inputNumber = p.getInputNumber();
        this.strike = strike;
        this.ball = ball;
    }
}
