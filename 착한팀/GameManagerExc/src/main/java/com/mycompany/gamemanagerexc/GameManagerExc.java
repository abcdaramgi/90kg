/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamemanagerexc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kdh12
 */
public class GameManagerExc {
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    int id;
    boolean isRight = false;
    int life;
    int targetNumber;
    int inputNumber;
    
    //------------------------------------------------------------------------//
    // 생성자
    // 객체를 생성시키는 놈이라고도 설명할 수 있다.
    // 객체를 처음 만들 때 호출되는 함수.
    // 클래스 명과 동일한 이름으로 함수를 정의한다.
    public GameManagerExc(){
        targetNumber = getRandomNumber();
    }
    //------------------------------------------------------------------------//
    // 메서드
    public void play(){

        setId();
        setLife();

        while(!isRight && life != 0){
            setInputNumber();
            
            isRight = getIsRight(targetNumber, inputNumber);
            printResult(targetNumber, inputNumber);
            
            if(!isRight)
                life--;
            // 개발자 모드일때 (userNumber == 0) 라이프, 타겟 넘버, 인풋넘버를 출력하는 함수
            printStatus();
        }

        if(life == 0)
            System.out.println("실패");
        else
            System.out.println("성공");
        }
    //------------------------------------------------------------------------//
    public void manual(){
        // 기능 추가 되면
    }
    public void printStatus(){
            if(id == 0){
                System.out.println("--------------------");
                System.out.println("라이프 ="+life);
                System.out.println("타겟넘버 ="+targetNumber);
                System.out.println("인풋넘버 ="+inputNumber);
                System.out.println("--------------------");
            }
    }
    public int getRandomNumber(){
        int randomNumber = 0;
        
        Random rand = new Random();
        
        randomNumber = rand.nextInt(10);
        
        return randomNumber;
    }
    
    public void setLife(){
        System.out.println("0보다 큰수의 라이프를 입력하세요.");
        life = getInteger();
        if(life<=0){
          System.out.println("음수는 입력 할 수 없습니다.");
          setLife();
        }
    }
    
    private int getInteger(){
        int input = 0;
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                break;
            }catch(java.lang.RuntimeException e){
                System.out.println("입력값 오류. 다시 입력해주세요");
            }
        }
      
      return input;
    }
      
    public void setId(){
        System.out.println("회원 번호를 입력하세요");
        
       this.id = getInteger();
        
       
        if(id==0){
            System.out.println("개발자모드로 진행합니다");
            System.out.println("targetNumber = " + targetNumber);
        }
        
        else if(0<=id && id<=100) {
            System.out.println("사용자모드로 진행합니다");
        }
        
        else{
            System.out.println("ID값 오류입니다. 0~100까지 숫자로 입력하세요");
            setId();
        }
        
        
    }
    
    public void setInputNumber(){
        System.out.println("남은 횟수 = " + life);
        System.out.println("예상숫자를 입력하세요.");
        this.inputNumber = getInteger();
        checkInputNumberRange(inputNumber); 
    }

    public void checkInputNumberRange(int inputNumber){
        if (inputNumber > 9 || inputNumber < 0){
            System.out.println("0 ~ 9 사이 정수를 입력해야합니다.");
            setInputNumber();
        }

    }
    // 스트라이크랑 볼
    public void printResult(int targetNumber, int inputNumber){
        if (targetNumber == inputNumber){
           
        }
        else{
            System.out.println("틀렸습니다. 다시 입럭하셈");
        }
    }
    
    public boolean getIsRight(int target, int input){
        return target == input;
    }
    // 요거는 아직 ㄴㄴ 자릿수 추가되면 해볼거임
    public int getStrike(){
        
        return 0;
    }
    public int getBall(){
        
        return 0;
    }
}

