/*
    1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15
 */
package Patterns;
public class Pattern_18 {
    public static void main(String[] args) {
        int i,j,n=5,start = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(start+" ");
                start+=1;
            }
            System.out.println();
        }
    }
}
