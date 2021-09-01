/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author ASUS
 */
public class SocketNetwork {
    Socket socket;
    PrintWriter writer;
    //------------------------------------------------------------------------//
    private void setUpNetworking(){
        try{
            socket = new Socket("127.0.0.1", 5000);
            
            System.out.println("서버에 접속하셨습니다.");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    private void sendMessage(){
        try{
            OutputStream out = socket.getOutputStream();
            writer = new PrintWriter(out);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
/* 1.소켓연결 2. 서버로 메세지 전송

*/