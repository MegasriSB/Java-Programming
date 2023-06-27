/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/

package Patterns;
import java.util.*;
public class Pattern_5 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
