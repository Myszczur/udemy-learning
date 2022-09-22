package simple_tcp_multithread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket socket;
    private MainServer mainServer;

    public ServerThread(Socket socket, MainServer mainServer) {
        this.mainServer = mainServer;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            int clientNumber = mainServer.getClientNumber();
            System.out.println("Client" + clientNumber + " has connected.");

            BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            out_socket.println("Welcome! Whats your name?: "); // send welcome message to the client
            String message = in_socket.readLine();
            System.out.println("Client says: " + message); //display clients message int he console

            socket.close();
            System.out.println("Client " + clientNumber + " has disconnected.");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
