// multiplication table
import java.util.Scanner;

class forloop
{
	public static void main(String args[])
	{
		System.out.println("Enter any number");
		
		Scanner sc= new Scanner (System.in);
		int x=sc.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(x+ "*" +i + "=" +i*x);
		}
	}
}