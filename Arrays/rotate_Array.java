package Set_2;
public class rotate_Array {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int n = a.length, i, rot = 1, temp=1;
        while(temp<=rot){
            int last = a[0];
            for(i=0; i<n-1; i++)
                a[i] = a[i+1];
            a[n-1] = last;
            temp++;
        }
        for(i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
