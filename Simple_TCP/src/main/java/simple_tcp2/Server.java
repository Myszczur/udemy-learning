package simple_tcp2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {

    public Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(2020); // opening a new port
        System.out.println("Port 2020 is open");

        Socket socket = serverSocket.accept();
        System.out.println("Client " + socket.getInetAddress() + " has connected");

        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        int secretNumber = (int) (Math.random() * 10 + 1);
        String message;

        do {
            out_socket.println("Guess a number [1-10]: ");
            message = in_socket.readLine();
        } while (!(Integer.parseInt(message) == secretNumber));

        out_socket.println("You got it !");
        System.out.println("Secret number is out. Exiting the app.");
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