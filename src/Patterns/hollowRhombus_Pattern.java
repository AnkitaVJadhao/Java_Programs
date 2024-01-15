package Patterns;

import java.util.Scanner;

public class hollowRhombus_Pattern {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a-1;i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
		for(int i=2; i<=a-1; i++)
		{
			//print space
			
			for(int j=1; j<=a-i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=2; k<=(2*i)-2; k++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i=a; i>1; i--)
		{
			//print space
			for(int j=1; j<=a-i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=2; k<=(2*i)-2; k++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=1;i<=a-1;i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");

	}

}
