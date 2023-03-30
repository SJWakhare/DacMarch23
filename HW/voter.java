/*write a program to identify the eligibility of a voter for elections*/

import java.util.Scanner;

class voter
{
	public static void main(String args[])
	{
		System.out.println("What is your nationality? If Indian then press 1, if not press 0");
		Scanner sc= new Scanner(System.in);
		int nationality =sc.nextInt();
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		
		if((nationality==1)&&(age>=18))
		{
			System.out.println("Do you have voter ID? If yes press 1, if not press 0");
			int id = sc.nextInt();
			if (id==1)
			{
				System.out.println("You are eligible to vote. Congratulations!!");
			}
			else
			{
				System.out.println("You are not eligible to vote. Sorry"); 
			}
		}
		else
		{
			System.out.println("You are not eligible to vote. Sorry"); 
		}
		
		
		
	}
	
}