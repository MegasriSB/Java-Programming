package Set_2;
public class Qn_1 {
    public static void main(String[] args) {
        int a[] = {10,3,5,12,17,22};
        int evenlen=0, oddlen=0;
        int i,j;
        int odd[] = new int[10];
        int even[] = new int[10];
        for(i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                even[evenlen++] = a[i];
            }
            else{
                odd[oddlen++] = a[i];
            }
        }
        for(i=0;i<evenlen;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        for(i=0;i<oddlen;i++){
            System.out.print(odd[i]+" ");
        }
    }
}
