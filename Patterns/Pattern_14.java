/*
        *
       ***  
      *****
     *******
    *********
*/
package Patterns;
import java.util.*;
public class Pattern_14 {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n = ob.nextInt();
        int t = n;
        System.out.println();
        for(i=1;i<=n;i++){
            for(k=t;k>1;k--){
                System.out.print(" ");
            }
            t--;
            for(j=2*i;j>1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
