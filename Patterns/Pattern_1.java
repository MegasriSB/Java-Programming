/*
    1 
    2 2 
    3 3 3 
    4 4 4 4 
    5 5 5 5 5
*/

package Patterns;
import java.util.*;
public class Pattern_1 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
