package Set_3;
import java.util.*;
public class Qn_5 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str;
        str = "Zoho Corp Madurai";
        System.out.println("Zoho Corp Madurai");
        int n = str.length();
        int padding = 25, count =0;
        int temp = padding - n;
        for(int i = 0; i<n; i++){
            if(str.charAt(i) == ' '){
                count+=1;
            }
        }
        int tmp = temp/count;
        for(int i = 0; i<n; i++){
            System.out.print(str.charAt(i));
            if(str.charAt(i) == ' '){
                for(int j = 1; j< tmp; j++){
                    System.out.print(' ');
                }
            }
        }
    }
}
