package Set_2;
import java.util.*;
class even extends Thread{
    public int n;
    public even(int n) {
        this.n = n;
    }
    @Override
    public void run(){
        System.out.println("Thread "+ n +" is even ==> square value is: " + n * n);
    }
}
class odd extends Thread{
    public int n;
    public odd(int n) {
        this.n = n;
    }
    @Override
    public void run(){
        System.out.println("Thread "+ n +" is odd ==> cube value is: " + n * n * n);
    }
}
public class Multithreading extends Thread {
    public static void main(String[] args){
        Multithreading m = new Multithreading(){
            @Override
            public void run(){
                int n = 0;
                Random r = new Random();
                try{
                    for(int i=0;i<5;i++){
                        n=r.nextInt(15);
                        System.out.println("The Random number is : "+n);
                        if(n%2==0){
                            even t1 = new even(n);
                            t1.start();
                        }
                        else{
                            odd t2 = new odd(n);
                            t2.start();
                        }
                        Thread.sleep(100);
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        };
        m.start();
    }
}
