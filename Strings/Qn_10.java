package Set_3;
import java.util.*;
public class Qn_10 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = ob.nextInt();
        int n, i, org, ans=1,rev = 0;
        
        while(ans!=0){
            ++num;
            org = num;
            while(org!=0){
                org= org%10;
                rev = rev*10+org;
                org = org/10;
            }
            if(rev==num){
                System.out.println("Next palindrom: "+num);
                ans=0;
            }
        }
    }
}
