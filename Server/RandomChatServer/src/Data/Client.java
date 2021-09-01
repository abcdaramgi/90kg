/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Network.SocketManager;
import Util.Debug;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author ssy02
 */
public class Client {
    // ------------------------------------------------------------------------//
    //
    // ------------------------------------------------------------------------//
    public User user;
    private String ip;
    private int port;
    Socket clientSocket;
    public Client connectedClient;

    public int status = 0;
    public static final int ONLINE = 0;
    public static final int MATCHING = 1;
    public static final int MATCHED = 2;

    PrintWriter writer;

    // ------------------------------------------------------------------------//
    //
    // ------------------------------------------------------------------------//
    public Client(User user) {
        this.user = user;
    }

    public Client(Socket socket) {
        setSocket(socket);
    }

    public Client(Socket socket, User user) {
        this(socket);
        this.user = user;
    }

    public Client(Socket socket, User user, Client connectedClient) {
        this(socket, user);
        this.connectedClient = connectedClient;
    }

    // ------------------------------------------------------------------------//
    //
    // ------------------------------------------------------------------------//
    // equals 오버라이드 (clients.indexOf 함수 사용 시 호출)
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Client))
            return false;
        Client c = (Client) o;

        return c.getUser() != null && this.user.getId().equals(c.getUser().getId());
    }

    public void setSocket(Socket socket) {
        // 클라이언트 소켓 정보 세팅
        try {
            clientSocket = socket;

            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
            ip = socket.getInetAddress().toString();
            port = socket.getLocalPort();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ------------------------------------------------------------------------//
    // getter and setter
    // ------------------------------------------------------------------------//
    public void println(String message) {
        Debug.log(message);
        writer.println(message);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Socket getClientSocket() {
        return clientSocket;
    }

    public void setClientSocket(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public PrintWriter getWriter() {
        return writer;
    }

    public void setWriter(PrintWriter writer) {
        this.writer = writer;
    }

    public Client getConnectedClient() {
        return this.connectedClient;
    }

    public void setConnectedClient(Client connectedClient) {
        this.connectedClient = connectedClient;
    }

    public int isMatching() {
        return this.status;
    }

    public void setIsMatching(int status) {
        this.status = isMatching();
    }

//    public void chatting(Client connectedClient, String message) {
//        connectedClient.println(message);
//    }

}
