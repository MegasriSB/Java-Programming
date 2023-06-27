/*
    * 
    * * 
    * * * 
    * * * * 
    * * * * *
 */
package Patterns;
import java.util.*;
public class Pattern_13 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
