/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import Data.Client;
import Data.Matching;
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
    public ArrayList<Client> matchingClients = new ArrayList<Client>();
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
    // singleton pattern
    // --------------------------------------------------------------------------------------------//
    private static class SingleTonHolder {
        private static final SocketManager instance = new SocketManager();
    }

    public static SocketManager getInstance() {
        return SingleTonHolder.instance;
    }

    public void printClients() {
        Debug.log("printClients");
        for (Client c : clients) {
            Debug.log("client : " + c.getUser());
        }
    }
    // --------------------------------------------------------------------------------------------//
    // 메서드
    // --------------------------------------------------------------------------------------------//

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
                        
                        actualClient.status = Client.MATCHING;
                        matchingClients.add(actualClient);
                        
                        Thread t = new Thread(new Matching(actualClient, mc));
                        t.start();

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
}