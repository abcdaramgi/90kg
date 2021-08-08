/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMode;

import com.mycompany.numberbaseball.Game;
import com.mycompany.numberbaseball.Player;

/**
 *
 * @author ASUS
 */
public class NomalMode extends Game{
    int min;
    int max;
    public static int MAX_SIZE = 2;
    
    public NomalMode(){
        this.min = 10;
        this.max = 100;
        this.targetNumber = getRandomNumber();
    }
    
    @Override
    public int getRandomNumber(){
        String strRandomNumber = "";
        int randomNumber = 0;
        
        for(int i = 0; i < MAX_SIZE; i++){
            int random = (int) (Math.random() * 10);
            
            if(!strRandomNumber.contains("" + random) && !(random == 0 && i == 0)){
                strRandomNumber += "" + random;
            }
            else{
                i--;
            }
        }
        randomNumber = Integer.parseInt(strRandomNumber);
        
        return randomNumber;
    }
    @Override
    public void inputException(Player player){
        if(!checkInputRange(player.inputNumber)){
            System.out.println(min + "~" + max +"사이의 정수만 입력하세요");
            setInputNumber(player);
        }
        if(!checkReduplication(player.inputNumber)){
            System.out.println("연속된 수를 입력할 수 없습니다.");
            setInputNumber(player);
        }
        
    }
    
    @Override
    public void printResult(Player p){
        int strike = getStrike(targetNumber, p.inputNumber);
        int ball = getBall(targetNumber, p.inputNumber);
        if(p.isRight){
            System.out.println(p.name + "님은 정답입니다!");
        }else{
            System.out.println(p.name + "님은 오답입니다.");
            System.out.print(strike + " Strike, ");
            System.out.println(ball + " Ball");
        }
    }
    
    public boolean checkInputRange(int input){
        return min <= input && input < max;
    }
    
    public boolean checkReduplication(int input){
        String strInput = "" + input;
        
        for(int i = 0; i < strInput.length(); i++){
            for(int j = i + 1 ; j < strInput.length(); j++){
                if(strInput.charAt(i) == strInput.charAt(j))
                    return false;
            }
        }
        return true;
    }
    
    @Override
    public int getStrike(int target, int input){
        String strTarget = "" + target;
        String strInput = "" + input;
        int strikeCount = 0;
        
        for(int i = 0; i < strTarget.length(); i++){
            if(strTarget.charAt(i) == strInput.charAt(i)){
                strikeCount++;
            }
        }
        
        return strikeCount;
    }
    
    @Override
    public int getBall(int target, int input){
        String strTarget = "" + target;
        String strInput = "" + input;
        int ballCount = 0;
        
        for(int i = 0; i < strTarget.length(); i++ ){
            if(strTarget.contains("" + strInput.charAt(i))){
                ballCount++;
            }
        }
        ballCount -= getStrike(target,input);
        
        return ballCount;
    }
}
