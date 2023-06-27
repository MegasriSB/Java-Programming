//package Lab;
//import java.io.*;
//import java.net.*;
//public class Ex_5_RARPclient {
//    public static void main(String args[]) {
//        try {
//            DatagramSocket client = new DatagramSocket();
//            InetAddress addr = InetAddress.getByName("127.0.0.1");
//            byte[] sendbyte = new byte[1024];
//            byte[] receivebyte = new byte[1024];
//            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Enter the Physical address (MAC):");
//            String str = in.readLine();
//            sendbyte = str.getBytes();
//            DatagramPacket sender = new DatagramPacket(sendbyte, sendbyte.length, addr, 1309);
//            client.send(sender);
//            DatagramPacket receiver = new DatagramPacket(receivebyte, receivebyte.length);
//            client.receive(receiver);
//            String s = new String(receiver.getData());
//            System.out.println("The Logical Address is(IP): " + s.trim());
//            client.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//}

package Lab;
import java.io.*;
import java.net.*;
public class Ex_5_RARPclient {
    public static void main(String args[]) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            Socket clsct = new Socket("127.0.0.1", 5604);
            DataInputStream din = new DataInputStream(clsct.getInputStream());
            DataOutputStream dout = new DataOutputStream(clsct.getOutputStream());
            System.out.println("Enter the Logical address(MAC):");
            String str1 = in.readLine();
            dout.writeBytes(str1 + '\n');
            String str = din.readLine();
            System.out.println("The Physical Address is: " + str);
            clsct.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

