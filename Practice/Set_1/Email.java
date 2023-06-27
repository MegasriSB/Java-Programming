package Set_1;
import java.util.*;
public class Email {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String fname, lname, mail;
        System.out.print("Enter the first name:");
        fname = ob.next();
        System.out.print("Enter the last name:");
        lname = ob.next();
        System.out.println(fname.substring(0, 3)+lname.substring(0, 4)+"@gmail.com");
    }
}
