package mockpractice;

public class VariableType1 
{
 	int a=1; 
 	static int b=4;
	
	public static void main(String[] args) 
	
	{
		VariableType1 v1=new VariableType1();  // class obj-reference = new constructor
		v1.sum();    //non static method call
		sub();     //static method call 
		
	}
	
	public void sum()
	{
		int x=2;
		int y=3;
		int sum=x+y+a+b;
		System.out.println("Sum is "+sum);
	}
	
	public static void sub()
	{
		int x=10;
		int y=5;
		int sub=x-y-b;
		System.out.println("Sub is "+sub);
	}
}
