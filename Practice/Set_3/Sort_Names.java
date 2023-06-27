package Set_3;
import java.util.*;  
public class Sort_Names{  
   public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number of elements ");
        int n=sc.nextInt();   
        String names[]=new String[n];
        System.out.println("Enter the String ");   
        for(int i=0; i<n ;i++)     
            names[i]=sc.nextLine();   
        Arrays.sort(names,0,names.length);
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }  
}