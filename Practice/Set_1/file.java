package Set_1;
import java.io.*;
public class file{
    public static void main(String[] args) {
        try {
            int c,i=0;
            int n = args.length;
            System.out.println("Number of files: "+n);
            while(i<n){
                int count =0;
                FileReader fr = new FileReader("D:\\Java\\"+args[i]);
                while((c=fr.read())!=-1)
                    if((char)c == '\n')
                        count++;
                System.out.println("Number of lines:"+count);
                i++;               
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}