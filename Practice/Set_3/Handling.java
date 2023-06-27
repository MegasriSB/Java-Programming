package Set_3;
import java.util.*;
public class Handling {
    public static void main(String[] args){
        int len = -5;
        try{int a[] = new int[len];}
        catch(NegativeArraySizeException e){System.out.println("Cannot create array of negative size");}
        System.out.println("Exception handled-NegativeArraySizeException");
    }
}
