package logical_program;

public class Fibonacci {

	public static void main(String[] args) 
	
	{
		
		int num1=0;     // 0,1,2,3,4,5   :- 0+1 =1; 1+1=2 ; 2+1
		int num2=1;
		int num3;
		int count = 20;
		System.out.println(0);   //constant
		System.out.println(1);
		
		
		
		for(int i=2;i<count;i++)
		{
			num3=num1+num2;    // num3=0+1 =1
			System.out.println(num3);
			num1=num2;      
			num2=num3;
		}
		System.out.println("=========================================");
		int a=5;
		int count1=0;   
		for(int i=2;i<a;i++)
		{
			if(a%i==0)   
			{
				count1++;  
				break;
			}
				
		}
		if(count1==0)
		{
			System.out.println("This is prime number");
		}
		else
		{
			System.out.println("This is not prime number");
		}
		
	}

}
