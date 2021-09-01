/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author ssy02
 */
public class Client {
    User user;
    String ip;
    int port;
    Socket clientSocket;
    PrintWriter writer;
    
    public void setSocket(Socket socket){
        try{
            clientSocket = socket;

            writer = new PrintWriter(clientSocket.getOutputStream());
            ip = socket.getInetAddress().toString();
            port = socket.getLocalPort();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void println(String message){
        writer.println(message);
    }
    
    public void setUpNetworking(){
        
    }
}
