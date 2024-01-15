package Patterns;

public class diamond_Pattern {
	
//	   *
//	  ***
//	 ***** 
//	******* 
//	 *****
//	  ***
//	   *
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)    //row
		{
			for(int j=1; j<=5-i; j++)  // space
			{
				System.out.print(" ");   
			}
			for(int k=1;k<=2*i-1; k++)   //2*1-1 = 2-1 =1
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =5;i>=1; i--)    //if we provide i =4 then it will remove the  duplicate line
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
