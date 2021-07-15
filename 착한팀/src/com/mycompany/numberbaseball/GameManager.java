package com.mycompany.numberbaseball;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kdh12
 */
public class GameManager {
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    boolean isRight = false;
    int life;
    int targetNumber;
    int inputNumber;
    
    //------------------------------------------------------------------------//
    // 생성자
    // 객체를 생성시키는 놈이라고도 설명할 수 있다.
    // 객체를 처음 만들 때 호출되는 함수.
    // 클래스 명과 동일한 이름으로 함수를 정의한다.
    public GameManager(){
        targetNumber = getRandomNumber();
    }
    //------------------------------------------------------------------------//
    // 메서드
    public void play(){
        while(isRight==false){
        System.out.println("라이프를 입력하세요.");
        setLife();
        if (life <= 0){
            System.out.println("0보다 큰 숫자를 입력해 주세요");
        }
        else{
            break;
        }
        }
        
        // 라이프 수 만큼 입력을 받을 수 있고,
        // 라이프 수가 다따르기 전에 답을 맞추면 성공
        // 라이프 수가 다딸라도 못맞추면 실패
        while(isRight==false){
            System.out.println("예상숫자를 입력하세요.");
            setInputNumber();
        
            if (life > 0 && inputNumber >= 0 && inputNumber <= 9){
            isRight=getIsRight(targetNumber, inputNumber);
            life--;
            if(life==0)
                break;
            }
            else{
                System.out.println("입력 값 오류입니다.");
            } 
        }
        if(life==0)
                System.out.println("실패");
            else
                System.out.println("성공");
    }
    //------------------------------------------------------------------------//
    public void manual(){
        // 기능 추가 되면
    }
    public int getRandomNumber(){
        int randomNumber = 0;
        
        Random rand = new Random();
        
        randomNumber = rand.nextInt(10);
        
        return randomNumber;
    }
    public void setLife(){
        try{
            Scanner sl = new Scanner(System.in);
            this.life = sl.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("라이프 값 오류입니다. 다시 입력하세요");
                setLife();
        }
    }
    public void setInputNumber(){
        try{
            Scanner in = new Scanner(System.in);
            this.inputNumber = in.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("입력 값 오류입니다.");
            setInputNumber();
        }    
        
    }
    public boolean getIsRight(int target, int input){
        if(target==input)
            return true;
        else
            return false;
    }
    // 요거는 아직 ㄴㄴ 자릿수 추가되면 해볼거임
    public int getStrike(){
        
        return 0;
    }
    public int getBall(){
        
        return 0;
    }
}