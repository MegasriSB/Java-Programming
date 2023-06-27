/*
    1 3 5 7 9
    1 3 5 7
    1 3 5
    1 3
    1
 */
package Patterns;
import java.util.*;
public class Pattern_7 {
    public static void main(String[] args) {
        int i = 0,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i=2*n-1;i>=1;i-=2){
            for(j=1;j<=i;j+=2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
