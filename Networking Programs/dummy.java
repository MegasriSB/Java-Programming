package Lab;
import java.util.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dummy {
    public static void main(String[] args) throws UnknownHostException {
        String url;
        System.out.print("Enter the hostname : ");
        Scanner ob = new Scanner(System.in);
        url = ob.nextLine();
        InetAddress str = InetAddress.getByName(url);
        System.out.println(str);
        try {
            NetworkInterface network = NetworkInterface.getByInetAddress(str);
            System.out.println(network);
        } catch (SocketException ex) {
            System.out.println(ex);
        }
    }
}
