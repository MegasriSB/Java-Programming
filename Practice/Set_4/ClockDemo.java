package Set_4;
import java.io.*;
import java.util.*;
class MyOwnException extends Exception{
    public MyOwnException(String msg) {
        super(msg);
    }   
}
class Clock{
    int hr, min;
    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the time in hh:mm format:");
        String str = br.readLine();
        StringTokenizer tokn = new StringTokenizer(str,":");
        String h = tokn.nextToken();
        String m = tokn.nextToken();
        hr = Integer.parseInt(h);
        min = Integer.parseInt(m);
        try{
            System.out.println("Hour: "+hr);
            if(hr<0 || hr>24)
                throw new MyOwnException("Fatal error: Invalid hour");
        }
        catch(MyOwnException e){
            System.out.println(e);
        }
        try{
            System.out.println("Minute: "+min);
            if(min<0 || min>59)
                throw new MyOwnException("Fatal error: Invalid minute");
        }
        catch(MyOwnException e){
            System.out.println(e);
        }
    }
}
public class ClockDemo {
    public static void main(String[] args) throws IOException{
        Clock c = new Clock();
        c.input();
    }
}
