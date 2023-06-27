package Set_3;
import java.util.*;
public class Poly {
    int a,b;
    public Poly(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void add(){
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
class child extends Poly{

    public child(int a, int b) {
        super(a, b);
    }

    @Override
    public void add() {
        System.out.println("there is no addition");
    }
    
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int x,y;
        System.out.println("enter any two integers");
        child k=new child(m.nextInt(),m.nextInt());
        k.add();
    }
}
