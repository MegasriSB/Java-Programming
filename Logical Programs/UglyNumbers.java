package Logic_Pro;
import java.util.*;
public class UglyNumbers {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ob.nextInt();
        if(num<=0)
            System.out.println("Negative numbers are not allowed");
        int temp = 0;
        while(num != 1){
            if(num % 2 == 0)
                num = num/2;
            else if(num % 3 == 0)
                num = num/3;
            else if(num % 5 == 0)
                num = num/5;
            else{
                temp = 1;
                break;
            }
        }
        if(temp == 0)
            System.out.println("It is an ugly number");
        else
            System.out.println("It is not an ugly number");
    }
}
