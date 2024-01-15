package Patterns;

import java.util.Scanner;

public class newDiamond {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		int a=sc.nextInt();
		for(int i=1; i<=a; i++)
		{
			//print space
			for(int j=1; j<=a-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=a; i>=1; i--)  // as we know that inner loop depend on 
			//i (outer loop)
			//we just made reflection of of or above program 
		{
			//print space
			for(int j=1; j<=a-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		
		

	}

}
