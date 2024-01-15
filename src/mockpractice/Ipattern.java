package mockpractice;

public class Ipattern {

	public static void main(String[] args) 
	{
		for(int i=1; i<=7;i++)
		{
		  System.out.print("*");
		}
		System.out.println();
		for(int j=1; j<=7-2;j++)
		{
			for(int k=1;k<=7/2; k++)     // 7/2 =3
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=1; i<=7;i++)
		{
		  System.out.print("*");
		}
			

	}

}
