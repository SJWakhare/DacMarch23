/*make use of ternary operator and identify even number*/

import java.util.Scanner;

class even_num
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num= n%2==0?"even":"odd";
		System.out.println("number is "+num);
		
	}
}