package Scanner;

import java.util.*;

public class compare_elseif
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a == b)
		{
			System.out.println("A is equal");
		}
		else if(a > b)     //nested if 
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is greater");
		}
		
		
	}
}
