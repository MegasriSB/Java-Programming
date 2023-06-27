package student;
import Year_I.*;
import Year_II.*;
import java.util.Scanner;
class stud
{
    int rollno;
    String name;
    YearIMarks y1;
    YearIIMarks y2;
    int m1,m2,m3,m4;
    String g1,g2,g3,g4;
    void getdetails()
    {
       Scanner ob=new Scanner(System.in);
       System.out.println("enter your rollno,name,m1,m2,m3,m4 in order:");
       rollno=ob.nextInt();
       name=ob.next();
       m1=ob.nextInt();
       g1=checkgrade(m1);
       m2=ob.nextInt();
       g2=checkgrade(m2);
       m3=ob.nextInt();
       g3=checkgrade(m3);
       m4=ob.nextInt();
       g4=checkgrade(m4);
       this.y1=new YearIMarks(m1,m2);
       this.y2=new YearIIMarks(m3,m4);
    }
    String checkgrade(int m)
    {
      String g;
      if(m>=50)
          g="pass";
      else
          g="fail";
      return g;
    }
    public String toString()
    {
        return "student details:\n name:"+name+"\n"+"rollno:"+rollno+"\n"+"m1&g1:"+m1+"&"+g1+"\n"+"m2&g2:"+m2+"&"+g2+"\n"+"m3&g3:"+m3+"&"+g3+"\n"+"m4&g4:"+m4+"&"+g4;
    }
}
public class Student
{
    public static void main(String[] args) 
    {
       int n;stud arr[];
       Scanner ob=new Scanner(System.in);
       System.out.println("enter number of objects to create for class student:");
       n=ob.nextInt();
       arr=new stud[n];
       for(int i=0;i<arr.length;i++)
       {
         System.out.println("student:"+(i+1));
         arr[i]=new stud();
         arr[i].getdetails();
         System.out.println(arr[i]);
       }
       
    }
}
