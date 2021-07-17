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
        setlife();
        if(life==0){
            System.out.println("최소 LIFE는 1이상 입니다");
            setlife();
        }
        System.out.println("숫자야구 시작");
        
        while(isRight == false){
            do{
                System.out.println("10이하의 정수를 입력하세요");
                setInputNumber();
            }while(inputNumber>9);
            
            isRight = getIsRight(targetNumber, inputNumber);
            life--;
            if(isRight==true)
                break;
            if(life==0)
                break;
            System.out.println("다시 시도해보세요");
        }
        
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
        if(target==input)
            return true;
        else
            return false;
    }
    
    public void setInputNumber(){
<<<<<<< Updated upstream

        System.out.println("예상 숫자를 입력하세요 : ");

=======
        System.out.println("예상 숫자를 입력하세요 : ");
>>>>>>> Stashed changes
        try{
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
        }catch(java.lang.RuntimeException e){
            System.out.println("입력값이 잘못되었습니다. 정수를 입력하세요.");
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
    
    
    
    public int getStrike(){
        
        return 0;
    }*/

    public int getBall(){
        
        return 0;
<<<<<<< Updated upstream
    }    
    
=======
    }
>>>>>>> Stashed changes
    public void UserNumber(){
        System.out.println("회원넘버를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        usernumber = sc.nextInt();
    }
}
    
    