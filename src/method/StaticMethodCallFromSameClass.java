package method;

public class StaticMethodCallFromSameClass 
{
	
	int a=10;
	public static void main(String[] args) 
	{
		//Call static regular method from same(own) class
		//methodName()
		
		test(); //calling static regular method from same class
		test1();	
	}

	public static void test() //complete static regular method
	
	{
		System.out.println("Hi this is static regular method test");
		
	}
	
	public static void	test1()
	{
		System.out.println("Hi this is static regular method test1");
	}	
}
