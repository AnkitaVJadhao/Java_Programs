package mockpractice;

public class patternExamples 
{
    public static void main(String[] args) 
    {
		
    	//1
    	//12
    	//123
//    	  1234
//    	  12345
    	
    	for(int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=i; j++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println("=====================");
    	for(int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=5-i+1; j++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println("=====================");
    	for(int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=5-i; j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1; k<=i; k++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println("=====================");
    	
    	//*****
    	for(int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=i-1; j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1; k<=5-i+1; k++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println("=====================");
    	for(int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=5-i;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1; k<=2*i-1; k++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	
    	for(int i=2; i<=5; i++)
    	{
    		for(int j=1; j<=i-1; j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1; k<=2*(5-i+1)-1; k++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println("=======================");
//      ****  
//    	*  *
//    	*  *
//    	****
    	
    	for(int i=1; i<=10; i++)
    	{
    	 System.out.print("*");
    	}System.out.println();
    	for(int i=1; i<=10-2; i++)
    	{
    	  System.out.print("*");
    	  for(int j=1; j<=10-2; j++)
    	  {
    		  System.out.print(" ");
    	  }System.out.print("*");
    	   System.out.println();
    	}
    	for(int i=1; i<=10; i++)
    	{
    		
    		System.out.print("*");
    	}
    	
	}
    }
