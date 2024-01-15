package Patterns;

public class H_pattren 
{   
//	   *         *
//	   *         *
//	   * * * * * * 
//	   *         *
//	   *         *

	public static void main(String[] args) 
	{
		for(int i=1; i<=5/2; i++)
		{
			 for(int j=1; j<=5-2; j++)
			 {
				  System.out.print(" ");
			 }
			 System.out.println("*");
		}
		for(int k=1;k<=5;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=5/2; i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}

}
