/*
    1 2 3 4 5
    2 3 4 5
    3 4 5
    4 5
    5
*/

package Patterns;
import java.util.*;
public class Pattern_9 {
    public static void main(String[] args) {
        int i = 0,j,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        System.out.println();
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
