/*
    1                 1
    1 2             2 1
    1 2 3         3 2 1
    1 2 3 4     4 3 2 1
    1 2 3 4 5 5 4 3 2 1
 */
package Patterns;

public class Pattern_17 {

    public static void main(String[] args) {
        int i, j, n = 5,k, space = 2*(n-1);
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
//        for (i = 1; i <= n; i++) {
//            for (k = 1; k <= n - i; k++) {
//                System.out.print(" ");
//            }
//            for (j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
    }
}