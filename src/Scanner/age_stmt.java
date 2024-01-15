package Scanner;

import java.util.*;

public class age_stmt {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("You are adult");
		}
		else
		{
			System.out.println("You are child");
		}
		
		
		
	}

}
