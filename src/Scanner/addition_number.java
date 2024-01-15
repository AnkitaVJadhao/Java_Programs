package Scanner;

import java.util.*;    //we can also take scanner.

public class addition_number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);   //for input will take System.in
		System.out.println("Enter first number");
		int a=sc.nextInt();     //for taking input from user
		System.out.println("Enter second number");
		int b=sc.nextInt();      //for taking input from user
		
		float c=a+b;
		System.out.println("Addition is " +c);
		
		
		
		
	}

}
