package Set_2;
public class Qn_4 {
    public int addNum(char a, char b){
        int c = a-'0';
        int d = b-'0';
        int res = c+d;
        return res;
        }
    public int subNum(char a, char b){
        int c = a-'0';
        int d = b-'0';
        int res = c-d;
        return res;
        }
    public int mulNum(char a, char b){
        int c = a-'0';
        int d = b-'0';
        int res = c*d;
        return res;
    }
    public int divNum(char a, char b){
        int c = a-'0';
        int d = b-'0';
        int res = c/d;
        return res;
    }
    public static void main(String[] args) {
        String str = "374291--*+-";
        int i,j = 0,res = 0,flag=0;
        char a,b;
        int count = 0;
        for(i=0;i<str.length();i++){
           if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                       count++;
                       
           }
        }
        j=count;
        a=str.charAt(0);
        Qn_4 sc = new Qn_4();
        for(i=1;i<str.length();i++){
            b=str.charAt(i);
            while(j<str.length()&& flag!=1){
                    if(str.charAt(j)=='+'){
                        res = sc.addNum(a, b);
                        flag=1;
                    }
                    else if(str.charAt(j)=='-'){
                        res = sc.subNum(a, b);
                        flag=1;
                    }
                    else if(str.charAt(j)=='*'){
                        res = sc.mulNum(a, b);
                        flag=1;
                    }
                    else{
                        res = sc.divNum(a, b);
                        flag=1;
                    }
            }
            j++;
            flag=0;
            a=(char)(res+'0'); 
        }
        
        System.out.println(res);
    }
}