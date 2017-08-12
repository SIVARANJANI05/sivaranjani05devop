package sortingssss;
import java.util.Scanner;


public class Bubble_sorting {
	static int i,j,n;
	
	public void ascending(int a[])
	{
		int b[]=new int[n];
		int temp=0;
		for(i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
		{
			if(b[i]>b[j])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
				
		}
		}
		System.out.println("\n ################## \nascending order is: \n");
			for(i=0;i<n;i++)
			{
			System.out.println(b[i]);
			}
	}
		public void descending(int a[])
		{
			int c[]=new int[n];
			int tem=0;
			for(i=0;i<n;i++)
			{
				c[i]=a[i];
			}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
			{
				if(c[i]<c[j])
				{
					tem=c[i];
					c[i]=c[j];
					c[j]=tem;
				}
					
			}}
			
				System.out.println("\n ###################### \ndecending order is: \n");
				for(i=0;i<n;i++) {
				System.out.println(c[i]);
				}
		}
		public static void main(String[] args) {
			Bubble_sorting obj=new Bubble_sorting();
			Scanner SC=new Scanner(System.in);
			String m;
		    System.out.println("enter the no of terms ");
		    n=SC.nextInt();
		    int a[]=new int[n];
		    System.out.println("enter the numbers");
		    for(i=0;i<n;i++)
		    {
		    	a[i]=SC.nextInt();
		    }
		    System.out.println("which type of sorting??");
		    System.out.println("\n 1.ascending ----- press A ");
		    System.out.println("\n 2.descending ----- press D ");
		    System.out.println("\n 3.BOTH----- press B ");
		    m=SC.next();
		    
		    System.out.println("before sorting: \n");
		    for(i=0;i<n;i++)
		    {
		    	System.out.println(a[i]);
		    }
		    if(m.equalsIgnoreCase("A"))
		    {
		    	obj.ascending(a);
		    }
		    if(m.equalsIgnoreCase("d"))
		    {
		    	obj.descending(a);
		    }
		    if(m.equalsIgnoreCase("b"))
		    {
		    	obj.ascending(a);
		    	obj.descending(a);
		    }
			
			
			
		}
	
	

}
