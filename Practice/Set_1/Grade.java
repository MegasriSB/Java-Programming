package Set_1;
import java.util.*;
public class Grade {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int e, t, m, s, h, tot, avg;
        System.out.print("Enter English mark: ");
        e = ob.nextInt();
        System.out.print("Enter Tamil mark: ");
        t = ob.nextInt();
        System.out.print("Enter Maths mark: ");
        m = ob.nextInt();
        System.out.print("Enter Science mark: ");
        s = ob.nextInt();
        System.out.print("Enter History mark: ");
        h = ob.nextInt();
        tot = e+t+m+s+h;
        avg = tot/5;
        if(avg >= 91 && avg <=100)
            System.out.println("O grade");
        else if(avg >= 81 && avg <=90)
            System.out.println("A+ grade");
        else if(avg >= 71 && avg <=80)
            System.out.println("A grade");
        else if(avg >= 61 && avg <=70)
            System.out.println("B+ grade");
        else if(avg >= 50 && avg <=60)
            System.out.println("B grade");
        else
            System.out.println("RA");
    }
}
