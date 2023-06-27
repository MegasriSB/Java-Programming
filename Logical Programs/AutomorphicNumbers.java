package Logic_Pro;
import java.util.*;
public class AutomorphicNumbers {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ob.nextInt();
        int sqr = num * num;
        if(isAutomorphic(num,sqr))
            System.out.println("The number is an automorphic number");
        else
            System.out.println("The number is not an automorphic number");
    }
    static boolean isAutomorphic(int num, int sqr){
        while(num > 0){
            if(sqr %10 != num %10)
                return false;
            sqr = sqr / 10;
            num = num / 10;
        }
        return true;
    }
}
