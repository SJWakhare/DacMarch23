/*Program to identify grade of a student
  Input: Total marks 
  Grades: >95: Distiction
		  >=85:1st div
		  >=75:2nd div
		  <75: average*/
import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		System.out.println("Enter your marks in 5 subjects. Marks are out of 100");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int total= a+b+c+d+e;
		int avg= total/5;
		System.out.println("Your average is "+avg);
		
		double per= (((double)total)*100)/500;
		System.out.println("Your percentage is "+per);
		
		if(per>=95)
		{
			System.out.println("Congratulations! You got distiction");
		}
		else if(per<95 && per>=85)
		{
			System.out.println("Congratulations! You passed with 1st distiction");
		}
		else if(per<85 && per>=75)
		{
			System.out.println("You passed with 2nd distiction");
		}
		else
		{
			System.out.println("You got average marks.");
		}	
		
	}
}