package mockpractice;

public class StaticVariable
{

	static int a=40;
	int x;
	
	public static void main(String[] args)
	{
		//calling non static method we need to create object
		StaticVariable s1=new StaticVariable();
		
		//we can use static variable in static method only
		System.out.println("Value of a is "+a);
		
		//calling method
		s1.display();
		
		//calling non static variable from another class
		StaticVariable2 s2=new StaticVariable2();   
		s2.name="Ankita";    // assign value to non-static variable from another class 
		
		//if we need to call non-static variable from another class then create object and call like object name . variable name;
		System.out.println("The name is "+s2.name);  

	}
	public void display()
	{
		//static variable can use in non -static method also 
		int b=10;
		int sum=a+b;
		System.out.println("B values is "+b);    //local variable
		System.out.println("Then sum is "+sum); //static global variable
	}
}
