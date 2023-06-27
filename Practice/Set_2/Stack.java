package Set_2;
import java.util.*;
interface StackADT{
    public void getElements();
    public void push();
    public void pop();
    public void peek();
    public void display();
}
public class Stack implements StackADT {
    int s[] = new int[10];
    int i, top=5,ele,max=10;
    Scanner ob = new Scanner(System.in);
    @Override
    public void getElements() {
        System.out.println("Enter elements of the stack:");
        for(int i=0;i<5;i++)
            s[i] = ob.nextInt();
    }
    @Override
    public void push(){
        try{
            System.out.println("Enter an element to push:");
            int ele = ob.nextInt();
            s[top++] = ele; 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    @Override
    public void pop(){
       try{
           top--;
           System.out.println("The element deleted is "+s[top]);
       }
       catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    @Override
    public void peek(){
        try{
            System.out.println("The top element is "+s[--top]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    @Override
    public void display(){
        System.out.println("The elements in the stack are");
        for(i=top-1;i>=0;i--)
            System.out.println(s[i]);
    }
    public static void main(String[] args){
        Stack ob2 = new Stack();
        ob2.getElements();
        ob2.push();
        ob2.display();
        ob2.pop();
        ob2.display();
        ob2.peek();        
    }
}
