package simple_tcp;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(2020);

    }

    public static void main(String[] args) {
        try {
            new Server();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}