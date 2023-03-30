import java.util.Scanner;

class Switch
{
	public static void main(String args[])
	{
		System.out.println("Enter no. 0 to 6");
		Scanner sc= new Scanner(System.in);
		int day=sc.nextInt();
		
		String s=" "; // OR s="Null" OR String s; and add ---default: s="Enter correct input";---on last line
		
		switch(day)
		{
			case 0: s="Sunday"; 
			break;
			case 1: s="Monday"; 
			break;
			case 2: s="Tuesday"; 
			break;
			case 3: s="Wednesday"; 
			break;
			case 4: s="Thursday"; 
			break;
			case 5: s="Friday"; 
			break;
			case 6: s="Saturday"; 
			break;
			
			
		}
		
		System.out.println(s);
		
		
	}
}