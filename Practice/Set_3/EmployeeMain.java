package Set_3;
class Employ{
    String Emp_name;
    int Emp_id;
    String Address;
    String Mail_id;
    String Mobile_no;
    public Employ(String emp_name, int emp_id, String address, String mail_id, String mobile_no){
        Emp_name = emp_name;
        Emp_id = emp_id;
        Address = address;
        Mail_id = mail_id;
        Mobile_no = mobile_no;
    }
    void display(){
        System.out.println("Name: " + Emp_name + "\nAddress: " + Address + "\nId: " +Emp_id + "\nMail: " + Mail_id + "\nMobile: " + Mobile_no);
    }
}
class Programmers extends Employ{
    int BP;
    public Programmers(String emp_name, int emp_id, String address, String mail_id, String mobile_no, int BP){
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.BP = BP;
    }
    @Override
    void display(){
        super.display();
        System.out.println(BP);
        System.out.println("DA: "+0.97*BP);
        System.out.println("HRA: "+0.10*BP);
        System.out.println("PF: "+0.12*BP);
        System.out.println("STAFF CLUB FUND: "+0.001*BP);
        System.out.println("GROSS PAY: Rs. "+(BP+0.97*BP+0.10*BP));
        System.out.println("NET PAY: Rs. "+(BP+0.97*BP+0.10*BP-0.12*BP-0.001*BP));
    }
}
class Assistant_Professor extends Employ{
    int BP;
    public Assistant_Professor(String emp_name, int emp_id, String address, String mail_id,String mobile_no, int BP){
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.BP = BP;
    }
    @Override
    void display(){
        super.display();
        System.out.println(BP);
        System.out.println("DA: "+0.97*BP);
        System.out.println("HRA: "+0.10*BP);
        System.out.println("PF: "+0.12*BP);
        System.out.println("STAFF CLUB FUND: "+0.001*BP);
        System.out.println("GROSS PAY: Rs. "+(BP+0.97*BP+0.10*BP));
        System.out.println("NET PAY: Rs. "+(BP+0.97*BP+0.10*BP-0.12*BP-0.001*BP));
    }
}
class Associate_Professor extends Employ{
    int BP;
    public Associate_Professor(String emp_name, int emp_id, String address, String mail_id,String mobile_no, int BP){
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.BP = BP;
    }
    @Override
    void display(){
        super.display();
        System.out.println(BP);
        System.out.println("DA: "+0.97*BP);
        System.out.println("HRA: "+0.10*BP);
        System.out.println("PF: "+0.12*BP);
        System.out.println("STAFF CLUB FUND: "+0.001*BP);
        System.out.println("GROSS PAY: Rs. "+(BP+0.97*BP+0.10*BP));
        System.out.println("NET PAY: Rs. "+(BP+0.97*BP+0.10*BP-0.12*BP-0.001*BP));
    }
}
class Professors extends Employ{
    int BP;
    Professors(String emp_name, int emp_id, String address, String mail_id, String mobile_no, int BP){
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.BP = BP;
    }
    @Override
    void display(){
        super.display();
        System.out.println(BP);
        System.out.println("DA: "+0.97*BP);
        System.out.println("HRA: "+0.10*BP);
        System.out.println("PF: "+0.12*BP);
        System.out.println("STAFF CLUB FUND: "+0.001*BP);
        System.out.println("GROSS PAY: Rs. "+(BP+0.97*BP+0.10*BP));
        System.out.println("NET PAY: Rs. "+(BP+0.97*BP+0.10*BP-0.12*BP-0.001*BP));
    }
}
class EmployeeMain{
    public static void main(String args[]){
        System.out.println("\n1.Programmer\n2.Assistant_Professor\n3.Associate_Professor\n4.Professor");
        Programmers p1=new Programmers("Sre", 23, "NOVA city", "sre@gmail.com","+919832749789", 15000);
        p1.display();
        Assistant_Professor p2=new Assistant_Professor("hii", 23, "NOVA city","sre@gmail.com", "+919832749789", 3000);
        p2.display();
        Associate_Professor p3=new Associate_Professor("bye", 23, "NOVA city","sre@gmail.com", "+919832749789", 30500);
        p3.display();
        Professors p4=new Professors("tata", 23, "NOVA city", "sre@gmail.com","+919832749789", 20000);
        p4.display();
    }
}
