package Set_2;
public class Qn_3 {
    public static void main(String[] args) {
        int a[] = {5,6,1,2,8,4,3,0};
        int b[] = new int[a.length];
        int i, j, temp;
        for(i=0;i<a.length;i++)
            b[i] = a[i];
        for(i=0; i<a.length-1; i++){
            for(j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i=0; i<a.length;i++){
            for(j=0; j<a.length; j++){
                if(a[i] == b[j])
                    System.out.print(j+" ");
            }
        }
    }
}
