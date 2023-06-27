package Set_2;
import java.util.*;
public class Qn_8 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[] = {16,17,4,3,5,2};
        int i,j, count=0;
        for(i = 0; i<a.length-1; i++){
            for(j = i+1; j<a.length; j++){
                if(a[i]>a[j])
                    count++;
                else{
                    count = 0;
                    break;
                }
            }
            if(count > 0 && count == a.length-1-i)
                System.out.println(a[i]);
        }
        System.out.println(a[a.length-1]);
    }
}
