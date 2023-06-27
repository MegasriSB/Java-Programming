package Set_1;
import java.util.*;
abstract class Car{
    int reg_no;
    String model;
    String reg_date;
    public Car(int reg_no, String model, String reg_date) {
        this.reg_no = reg_no;
        this.model = model;
        this.reg_date = reg_date;
    }
    abstract void getdetails();
}
class transportVehicles extends Car{  
    int valid_no,period;
    String start_date;
    Scanner ob = new Scanner(System.in);
    public transportVehicles(int reg_no, String model, String reg_date,int valid_no, String start_date, int period) {
        super(reg_no, model, reg_date);
        this.valid_no = valid_no;
        this.start_date = start_date;
        this.period = period;
    }  
    @Override
    void getdetails() {
        System.out.print("Enter Registration number of the car:");
        reg_no = ob.nextInt();
        System.out.print("Enter model of the car:");
        model = ob.next();
        System.out.print("Enter Registration date of the car:");
        reg_date = ob.next();
        System.out.print("Enter Validity number of the car:");
        valid_no = ob.nextInt();
        System.out.print("Enter Start date of the car:");
        start_date = ob.next();
        System.out.print("Enter Period of the car:");
        period = ob.nextInt();
    }
}
class privateVehicles extends Car{
    String owner_name,owner_add;
    Scanner ob1 = new Scanner(System.in);
    public privateVehicles(int reg_no, String model, String reg_date, String owner_name, String owner_add) {
        super(reg_no, model, reg_date);
        this.owner_name = owner_name;
        this.owner_add = owner_add;
    }   
    @Override
    void getdetails() {
        System.out.print("Enter Registration number of the car:");
        reg_no = ob1.nextInt();
        System.out.print("Enter model of the car:");
        model = ob1.next();
        System.out.print("Enter Registration date of the car:");
        reg_date = ob1.next();
        System.out.print("Enter Owner name of the car:");
        owner_name = ob1.next();
        System.out.print("Enter Owner address of the car:");
        owner_add = ob1.next();
    }
}
public class CarMain {
    public static void main(String[] args){
        Scanner ob2 = new Scanner(System.in);
        System.out.println("Enter number of Transport vehicles object:");
        int t = ob2.nextInt();
        System.out.println("Enter number of Private vehicles object:");
        int p = ob2.nextInt();
        transportVehicles[] tv = new transportVehicles[t];
        for(int i=0; i<=t; i++)
        {
            tv[i].getdetails();
            //tv[i] = new transportVehicles();
            
        }
        privateVehicles[] pv = new privateVehicles[p];
        
    }
}
