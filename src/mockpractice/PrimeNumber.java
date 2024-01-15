package mockpractice;

public class PrimeNumber {

	public static void main(String[] args)
	{
		
		int num1=5;
		
		for(int i=2; i<=10; i++)  // 1 is not prime number nor not prime number
		{
			if(num1%i==0 && num1!=i)
			{
				System.out.println("The number is not prime number");
				break;
			}
			else
			{
				System.out.println("The number is  prime number");
				break;
			}
		}
		
	}

}
