package controlStatements;

public class IElse_IF_Study {

	public static void main(String[] args)
	
	{
		 //if my account balance is greater than equal to 4000000 and less than 7000000 then I can apply for personal loan
		//else if my account balance is greater than equal to 2500000 and less than 4000000 then msg display that you need minimum 4000000 in your account
		//else if my account balance is greater than equal to 1500000 and less than 2500000 then msg display that you need minimum 4000000 in your account
       //else msg display you need to open account in our bank and need specific balance in it for personal loan.
		
		int accbalance;
		accbalance=1000000;
		
		if(accbalance>=4000000 && accbalance<=7000000)
		{
			System.out.println("Respected user , you are applicable for personal loan.");
		}
		
		else if (accbalance>=2500000 && accbalance<4000000) 
		{
		     System.out.println("1.Respected user , You need minimum 4000000 balance  in your account ");	
		}
		
		else if (accbalance>=1500000 && accbalance<2500000) 
		{
			System.out.println("2.Respected user , You need minimum 4000000 balance  in your account ");
		}
		
		else
		{
			System.out.println("Respected user ,You need to open account in our bank and need specific balance in it for personal loan. ");
		}
	}

}
