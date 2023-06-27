package Set_5;
abstract class Shape
{
    int n1,n2;
    public abstract void printArea();
}
class  Rectangle extends Shape
{
    public Rectangle(int n1,int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    @Override
    public void printArea()
    {
        System.out.println("Area of Rectangle is  "+ (n1*n2));
    }
}
class Circle extends Shape
{
    public Circle(int ni)
    {
        this.n1=n1;
    }
    @Override
    public void printArea()
    {
        System.out.println("Area of Circle is  "+ (3.14*n1*n1));
    }
}
class  Triangle extends Shape
{
    public Triangle(int n1,int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    @Override
    public void printArea()
    {
        System.out.println("Area of Triangle is  "+ (n1*n2)/2);
    }
}

public class AbsShape
{
    public static void main(String str[])
    {
        Rectangle r= new Rectangle(3,4);
        r.printArea();
        Circle c= new Circle(5);
        c.printArea();
        Triangle t= new Triangle(3,4);
        t.printArea();
    }
}

