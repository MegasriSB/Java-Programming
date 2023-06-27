package Set_2;
public class Qn_6 {
    public static void main(String[] args) {
        String a[] = {"1","15","200","4","9","14"};
        int b[] = new int[a.length];
        int i, j, count=0;
        int temp;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length();j++){
                count = count*10+((int)a[i].charAt(j) - 48);
            }
            b[i] = count;
            count = 0;
        }
        for(i=0;i<b.length-1;i++){
            for(j=i+1;j<b.length;j++){
                
                if(b[i]>b[j]){ 
                    temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
