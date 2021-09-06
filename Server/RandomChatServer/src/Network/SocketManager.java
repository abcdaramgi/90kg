/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import Data.Client;
import Data.MatchingCondition;
import Data.User;
import Util.Debug;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ssy02
 */
public class SocketManager implements Runnable {
    private static SocketManager instance;
    public ArrayList<Client> clients;
    public Queue<Client> matchingQueue = new LinkedList<Client>();
    public ArrayList<Client> premiumUsers = new ArrayList<Client>();
    private ServerSocket serverSocket;
    int port;
    int clientCount = 0;

    public SocketManager() {
        try {
            this.port = 5000;

            serverSocket = new ServerSocket(port);

        } catch (IOException ex) {
            Debug.log("Socket construct exception");
        }
    }
    // 서버가 클라이언트를 기다리는
    @Override
    public void run() {
        clients = new ArrayList<Client>();
        System.out.println("Server ON");
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                Client connectedClient = new Client(socket);
                connectedClient.setUser(new User("client" + clientCount++));
                clients.add(connectedClient);

                connectedClient.println("채팅서버에 접속하셨습니다.");

                Thread.sleep(50);

                Thread t = new Thread(new ClientHandler(connectedClient.getClientSocket()));
                t.start();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    // --------------------------------------------------------------------------------------------//
    // ClientHandler (내부 클래스) 인터페이스 (runnable)
    // --------------------------------------------------------------------------------------------//
    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket socket;

        public ClientHandler(Socket clientSocket) {
            try {
                socket = clientSocket;
                InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(isReader);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // ----------------------------------------------------------------------------------------//
        // 클라이언트 소켓이 read 하는 부분
        // 클라이언트 소켓의 쓰레드가 수행하는 행동

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    // add clients area
                    JSONParser parser = new JSONParser();
                    JSONObject data = (JSONObject) parser.parse(message);
                    String status = data.get("status").toString();
                    
                    if (status.equals("online")) {
                        String userJson = data.get("user").toString();
                        User newUser = parseUser(userJson);
                        
                        int clientIdx = clients.indexOf(new Client(newUser));
                        Client newClient = clients.get(clientIdx);
                        
                        newClient.setUser(newUser);
                        newClient.status = Client.ONLINE;

                    }
                    if (status.equals("matching")) {
                        String userJson = data.get("matchingCondition").toString();
                        MatchingCondition mc = parseMatching(userJson);
                        Client tempClient = new Client(new User(mc.sourceClientId));
                        
                        Client actualClient = clients.get(clients.indexOf(tempClient));
                        actualClient.matchingCondition = mc;
                        actualClient.status = Client.MATCHING;
                        
                        if(mc.condition.equals("premium")){
                            premiumUsers.add(actualClient);
                            premiumMatching(actualClient);
                        }
                        else{
                            randomMatching(actualClient);
                        }
                        
                        
                        //----------------------------------------------------//
                        // 랜덤매칭
                        
                        //----------------------------------------------------//
                        // 조건 매칭
                        printQueue();
//                        Thread t = new Thread(new Matching(actualClient, mc));
//                        t.start();
                        
                  

                        // statusCheck(matchingClients, newClient);
                        // 매칭 배열 최신화
                        // matchingCheck(kindsOfmatching, newClient, condition);
                    } else {
                        String[] splitMessage = message.split(":");
                        String clientName = splitMessage[0];
                        String msg = splitMessage[1];

                        Client client = new Client(new User(clientName));

                        // client.chatting(client.connectedClient, msg);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // --------------------------------------------------------------------------------------------//
    // 메서드
    // --------------------------------------------------------------------------------------------//
    public void randomMatching(Client matchingClient){
        if(matchingQueue.size() == 0){
            matchingQueue.add(matchingClient);
        }
        else if(matchingQueue.size() == 1){
            matchingQueue.add(matchingClient);
            Client targetClient = matchingQueue.poll();
            Client sourceClient = matchingQueue.poll();
            
            
            matching(sourceClient, targetClient);
            Debug.log("randomMatching");
        }
        else{
            Debug.log("");
            printQueue();
        }
    }
    public boolean checkCondition(MatchingCondition matchingCondition, Client client){
        // age : 20 ~ 24, -1 ~ 24, 25 ~ 100
        // user age : 25
        
        User u = client.getUser();
        
        boolean ageCondition = matchingCondition.minAge <= u.getAge() && u.getAge() <= matchingCondition.maxAge;
        boolean genderConditon = matchingCondition.gender.equals(u.getGender())  ||  matchingCondition.gender.equals("");
        boolean univConditon = matchingCondition.univ.equals(u.getUniv()) ||  matchingCondition.univ.equals("");
        boolean majorConditon = matchingCondition.major.equals(u.getMajor())  ||  matchingCondition.major.equals("");
        return ageCondition &&  genderConditon && univConditon && majorConditon;
    }
    
    public void premiumMatching(Client waitingClient){
        boolean isMatching = false;
        Client tempClient = new Client(new User(""));
        for(Client sourceClient : premiumUsers){
            if(!matchingQueue.isEmpty()){
                Client targetClient = matchingQueue.peek();
                if(checkCondition(sourceClient.matchingCondition, targetClient)){
                    targetClient = matchingQueue.poll();
                    matching(sourceClient, targetClient);
                    Debug.log("premiumMatching !isEmpty");
                    isMatching = true;
                    tempClient = sourceClient;
                    break;
                }
            }
            else{
                if(checkCondition(sourceClient.matchingCondition, waitingClient)){
                    Debug.log("sourceClient : " + sourceClient.getUser());
                    Debug.log("targetClient : " + waitingClient.getUser());
                    matching(sourceClient, waitingClient);
                    Debug.log("premiumMatching isEmpty");
                    tempClient = sourceClient;
                    isMatching = true;
    //                premiumUsers.remove(tempClient);
                    break;
                }
            }
        }
        
        if(!isMatching){
            matchingQueue.add(waitingClient);
            randomMatching(waitingClient);
        }
        else{
            premiumUsers.remove(tempClient);
        }
        
    }
    
    public void matching(Client sourceClient, Client targetClient){
        sourceClient.connectedClient = targetClient;
        sourceClient.status = Client.MATCHED;
        sourceClient.getWriter().println("matched!!! " + sourceClient.connectedClient.getUser());
        targetClient.connectedClient = sourceClient;
        targetClient.status = Client.MATCHED;
        targetClient.getWriter().println("matched!!! " + targetClient.connectedClient.getUser());
    }
    
    public User parseUser(String userJson) {
        JSONParser parser = new JSONParser();
        JSONObject data;
        User user = new User();
        try {
            data = (JSONObject) parser.parse(userJson);
            user.setId((String) data.get("id"));

            user.setAge(Integer.parseInt((String) data.get("age")));
            user.setGender((String) data.get("gender"));
            user.setUniv((String) data.get("univ"));
            user.setMajor((String) data.get("major"));
            user.setNickname((String) data.get("nickname"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    public MatchingCondition parseMatching(String matchingConditionJson) {
        JSONParser parser = new JSONParser();
        JSONObject data;
        MatchingCondition matchingCondition = new MatchingCondition();
        try {
            data = (JSONObject) parser.parse(matchingConditionJson);
            matchingCondition.condition = data.get("condition").toString();
            matchingCondition.minAge = Integer.parseInt((String) data.get("minAge"));
            matchingCondition.maxAge = Integer.parseInt((String) data.get("maxAge"));
            matchingCondition.univ = data.get("univ").toString();
            matchingCondition.major = data.get("major").toString();
            matchingCondition.gender = data.get("gender").toString();
            matchingCondition.sourceClientId = data.get("userId").toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return matchingCondition;
    }

    public void tellEveryone(String message) {
        for (Client client : clients) {
            try {
                PrintWriter writer = client.getWriter();
                writer.println(message);
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void printClients() {
        Debug.log("printClients");
        for (Client c : clients) {
            Debug.log("client : " + c.getUser());
        }
    }
        
    
    
    
    public void printQueue(){
        for(Client c : matchingQueue){
            Debug.log("client : " + c.getUser());
        }
    }

    // --------------------------------------------------------------------------------------------//
    // singleton pattern
    // --------------------------------------------------------------------------------------------//
    private static class SingleTonHolder {
        private static final SocketManager instance = new SocketManager();
    }

    public static SocketManager getInstance() {
        return SingleTonHolder.instance;
    }


}