/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Data.Client;
import Network.ClientSocket;
import java.util.ArrayList;

/**
 *
 * @author ssy02
 */
public class ClientSocketManager {
    private static ClientSocketManager instance;
    ArrayList<ClientSocket> clients;
    
    private ClientSocketManager(){
        clients = new ArrayList<ClientSocket>();
    }
    
    private static class SingleTonHolder{
        private static final ClientSocketManager instance = new ClientSocketManager();
    }
    
    public static ClientSocketManager getInstance(){
        return SingleTonHolder.instance;
    }
    
    public void add(ClientSocket client){
        clients.add(client);
    }
}
