package method;

public class NonStaticExample 
{
	public static void main(String[] args)
	{
		//to call non static method first we need to create object for this class.
		//syntax :- Classname objectname = new Classname();
		
		NonStaticExample n =new NonStaticExample(); //create object
		
		//to call method after creating object 
		//syntax :- objectname.methodname();
		
		n.method1();
		n.method2();
		
		System.out.println("================================================================");
		//to call non static method from another class we need to create object for another class(NonStaticExample1)
		//syntax:- Classname objectname = new Classname();
		
		NonStaticExample1 n1=new NonStaticExample1(); //create object
		
		//to call method after creating object 
		//syntax :- objectname.methodname();
		
		n1.method3();
		n1.method4();
		
	}

	public void method1()  //non static regular method
	{
      System.out.println("1.This is first non static method from NonStaticExample class. ");
	}
	public void method2()   //non static regular method
	{
		System.out.println("2.This is second non static method from NonstaticExample class.");
	}
	
}
