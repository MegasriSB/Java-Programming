package lab;
import java.io.*;
import java.net.*;
import java.util.*;
public class Ex_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int portNumber = 80;
        System.out.println("Enter the url:");
        String hostName = sc.nextLine();
        try{
            Socket socket = new Socket(hostName,portNumber);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("GET / HTTP/1.1\nHost:" +hostName+ " \n\n");
            String inputLine;
            while((inputLine = in.readLine()) != null){
                System.out.println(inputLine+"\n");
            }
        }
        catch(UnknownHostException e){
            System.err.println("Don't know about the host "+hostName);
            System.exit(1);
        }
        catch(IOException e){
            System.err.println("Couldn't get I/O for the connection to "+hostName);
            System.exit(1);
        }
    }
}