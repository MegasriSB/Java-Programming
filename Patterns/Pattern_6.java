/*
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5
*/

package Patterns;
import java.util.*;
public class Pattern_6 {
    public static void main(String[] args) {
        int i,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
