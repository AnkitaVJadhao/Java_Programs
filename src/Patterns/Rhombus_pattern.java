package Patterns;

import java.util.Scanner;

public class Rhombus_pattern {

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int a=sc.nextInt();
//		
//		for(int i=1;i<=a;i++)
//		{
//			for(int j=0;j<a-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=a;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//int a=5;
        for(int i=0;i<a-1;i++){
            System.out.print(" ");//####*****
        }
        for(int i=1;i<=a;i++){

            System.out.print("*");
        }
        System.out.println();

        for(int i=1;i<=a-2;i++)
        {
            for(int j=0;j<a-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<=a-2;k++)
            {
            	System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<a;i++){
            System.out.print("*");
        }

    }

		

	}


