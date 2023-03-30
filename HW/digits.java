//Write a Java Program to print the digits of a Given Number.

import java.util.Scanner;

class digits
{
	public static void main (String args[])
	{
		System.out.println("Enter any number");
		Scanner sc= new Scanner (System.in);
		
		int num= sc.nextInt();
		
		if (num==0)
		{
		 System.out.println("Enter valid number");	
		}
		else
		{
			for(int i=0; num>0;i++)
			{
			 int a=num%10;
			 num=num/10;
			 System.out.println(a);
			}
		
		}
	}
}