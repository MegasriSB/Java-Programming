package Set_2;
import java.util.*;
abstract class Shape {
    double breadth;
    double length;    
    public abstract void printArea();   
}
class Rectangle extends Shape{
    double breadth;
    double length;
    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }   
    @Override
    public void printArea(){
        double Area = length*breadth;
        System.out.println("Area of the rectangle:"+Area);
    }    
}
class Triangle extends Shape{
    double base,height;
    public Triangle(double base, double height){
       this.base=base;
       this.height=height;
    }
    @Override
    public void printArea(){
        double Area = 0.5*(base*height);
        System.out.println("Area of the Triangle:"+Area);
    }    
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void printArea(){
        double Area = 3.14*radius*radius;
        System.out.println("Area of the circle:"+Area);
    }
}
public class mainShape{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle:");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the Rectangle:");
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(b,l);
        r.printArea();
        System.out.println("Enter the height of the Triangle:");
        double h = sc.nextDouble();
        System.out.println("Enter the base of the Triangle:");
        double ba = sc.nextDouble();
        Triangle t = new Triangle(ba,h);
        t.printArea();
        System.out.println("Enter the radius of the circle:");
        double ra = sc.nextDouble();
        Circle c = new Circle(ra);
        c.printArea();
    }
}