/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.numberbaseball.GameLauncher;

import Util.Debug;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ssy02
 */
public class Game {
    //------------------------------------------------------------------------//
    // 상수
    
    //------------------------------------------------------------------------//
    // 인스턴스 변수
    boolean isRight = false;
    int life;
    public int targetNumber;
    int numberOfPlayer;
    
    public ArrayList<Player> players;
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
    public void start(){
        setNumberOfPlayerr();
        setLife();
        setPlayers();
        printStatus();
        
        while(numberOfPlayer > 0){
            for(Player player : players){
                if(player.getIsRight())
                    continue;
                setInputNumber(player);
                isRight = player.compareInputNumberWith(targetNumber);
                player.setIsRight(isRight);
                
                printResult(player);
                if(isRight){
                    numberOfPlayer--;
                }
                else{
                    player.decreaseLife();
                    if(player.getLife() <= 0){
                        numberOfPlayer--;
                    }
                }
                printStatus();
            }
            
        }
        printGameOver();
        askDoRestart();
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void printGameOver(){
        // 최종 순위 출력
        // 라이프 젤 많은 사람 우승자
        
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void setNumberOfPlayerr(){
        System.out.println("플레이어 수를 입력하세요.");
        numberOfPlayer = getInteger();
        setIsDebug(numberOfPlayer);
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void setIsDebug(int userNumber){
        Debug.setIsDebug(userNumber == 3);
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void setLife(){
        System.out.println("라이프를 입력하세요.");
        life = getInteger();
        if(life <= 0){
            System.out.println("라이프는 양수만 입력 가능합니다.");
            setLife();
        }
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void printStatus() {
        Debug.log("#########################################");
        Debug.log("Target Number : " + targetNumber);
        for(Player p : players){
            Debug.log("--------------player " + p.getName() + "--------------");
            Debug.log(p.toString());
        }
        
        Debug.log("#########################################");
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public void printResult(Player p){
        if(p.getIsRight()){
            System.out.println(p.getName() + "님은 정답입니다!");
        }
        else{
            System.out.println(p.getName() + "님은 오답입니다.");
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
    public void setInputNumber(Player player){
        System.out.println(player.getName() + "의 차례입니다.");
        System.out.println("예상 숫자를 입력하세요.");
        int input = getInteger();
        player.setInputNumber(input);
        inputException(input, player);
    }
    
    public void inputException(int input, Player player){
        if(!checkInputNumberRange(input)){
            System.out.println("현재 난이도에선 0 ~ 9 까지의 정수만 입력가능합니다.");
            setInputNumber(player);
        }
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public static int getInteger(){
        int input = 0;
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                break;
            }catch (InputMismatchException exception) {
                System.out.println("정수만 입력 가능합니다.");
            }
        }
        return input;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    public int getStrike(int input){
        
        return 0;
    }
    public int getBall(int input){
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
            start();
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
    public boolean checkInputNumberRange(int input) {
        return 0 <= input && input < 10;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private String getString(){
        String input = "";
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                input = sc.nextLine();
                break;
            }catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return input;
    }
    //------------------------------------------------------------------------//
    //
    //------------------------------------------------------------------------//
    private void setPlayers() {
        players = new ArrayList<Player>(numberOfPlayer);
        for(int i = 0; i < numberOfPlayer; i++){
            System.out.println((i + 1) + "번째 플레이어의 이름을 입력하세요.");
            String userName = getString();
            Player p = new Player(userName, life);
            players.add(p);
        }
    }
}