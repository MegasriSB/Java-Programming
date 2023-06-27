package Set_2;
public class Qn_5 {
    public static void main(String[] args) {
        int a[] = {1,9,7,56,36,91,42};
        int b[] = new int[a.length];
        int i,j,k,temp;
        for(i=0;i<a.length;i++)
            b[i]=a[i];
        for(i=0;i<a.length-1;i++){
            for(j=i+1;j<a.length;j++){
                for(k=j+1;k<a.length;k++){
                    if(a[j]>a[k]){
                        temp = b[j];
                        b[j]=b[k];
                        b[k]=temp;
                    }
                }
            }
//            for(j=i+1;j<a.length;j++){
//                for(k=j+1;k<a.length;k++){
//                    
//                }
            System.out.print(b[i]+" ");
            a[i] = b[i+1];
        }
        System.out.println();
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}