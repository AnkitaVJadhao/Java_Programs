package Patterns;

public class Patternbutterfly90degree 
{
     public static void main(String[] args) 
     {
    	 for(int i=1; i<=8; i++)
     	{
     		for(int j=1; j<=i-1; j++)
     		{
     			System.out.print(" ");
     		}
     		for(int s=1; s<=2*(8-i+1);s++)  // 
     		{
     			System.out.print("*");
     		}
//     		for(int k=1; k<=i; k++)
//     		{
//     			System.out.print(" ");
//     		}
     		System.out.println();
     	}
     	
     	for(int i=2; i<=8; i++)
     	{
     		for(int j=1; j<=8-i; j++)    //5-2+1 :4
     		{
     			System.out.print(" ");
     		}
     		for(int s=1; s<=(i)*2;s++)  
     		{
     			System.out.print("*");
     		}
//     		for(int k=8-i+1; k>=1; k--)
//     		{
//     			System.out.print(" ");
//     		}
     		System.out.println();
     	}
     	//System.out.println("=====================");
	}
}
