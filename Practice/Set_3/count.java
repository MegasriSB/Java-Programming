package Set_3;
import java.io.*;
public class count {
    public static void main(String[] args) {
        try{
            BufferedReader k=new BufferedReader(new FileReader("D:\\Java\\good.txt"));
            String s,a[];
            int l=0,w=0,c=0;
            System.out.println("the content of the file is:");
            while((s=k.readLine())!=null){
                System.out.println(s);
                ++l;
                c=c+s.length();
                a=s.split(" ");
                w=w+a.length;
            }
            System.out.println("No. of lines = "+l);
            System.out.println("No. of characters = "+c);
            System.out.println("No. of words = "+w);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
