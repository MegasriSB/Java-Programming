/*
    5 4 3 2 1 
    4 3 2 1 
    3 2 1 
    2 1 
    1
*/

package Patterns;
import java.util.*;
public class Pattern_3 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i = n; i >= 1; i--){
            for(j = i; j >= 1; j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
