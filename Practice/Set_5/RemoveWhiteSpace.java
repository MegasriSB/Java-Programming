package Set_5;
import java.io.*;
public class RemoveWhiteSpace {
    public static void main(String[] args){
        String c;
        try{
            FileReader fr = new FileReader("D:\\Java\\bye.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("D:\\Java\\hehe.txt");
            while((c=br.readLine())!=null){
                c = c.trim();   //To remove beginning and ending spaces
                c = c.replaceAll("\\s+","");   //To remove inbetween spaces
                fw.write(c);
            }
            fr.close();
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
