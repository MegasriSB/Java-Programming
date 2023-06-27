/*
    *********
     *******
      *****
       ***
        *
*/
package Patterns;
import java.util.*;
public class Pattern_15 {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        int t = n;
        System.out.println();
        for(i=n;i>=1;i--){
            for(k=n;k>i;k--){
                System.out.print(" ");
            }
            t++;
            for(j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
