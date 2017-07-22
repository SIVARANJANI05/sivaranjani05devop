package inheritance;

public class c  extends B{
	c()
	{   
		System.out.println("hello iam c");
		
	}
	c(int a)
	{this();
		System.out.println("iam c with an argument");
	}

public static void main(String[] args) {
	c C =new c(5);
	
}	

}
