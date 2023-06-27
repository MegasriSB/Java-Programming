package Set_2;
public class Subarray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};
        int sum = 0, tot =0, s_avg = 0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        int avg = sum/a.length;
        for(int i=0; i<a.length; i++){
           for(int j=i; j<a.length; j++){
               for(int k=i; k<=j; k++){
                   for(int l=0; l<k; l++)
                       tot+=a[l];
                   s_avg = tot/a.length;
                   if(s_avg == avg)
                       System.out.println(a[k]+" ");
               }
//                   System.out.print(a[k]+" ");
               System.out.println();
           }
        }
    }
}
