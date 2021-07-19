/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberbaseball;

import java.util.Scanner;


public class GameManager {
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    final static int INPUT_EXCEPTION = -9876543;
    boolean isRight = false;
    int life;
    int targetNumber;
    int inputNumber;
    int usernumber;
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
    public void play(){
        
        setUserNumber();
        printConnectMessage(targetNumber);
        setlife();
        
        System.out.println("숫자야구 시작");
        
        while(isRight == false && life > 0){
            setInputNumber();
            isRight = getIsRight(targetNumber, inputNumber);
            life--;
            // 개발자모드 일 때 ( userNumber = 0 ) targetNumber, inputNumber, life 출력해주는 함수
            printStatus(usernumber);
            printResult(isRight);
        }
        printIsSuccess(isRight);
    }
    
    public int getInteger()
    {
        int input = 0;
        try{
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            return input;
        }catch(java.lang.RuntimeException e){
            System.out.println("입력값이 잘못되었습니다. 정수를 입력하세요.");
            
            getInteger();
            return INPUT_EXCEPTION;
        }
    }
    
    public void printStatus(int usernumber)
    {
        if(usernumber == 0){
            System.out.println("-------------------------");
            System.out.println("랜덤 숫자 = "  + targetNumber);
            System.out.println("입력 숫자 = "  + inputNumber);
            System.out.println("남은 라이프 = "  + life);
            System.out.println("-------------------------");
        }
    }
    
    public void printResult(boolean isRight)
    {
        if(isRight == false){
            System.out.println("오답입니다. 다시 시도해주세요.");
        }
    }
    
    public void printConnectMessage(int targetNumber)
    {
        if(usernumber == 0){
            System.out.println("개발자로 접속하셨습니다.");
            System.out.println("랜덤 숫자= "+targetNumber);
        }
        else
            System.out.println("사용자로 접속하셨습니다.");
    }
    
    public void printIsSuccess(boolean isRight)
    {
        if(isRight == true){
            System.out.println("정답입니다.");
        }
        
        if(isRight == false){
            System.out.println("실패입니다.");
        }
    }

    public int getRandomNumber(){
        int randomNumber= (int) (Math.random()*10);
        
        return randomNumber;
    }

    public boolean getIsRight(int target, int input){
            return target==input;
    }
    
    public void checkInputNumberRange(int inputNumber)
    {
         if(inputNumber > 9 || inputNumber < 0)
            {
                System.out.println("0 ~ 9 사이의 정수만 입력하세요");
                setInputNumber();
            }
    }
    
    public void setInputNumber(){
        //후
        System.out.println("예상 숫자(10이하의 정수만) 입력하세요");
        inputNumber = getInteger();
        checkInputNumberRange(inputNumber);
        
    }
    
    public void setlife(){
        //후
        System.out.println("라이프를 입력하세요.");
        int input = getInteger();
        if(input != INPUT_EXCEPTION)
            life = input;
        System.out.println("life : " + life );
        System.out.println("input : " + input );
        if(life <= 0 && input != INPUT_EXCEPTION){
            System.out.println("최소 LIFE는 1이상 입니다");
            setlife();
        }
    }
    
    public void setUserNumber(){
        //후
        System.out.println("회원넘버를 입력하세요.");
        usernumber = getInteger();
        if(usernumber < 0){
                System.out.println("회원넘버는 0 이상 가능합니다");
                getInteger();
        }
    }
    
    public int getStrike(){
        
        return 0;
    }

    public int getBall(){
        
        return 0;
    }    
    
}
    
    