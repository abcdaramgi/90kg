/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomchatserver;

import Network.SocketManager;

/**
 *
 * @author ssy02
 */
public class RandomChatServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t = new Thread(SocketManager.getInstance());
        t.start();
    }

}
