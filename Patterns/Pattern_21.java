/*
    **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********
*/

package Patterns;
public class Pattern_21 {
    public static void main(String[] args) {
        int i, j, n = 5,k, space = 2*(n-1);
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            for(k=1;k<i;k++){
                System.out.print("  ");
            }
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
    }
}
