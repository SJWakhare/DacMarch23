class gross_salary
{
	public static void main(String args[])
	{
		double basic= 10000.8989009;
		double TA=5600.6778;
		double DA= 0.14*basic;
		double PA=7000.3443534546;
		double TD= 0.0176*DA;
		double gross;
		
		gross =basic + TA + DA + PA - TD; 
		
		System.out.println("Gross salary=" + gross);
	}
}