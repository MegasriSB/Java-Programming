/*
    A
    AB
    ABC
    ABCD
    ABCDE
 */
package Patterns;
public class Pattern_19 {
    public static void main(String[] args) {
        int i,j,n=5, alp = 65;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print((char)(alp+j));
            }
            System.out.println();
        }
    }
}
