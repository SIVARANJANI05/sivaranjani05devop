
package logininfeed;
import java.util.Scanner;

public class A {
	
	public static  String name ;
	public static String paswrd;
	public static String nat;
	public static String city;
	public static String email;
	public static String fname;
	public static int age;
	public static int ph;
		
	void register()
	{
		System.out.println("registeration:");
	Scanner SC =new Scanner(System.in);
	System.out.println("enter name:");
   name=SC.nextLine();
 System.out.println("hiii  "+ name );

 System.out.println("password");
    paswrd = SC.nextLine();
    System.out.println("native:");
    nat = SC.nextLine();
    System.out.println("current city:");
    city = SC.nextLine();
    System.out.println("email id:");
    email = SC.nextLine();
    System.out.println("father's name:");
    fname = SC.nextLine();
 System.out.println("age:");
   age=SC.nextInt();
 System.out.println("phone number:");
 ph=SC.nextInt();
 }
	void display()
	{
	 System.out.println("hiiii  "+ name + ":)");
	 System.out.println("your details are:");
	 System.out.println("name:"+name);
	 System.out.println("father name:"+fname);
	 System.out.println("native:"+nat);
	 System.out.println("email.id:"+email);
	 System.out.println("current city:"+city);
	 System.out.println("age:"+age);
	 System.out.println("phone no:"+ph);
	}
   
		
	}   
