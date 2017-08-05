import java.util.*;
public class A extends Thread {
	public static String str;
public void run()
{  
	Scanner SC=new Scanner(System.in); 
	System.out.println("esaay writing(5 min only)");
	System.out.println("topic::tell me abt urself");
	System.out.println("start writing::(time strted as pge opened itself)");
	str=SC.nextLine();
	
	
}
public void display()
{
	System.out.println(str);
}
public static void main(String[] args) throws InterruptedException {
	A a=new A();
	a.setDaemon(true);
	a.start();
	for(int i = 1;i<=1;i++)
	{
		sleep(300000);
		System.out.println("terminated.................time out'''''''");
		System.out.println("submitting........");
		sleep(30000);
		System.out.println("submitted!! press enter to view");
		sleep(10000);
		a.display();
	}
}
} 
