package Lab;
import java.util.*;
import java.net.*;
import java.io.*;
public class Ex_3_ChatClient{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Socket s = new Socket("localhost", 3333);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Connection established successfully");
            String str, str2;
            do{
                System.out.println("Enter any data: ");
                str = sc.nextLine();
                dout.writeUTF(str);
                str2 = din.readUTF();
                System.out.println("Data from server: "+str2);
            }while(str.equals("stop") == false);
            din.close();
            dout.close();
            s.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
