package Lab;
import java.io.*;
import java.util.*;
import java.net.*;
public class Ex_4_client {
    public static void main(String args[]) throws IOException {
        DatagramSocket clientsocket = new DatagramSocket();
        InetAddress ipaddress;
        ipaddress = InetAddress.getLocalHost();
        byte[] senddata = new byte[1024];
        byte[] receivedata = new byte[1024];
        int portaddr = 3333;
        DatagramPacket pack = new DatagramPacket(senddata, senddata.length, ipaddress, portaddr);
        clientsocket.send(pack);
        DatagramPacket recvpack = new DatagramPacket(receivedata, receivedata.length);
        clientsocket.receive(recvpack);
        System.out.println(ipaddress);
        System.out.print("Enter the hostname : ");
        Scanner ob = new Scanner(System.in);
        String url = ob.nextLine();
        System.out.println(InetAddress.getByName(url));
        clientsocket.close();
    }
}
