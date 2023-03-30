//10.Write a Java Program to find the sum of the digits of a given number.
import java.util.Scanner;

class digits_sum
{
	public static void main (String args[])
	{
		System.out.println("Enter any number");
		Scanner sc= new Scanner (System.in);
		
		int num= sc.nextInt();
		int sum=0;
		int rem;
		for(int i=0; num!=0;i++)
		{
		 rem=num%10;
		 num=num/10;
		 sum= sum + rem;
		
		}
		 System.out.println(sum);
		
	}
}