package Self_practice;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter first number");
//		
//		int a=sc.nextInt();
//		
//		System.out.println("Enter second number");
//		
//		int b= sc.nextInt();
//		
//         int c= a+b;
//		System.out.println("Addition is "+(a+b));
//		
//		System.out.print("Enter any string \n");
//		String name=sc.next();
//		System.out.println("Enter name"+name.length());
		
		
		System.out.println("Enter  number");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
		

	}

}
