package controlStatements;

public class Nested_If {

	public static void main(String[] args) 
	{
		//If email id is correct then enter password
		//if password is correct then home page display
		//else enter correct password
		//else enter correct email id
		
		String emailid="velocity123@gmail.com";
		String password="an@1234";
		
		if(emailid=="velocity123@gmail.com")
		{
			if(password=="an@1234")
			{
				System.out.println("Welcome to application");
			}
			else
			{
				System.out.println("Enter correct password");
			}
		}
		else
		{
			System.out.println("Enter correct email id");
		}
		

	}

}
