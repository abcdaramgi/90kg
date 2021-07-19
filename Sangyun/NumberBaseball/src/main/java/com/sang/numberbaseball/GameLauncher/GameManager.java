/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher;

import Util.Debug;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ssy02
 */
public class GameManager {
    //------------------------------------------------------------------------//
    // 상수
    
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    
    
    boolean isRight = false;
    int life;
    int targetNumber;
    int inputNumber;
    int userNumber;
    //------------------------------------------------------------------------//
    //생성자
    //객체를 생성시키는 놈이라고도 설명 가능
    //객체를 처음 만들 때 호출되는 함수
    //클래스 명과 동일한 이름으로 함수를 정의한다
    //반환값을 안적어줘도 오류가 없음 -> 자동으로 자기 자신을 반환해주기 때문
    public GameManager(){
        targetNumber = getRandomNumber();
    }
    //------------------------------------------------------------------------//
    // 메서드
    public void gameStart(){
        setUserNumber();
        setLife();
        
        while(!isRight && life > 0){
            setInputNumber();
            isRight = getIsRight(targetNumber, inputNumber);
            printStatus();
            printResult(isRight);
            life--;
        }
        printIsSuccess();
        askDoRestart();
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void printIsSuccess(){
        if(isRight){
            System.out.println("성공입니다.");
        }
        else{
            System.out.println("실패입니다.");
        }
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void setUserNumber(){
        System.out.println("사용자 번호를 입력하세요.");
        userNumber = getInteger();
        setIsDebug(userNumber);
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void setIsDebug(int userNumber){
        Debug.setIsDebug(userNumber == 0);
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void setLife(){
        System.out.println("라이프를 입력하세요.");
        life = getInteger();
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void printStatus() {
        Debug.log("----------------------------------------------------------");
        Debug.log("Life : " + life);
        Debug.log("Target Number : " + targetNumber);
        Debug.log("Input Number : " + inputNumber);
        Debug.log("----------------------------------------------------------");
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void printResult(boolean isRight){
        if(isRight){
            System.out.println("정답입니다!");
        }
        else{
            System.out.println("오답입니다.");
        }
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public void manual(){
        
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public int getRandomNumber(){
        int randomNumber= (int) (Math.random()*10);
        
        return randomNumber;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public boolean getIsRight(int target, int input){
        return target == input;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public void setInputNumber(){
        System.out.println("예상 숫자를 입력하세요.");
        int input = getInteger();
        inputNumber = input;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private int getInteger(){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        try{
            input = sc.nextInt();
        }catch (InputMismatchException exception) {
            System.out.println("정수만 입력 가능합니다.");
            sc = new Scanner(System.in);
            input = sc.nextInt();
        }
        
        return input;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public int getStrike(){
        
        return 0;
    }
    public int getBall(){
        return 0;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void askDoRestart() {
        System.out.println("다시 하시겠습니다? (y/n)");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        
        if(input == 'y' || input == 'Y'){
            gameStart();
        }
        else if(input == 'n' || input == 'N'){
            
        }
        else{
            askDoRestart();
        }
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void checkInputNumberSize(int input) {
        
    }
}