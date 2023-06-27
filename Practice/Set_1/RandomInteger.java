package Set_1;
import java.util.*;
public class RandomInteger {
    public static void main(String[] args){
        int i,j,sum=0;
        double avg;
        int a[] = new int[20];
        for(i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*80+10);
            sum=sum+a[i];
        }
        avg = sum/(double)a.length;
        System.out.println("Average:"+avg);
        ArrayList<Integer> bavg = new ArrayList<Integer>();
        ArrayList<Integer> aavg = new ArrayList<Integer>();
        for (i=0;i<a.length;i++)
        if (a[i]<avg)
            bavg.add(a[i]);
        else
            aavg.add(a[i]);
        System.out.println("Below Average");
        for (i=0;i<bavg.size();i++)
            System.out.print(bavg.get(i)+" ");
        System.out.println("\n"+"Above Average");
        for (i=0;i<aavg.size();i++)
            System.out.print(aavg.get(i)+" ");
    }
}
