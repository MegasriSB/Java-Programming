package Set_3;
import java.util.*;
public class Qn_9 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = ob.nextLine();
        int cnta = 0, cnte=0, cnti=0, cnto=0, cntu=0;
        for(int i = 0; i<str.length(); i++){
           if(str.charAt(i) == 'a' || str.charAt(i) == 'A')
               cnta++;
           if(str.charAt(i) == 'e' || str.charAt(i) == 'E')
               cnte++;
           if(str.charAt(i) == 'i' || str.charAt(i) == 'I')
               cnti++;
           if(str.charAt(i) == 'o' || str.charAt(i) == 'O')
               cnto++;
           if(str.charAt(i) == 'u' || str.charAt(i) == 'U')
               cntu++;
        }
        System.out.println("a:"+cnta);
        System.out.println("e:"+cnte);
        System.out.println("i:"+cnti);
        System.out.println("o:"+cnto);
        System.out.println("u:"+cntu);
    }
}
