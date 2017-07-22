package area;

public class A {
	
	void square()
	{
	 int a=8;
		System.out.println("area of square="+a*a);
	}
	void rectangule(int a,int c)
	{
		System.out.println("area of rect="+a*c);
	}
	int triangle(int a,int b,int c)
	{
		System.out.println("ärea of tri="+(a*b*c)/2);
	return 0;
	}
	int circle()
	{
		int r=5;
		System.out.println("are of circle="+(3.14*r*r));
		return 0;
		
	}
	
	
public static void main(String[] args) {
	A b=new A();
	b.square();
	b.rectangule(2,7);
	b.triangle(8,3,4);
	b.circle();
	
}
}
