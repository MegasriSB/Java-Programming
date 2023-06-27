package Set_3;
import java.util.*;
public class Qn_2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = ob.nextLine();
        int  i = 0, j = 0, count = 1;
        char ch = str.charAt(0);
        
        for(j = i+1; j < str.length(); j++){
            if(ch == str.charAt(j)){
                count+=1;
            }
            else{
                System.out.print(ch);
                System.out.print(count);
                count = 1;
                ch = str.charAt(j);
                i = j;
            }
        }
        System.out.print(ch);
        System.out.print(count);   
    }
}
