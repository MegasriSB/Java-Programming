package Lab;
import java.util.*;
import java.net.*;
import java.io.*;
public class Ex_3_FileClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3333);
            String str, str2;
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner m = new Scanner(System.in);
            System.out.println("Options :\n Write\nGet\nExit");
            do {
                System.out.println("enter your choice");
                str = m.next();
                dout.writeUTF(str);
                str2 = "";
                dout.flush();
                if (str.equalsIgnoreCase("Write")) {
                    System.out.println("enter the content of file:");
                    do {
                        str2 = m.nextLine();
                        dout.writeUTF(str2);
                    } while (str2.equalsIgnoreCase("EOF") == false);
                    System.out.println("File written successfully.");
                }
                if (str.equalsIgnoreCase("Get")) {
                    str2 = "";
                    System.out.println("Content of file is :");
                    do {
                        str2 = din.readUTF();
                        System.out.print(str2);
                    } while ((str2.equalsIgnoreCase("EOF")) == false);
                }
            } while (str.equalsIgnoreCase("Exit") == false);
            din.close();
            dout.close();
            s.close();
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}