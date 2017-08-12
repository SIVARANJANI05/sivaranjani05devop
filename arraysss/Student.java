package arraysss;
import java.util.Scanner;
import java.util.Array;
import java.util.ArrayList;


public class Student {
	public static void main(String[] args) {
		int n,i,mark;
		String name,m;
		float avg;
		do
		{
			int total=0,j=1,k=1;
			Scanner SC=new Scanner(System.in);
			System.out.println("enter the student name:");
			name=SC.next();
			System.out.println("enter how many subjects:");
			n=SC.nextInt();
			ArrayList list=new ArrayList();
			for(i=0;i<n;i++)
			{
				System.out.println("enter the mark"+ k +":");
				mark=SC.nextInt();
				list.add(mark);
				total=total+mark;
				k++;
			}
			avg=total/n;
			if(avg>50)
			{
			    System.out.println("###########################################################################");
				System.out.println("CONGRATULATIONSSSS!!!!!!!!!!!");
			}
			else
			{
				System.out.println("REATTEMPT REQUIRED......");
			}
			 
			System.out.println("$$$$$$$$ SCORE CARD $$$$$$$");
			System.out.println("NAME:"+name);
			System.out.println("your marks:");
			for(i=0;i<n;i++)
			{
				System.out.println("mark"+ j +"=");
				System.out.println(list.get(i));
				j++;
				
			}
			System.out.println("GRAND TOTAL :" + total );
			System.out.println("AVERAGE:" + avg);
			System.out.println("your result is:");
			if(avg>50)
			{
				System.out.println("PASSED");
			}
			else
			{
				System.out.println("FAILED");
			}
			
			System.out.println("do you want to do it to another student");
			m=SC.next();
			}while(m.equalsIgnoreCase("y"));
	}

}
