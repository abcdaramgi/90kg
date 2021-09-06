/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import Data.MatchingCondition;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import Data.User;
import Util.Debug;
import org.json.JSONObject;

/**
 *
 * @author ssy02
 */
public class ClientSocket {
    // ------------------------------------------------------------------------//
    //
    public static int numOfClient;

    BufferedReader reader;
    private PrintWriter writer;
    private User user;
    public MatchingCondition mc;

    Socket socket;

    // ------------------------------------------------------------------------//
    //
    // ------------------------------------------------------------------------//
    public ClientSocket() {
        setUpNetworking();
        go();
    }

    // ------------------------------------------------------------------------//
    //
    // ------------------------------------------------------------------------//
    private void setUpNetworking() {
        try {
            socket = new Socket("192.168.0.5", 5000);
            user = new User("client" + numOfClient++);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);

            Debug.log(user.getId() + " on");

            online();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*
     * 
     * 
     * { "status" : "online" // "matching" // "exit" // "message",
     * 
     * "matchingCondtion" : { "minAge" : "maxAge" : } } private String id; private
     * String nickname; private String univ; private String major; private String
     * gender; private int age;
     */

    public void online() {
        JSONObject data = new JSONObject();
        JSONObject userJson = new JSONObject();
        userJson.put("id", user.getId());
        userJson.put("nickname", user.getNickname());
        userJson.put("univ", user.getUniv());
        userJson.put("major", user.getMajor());
        userJson.put("gender", user.getGender());
        userJson.put("age", user.getAge());

        data.put("status", "online");
        data.put("user", userJson);
        writer.println(data.toString());
        writer.flush();
    }

    // gender, major, univ
    public void match() {
        MatchingCondition matchingCondition = this.mc;
        JSONObject data = new JSONObject();
        JSONObject matchingConditionJson = new JSONObject();
        
        data.put("status", "matching");
        
        matchingConditionJson.put("condition", matchingCondition.getCondition());
        matchingConditionJson.put("minAge", matchingCondition.getMinAge());
        matchingConditionJson.put("maxAge", matchingCondition.getMaxAge());
        matchingConditionJson.put("univ", matchingCondition.getUniv());
        matchingConditionJson.put("major", matchingCondition.getMajor());
        matchingConditionJson.put("gender", matchingCondition.getGender());
        matchingConditionJson.put("userId", user.getId());

        data.put("matchingCondition", matchingConditionJson);
        
        writer.println(data.toString());
        writer.flush();

    }

    public void go() {
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
    }

    public class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("서버로부터 온 메시지 : " + message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    // ------------------------------------------------------------------------//
    // getter and setter
    // ------------------------------------------------------------------------//
    public PrintWriter getWriter() {
        return this.writer;
    }

    public void setWriter(PrintWriter writer) {
        this.writer = writer;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
