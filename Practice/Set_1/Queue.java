package Set_1;
import java.util.*;
interface QueueOperations{
    abstract void enqueue();
    abstract void dequeue();
    abstract void display();
}
public class Queue implements QueueOperations{
    int q[] = new int[5];
    int i, front=-1,rear=-1,ele,max=5;
    Scanner ob = new Scanner(System.in);
    @Override
    public void enqueue() {
        System.out.println("Enter an element to enqueue:");
        ele = ob.nextInt();
        if(rear == max-1)
            System.out.println("Queue is full");
        else if(front == -1 && rear == -1)
            front = rear = 0;
        else
            rear++;
        q[rear] = ele;
    }

    @Override
    public void dequeue() {
        if(front == -1 && rear == -1 || front > rear)
            System.out.println("Queue is empty");
        else
            front++;
        System.out.println("After deletion: ");
        display();
    }

    @Override
    public void display() {
        if(front == -1 && rear == -1 || front > rear)
            System.out.println("Queue is empty");
        else{
            System.out.println("The elements in the queue are");
            for(i=front;i<=rear;i++)
                System.out.println(q[i]);
        }
    }
    public static void main(String[] args){
        int ch;
        Queue ob2 = new Queue();
        Scanner ob1 = new Scanner(System.in);
        System.out.println("The queue Operations are");
        System.out.println("1.Enqueue"+"\n"+"2.Dequeue"+"\n"+"3.Display");
        do{
            System.out.println("Enter your choice: ");
            ch = ob1.nextInt();
            switch(ch){
                case 1:
                    ob2.enqueue();
                    break;
                case 2:
                    ob2.dequeue();
                    break;
                case 3:
                    ob2.display();
                    break;
                default:
                    System.out.println("Incorrect choice");
            }
        }while(ch<=3);
    }
}
