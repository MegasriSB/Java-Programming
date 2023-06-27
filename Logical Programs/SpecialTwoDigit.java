package Logic_Pro;
import java.util.*;
public class SpecialTwoDigit {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ob.nextInt();
        if (num < 10 || num > 99)
            System.out.println("Invalid input");
        else{
            int dig1 = num / 10;
            int dig2 = num % 10;
            int sum = dig1 + dig2;
            int pro = dig1 * dig2;
            int org = sum + pro;
            if(org == num)
                System.out.println(num+" is a special two digit number");
            else
                System.out.println(num+" is not a special two digit number");
        }           
    }
}
