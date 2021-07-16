/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberbaseball;

import static java.sql.DriverManager.println;
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
        
        UserNumber();
        if(usernumber == 0){
            System.out.println("개발자로 접속하셨습니다.");
            System.out.println("랜덤 숫자= "+targetNumber);
        }
        else
            System.out.println("사용자로 접속하셨습니다.");
        
        System.out.println("라이프를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        life = sc.nextInt();
        
        while(isRight == false){
            setInputNumber();
            isRight = getIsRight(targetNumber, inputNumber);
            life--;
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
    public void manual(){
        
    }
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
        System.out.println("예상 숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    public int getStrike(){
        
        return 0;
    }
    public int getBall(){
        return 0;
    }
    public void UserNumber(){
        System.out.println("회원넘버를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        usernumber = sc.nextInt();
    }
}
    
    