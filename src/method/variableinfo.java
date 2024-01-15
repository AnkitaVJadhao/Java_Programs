package method;

public class variableinfo 

{

	static int a=35;
	int b =56; //instance variable or global variable 
	
	public static void main(String[] args) 
     
     {
		int rollnumber;   //Declare 
		rollnumber =10;  //value assign
		System.out.println("Then rollnumber is "+rollnumber);
		System.out.println("a value is"+a);
		
		variableinfo v1=new variableinfo();
		System.out.println("b value is "+v1.b);	
		v1.display();
		add();
		
		
	
	
	}
	
	public void display()
	{
		System.out.println("a value is"+a);
		System.out.println("b value is "+b);
	}
	
	public static void add()
	{
		int s=2,b=2;   
		int sum=s+b;
		System.out.println("Adding is"+sum);
		
	}
}
