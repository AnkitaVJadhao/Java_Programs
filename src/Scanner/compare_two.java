package Scanner;

import java.util.*;

public class compare_two {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a == b)
		{
			System.out.println("A is equal");
		}
		else    //we can check many condition after else also , so in java we found solution it's call"Else if"
		{
			if(a>b)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("B is greater");
			}
		}
		

	}

}
