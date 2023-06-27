package Set_2;
import java.util.*;
public class StringArrayList {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        list.add("Raju");
        list.add("Seetha");
        list.add("Meena");
        list.add("Reena");
        System.out.println(list);
        list.add(2,"Sheela");
        System.out.println(list);
        System.out.println("Enter a string to search:");
        String str = ob.next();
        int j = list.indexOf(str);
        if (j == -1)
            System.out.println("Element not found");
        else
            System.out.println("Index of "+str+" is "+j);
        System.out.println("Enter the starting letter:");
        str = ob.next();
        for(int i = 0; i<(list.size()-1); i++){
            String str1 = list.get(i);
            if(str1.startsWith(str))
                System.out.println(str1);
        }
    }
}
