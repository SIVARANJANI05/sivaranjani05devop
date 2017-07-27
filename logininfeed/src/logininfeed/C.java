package logininfeed;
import java.util.*;
import java.lang.*;

public class C {
	
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		A a=new A();
		B b=new B();
		C c=new C();
		
		a.register();
		b.login();	
		if((A.name.equals(B.name))&&(A.paswrd.equals(B.paswrd)))
		{
			System.out.println("yess login success full");
			b.display();
		}
		else
		{
			System.out.println("noo..login error");
		}
		
		
		System.out.println("thanx....");
		
		
	
	}
	
	//@override
	public boolean equals()
	{
		return false;
		
	}
	}



