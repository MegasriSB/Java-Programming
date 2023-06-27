package Set_1;
import java.io.*;
public class threadprgm extends Thread{
    public static void main(String[] args){
        threadprgm b = new threadprgm(){
            @Override
            public void run(){
                try {
                    int i=0,c,n=args.length;
                    while(i<n){
                        int count=0;
                        File f = new File("D:\\Java\\"+args[i]);
                        BufferedReader br = new BufferedReader(new FileReader(f));
                        while((br.readLine())!=null)
                                count++;
                        System.out.println(f.getName()+" : "+count);
                        i++;
                    }
                } 
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        b.start();
        System.out.println(b);
    }
}

