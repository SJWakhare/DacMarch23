/*Check if the given number is EVEN or ODD*/
import java.util.Scanner;
class even_odd
{
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner (System.in);
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
	
}