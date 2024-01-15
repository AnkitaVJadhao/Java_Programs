package Patterns;

public class Pattern_3_4 {

	public static void main(String[] args) 
	{
		
		Pattern4();
		System.out.println("===================");
		Pattern3();

	}
	public static void Pattern4()
	{
		for(int i=1; i<=5; i++)   //row 
		{
			for(int j=1; j<=i-1; j++)  //column space :- row -1;
			{
				System.out.print(" ");   
			}
			for (int k=1; k<=5-i+1; k++)    // print the number 
			{
				System.out.print(k);
			}System.out.println();
		}
	} 
	
	public static void Pattern3()
	{
		for(int i=1; i<=5; i++)   //row 
		{
			for(int j=1; j<=5-i; j++)  //column space :- row -1;
			{
				System.out.print(" ");   
			}
			for (int k=1; k<=i; k++)    // print the number 
			{
				System.out.print(k);
			}System.out.println();
		}
	} 


}
