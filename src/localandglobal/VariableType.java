package localandglobal;

public class VariableType 
{
	//Global variable declaration 
	  static int a=90;
	  static int b =25;
	 
	 public VariableType()
	 {
		 a=100;
		 b=200;
		 int multiply= a*b;
		 System.out.println("The ans is "+multiply);
	 }
	 
	 
	public static void main(String[] args) 
	{
		VariableType v1=new VariableType(); //by default constructor get called 
		//System.out.println("a value is "+a);  //if we try to call global variable in main method it will display error.
		//System.out.println("x value is"+x); //if we call local variable then error will display
		demo1();
		v1.demo2();
		//v1.demo2();
	}
	public static void demo1()   //we can use static  variable in static method only
	{
		
		int x=1;             //local variable
		int y=2;
		int sum =x+y+a+b;    // 'a' is global variable the scope of variable is within this class 
		System.out.println("Sum is "+sum);
	}
	
	public void demo2()  //we can use non-static and static  variable in non-static method
	{
		int x=90;       //local variable
		int y=100;     //'x' is local variable the scope of variable is within this method
		int sub=x+y-a+b;
		System.out.println("Sub is "+sub);
		
	}
}
