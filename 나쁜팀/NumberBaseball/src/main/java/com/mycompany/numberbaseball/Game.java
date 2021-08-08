/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberbaseball;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    int life;
    public int targetNumber;
    int numberOfPlayer;
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Player> rank = new ArrayList<Player>();
    //------------------------------------------------------------------------//
    //생성자
    //객체를 생성시키는 놈이라고도 설명 가능
    //객체를 처음 만들 때 호출되는 함수
    //클래스 명과 동일한 이름으로 함수를 정의한다
    //반환값을 안적어줘도 오류가 없음 -> 자동으로 자기 자신을 반환해주기 때문
    public Game(){
        targetNumber = getRandomNumber();
    }
    //------------------------------------------------------------------------//
    // 메서드
    public void play(){
        setNumberOfPlayer();
        setlife();
        setPlayerInfo();
        printStatus();
        
        System.out.println("숫자야구 시작");
        
        while(numberOfPlayer > 0){
            
            for(Player player : players){   
                if(player.isRight)          
                    continue;
                
                setInputNumber(player);
                boolean isRight = player.getIsRight(targetNumber);
                player.isRight = isRight;
                printResult(player);
                if(!isRight){
                    player.life--;
                    if(player.life == 0){
                        rank.add(player);
                        numberOfPlayer--;
                    }
                }
                else{
                    rank.add(player);
                    numberOfPlayer--;
                }
            }
            printStatus();
        }
        printRank();
    }
    
    
    
    public static int getInteger()
    {
        int input = 0;
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                break;
            }catch(java.lang.RuntimeException e){
                System.out.println("입력값이 잘못되었습니다. 정수를 입력하세요.");
            }
        }
        return input;
    }
    
    public void setPlayerInfo(){
        for(int i = 0; i < numberOfPlayer; i++){
            System.out.println((i + 1) + " 번째" +"Player 이름을 입력하세요.");
            
            Player p = new Player(setInputString(), life);
            
            players.add(p);
        }
    }
    
    public void printStatus()
    {
        if(numberOfPlayer == 3){
            System.out.println("-------------------------");
            System.out.println("랜덤 숫자 = "  + targetNumber);
            System.out.println("-------------------------");
            for(Player player : players){
                System.out.println("입력 이름 = "  + player.name);
                System.out.println("남은 라이프 = "  + player.life);
                System.out.println("-------------------------");
            }
          
        }
    }
    
    public void printResult(Player p)
    {
        if(p.isRight ){
            System.out.println("정답입니다. 다시 시도해주세요.");
        }
        else{
            System.out.println("오답입니다. 다시 시도해주세요.");
        }
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
    public void printRank(){
        int i=1;
        for(Player player : rank){
            System.out.println(i+"등은"+ player.name + "입니다.");
            i++;
        }
    }
    public int getRandomNumber(){
        int randomNumber= (int) (Math.random()*10);
        
        return randomNumber;
    }
    
    public void inputException(Player player)
    {
         if(player.inputNumber > 9 || player.inputNumber < 0)
            {
                System.out.println("0 ~ 9 사이의 정수만 입력하세요");
                setInputNumber(player);
            }
    }
    
    public void setInputNumber(Player player){
        //후
        System.out.println(player.name + "의 차례입니다.");
        System.out.println("예상 숫자 입력하세요");
        player.inputNumber = getInteger();
        inputException(player);
        
    }
    
   public void setNumberOfPlayer(){
        //후
        System.out.println("Player 수를 입력하세요.");
        numberOfPlayer = getInteger(); 
        
        if(numberOfPlayer < 0){
                System.out.println("플레이서 수는 0 이상 가능합니다");
                getInteger();
        }
    }
   
    public void setlife(){
        
        System.out.println("라이프를 입력하세요.");
        int input = getInteger();
        life = input;

    }
    
    public String setInputString(){
        String str;
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                str = sc.nextLine();
                break;
            }catch(java.lang.RuntimeException e){
                System.out.println("입력값이 잘못되었습니다. 이름을 입력하세요.");
            }
        }
        return str;
    }
    
   
    
    public int getStrike(int target, int input){
        
        return 0;
    }

    public int getBall(int target, int input){
        
        return 0;
    }    
}
    
    