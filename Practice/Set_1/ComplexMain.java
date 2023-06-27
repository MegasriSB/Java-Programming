package Set_1;
class Complex{
    int r1, r2, i1, i2;
    public Complex(int r1, int r2, int i1, int i2) {
        this.r1 = r1;
        this.r2 = r2;
        this.i1 = i1;
        this.i2 = i2;
    }
    void add(){
        int real = r1 + r2;
        int img = i1 + i2;
        System.out.println("Addition: "+real+"+i"+img);
    }
    void sub(){
        int real = r1 - r2;
        int img = i1 - i2;
        System.out.println("Subtraction: "+real+"+i"+"("+img+")");
    }
    void mul(){
        int real = (r1 * r2) + (i1 * i2 * -1);
        int img = (r1 * i2) + (r2 * i1);
        System.out.println("Multiplication: "+real+"+i"+img);
    }
    void div(){
        int real = ((r1*r2)+(i1*i2)) / ((r2*r2)+(i2*i2));
        int img = ((r2*i1)-(r1*i2)) / ((r2*r2)+(i2*i2));
        System.out.println("Division: "+real+"+i"+img);
    }
}
public class ComplexMain {
    public static void main(String[] args){
        Complex ob = new Complex(1,2,3,4);
        ob.add();
        ob.sub();
        ob.mul();
        ob.div();
    }
}
