package Set_1;
import java.util.*;
public class days {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int no_of_days = 0;
        String Month_name = "";
        System.out.print("Enter the year: ");
        int yr = ob.nextInt();
        System.out.print("Enter the month number: ");
        int month = ob.nextInt();
        switch(month){
            case 1:
                Month_name = "January";
                no_of_days = 31;
                break;
            case 2:
                Month_name = "February";
                if((yr%400 == 0) || (yr%4==0) && (yr%100 !=0))
                    no_of_days = 29;
                else
                    no_of_days = 28;
                break;
            case 3:
                Month_name = "March";
                no_of_days = 31;
                break;
            case 4:
                Month_name = "April";
                no_of_days = 30;
                break;
            case 5:
                Month_name = "May";
                no_of_days = 31;
                break;
            case 6:
                Month_name = "June";
                no_of_days = 30;
                break;
            case 7:
                Month_name = "July";
                no_of_days = 31;
                break;
            case 8:
                Month_name = "August";
                no_of_days = 31;
                break;
            case 9:
                Month_name = "September";
                no_of_days = 30;
                break;
            case 10:
                Month_name = "October";
                no_of_days = 31;
                break;
            case 11:
                Month_name = "November";
                no_of_days = 30;
                break;
            case 12:
                Month_name = "December";
                no_of_days = 31;
                break;
        }
        System.out.println("Month Name: "+Month_name);
        System.out.println("Number of days: "+no_of_days);
    }
}
