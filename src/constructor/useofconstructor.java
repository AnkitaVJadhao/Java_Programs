package constructor;

public class useofconstructor {
	
	int a; //variable declaration
	int b;
	int c;
	
	//use of constructor -->To initialize data member/variable
	
	public useofconstructor()   //User defined Constructor without/zero parameter constructor
	{
		/*1.Constructor name should be same as class name
		  2.You should not declare any return type for the constructor (like void).
		  3.Arguments/parameter should be different*/
		/* Use of Constructor
		  1.To copy/load non-static members of class into object (In this program we have declared non-static method   */
		a=100;
		b=200;
		c=300;
	
	}

	public static void main(String[] args) 
	{
		useofconstructor u1=new useofconstructor();
		u1.calculation1();
		
	}
	public void calculation1()
	{
		int calculation;
		calculation=(a+b+c)*c;
		System.out.println("Calculation is "+calculation);
	}
	
}
