package Logic_Pro;
import java.util.*;
public class Amicable {
    public static void main(String[] args){
        int s1 = 0, s2=0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int n1 = ob.nextInt();
        System.out.println("Enter num2: ");
        int n2 = ob.nextInt();
        System.out.println("The divisors of n1 are ");
        for(int i = 1; i<n1; i++)
            if(n1%i==0){
                System.out.println(i+" ");
                s1 = s1+i;
            }
        System.out.println("The sum of divisors of s1 : "+s1);
        System.out.println("The divisors of n2 are ");
        for(int i = 1; i<n2; i++)
            if(n2%i==0){
                System.out.println(i);
                s2 = s2+i;
            }
        System.out.println("The sum of divisors of s2 : "+s2);
        if(s1 == n2 && s2 == n1)
            System.out.println("The numbers are amicable");
        else
            System.out.println("The numbers are not amicable");    
    }
}
