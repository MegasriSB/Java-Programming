package Set_2;
import java.util.*;
public class Sort_Arrays {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = ob.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int i,j,temp;
        System.out.println("Enter the elements of the array:");
        for(i=0; i<n; i++){
            a[i] = ob.nextInt();
            b[i] = a[i];
        }
        for(i=0; i<n-1; i++){
            for(j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        for(i=0; i<n; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        Arrays.sort(b);
        for(i=0; i<n; i++){
            System.out.println(b[i]);
        }
        if(Arrays.equals(a,b))
            System.out.println("True");
        else
            System.out.println("False");
            
    }
}
