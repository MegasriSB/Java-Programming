package Set_3;
import java.util.*;
public class Strtokenizer {
    public static void main(String args[])  {
        int n,sum=0;
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers:");
        s1 = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s1, " ");
        System.out.println("Integers are");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
    }
}
