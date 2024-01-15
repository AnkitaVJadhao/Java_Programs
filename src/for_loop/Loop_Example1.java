package for_loop;

public class Loop_Example1 {

	public static void main(String[] args) 
	
	{
		for(int a=1;a<=10;a++)
		{
			System.out.println(a);
		}
		
		System.out.println("Sum of first 10 naature number");
		
		int sum=0;
		for(int b=1;b<=10;b++)
		{
			sum=sum+b;  //2
		}
		System.out.println(sum);
		System.out.println("Multiplication of first 10 number");
		
		int mult=1;
		for(int i=1;i<=10;i+=2)   
		{
			mult=mult*i;  
			
		}
		System.out.println(mult);  
		System.out.println("Reverise number");
	
		for(int s=10;s>=1;s--)
		{
			System.out.println(s);
		}
		System.out.println("Even number from 1 to 100");
		
		for(int p=1;p<=100;p++)
		{
			if(p%2==0)
			{
				System.out.println("Even number "+p);
			}
		}
		System.out.println("Odd number from 1 to 100");
		
		for(int q=1;q<=100;q++)
		{
			if(q%2!=0)
			{
				System.out.println("Odd number "+q);
			}
		}
		//for(int s=1;s<=255;s++)
		//{
			//System.out.println((char)s);
		//}
     System.out.println("Factorial program");
     
     int fact=1;
     for(int i=1;i<=8;i++)
     {
    	 fact=fact*i;
    	 
     }
     System.out.println(fact);
     
    System.out.println("First five odd number");
    
    int mult1=0;
    for(int k=1;k<=10;k=k+2)
    {
    	mult1=mult1+k;    
    
    }
    System.out.println(mult1);
    
    
	}
}

