/*
    5 
    4 4 
    3 3 3 
    2 2 2 2 
    1 1 1 1 1
*/

package Patterns;
import java.util.*;
public class Pattern_10 {
    public static void main(String[] args) {
        int i = 0,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
