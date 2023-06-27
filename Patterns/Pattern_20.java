/*
    A
   ABA
  ABCBA
 ABCDCBA
 */
package Patterns;
public class Pattern_20 {
    public static void main(String[] args) {
        int i,j,k,n=4,alp=65;
        for(i=0;i<n;i++){
            for(k=n-1;k>i;k--){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print((char)(alp+j));
            }
            for(j=i+1;j>0;j--){
                System.out.print((char)(alp-1+j));
            }
            System.out.println();
        }
    }
}
