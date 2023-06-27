package Set_3;
// abcddefgikom
// abdcdeffgklm
import java.util.*;
public class Qn_4 {
    public static void main(String[] args) {
        String str1, str2;
        int i=0, j=0, len = 0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        str1 = ob.nextLine();
        System.out.println("Enter the string2: ");
        str2 = ob.nextLine();
        if(str1.length() == str2.length())
            len = str1.length();
        else
            System.out.println("Length of the strings are not equal");
//        for(i=0; i<=len; i++){
//            if((str1.charAt(i) != str2.charAt(i))){
////                System.out.println(str1.charAt(i)+","+str2.charAt(i));
//                if((str1.charAt(i++) != str2.charAt(i++)))
//                    break;
//                System.out.println(str1.substring(i-2,i)+","+str2.substring(i-2,i));
//            }
//        }
        for(i=0; i<len; i++){
            for(j=0; j<len; j++){
                if(i == j){
                    while(str1.charAt(i) != str2.charAt(i)){
                        i++;
                        if(str1.charAt(i) == str2.charAt(i))
                            System.out.println(str1.substring(j, i)+","+str2.substring(j, i));
                    }
                    
                } 
            }
        }
    }
}
