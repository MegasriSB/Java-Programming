package Set_4;
import java.util.*;
public class StringtoArrayList {
    public static void main(String[] args){
        String str = "a,b,c,d,e,f";
        String st[] = str.split(",");
        ArrayList<String> k=new ArrayList<String>();
        for(int i=0;i<st.length;i++)
            k.add(st[i]);
        for(int i=0;i<k.size();i++)
        {
            System.out.println(k.get(i));
        }
            
    }
}
