package Lab;
import java.io.*;

public class dummyCRC {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the generator");
        String gen = br.readLine();
        System.out.println("Enter the data:");
        String data = br.readLine();
        String code = data;
        
        while(code.length()<(data.length()+gen.length()-1)){
            code = code + "0";
        }
        
        code = data + div(code,gen);
        System.out.println("The transmitted code:"+code);
        System.out.println("Enter the received code:");
        String recv = br.readLine();
       if (Integer.parseInt(div(recv, gen)) == 0)
           System.out.println("The received code contains no errors");
       else
           System.out.println("The received code contains errors");
    
    }
    
    static String div(String n1,String n2){
        int p = n2.length();
        String rem="";
        String res = n1.substring(0,p);
        for(int i =0;i<n2.length();i++){
            if(res.charAt(i)==n2.charAt(i))
                rem+="0";
            else
                rem+="1";
        }
        while(p<n1.length()){
            if(rem.charAt(0)=='0'){
                rem=rem.substring(1,rem.length());
                rem=rem+String.valueOf(n1.charAt(p));
                p++;   
            }
            
            res = rem;
            rem="";
            for(int i =0;i<n2.length();i++){
            if(res.charAt(i)==n2.charAt(i))
                rem+="0";
            else
                rem+="1";
        }
        }
        return rem.substring(1,rem.length());
    }
}
