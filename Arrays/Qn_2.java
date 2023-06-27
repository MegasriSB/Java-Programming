package Set_2;
public class Qn_2 {
    public static void main(String[] args) {
        int a[] = {1,8,3,6,4};
        int i,j,temp;
        for(i=0;i<a.length-1;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(i=0;i<(a.length)/2;i++){
            System.out.print(a[i]+" "+a[a.length-1-i]+" ");
        }
        if(a.length%2!=0)
            System.out.println(a[a.length/2]); 
    }
}
