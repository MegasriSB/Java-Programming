package Set_3;
import java.util.*;
public class Prime{
    public static void main(String[] args){
        int num,p,i,j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = s.nextInt();
        for(i=2; i<num; i++){
            p=0;
            for(j=2;j<i;j++){
               if(i%j == 0)
                   p=1;
            }
            if(p==0)
                System.out.println(i);       
        }
    }
}

