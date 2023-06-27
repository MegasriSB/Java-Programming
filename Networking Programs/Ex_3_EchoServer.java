package lab;
import java.io.*;
import java.net.*;
public class Ex_3_EchoServer{
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(3333);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Connection established successfully");
            String str = din.readUTF();
            System.out.println("Data at the client side: "+str);
            System.out.println(str);
            dout.writeUTF(str);
            System.out.println("Data sent to client");
            din.close();
            dout.close();
            s.close();
            ss.close();
            System.out.println("Connection terminated");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}