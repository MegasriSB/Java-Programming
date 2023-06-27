package Set_3;
import java.io.*;
public class files {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("D:\\Java\\good.txt"));
            String c;
            int l=1;
            System.out.println("the content of the file is:");
            while((c=br.readLine())!=null){
                System.out.println(l+". "+c);
                ++l;
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

