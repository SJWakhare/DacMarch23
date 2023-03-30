/*class CI
{
	public static void main(String args[])
	{
		double P=50000000.00;
		int year=5;
		double r=10.75;
		double A= P*((1+ r/100)*(1+ r/100)*(1+ r/100)*(1+ r/100)*(1+ r/100));
		double CI= A - P;
		System.out.println("CI is" + CI);
	}
}*/
class CI
{
	public static void main(String args[])
	{
		double P=50000;
		int year=5;
		double r=10.75;
		double A= P*((1+ r/100)*(1+ r/100)*(1+ r/100)*(1+ r/100)*(1+ r/100));
		double CI= A - P;
		System.out.println("CI is" + CI);
	}
}