/* consider 3 variables a,b,c and identify max and min value.*/
import java.util.Scanner;
class max_min
{
	public static void main (String args[])
	{
		System.out.println("enter three number");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(((n1>n2)&&(n1>n3))||((n1==n2)&&(n1>n3)))
		{
			System.out.println("Max num is "+n1);
		}
		else
		{
			if(((n2>n3)&&(n2>n1))||((n2==n3)&&(n2>n1)))
			{
				System.out.println("Max num is "+n2);
			}
			else
			{
				System.out.println ("Max num is "+n3);
			}
		}
		
		if(((n1<n2)&&(n1<n3))||((n1==n2)&&(n1<n3)))
		{
			System.out.println("Min num is "+n1);
		}
		else
		{
			if(((n2<n3)&&(n2<n1))||((n2==n3)&&(n2<n1)))
			{
			System.out.println("Min num is "+n2);
			}
			else
			{
			System.out.println("Min num is "+n3);	
			}
		}
		if((n1==n2)&&(n2==n3))
		{
			System.out.println("All numbers are same.");
		}
	}
	
}