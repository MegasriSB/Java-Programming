/*
    5 5 5 5 5 
    4 4 4 4 
    3 3 3 
    2 2 
    1
*/

package Patterns;
import java.util.*;
public class Pattern_2 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i = n; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
