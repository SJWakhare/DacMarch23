//Homework

import java.util.Scanner;

class Area
{
	
	
	public static void main(String args[])
	{
		System.out.println("Area ");
		Area a= new Area(); //object creation with constructor
		a.circle();			// function calling
		
	
	}
	void circle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of a circle ");
		double r=sc.nextDouble();
		System.out.println("Area of the circle= "+(3.14*r*r));
	}
	void square()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of a square ");
	}
}

