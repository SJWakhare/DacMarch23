import java.util.*;
class OddSeries 
{
	public static void main (String args [] )
	{
		System.out.println("Enter a range of series.");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for(int i = 1; i < num ; i++)
		{
			if (i% 2== 1 )
			{
				System.out.print(i+" ");
			}
		}
	}
}

/*import java.util.Scanner ;
 
class Even{
	public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the range limit : ");
	  int n = sc.nextInt();
	  
	 System.out.println(  " Even nos.are :  ");
	 for(int i =1 ; i<n ; i++){
	  if(i%2==0){
	  System.out.print( i + " ");
	  }
	 }
	 
	  System.out.println(  "\n Odd nos.are :  ");
	  for( int j =1 ; j<n ; j++){
	  if(j%2!=0){
	  System.out.print(  j + " ");
	  }
	  
	 }
	 
	}
}
*/