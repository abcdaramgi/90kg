/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher.GameMode;

import Data.InputResult;
import com.sang.numberbaseball.GameLauncher.Game;
import com.sang.numberbaseball.GameLauncher.Player;
import java.util.ArrayList;

/**
 *
 * @author ssy02
 */
public class HardMode extends Game {
    public static int MAX_SIZE = 3;
    int min = 100;
    int max = 1000;
    ArrayList<InputResult> inputList = new ArrayList<InputResult>();
    
    @Override
    public int getRandomNumber(){
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] targetNumbers = new int[MAX_SIZE];
        for(int i = 0; i < MAX_SIZE; i++){
            int randomNumber= (int) (Math.random()*10);
            
            if(numbers[randomNumber] == -1 || (i == 0 && randomNumber == 0)){
                i--;
            }
            else{
                targetNumbers[i] = numbers[randomNumber];
                numbers[randomNumber] = -1;
            }
        }
        String strTarget = "";
        for(int i = 0; i < MAX_SIZE; i++){
            strTarget += targetNumbers[i];
        }
        
        int target = Integer.parseInt(strTarget);
        
        return target;
    }
    
    @Override
    public boolean checkInputNumberRange(int input) {
        
        return min <= input && input < max;
    }
    
    public boolean checkInputReduplication(int input){
        boolean result = true;
        String strInput = "" + input;
        
        for(int i = 0 ; i < strInput.length(); i++){
            if(countChar(strInput, i) > 1){
                return false;
            }
        }
        return true;
    }
    
    public int countChar(String str, int idx) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(idx)) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public void printResult(Player p){
        int strike = getStrike(p.getInputNumber());
        int ball = getBall(p.getInputNumber());
        if(p.getIsRight()){
            System.out.println(p.getName() + "님은 정답입니다!");
        }else{
            System.out.println(p.getName() + "님은 오답입니다.");
            System.out.print(strike + " Strike, ");
            System.out.println(ball + " Ball");
            addToInputList(p, strike, ball);
        }
        printInputList();
    }
    public void addToInputList(Player p, int strike, int ball){
        inputList.add(new InputResult(p, strike, ball));
    }
    
    public void printInputList(){
        System.out.println("################");
        for(InputResult ir : inputList ){
            System.out.print(ir.player.getName() + "님의 ");
            System.out.print("입력 값 : " + ir.inputNumber + " / ");
            System.out.print(ir.strike + " strike , ");
            System.out.println(ir.ball + " ball");
        }
        System.out.println("################");
    }
    
    @Override
    public int getStrike(int input){
        int strike = 0;
        String strTarget = "" + targetNumber;
        String strInput = "" + input;
        
        String[] splitedTarget = strTarget.split("");
        String[] splitedInput = strInput.split("");
        
        for(int i = 0 ; i < strTarget.length(); i++){
            if(splitedTarget[i].equals(splitedInput[i])){
                strike++;
            }
        }
        
        return strike;
    }
    @Override
    public int getBall(int input){
        int ball = 0;
        String strTarget = "" + targetNumber;
        String strInput = "" + input;
        
        String[] splitedInput = strInput.split("");
        
        for(String s : splitedInput){
            if(strTarget.contains(s)){
                ball++;
            }
        }
        ball -= getStrike(input);
        
        return ball;
    }
    
    @Override
    public void inputException(int input, Player player){
        if(!checkInputNumberRange(input)){
            System.out.println("현재 난이도에선 " + min + "~" + (max-1)+ "까지의 정수만 입력가능합니다.");
            setInputNumber(player);
        }
        if(!checkInputReduplication(input)){
            System.out.println("연속된 수를 입력할 수 없습니다.");
            setInputNumber(player);
        }
    }
}
