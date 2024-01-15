package ExceptionHandlingStudy;

import java.util.Scanner;

public class tryandcatchstudy {

	private static final Exception ArithmeticException = null;

	public static void main(String[] args)
	{
		
		
		String username="ankitaj";
		String password="123@123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username");
		String user = sc.next();
		System.out.println("Enter your password");
		String pass = sc.next();
		
		try 
		{
			
			if(username.equals(user)&& password.equals(pass))
			{
				System.out.println("Logged in ");
			}
			else
			{
				throw ArithmeticException;
			}
			
		} 
		catch (Exception e)
		{
			
			System.out.println("Enter your valid credeintials");
		}
		
		System.out.println("After running arthmetic ");
		
		
		
		
		
		

	}

}
