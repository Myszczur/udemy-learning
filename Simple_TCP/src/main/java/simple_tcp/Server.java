package simple_tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(2020); // opening a new port
        System.out.println("Port 2020 is open");

        Socket socket = serverSocket.accept();
        System.out.println("Client " + socket.getInetAddress() + " has connected");

        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        out_socket.println("Welcome!"); // send welcome message to the client
        String message = in_socket.readLine();
        System.out.println("Client says: " + message); //display clients message int he console

        socket.close();
        System.out.println("Socket is closed.");
    }

    public static void main(String[] args) {
        try {
            new Server();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}