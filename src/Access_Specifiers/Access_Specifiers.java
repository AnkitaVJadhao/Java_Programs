package Access_Specifiers;

public class Access_Specifiers 

{
	private int a=20;       
	int b=35;     
	protected int c=35;    
	public int d=40;
	
	public static void main(String[] args)
	
	{
		Access_Specifiers a1=new Access_Specifiers();
		System.out.println("a values is"+a1.a);  //calling private member from same class
		System.out.println("b values is "+a1.b); //calling default member from same class
		System.out.println("c value is "+a1.c);  //calling protected member from same class
		System.out.println("d values is "+a1.d);  //calling public member from same class
		System.out.println("=====================");
		a1.test1();        //calling private member from same class
		a1.test2();        //calling default member from same class
		a1.test3();         //calling protected member from same class
		a1.test4();       //calling public member from same class
		
	}
	
	private void test1()
	{
		System.out.println("This is private method :- visible in within class only");
	}
	
	void test2()
	{
		System.out.println("This is default method :- visible in within package only");
	}
	
	protected void test3()
	{
		System.out.println("This is protected method :- visible in within package only and if we wwant to access this in other package class then we need to use inheritance concept");
	}
	
	public void test4()
	{
		System.out.println("This is public method :- visible in within project ");
	}
	
}


