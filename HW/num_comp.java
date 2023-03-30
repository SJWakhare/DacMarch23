/*Take input of 2 numbers and use ternary operator to compare.
  If num1 is > then, do num1+num2
  if num2 is > then, do num1-num2*/
  
  import java.util.*;
  class num_comp
  {
	  public static void main(String args[])
	  {
		  System.out.println("enter two numbers");
		  Scanner sc = new Scanner (System.in);
		  int num1 = sc.nextInt();
		  int num2 = sc.nextInt();
		  
		  int num3 = (num1>num2)? (num1+num2):(num1-num2);
		  
		  System.out.println("Answer is "+num3);
	  }
  }