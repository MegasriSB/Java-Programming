package lab;
import java.io.*;
import java.net.*;
import java.util.*;
public class Ex_3_EchoClient{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Socket s = new Socket("localhost",3333);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Connection established successfully");
            String str, str2;
            System.out.println("Enter any data:");
            str = sc.nextLine();
            dout.writeUTF(str);
            System.out.println("Data sent to server");
            str2 = din.readUTF();
            System.out.println("Data received from server: "+str2);
            din.close();
            dout.close();
            s.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}