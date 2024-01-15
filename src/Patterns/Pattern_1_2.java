package Patterns;

public class Pattern_1_2 {

	public static void main(String[] args) 
	{
		Pattern_1_2 p1 = new Pattern_1_2();
		p1.pattern1(5);
		System.out.println("========================");
		p1.pattern2(5);

	}
	public void pattern1(int n)
	{
		for(int i =1; i<=n ; i++)  //no. row
		{
			for(int j =1; j<=i; j++)  // pattern 1:- j<=i 
			{
				System.out.print(i);   //coln change 
			}
			System.out.println();
		}
		
		
	}
	public void pattern2(int a)
	{
	for(int i =1; i<=a ; i++)  //no. row
	{
		for(int j =1; j<=a-i+1; j++)  // pattern 1:- j<=i 
		{
			System.out.print(i);   //coln change 
		}
		 System.out.println();
	}

	}
	
}
