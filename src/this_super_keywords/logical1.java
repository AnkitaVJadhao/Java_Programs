package this_super_keywords;

import java.util.Scanner;

public class logical1 {

	public static void main(String[] args) 
	{
		//n=2
		//shift this array :-{5,7,9,0,1,2}   // {2,5,7,9,0,1} 
		//count same number in String s="madagascar";
		//and print which char is repeting 
	    System.out.println("Enter K value");
	    Scanner sc=new Scanner(System.in);
	    int k=sc.nextInt();
	    
		if(k>6)
		{
			k=k%6;
		}
		int []a= {1,2,3,4,5,6};
		for(int i=0;i<k;i++)
		{
			routedLeft(a, a.length);
			//routedRight(a, a.length);

		}

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}
	public static void routedRight(int []a,int n )
	{
		int temp=a[n-1];
		
		for(int i=n-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
	}
	public static void routedLeft(int []a,int n )
	{
		int temp=a[0];
		
		for(int i=0;i<n-1;i++)
		{
			a[i]=a[i+1];
			
		}
		a[n-1]=temp;
		
		//1,2,3,4,5
		//Left :- 5,1,2,3,4
		//Right:- 2,3,4,5,1
	}

}
