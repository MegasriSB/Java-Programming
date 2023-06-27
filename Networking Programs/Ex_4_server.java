package Lab;
import java.io.*;
import java.net.*;
public class Ex_4_server {
    public static void main(String arg[]) throws IOException {
        DatagramSocket serversocket = new DatagramSocket(3333);
        byte[] senddata = new byte[1021];
        byte[] receivedata = new byte[1021];
        DatagramPacket recvpack = new DatagramPacket(receivedata, receivedata.length);
        serversocket.receive(recvpack);
        String sen = new String(recvpack.getData());
        InetAddress ipaddress = recvpack.getAddress();
        int port = recvpack.getPort();
        System.out.println("Request for host " + sen);
        DatagramPacket pack = new DatagramPacket(senddata, senddata.length, ipaddress, port);
        serversocket.send(pack);
        serversocket.close();
    }
}
