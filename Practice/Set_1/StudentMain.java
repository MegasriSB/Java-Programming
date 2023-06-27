package Set_1;
import java.util.*;
class Student{
    String name;
    int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    void Score(){}
}
class Result extends Student{
    int sub1, sub2, sub3,tot;
    Scanner ob = new Scanner(System.in);
    public Result(String name, int roll, int sub1, int sub2, int sub3) {
        super(name, roll);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    @Override
    void Score(){
        tot = sub1+sub2+sub3;
    }
}
class Sports extends Result{
    int points;
    public Sports(String name, int roll, int sub1, int sub2, int sub3,int points) {
        super(name, roll, sub1, sub2, sub3);
        this.points = points;
    }
    @Override
    void Score(){
        super.Score();
        if(tot>=200 && points>=5)
            System.out.println(name+" "+roll+" "+tot+" "+points+" "+"PASS");
        else
            System.out.println(name+" "+roll+" "+tot+" "+points+" "+"FAIL");
    }
}
public class StudentMain {
    public static void main(String[] args){
        Student s1 = new Sports("Ram",1001,94,95,96,7);
        s1.Score();
        Student s2 = new Sports("Tina",1002,93,94,96,9);
        s2.Score();
        Student s3 = new Sports("Sheela",1003,20,48,31,4);
        s3.Score();
    }
}
