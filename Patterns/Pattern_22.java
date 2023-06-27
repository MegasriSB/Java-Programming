/*
    ****
    *  *
    *  *
    ****
*/
package Patterns;
public class Pattern_22 {
    public static void main(String[] args) {
        int i, j, k, n = 5;
//        for(int k=1; k <= n; k++){
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if(i==1 || j==1 || i==n || j==n)
                    System.out.print(n);
                else
                    System.out.print(" ");
            }
            for(k = n-i; k>1; k--){
                if(i==1 || k==1 || i==n || k==n)
                    System.out.print(n);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
//    } 
    }
}
