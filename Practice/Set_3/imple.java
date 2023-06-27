package Set_3;
import Set_3_18.*;
import java.util.*;
public class imple implements inter{
    int a;
    @Override
    public void multiply(int a) {
        a=a*x;
        System.out.println("after multiplying "+a);
    }
    @Override
    public void sum(int a) {
        a=a+x;
        System.out.println("after addition "+a);
    }
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        imple k=new imple();
        System.out.println("enter an integer");
        k.a=m.nextInt();
        k.multiply(k.a);
        k.sum(k.a);
    }

}
