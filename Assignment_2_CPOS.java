class Assignment2
{
	public static void main(String args[])
	{
//1.
/*Q1	1
		1	2
		1	2	3
		1	2	3	4
		1	2	3	4	5
*/
/*	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print(b+ "	");
		}
		System.out.println();
	}
*/



/*Q2	A
		A	B
		A	B	C
		A	B	C	D
		A	B	C	D	E
*/
/*	for(char a=65; a<70; a++)
	{
		for(char b=65; b<=a; b++)
		{
			System.out.print(b+ "	");
		}
		System.out.println();
	}
*/



/*Q3	*
		*	*
		*	*	*
		*	*	*	*
		*	*	*	*	*
*/
/*	for(int a=0; a<5;a++)
	{
		for(int b=0; b<=a;b++)
		{
			System.out.print("*	");
		}
		System.out.println();
	}
*/



/*Q4	1
		2	2
		3	3	3
		4	4	4	4
		5	5	5	5	5
*/
/*	for(int a=1; a<=5;a++)
	{
		for(int b=1; b<=a; b++)
		{
			System.out.print(a+ "	");
		}
		System.out.println();
	}
*/



/*Q5	A
		B	B
		C	C	C	
		D	D	D	D
		E	E	E	E	E	
*/
/*	for(char a=65; a<70; a++)
	{
		for(char b=65;b<=a;b++)
		{
			System.out.print(a+ "	");	
		}
		System.out.println();
	}
*/ 
//OR
/*	for(char a='A';a<='E';a++)
	{
		for(char b='A';b<=a;b++)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
*/
	
	
	
/*Q6						*
						*	*
					*	*	*
				*	*	*	*
			*	*	*	*	*
*/

/*	for(int a=1;a<=5;a++)	
	{
		for(int b=4;b>=a;b--)
		{
			System.out.print("	");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print("*	");
		}
		System.out.println();
		
	}
*/



/*Q7			1
			  1	  2
			1	2	3
		  1	  2   3   4
		1	2	3	4	5
*/
/*	for(int a=1;a<=5;a++)
	{
		for(int b=4;b>=a;b--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
*/



/*Q8			5
			  4	  5
			3	4	5
		  2	  3   4	  5
		1	2	3	4	5
*/
/*	for(int a=5;a>=1;a--)
	{
		for(int b=1;b<a;b++)
		{
			System.out.print(" ");
		}
		for(int c=a;c<=5;c++)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
*/	
	
	
	
/*Q9	A
	   A B
	  A B C
	 A B C D
	A B C D E
*/
/*	for(char a=65; a<70; a++)
	{
		for(char b=69;b>=a;b--)
		{
			System.out.print(" ");
		}
		for(char c=65; c<=a; c++)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
*/



/*Q10	E
	   D E
	  C D E
	 B C D E
	A B C D E
*/
/*	for(char a=69;a>=65; a--)
	{
		for(char b=65;b<a;b++)
		{
			System.out.print(" ");
		}
		for(char c=a;c<=69;c++)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
*/



/*Q11	*
	   ***
	  *****
	 *******
	*********
*/
/*	for(int a=1;a<=5;a++)
	{
		for(int b=5;b>a;b--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print("*");
		}
		for(int d=2;d<=a;d++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q12	1
	   2 2
	  3 3 3
	 4 4 4 4
	5 5 5 5 5
*/
/*	for(int a=1;a<=5;a++)
	{
		for(int b=5;b>a;b--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print(a+ " ");
		}
		System.out.println();
	}
*/



/*Q13	A
	   B B
	  C C C 
	 D D D D
	E E E E E
*/
/*	for(char a=65; a<=69;a++)
	{
		for(int b=69;b>a;b--)
		{
			System.out.print(" ");
		}
		for(int c=65;c<=a;c++)
		{
			System.out.print(a+ " ");
		}
		System.out.println();
	}*/		
	
	

/*Q14	1	2	3	4	5
		1	2	3	4
		1	2	3
		1	2
		1
*/
/*	for(int a=5;a>=1;a--)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print(b+ "	");
		}
		System.out.println();
	}
 */
 
 
 /*Q15	5	4	3	2	1
		5	4	3	2
		5	4	3
		5	4
		5
*/
/*	for(int a=1; a<=5;a++)
	{
		for(int b=5; b>=a;b--)
		{
			System.out.print(b+ "	");
		}
		System.out.println();
	}
*/


/*Q16	5
		5	4
		5	4	3
		5	4	3	2
		5	4	3	2	1
*/		
/*	for(int a=5;a>=1;a--)
	{
		for(int b=5;b>=a;b--)
		{
			System.out.print(b+ "	");
		}
		System.out.println();
	}		
*/


/*Q17	1
		2	3
		4	5	6
		7	8	9	10
		11	12	13	14	15
*/
/*	int n=1;
	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print(n+ "	");
			n++;
		}
		System.out.println();
	}
*/



/*Q18	A	B	C	D	E
		A	B	C	D
		A	B	C
		A	B
		A
*/
/*	for(char a='E';a>='A';a--)
	{
		for(char b='A';b<=a;b++)
		{
			System.out.print(b+ "	");
		}
		System.out.println();
	}
*/


//2.
/*Q1	*
		**
		***
		****
		*****
*/
/*	char A='*';
	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print(A);
		}
		System.out.println();
	}
*/


/*Q2	     *
			**
           ***
		  ****
         *****
*/		 
/*	for(int a=5;a>=1;a--)
	{
		for(int b=1;b<a;b++)
		{
			System.out.print(" ");
		}
		for(int c=5;c>=a;c--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/


/*Q3	*****
		****
		***
		**
		*
*/
/*	for(int a=5;a>=1;a--)
	{
		for(int b=a;b>=1;b--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q4	*****
		 ****
		  ***
		   **
		    *
*/
/*	for(int a=5;a>=1;a--)
	{
		for(int b=5;b>a;b--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q5	   *
          ***
		 *****
        *******
	   *********
*/
/*	for(int a=5;a>=1;a--)
	{
		for(int b=a;b>1;b--)
		{
			System.out.print(" ");
		}
		for(int c=5;c>=a;c--)
		{
			System.out.print("*");
		}
		for(int d=4;d>=a;d--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q6	 *********
          *******
		   *****
            ***
			 *
*/
/*	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<a;b++)
		{
			System.out.print(" ");
		}
		for(int c=5;c>=a;c--)
		{
			System.out.print("*");
		}
		for(int d=4;d>=a;d--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q7	   *
          ***
		 *****
        *******
	   *********	
	    *******
		 *****
          ***
	       *
*/
/*	for(int a=5;a>=1;a--)
	{
		for(int b=1;b<a;b++)
		{
			System.out.print(" ");
		}
		for(int c=5;c>=a;c--)
		{
			System.out.print("*");
		}
		for(int d=5;d>a;d--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int a1=1;a1<5;a1++)
	{
		for(int b1=1;b1<=a1;b1++)
		{
			System.out.print(" ");
		}
		for(int c1=4;c1>=a1;c1--)
		{
			System.out.print("*");
		}
		for(int d1=4;d1>a1;d1--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q8	*
		**
		***
		****
		*****
		****
		***
		**
		*
*/
/*	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int c=4;c>=1;c--)
	{
		for(int d=c;d>=1;d--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q9	
            *
		   **
		  ***
		 ****
		*****
		 ****
		  ***
		   **
		    *
*/

/*	for(int a=1;a<=5;a++)
	{
		for(int b=4;b>=a;b--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int a1=4;a1>=1;a1--)
	{
		for(int b1=4;b1>=a1;b1--)
		{
			System.out.print(" ");
		}
		for(int c1=1;c1<=a1;c1++)
		{
			System.out.print("*");
		}
		System.out.println();
	}	
*/

	

/*Q10	 
	*****
   *****
  *****
 *****
*****

*/
/*	for(int a=1;a<=5;a++)
	{
		for(int b=5;b>a;b--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=5;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/

	
/*Q11	*****
         *****
          *****
           *****
			*****
*/

/*	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<a;b++)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=5;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/
	
	
/*Q12	*****
		****
		***
		**
		*
		**
		***
		****
		*****
*/
/*	for(int a=5;a>=1;a--)
	{
		for(int b=a;b>=1;b--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int c=2;c<=5;c++)
	{
		for(int d=1;d<=c;d++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/



/*Q13	*****
		 ****
		  ***
		   **
		    *
		   **
		  ***
		 ****
		*****
*/

/*	for(int a=5;a>=1;a--)
	{
		for(int b=5;b>a;b--)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=a;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int a1=2;a1<=5;a1++)
	{
		for(int b1=5;b1>a1;b1--)
		{
			System.out.print(" ");
		}
		for(int c1=1;c1<=a1;c1++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
*/


/*Q14	* * * * *
		 * * * *
		  * * *
		   * *
		    *
		   * *
		  * * *
		 * * * *
		* * * * *
*/

/*	for(int a=5;a>=1;a--)
		{
			for(int b=5;b>a;b--)
			{
				System.out.print(" ");
			}
			for(int c=a;c>=1;c--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	for(int a1=2;a1<=5;a1++)
		{
			for(int b1=5;b1>a1;b1--)
			{
				System.out.print(" ");
			}
			for(int c1=1;c1<=a1;c1++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
*/


/*Q15	*
	    **
		* *
        *  *
        *****
*/

/*	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<=a;b++)
		{
			if(a==b || b==1 || a==5) System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
	}
*/


/*Q16	 *
	    **
	   * *
      *  *
     *****		
*/

/*
for(int a=5;a>=1;a--)
	{
		for(int b=1;b<a;b++)
		{
			System.out.print(" ");
		}
		for(int c=5;c>=a;c--)
		{
			if(a==c || a==1 || c==5) System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
	}
*/	
}
}