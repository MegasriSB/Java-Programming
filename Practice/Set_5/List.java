package Set_5;
import java.util.*;
public class List {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<String>();
        str.add("Hello");
        str.add("This");
        str.add("is");
        str.add("Megasri");
        for(int i = 0; i<str.size(); i++)
            System.out.println(str.get(i));
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        
    }
}
