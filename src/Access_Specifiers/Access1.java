package Access_Specifiers;

public class Access1 
{
	
	public static void main(String[] args) 
	
	{
		//calling method and variable from another class
		Access_Specifiers a1=new Access_Specifiers();
		//a1.a;    //private can be accessed only within same class not in another class
		System.out.println("b values is "+a1.b);    //calling default variable from another class
		System.out.println("c values is "+a1.c);   //calling protected variable from another class
		System.out.println("d values is "+a1.d);    //calling public variable from another class
		System.out.println("=========================");
		//a1.test1();    //private can be accessed only within same class not in another package
		a1.test2();      //calling default method from another class
		a1.test3();     //calling protected method from another class
		a1.test4();    //
		
	}

}
