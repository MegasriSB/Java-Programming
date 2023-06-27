package Set_5;
import java.util.Arrays;
class  alpha
{
    public static void main(String args[]){
        int n = args.length;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=args[i];
        }
        Arrays.sort(s, 0, s.length);
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
