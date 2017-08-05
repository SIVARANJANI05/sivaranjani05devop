
public class B extends Thread {
	public void run()
	{
		A.sum=A.a+A.b;
		System.out.println("sum="+A.sum);
		
	}
	public static void main(String[] args) throws InterruptedException {
		A a=new A();
		B b=new B();
		a.start();
		a.join();
		b.start();
		
	}

}
