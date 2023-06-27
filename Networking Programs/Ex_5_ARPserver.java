package Lab;
import java.io.*;
import java.net.*;
public class Ex_5_ARPserver {
    public static void main(String args[]) {
//        try {
//            ServerSocket ss = new ServerSocket(3333);
//            Socket s = ss.accept();
//            DataInputStream din = new DataInputStream(s.getInputStream());
//            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
//            String str = din.readLine();
//            String ip[] = {"165.165.80.80", "165.165.79.1"};
//            String mac[] = {"6A:08:AA:C2", "8A:BC:E3:FA"};
//            for (int i = 0; i < ip.length; i++) {
//                if (str.equals(ip[i])) {
//                    dout.writeBytes(mac[i] + '\n');
//                    break;
//                }
//            }
//            s.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
            try{
                ServerSocket ss = new ServerSocket(3333);
                Socket s = ss.accept();
                DataInputStream din = new DataInputStream(s.getInputStream());
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                String str = din.readLine();
                String ip[] = {"165.165.80.80", "165.165.79.1"};
                String mac[] = {"6A:08:AA:C2", "8A:BC:E3:FA"};
                for(int i =0 ;i<ip.length;i++){
                    if(str.equals(ip[i])){
                        dout.writeBytes(mac[i] +"\n");
                        break;
                    }
                }
                s.close();din.close();dout.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
    }
}
