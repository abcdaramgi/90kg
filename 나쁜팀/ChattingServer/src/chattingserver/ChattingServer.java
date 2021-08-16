/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattingserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class ChattingServer {
    ArrayList<PrintWriter> clientOutputStreams;
    
    public class clientHandler implements Runnable{
        BufferedReader reader;
        Socket socket;
        
        public clientHandler(Socket clientSocket){
            try{
                socket = clientSocket;
                InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(isReader);
                        
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            String message;
            try{
                while((message = reader.readLine()) != null){
                    System.out.println("" + message);
                    tellEveryone(message);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    public static void main(String[] args) {
        new ChattingServer().go();
    }
    
    public void go(){
        clientOutputStreams = new ArrayList();
        
        try{
            ServerSocket serversocket = new ServerSocket(5000);
            
            while(true){
                Socket clientSocket = serversocket.accept();
                System.out.println("ip : " + clientSocket.getInetAddress());
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);
                
                Thread t = new Thread(new clientHandler(clientSocket));
                t.start();
                System.out.println("got a 커넥션");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void tellEveryone(String message){
        for(PrintWriter writer : clientOutputStreams){
            try{
                writer.println(message);
                writer.flush();
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
