/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang.generateclient;

import Data.DBConnector;
import Data.MatchingCondition;
import Data.User;
import Managers.ClientSocketManager;
import Managers.GenerateManager;
import Network.ClientSocket;

/**
 *
 * @author ssy02
 */
public class GenerateClient {
    public static void main(String[] args){
        DBConnector.getConnection();
        GenerateManager gm = new GenerateManager();
        
        ClientSocket client0 = new ClientSocket();
        User user0 = new User("client0", "", "계명대", "컴퓨터공학", "M", "27");
        MatchingCondition mc0 = new MatchingCondition("premium", "20", "100");
        client0.mc = mc0;
        
        ClientSocket client1 = new ClientSocket();
        User user1 = new User("client1", "", "계명대", "컴퓨터공학", "F", "23");
        MatchingCondition mc1 = new MatchingCondition("premium", "20", "100");
        client1.mc = mc1;
        
        ClientSocket client2 = new ClientSocket();
        User user2 = new User("client2", "", "계명대", "컴퓨터공학", "F", "21");
        MatchingCondition mc2 = new MatchingCondition("premium", "F");
        client2.mc = mc2;
        
        ClientSocket client3 = new ClientSocket();
        User user3 = new User("client3", "", "계명대", "컴퓨터공학", "M", "31");
        MatchingCondition mc3 = new MatchingCondition("premium", "F");
        client3.mc = mc3;
        
        ClientSocket client4 = new ClientSocket();
        User user4 = new User("client4", "", "계명대", "컴퓨터공학", "F", "22");
        MatchingCondition mc4 = new MatchingCondition("premium", "-1", "30");
        client4.mc = mc4;
        
        ClientSocket client5 = new ClientSocket();
        User user5 = new User("client5", "", "계명대", "컴퓨터공학", "M", "23");
        MatchingCondition mc5 =  new MatchingCondition("premium", "-1", "30");
        client5.mc = mc5;
        
//        gm.setNumOfClients();
        ClientSocketManager.getInstance().clients.add(client0);
        ClientSocketManager.getInstance().clients.add(client1);
        ClientSocketManager.getInstance().clients.add(client2);
        ClientSocketManager.getInstance().clients.add(client3);
        ClientSocketManager.getInstance().clients.add(client4);
        ClientSocketManager.getInstance().clients.add(client5);
        
        gm.matchAllClient();
        
        /*for(int i = 0; i < ClientSocketManager.getInstance().clients.size(); i++){
            gm.setUser();
        }
        */
        
        
    }
}
