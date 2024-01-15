package Scanner;

import java.util.*;
public class all_even {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		
		for(int p =1; p <= n; p++)
		{
			if(p%2==0)
			{
				System.out.println(p);
			}
		}
	}

}
