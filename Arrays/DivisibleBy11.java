package Set_2;
import java.util.Scanner;
public class DivisibleBy11 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      String num = sc.nextLine();
      int digitSumEve = 0;
      int digitSumOdd = 0;
     
     for(int i = 0; i<num.length(); i++) {
         if(i%2 == 0) {
            digitSumEve = digitSumEve + num.charAt(i)-'0';
         } else {
            digitSumOdd = digitSumOdd + num.charAt(i)-'0';
         }
      }
      int res = digitSumEve-digitSumOdd;
       System.out.println(Math.abs(res));
   }
}
