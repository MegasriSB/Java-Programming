package Set_1;
class name extends Thread{
    name(String msg) {
        super(msg);
    }
    @Override
    public void run(){
        System.out.println("Hello I am "+Thread.currentThread().getName());
    }
}
public class Threadcommand {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        System.out.println(a);
        name th[] = new name[a];
        for(int i = 0; i < th.length; i++){
            int k =i+1;
            th[i] = new name("Thread #"+k);
            th[i].start();
        }
    }
}
