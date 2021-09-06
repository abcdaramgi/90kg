/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Network.ClientSocket;
import Util.Debug;
import Data.MatchingCondition;

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
    boolean premium = false;
    ArrayList<ClientSocket> clients;

    public GenerateManager() {
        clients = ClientSocketManager.getInstance().clients;
    }

    public void matching() {
        System.out.println("매칭을 진행할 클라이언트 수를 입력하세요.");
        int numOfMatchingClient = getInteger();

        for (int i = 0; i < numOfMatchingClient; i++) {
            String matchingCondition = setMatchingCondition();
            sendFrom(i, matchingCondition, "###");
        }
    }

    public String setMatchingCondition() {
        System.out.println("매칭 조건을 입력하세요. ");
        System.out.println("1. random ");
        System.out.println("2. age");
        System.out.println("3. gender");

        int matchingCondition = getInteger();

        switch (matchingCondition) {
            case 1:
                return "random";
            case 2:
                // 10 ~ 20
                System.out.println("최소 나이");
                int minAge = getInteger();
                System.out.println("최대 나이");
                int maxAge = getInteger();
                return "age/" + minAge + "/" + maxAge;
            case 3:
                // F : 여자 또는 M : 남자
                String gender = getString();
                return "gender/" + gender;
            default:
                return "random";

        }
    }

    public void setUser() {
        System.out.println("세팅할 클라이언트 인덱스를 입력하세요.");
        int clientIdx = getInteger();
        System.out.print("user id : ");
        String userId = getString();
        System.out.print("nickname : ");
        String nickname = getString();

    }

    public void setTargetClient() {
        System.out.println("메시지를 보낼 클라이언트 인덱스를 입력하세요.");
        int targetClientIdx = getInteger();
        String message = setMessage();

        sendFrom(targetClientIdx, message, "");
    }

    public void sendFrom(int idx, String msg, String type) {
        ClientSocket cs = ClientSocketManager.getInstance().clients.get(idx);
        String clientId = cs.getUser().getId();
        String message = type + clientId + ":" + msg + type;
        Debug.log(message);
        cs.getWriter().println(message);
    }

    public String setMessage() {
        System.out.println("메시지를 입력하세요.");
        String message = getString();

        return message;
    }

    public void IsPremium(boolean premium) { // ~~premium을 봉인해제하면 프리미엄을 true로 바꿔저서 신호를 준다
        // if(true){ //premium을 봉인해제 하는 조건 : premium매칭을 하시겠습니까?에서 확인을 누르면
        // //this.premium = true;
        // MatchingCondition mc = new MatchingCondition();
        // mc.setCondition();
        // mc.setMinAge();
        // mc.setMaxAge();
        // mc.setGender();
        // mc.setUniv();
        // mc.setMajor();
        // }
        // else
        // this.premium = false;

    }
    public void match(){
        
    }
    
    public void matchAllClient() {
        for (ClientSocket client : clients) {
            client.match();
        }
    }

    public void setNumOfClients() {
        System.out.println("클라이언트 수를 입력하세요.");
        numberOfClient = getInteger();
        for (int i = 0; i < numberOfClient; i++) {
            ClientSocket cs = new ClientSocket();
            ClientSocketManager.getInstance().add(cs);
        }

    }

    // ------------------------------------------------------------------------//
    //
    // ------------------------------------------------------------------------//
    public static int getInteger() {
        int input = 0;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("정수만 입력 가능합니다..");
            }
        }
        return input;
    }

    // ------------------------------------------------------------------------//
    //
    // ------------------------------------------------------------------------//
    private String getString() {
        String input = "";
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextLine();
                break;
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return input;
    }

}
