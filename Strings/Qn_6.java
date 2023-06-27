package Set_3;
import java.util.*;
public class Qn_6 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int j =0,count = 0;
        String str = "m$a@d!a**m%";
        char arr[] = new char[10];
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                arr[j++] = str.charAt(i);
            }
        }
        for(int i = 0; i<j; i++){
            System.out.print(arr[i]);
        }
        for(int i = 0; i<(j-1)/2; i++){
            if(arr[i] == arr[j-1-i]){
                count+=1;
            }
        }
//        System.out.println(j/2);
        if(count == (j-1)/2){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
