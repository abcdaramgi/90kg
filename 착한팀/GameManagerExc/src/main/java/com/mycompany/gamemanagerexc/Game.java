/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gamemanagerexc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kdh12
 */
public class Game {
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    int numberOfPlayer;
    boolean isRight = false;
    int life;
    public int targetNumber;
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Player> result = new ArrayList<Player>();
    
    //------------------------------------------------------------------------//
    // 생성자
    // 객체를 생성시키는 놈이라고도 설명할 수 있다.
    // 객체를 처음 만들 때 호출되는 함수.
    // 클래스 명과 동일한 이름으로 함수를 정의한다.
    public Game(){
        targetNumber = getRandomNumber();
    }
    //------------------------------------------------------------------------//
    // 메서드
    public void play(){
        setNumberOfPlayer();
        setLife();
        setPlayerInfo();
        printStatus();

        while(numberOfPlayer > 0){
            for (Player player : players){
                if(player.isRight)
                    continue;
                
                setInputNumber(player);

                isRight = player.getIsRight(targetNumber);
                player.isRight = isRight;
                printResult(player);


                if (isRight){
                    result.add(player);
                    numberOfPlayer--;
                }
                else{
                    player.life--;
                   if(player.life == 0){
                        result.add(player);
                        numberOfPlayer--;
                        System.out.println("실패");
                   }
                }
    // 개발자 모드일때 (userNumber == 0) 라이프, 타겟 넘버, 인풋넘버를 출력하는 함수
            }
        }
        printfResult();
    }
    //------------------------------------------------------------------------//
        // 스트라이크랑 볼
    public void printResult(Player player){
        if (targetNumber == player.inputNumber){
            System.out.println("성공");
        }
        else{
            System.out.println("틀렸습니다. 다시 입럭하셈");
        }
    }
    
    public void printStatus(){
            if(numberOfPlayer == 3){
                System.out.println( "----------------------------------------------");
                System.out.println("정답 : " + targetNumber);
                for(Player player : players){
                    System.out.println("불러 " + player.name + " "  + player.life);  
                }
                System.out.println( "----------------------------------------------");
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
    
    public static int getInteger(){
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
   
      
    public void setNumberOfPlayer(){
        System.out.println("플레이 할 인원을 입력하세요");
        
        this.numberOfPlayer = getInteger();
        
       
        if(numberOfPlayer <= 0){
            System.out.println("0이상의 자연수를 입력해주세요");
        }
        
        else if(0 <= numberOfPlayer && numberOfPlayer<=100){
            System.out.println("현재 인원 : " + numberOfPlayer);
            System.out.println("게임을 시작하겠습니다");
        }
    }
    
    private void setPlayerInfo() {
        // numberOfPlayer 만큼 플레이어 정보를 받고, 플레이어를 생성한다
        // 반복문으로 이름을 입력받는다
        // 이반복문 안에 플에이러르 생성한다.
        // 이름은 어떻게 세팅할건지 한번 생각...(생성자)
        // players.add();
        for(int i = 0; i < numberOfPlayer; i++){
            System.out.println("이름을 입력하세요");
            String playerName = getString();
            Player player = new Player(playerName, life);            
            players.add(player);
        }
    }
    
    public void setInputNumber(Player player){
        System.out.println(player.name + "의 차례입니다.");
        System.out.println("남은 횟수 = " + player.life);
        System.out.println("예상숫자를 입력하세요.");
        player.inputNumber = getInteger();
        inputException(player); 
    }

    public void inputException(Player player){
        if (player.inputNumber > 9 || player.inputNumber < 0){
            System.out.println("0 ~ 9 사이 정수를 입력해야합니다.");
            setInputNumber(player);
        }

    }


    // 요거는 아직 ㄴㄴ 자릿수 추가되면 해볼거임
    public int getStrike(Player player){
        
        return 0;
    }
    public int getBall(Player player){
        
        return 0;
    }

    private String getString() {
        String input = "0";
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                input = sc.next();
                break;
            }catch(java.lang.RuntimeException e){
                System.out.println("입력값 오류. 다시 입력해주세요");
            }
        }
      
      return input;
    }

    public void printfResult(){
        int i = 1;
        System.out.println( "----------------------------------------------");
        for ( Player result : result ){
            System.out.println( i + "등" + result.name + "라이프" + result.life );
            ++i;
        }
        System.out.println( "----------------------------------------------");
    }
}

