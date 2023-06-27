package Set_4;
import java.util.*;
public class oddeven {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a[] = new int[5];
        int even[]=new int[5];
        int odd[]=new int[5];int j=0;int k=0;
        System.out.println("Enter 5 elements in an array:");
        for(int i = 0; i <= a.length-1; i++)
            a[i] = ob.nextInt();
        for(int i = 0; i<= a.length-1; i++){
            if(a[i]%2==0){
                even[j]=a[i];
                j++;
            }
            else{
                odd[k]=a[i];
                k++;
            }
        }
        System.out.println("even numbers are:");
        for(int i=0;i<j;i++)
           System.out.println(even[i]);
        System.out.println("Odd numbers are:");
        for(int i=0;i<k;i++)
           System.out.println(odd[i]);
    }
}