//package Lab;
//import java.io.IOException;
//import java.net.*;
//public class Ex_5_RARPserver {
//    public static void main(String args[]) {
//        try {
//            DatagramSocket server = new DatagramSocket(1309);
//            while (true) {
//                byte[] sendbyte = new byte[1024];
//                byte[] receivebyte = new byte[1024];
//                DatagramPacket receiver = new DatagramPacket(receivebyte, receivebyte.length);
//                server.receive(receiver);
//                String str = new String(receiver.getData());
//                String s = str.trim();
//                InetAddress addr = receiver.getAddress();
//                int port = receiver.getPort();
//                String ip[] = {"165.165.80.80", "165.165.79.1"};
//                String mac[] = {"6A:08:AA:C2", "8A:BC:E3:FA"};
//                for (int i = 0; i < ip.length; i++) {
//                    if (s.equals(mac[i])) {
//                        sendbyte = ip[i].getBytes();
//                        DatagramPacket sender = new DatagramPacket(sendbyte, sendbyte.length, addr, port);
//                        server.send(sender);
//                        break;
//                    }
//                }
//                break;
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//}

package Lab;
import java.io.*;
import java.net.*;
public class Ex_5_RARPserver {
    public static void main(String args[]) {
        try {
            ServerSocket obj = new ServerSocket(5604);
            Socket obj1 = obj.accept();
            while (true) {
                DataInputStream din = new DataInputStream(obj1.getInputStream());
                DataOutputStream dout = new DataOutputStream(obj1.getOutputStream());
                String str = din.readLine();
                String ip[] = {"165.165.80.80", "165.165.79.1"};
                String mac[] = {"6A:08:AA:C2", "8A:BC:E3:FA"};
                for (int i = 0; i < ip.length; i++) {
                    if (str.equals(mac[i])) {
                        dout.writeBytes(ip[i] + '\n');
                        break;
                    }
                }
                obj.close();
                break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}