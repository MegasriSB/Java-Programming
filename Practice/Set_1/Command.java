package Set_1;
public class Command {
    public static void main(String[] args){
        int num,flag=0;
        int a = Integer.parseInt(args[0]);
        System.out.println(a);
        int b = Integer.parseInt(args[1]);
        System.out.println(b);
        assert ((a>0 && b>0) && b>a):"Criteria not satisfied";
        num=a;
        System.out.println("Prime numbers between "+a+"& "+b);
        while(num<b){
            flag=1;
            int temp,j;
            temp = num/2;
            for(j=2;j<=temp;j++)
                if((num%j)==0)
                    flag=0;
            if(flag==1)
                System.out.println(num);
            num++;
        }
    }
}
