package Set_3;
import java.io.*;
public class FilereadDisp 
{
    public static void main(String[] args) 
    {
        try
        {
            File f=new File("D:\\Java\\hii.txt");
            int i,j=0,m,k;
            String s1;
            FileReader f1=new FileReader(f);
            char ch[]=new char[(int)f.length()];
            f1.read(ch);
            String s=new String(ch);m=1;
            for(i=0;i<(int)f.length();i++)
            {
                if(ch[i]=='.')
                {
                   k=i+1;
                   s1=s.substring(j,k);
                   System.out.println(m+"."+s1);
                   j=k;m++;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
              
    }
}
