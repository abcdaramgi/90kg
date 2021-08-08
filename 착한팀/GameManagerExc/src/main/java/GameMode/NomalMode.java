/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMode;

import com.mycompany.gamemanagerexc.Game;
import com.mycompany.gamemanagerexc.Player;
import java.util.Random;

/**
 *
 * @author kdh12
 */
public class NomalMode extends Game {
    int max;
    int min;
    public static int MAX_SIZE = 2;
    public NomalMode(){
        min = 10;
        max = 100;
        MAX_SIZE = 2;
        targetNumber = getRandomNumber();
    }
    
    @Override
    public int getRandomNumber(){
        //두자리수, 중복x
        int randomNumber = 0;
        
        String strRandomNumber = "";
        
        for(int i = 0; i < MAX_SIZE; i++){
            Random rand = new Random();
            randomNumber = rand.nextInt(10);
            
            if(!strRandomNumber.contains("" + randomNumber) && !(randomNumber == 0 && i == 0)){
                strRandomNumber += "" + randomNumber;
            }
            else{
                i--;
            }
        }
        randomNumber = Integer.parseInt(strRandomNumber);
        
        return randomNumber;
    }
    
    @Override
    public void printResult(Player p){
        int strike = getStrike(p);
        int ball = getBall(p);
        if(p.getIsRight(targetNumber)){
            System.out.println(p.name + "님은 정답입니다!");
        }else{
            System.out.println(p.name + "님은 오답입니다.");
            System.out.print(strike + " Strike, ");
            System.out.println(ball + " Ball");
            
        }
        
    }
    
    @Override
    public void inputException(Player player){
        if(!(player.inputNumber > (min-1) && player.inputNumber < max)){
            System.out.println( min + "~" + max + "사이 값을 입력하세요.");
            setInputNumber(player);
        }
        if(!checkInputReduplication(player)){
            System.out.println("중복된 수를 입력할 수 없습니다.");
            setInputNumber(player);
        }
        if()
    }
    
    public boolean checkInputReduplication(Player player){
        //중복된 숫자인지 확인하는 메소드
        //String배열로 만든 후에 countChar메소드로 비교
        //중복되었으면 T 아니면 F
        
        boolean result = true;
        
        String strInput = "" + player.inputNumber;
        
        for(int i = 0 ; i < strInput.length(); i++){
            if(countChar(strInput, i) > 1){
                return false;
            }
        }
        return true;
    }
    
    public int countChar(String str, int idx) {
        //str.charAt(i)로 String > char로 변경
        //두 숫자 비교 후 같으면 1 아니면 0
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(idx)) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public int getBall(Player player){
        int ballCount = 0;
        
        String strInput = "" + player.inputNumber;
        String strRandom = "" + targetNumber;
        
        for(int i = 0; i < strInput.length(); i++){
           if(strRandom.contains("" + strInput.charAt(i))) 
               ballCount++;
        }
        
        ballCount -= getStrike(player);
        
        return ballCount;
    }
    
    @Override
    public int getStrike(Player player){
        int strikeCount = 0;
        
        String strInput = "" + player.inputNumber;
        String strRandom = "" + targetNumber;
        
        for(int i = 0; i < strInput.length(); i++){
           if(strInput.charAt(i) == strRandom.charAt(i)){
               strikeCount++;
            }
        }
        return strikeCount;
    }
}
