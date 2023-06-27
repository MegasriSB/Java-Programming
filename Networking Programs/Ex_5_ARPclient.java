package Lab;
import java.io.*;
import java.net.*;
public class Ex_5_ARPclient {
    public static void main(String args[]) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            Socket s = new Socket("localhost", 3333);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Enter the Logical address(IP):");
            String str1 = in.readLine();
            dout.writeBytes(str1 + '\n');
            String str = din.readLine();
            System.out.println("The Physical Address is: " + str);
            s.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
