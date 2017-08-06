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
		System.out.println("\n#################################################################################");
		System.out.println("\nterminated.................time out'''''''");
		System.out.println("\nsubmitting.....................(takes 30 sec..plz wait)");
		sleep(30000);
		System.out.println("\nsubmitted!!......");
		System.out.println("\nplzz click enter to view...else it gets erased (takes 10 seconds...plz wait)");
		sleep(10000);
		System.out.println("\nyour essay is: \n");
		a.display();
	}
}
} 
