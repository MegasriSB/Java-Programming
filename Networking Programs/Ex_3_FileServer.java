package Lab;
import java.net.*;
import java.io.*;
public class Ex_3_FileServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3333);
            Socket s = ss.accept();
            String str, str2;
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println("Connection established successfully.");
            do {
                str = din.readUTF();
                str2 = "";
                dout.flush();
                if (str.equalsIgnoreCase("write")) {
                    System.out.println("Writing into the file");
                    FileWriter k = new FileWriter("D:\\my.txt");
                    do {
                        str2 = din.readUTF();
                        k.write(str2 + "\n"); 
                    } while (str2.equalsIgnoreCase("EOF") == false);
                    k.close();
                }
                if (str.equalsIgnoreCase("get")) {
                    int i;
                    System.out.println("Reading from the file");
                    str2 = "";
                    FileReader fr = new FileReader("D:\\my.txt");
                    while ((i = fr.read()) != -1) {
                        str2 += (char) i;
                    }
                    dout.writeUTF(str2);
                    dout.writeUTF("EOF");
                    fr.close();
                }
            } while (str.equalsIgnoreCase("exit") == false);
            din.close();
            dout.close();
            s.close();
            ss.close();
            System.out.println("Connection closed");
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
