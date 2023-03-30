/*Write a Java Program to find the Factorial of a given number.*/

import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		System.out.println("Enter a number to find its factorial");
		Scanner fac= new Scanner(System.in);
		int n= fac.nextInt();
		int temp=n;
		int i=n;
		if(temp==0)
		{
			System.out.println("factorial of "+temp +" is " +1);
		}
		else
		{
			for(i=n-1;i>0;i--)
			{
				n=n*i;
			}
			System.out.print("factorial of "+temp);
			System.out.println(" is "+n);
		}
		
	}
	
}