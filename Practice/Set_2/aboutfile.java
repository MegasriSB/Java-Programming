package Set_2;
import java.io.*;
public class aboutfile {
    public static void main(String[] args) throws FileNotFoundException
    {
        File f1=new File("D:\\Java\\good.txt"); 
        String name=f1.toString();
        int i=name.lastIndexOf('.');
        String type=name.substring(i+1);
        System.out.println("File name is "+f1.getName());
        if(f1.exists())
            System.out.println("The file exists");
        else
            System.out.println("The file does not exists");
        if(f1.exists())
        {
            if(f1.canRead())
                System.out.println("The file is readable");
            else
                System.out.println("The file is not readable");
            if(f1.canWrite())
                System.out.println("The file is writable");
            else
                System.out.println("The file is not writable");
            if(i>0)
                System.out.println("The file type is:"+type);
            System.out.println("The length of the file is:"+(byte)f1.length());
        }
    }
}
