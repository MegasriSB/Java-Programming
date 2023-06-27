package Set_2;
import java.util.*;
public class EBConnection {
    static int Choice;
    static int Consumer_no;
    static String Consumer_name;
    static int prevMonthReading,CurrentMonthReading;
    static String EbConnTYpe;
    static double Amount;
    public EBConnection(int consumer_no, String Consumer_name, int prevMonthReading, int CurrentMonthReading, String EbConnTYpe) {
        this.Consumer_no = Consumer_no;
        this.Consumer_name = Consumer_name;
        this.prevMonthReading = prevMonthReading;
        this.CurrentMonthReading = CurrentMonthReading;
        this.EbConnTYpe = EbConnTYpe;
    }
    static void CalcAmount(){
        if(EbConnTYpe.equals("Domestic"))
            Choice = 1;
        else if(EbConnTYpe.equals("Commercial"))
            Choice = 2;
        else
            Choice =3;
        switch(Choice){
            case 1:
            {
                if(CurrentMonthReading<=100)
                   Amount = CurrentMonthReading*1.50;
                else if(CurrentMonthReading>100 && CurrentMonthReading<=200)
                    Amount = (100*1.50)+((CurrentMonthReading-100)*3);
                else if(CurrentMonthReading>200 && CurrentMonthReading<=500)
                    Amount = (100*1.50)+(100*3)+((CurrentMonthReading-200)*4.50);
                else
                    Amount = (100*1.50)+(100*3)+(300*4.50)+((CurrentMonthReading-500)*7);
                break;
            }
            case 2:
            {
                if(CurrentMonthReading<=100)
                   Amount = CurrentMonthReading*2.50;
                else if(CurrentMonthReading>100 && CurrentMonthReading<=200)
                    Amount = (100*2.50)+((CurrentMonthReading-100)*5);
                else if(CurrentMonthReading>200 && CurrentMonthReading<=500)
                    Amount = (100*2.50)+(100*5)+((CurrentMonthReading-200)*6.50);
                else
                    Amount = (100*2.50)+(100*5)+(300*6.50)+((CurrentMonthReading-500)*9);
                break;
            }
            case 3:
            {
                System.out.println("Invalid Input!");
                break;
            }
        }
        System.out.println("Total Amount:         "+Amount); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Enter the Consumer Number:");
        Consumer_no = sc.nextInt();
        System.out.println("Enter the Consumer Name:");
        Consumer_name = sc.next();
        System.out.println("Enter the Previous Month Reading:");
        prevMonthReading = sc.nextInt();
        System.out.println("Enter the Current Month Reading:");
        CurrentMonthReading = sc.nextInt();
        System.out.println("Enter the Type of EB connection (Domestic/Commercial):");
        EbConnTYpe = sc.next();
        EBConnection ob = new EBConnection(Consumer_no,Consumer_name,prevMonthReading,CurrentMonthReading,EbConnTYpe);
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("              Electricity Bill");
        System.out.println("--------------------------------------------");
        System.out.println("Consumer Number : "+Consumer_no);
        System.out.println("Consumer Name : "+Consumer_name);
        System.out.println("Previous Month Reading : "+prevMonthReading);
        System.out.println("Current Month Reading : "+CurrentMonthReading);
        System.out.println("Type of EB Connection : "+EbConnTYpe);
        System.out.println("--------------------------------------------");
        CalcAmount();
    }
}
