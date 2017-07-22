package factorial;
import java.util.*;
public class facto {
	public static void main(String[] args) {
		int i,j=1;
		System.out.println("enter the n");
		Scanner Sc =new Scanner(System.in);
		int n=Sc.nextInt();
		for(i=1;i<=n;i++)
		{ 
			j=j*i;
		}
		System.out.println(j);
	}
}

  
