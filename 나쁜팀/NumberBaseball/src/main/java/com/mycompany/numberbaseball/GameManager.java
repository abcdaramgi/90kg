/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberbaseball;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GameManager {
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    boolean isRight = false;
    int life;
    int targetNumber;
    int inputNumber;
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
        System.out.println("라이프를 입력하세요.");
        setlife();
        System.out.println("숫자야구 시작");
        while(isRight == false){
            setInputNumber();
            isRight = getIsRight(targetNumber, inputNumber);
            life--;
            System.out.println("다시 시도해보세요");
            if(life==0)
                break;
        }
        
        if(isRight == true){
            System.out.println("정답입니다.");
        }
        
        if(isRight == false){
            System.out.println("실패입니다.");
        }
    }
    
    
    
    /* public void manual(){
        
    } */
    
    
    public int getRandomNumber(){
        int randomNumber= (int) (Math.random()*10);
        
        return randomNumber;
    }

    public boolean getIsRight(int target, int input){
        if(target==input)
            return true;
        else
            return false;
    }
    public void setInputNumber(){
        try{
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
        }catch(java.lang.RuntimeException e){
            System.out.println("입력값이 잘못되었습니다.");
            setInputNumber();
        }
    }
    public void setlife(){
        try{
            Scanner sc = new Scanner(System.in);
             life = sc.nextInt();
        }catch(java.lang.RuntimeException e){
            System.out.println("입력한 라이프 값이 잘못되었습니다");
            setlife();
        }
        
    }
    
    /* 미완성
    public int getStrike(){
        
        return 0;
    }
    public int getBall(){
        return 0;
    }
    */
}
    
    