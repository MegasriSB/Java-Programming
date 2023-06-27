package Lab;
import java.util.*;
import java.net.*;
import java.io.*;
public class Ex_3_ChatServer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            ServerSocket ss = new ServerSocket(3333);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Connection established successfully");
            String str, str2;
            do{
                str2 = din.readUTF();
                System.out.println("Client entered: "+str2);
                System.out.println("Enter any data: ");
                str = sc.nextLine();
                dout.writeUTF(str);
            }while(str2.equals("stop") == false);
            din.close();
            dout.close();
            s.close();
            ss.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
