package Set_2;
class min<T extends Comparable<T>>{
    T[] a;
    public min(T[] o) {
        a = o;
    }   
    public T findmin(){
        T v = a[0];
        for(int i = 1; i<a.length; i++)
            if(a[i].compareTo(v) < 0)
                v = a[i];
        return v;
    }
    public T findmax(){
        T v = a[0];
        for(int i = 1; i<a.length; i++)
            if(a[i].compareTo(v) > 0)
                v = a[i];
        return v;
    }
}
public class Minimum {
    public static void main(String[] args){
        Integer num[] = {10,20,5,11,15};
        Character ch[] = {'m','e','g','a','s','r','i'};
        Double d[] = {10.2,20.5,5.1,11.3,15.6};
        min<Integer> iob = new min<Integer>(num);
        min<Character> cob = new min<Character>(ch);
        min<Double> dob = new min<Double>(d);
        System.out.println("Minimum value in Integer :"+iob.findmin());
        System.out.println("Maximum value in Integer :"+iob.findmax());
        System.out.println("Minimum value in Character :"+cob.findmin());
        System.out.println("Maximum value in Character :"+cob.findmax());
        System.out.println("Minimum value in Double :"+dob.findmin());
        System.out.println("Maximum value in Double :"+dob.findmax());
    }
}
