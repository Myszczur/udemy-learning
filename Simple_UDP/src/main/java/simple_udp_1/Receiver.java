package simple_udp_1;

import java.net.*;
import java.util.Scanner;

public class Receiver {

    public Receiver() throws Exception {
        DatagramSocket socket = new DatagramSocket(2020);
        System.out.println("Receiver is running.");
        Scanner scanner = new Scanner(System.in);

        byte[] buffer = new byte[1500]; //MTU = 1500
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet); //retrieving senders message

        String message = new String(buffer).trim();
        System.out.println("Received: " + message);

        InetAddress sendersAddress = packet.getAddress();
        int sendersPort = packet.getPort();

        System.out.println("Enter your message: ");
        message = scanner.nextLine();
        buffer = message.getBytes();
        packet = new DatagramPacket(buffer, buffer.length, sendersAddress, sendersPort);
        socket.send(packet);

        System.out.println("Sent: " + message);

    }

    public static void main(String[] args) {
        try {
            new Receiver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
