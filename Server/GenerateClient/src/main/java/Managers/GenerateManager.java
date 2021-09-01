/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Network.ClientSocket;
import Util.Debug;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import org.json.JSONObject;


/**
 *
 * @author ssy02
 */

public class GenerateManager {
    int numberOfClient;

    public void matching(){
        ArrayList<ClientSocket> clients = ClientSocketManager.getInstance().clients;

        System.out.println("매칭을 진행할 클라이언트 수를 입력하세요.");
        int numOfMatchingClient = getInteger();

        for(int i = 0; i < numOfMatchingClient; i++){
            String matchingCondition = setMatchingCondition();
            sendFrom(i, matchingCondition, "###");
        }    
    }

    public String setMatchingCondition(){
        System.out.println("매칭 조건을 입력하세요. ");
        System.out.println("1. random ");
        System.out.println("2. age");
        System.out.println("3. gender");

        int matchingCondition = getInteger();

        switch(matchingCondition){
            case 1: 
                return "random";
            case 2: 
                // 10 ~ 20
                System.out.println("최소 나이");
                int minAge = getInteger();
                System.out.println("최대 나이");
                int maxAge = getInteger();
                return "age/" + minAge + "/"+ maxAge;
            case 3: 
                // F : 여자 또는 M : 남자
                String gender = getString();
                return "gender/" + gender;
            default:
                return "random";

        }
    }

    public void setTargetClient() {
        System.out.println("메시지를 보낼 클라이언트 인덱스를 입력하세요.");
        int targetClientIdx = getInteger();
        String message = setMessage();

        sendFrom(targetClientIdx, message, "");
    }

    public void sendFrom(int idx, String msg, String type){
        ClientSocket cs = ClientSocketManager.getInstance().clients.get(idx);
        String clientId = cs.getUser().getId();
        String message = type + clientId + ":" + msg + type;
        Debug.log(message);
        cs.getWriter().println(message);
    }

    public String setMessage(){
        System.out.println("메시지를 입력하세요.");
        String message = getString();

        return message;
    }
    
    public void setNumOfClients(){
        System.out.println("클라이언트 수를 입력하세요.");
        numberOfClient = getInteger();
        for(int i = 0; i < numberOfClient; i++){
            ClientSocket cs = new ClientSocket();
            ClientSocketManager.getInstance().add(cs);
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
                System.out.println("정수만 입력 가능합니다..");
            }
        }
        return input;
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

    
    
}
