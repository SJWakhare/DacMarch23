class pattern
{
	public static void main (String args[])
	{
		//1.
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+ "--" +j +"  " ); //1--1  1--2  1--3  1--4  1--5 
			}							   			//2--1  2--2.....
			System.out.println();
		}*/
		
		
		//2.
		/*for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+ " " +j +"  "); //5 1  5 2  5 3  5 2  5 1
			}
			System.out.println();
		}*/
		
		
		//3.rev triangle
		/*for(int i=7;i>=1;i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("? ");
			}
			System.out.println();
		}*/
		
		
		//4. triangle
		/*for(int i=1;i<=7;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("? ");
			}
			System.out.println();
		}*/
		
		
		
		//5. (Homework)
		/*
? ? ? ? ? ? ?
? ? ? ? ? ?
? ? ? ? ?
? ? ? ?
? ? ?
? ?
?
? ?
? ? ?
? ? ? ?
? ? ? ? ?
? ? ? ? ? ?
? ? ? ? ? ? ?
		*/
		/*for(int i=7;i>=1;i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("? ");
			}
			System.out.println();
		}
		
		for(int k=2; k<=7;k++)
		{
			for(int l=1;l<=k; l++)
			{
				System.out.print("? ");
			}
			System.out.println();
		}*/
		
		
		//6. (Homework)
		/*
^
^ ^
^ ^ ^
^ ^ ^ ^
^ ^ ^ ^ ^
^ ^ ^ ^ ^ ^
^ ^ ^ ^ ^ ^ ^
^ ^ ^ ^ ^ ^
^ ^ ^ ^ ^
^ ^ ^ ^
^ ^ ^
^ ^
^
		*/
		/*
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print("^ ");
			}
			System.out.println();
		}
		
		for(int k=6;k>=1;k--)
		{
			for(int l=k;l>=1;l--)
			{
				System.out.print("^ ");
			}
			System.out.println();
		}
		*/
	}
	
}










/* print digit of given number using charAt
import java.util.*;
class Charat_demo
{
	public static void main(String args[])
	{
		String str;
		System.out.println("Enter No");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		//System.out.println("length "+str.length());
		
		for(int i=str.length();i!=0;i--)
		{
		System.out.println(str.charAt(str.length()-i));
		   
		}
		
	}
	
}*/

