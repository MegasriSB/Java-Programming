package Set_1;
import java.lang.*;  
public class ThreadPriorityExample extends Thread   
{   
@Override
public void run()  
{  
System.out.println("Inside the run() method");  
}  
  
  
public static void main(String argvs[])  
{  
// Creating threads with the help of ThreadPriorityExample class 
 
ThreadPriorityExample th1 = new ThreadPriorityExample();  
ThreadPriorityExample th2 = new ThreadPriorityExample();  
ThreadPriorityExample th3 = new ThreadPriorityExample();  
  
// We did not mention the priority of the thread.  
// Therefore, the priorities of the thread is 5, the default value  
  

System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());    
System.out.println("Priority of the thread th3 is : " + th3.getPriority());  

th1.setPriority(6);  
th2.setPriority(3);  
th3.setPriority(9);  
  
// 6  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
// 3  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
// 9  
System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
  
// Main thread  
  
// Displaying name of the currently executing thread   
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
// Priority of the main thread is 10 now  
Thread.currentThread().setPriority(10);  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  
