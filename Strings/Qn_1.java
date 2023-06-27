package Set_3;
import java.util.*;
public class Qn_1 {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = ob.nextLine();
        int i = 0, count = 0, j = 0;
        char ch = '0';        
        for (i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                String var = str.substring(i,i+1);
                count = (count * 10) + Integer.parseInt(var);
            }
            else if(count > 0){
                for(j = 0; j<count; j++){
                    System.out.print(ch);
                }
                count = 0;
            }
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                ch = str.charAt(i);
            }
        }
        for(j=0; j<count; j++){
            System.out.print(ch);
        }
    }
}

