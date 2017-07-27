package logininfeed;

public class C {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.register();
		b.login();	
		if((A.name.equals(B.name))&&(A.paswrd.equals(B.paswrd)))
		{
			System.out.println("yess login success full");
			a.display();
		}
		else
		{
			System.out.println("noo..login error");
		}
		
		
		System.out.println("thanx...for logging");
		}
		//@override
	public boolean equals()
	{
		return false;
		
	}
}



