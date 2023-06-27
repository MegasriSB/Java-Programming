package Set_1;
import java.util.Scanner;
class Logic
{
	int n;
	int nums[];
	Logic(int n)
	{
		this.n = n;
	}
	public void readNumbers()
	{
		Scanner input = new Scanner(System.in);
		nums = new int[n];
		System.out.println("Enter " + n + " numbers");
		for(int i = 0; i < n; i++)
		{
			nums[i] = input.nextInt();
		}
	}        
	public void average()
	{
		int sum = 0;
		float avg = 0.0f;
		for(int i = 0; i < n; i++)
			sum = sum + nums[i];
		avg = (float) sum / n;
		System.out.println("Average is : " + avg);
	}
        public void divisible()
        {
            System.out.println("Divisible by 5:");
            for(int i = 0; i<n; i++){
                if(nums[i]%5 == 0)
                    System.out.println(nums[i]);
            }
        }
}
class MyThread1 implements Runnable
{
	Thread t;
	Logic l;
	MyThread1(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
        @Override
	public void run()
	{
		l.readNumbers();
	}
}
class MyThread2 implements Runnable
{
	Thread t;
	Logic l;
	MyThread2(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
        @Override
	public void run()
	{
		l.average();
	}
}
class MyThread3 implements Runnable
{
	Thread t;
	Logic l;
	MyThread3(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
    @Override
    public void run() {
        l.divisible();
    }
}
public class Driver
{	
	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		Logic l = new Logic(n);
		MyThread1 t1 = new MyThread1(l);
		t1.t.join();
		MyThread2 t2 = new MyThread2(l);
                MyThread3 t3 = new MyThread3(l);
	}
}
