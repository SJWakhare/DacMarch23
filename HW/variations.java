class variations
{
	/*public static void main (String args[])
	{
		System.out.println("hello");
	}*/
	//OK
	
	/*public static void main (String[] args)
	{
		System.out.println("hello");
	}*/
	//OK
	
	/*public static void main (String... args)
	{
		System.out.println("hello");
	}*/ 
	//OK , but only 3 dots
	
	/*public static void main (String []args)
	{
		System.out.println("hello");
	}*/
	//OK
	
	/*public static void main (String [] args[])
	{
		System.out.println("hello");
	}*/
	//NOT OK
	
	/*public static final void main (String args[])
	{
		System.out.println("hello");
	}*/
	//OK
	
	/*final public static void main (String[] args)
	{
		System.out.println("hello");
	}*/
	//OK
	
	/*final strictfp public static void main (String[] args)
	{
		System.out.println("hello");
	}*/
	//OK
	
	/*public void main (String[] args)
	{
		System.out.println("hello");
	}*/
	//NOT OK, run time error
	
	/*static void main (String[] args)
	{
		System.out.println("hello");
	}*/
	//NOT OK, runtime error, main not found in class
	
	/*public void static main (String args[])
	{
		System.out.println("hello");
	}*/
	//NOT OK, compile time error
	
	/*static public void main (String args[])
	{
		System.out.println("hello");
	}*/
	//OK
	
	/*abstract public static void main (String[] args)
	{
		System.out.println("hello");
	}*/
	//Illegal combination abstract and static
}