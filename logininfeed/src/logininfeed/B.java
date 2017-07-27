package logininfeed;
import java.util.Scanner;
import java.lang.*;

public class B {


	public static  String name ;
	public static String paswrd;
	public static String city;
	public static int age;

	void login()
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("register is ovr--------------------------------------------------------");
		System.out.println("login here");
		System.out.println("name:");
		 name=SC.nextLine();
		System.out.println("password:");
		 paswrd=SC.nextLine();
		System.out.println("enter your current city");
		 city=SC.nextLine();
		System.out.println("age:");
		 age=SC.nextInt();
		
	}
	void display()
	{
	 System.out.println("hiiii  "+ name + ":)");
	 System.out.println("your details are:");
	 System.out.println("name:"+name);
	 System.out.println("city:"+city);
	 System.out.println("age:"+age);
	}
 
}
