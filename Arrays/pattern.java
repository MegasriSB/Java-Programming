package Set_2;
public class pattern {
    public static void main(String[] args) {
//        int count  = 1;
//        for(int i = 1; i <= 5; i++){
//            System.out.print("1 ");
//            for(int j = 2; j <= 5; j++){
//                if(i+j <= 6){
//                    System.out.print(j+" ");
//                }
//                else if(i+j == 7){
//                    count = 1;
//                    System.out.print(count++ +" ");
//                }
//                else{
////                    count = 1;
//                    System.out.print(count++ +" ");
//                }
//            }
////            count = 1;
//            System.out.println();
int  count = 0;
            for(int i = 1; i<=5; i++){
                int p= 'B';
                System.out.print("A"+" ");
                for(int j = 1; j<5; j++){
                    if((i+j)<5){
                        System.out.print((char)(p++)+" ");
                    }
                    else if(i+j == 5){
                        count = j;
                        System.out.print((char)p++ +" ");
                    }
                    else{
                        System.out.print((char)(64+(j-count))+" ");
                    }
                }
                System.out.println();
        }
    }
}
