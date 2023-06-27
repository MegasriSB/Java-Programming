package Logic_Pro;
import java.util.*;
public class CircularPrime{
    int permute(int n){
        String s = Integer.toString(n);
        String a = s.substring(1)+s.charAt(0);
        int num = Integer.parseInt(a);
        System.out.println("Number is : "+num);
        return num;
    }
    int isPrime(int n){
        int flag=0;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        return flag;
    }            
    public static void main(String[] args) {
        int num,n=0,f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        CircularPrime ob = new CircularPrime();
        String nu = Integer.toString(num);
        do{
            do{
                if(ob.isPrime(num)==0){
                    num=ob.permute(num);
                    f=1;
                }
                else{
                   f=0;
                   break;
                }     
            }while(f==0);
            n++;
        }while(n<nu.length());
        if(f==1)
            System.out.println("Number "+num+" is Circular Prime");
        else
            System.out.println("Number "+num+" is not Circular Prime");      
    }
}