package Polymorphism;

public class Complie_Polymorphism {
	
	//Compile time polymerphism should have same method name but different parameter/argument.

	public static void main(String[] args)
	{
		
		Complie_Polymorphism c1 = new Complie_Polymorphism();
		c1.add(); //method with zero parameter
		System.out.println("====================");
		c1.add(20, 30, 40);     //method with parameter
		System.out.println("====================");
		c1.add(20.3f, 30, 30);   //method with float data type parameter
		System.out.println("====================");
		add(20, 30.5f, 60);     //method with float data type parameter
		System.out.println("====================");
		c1.add("Ankita", "Jadhao");   //method with String data type parameter
		System.out.println("====================");
		c1.add("Velocity", 251);
		System.out.println("====================");
	}

	
	public void add()    //same object but behaviour is different 
	{
		int a=10,b=20,c=30;
		int sum = a+b+c;
		System.out.println("Addition is "+sum);
	}
	
	public static void add(int a, float b,int c)
	{
		
		float sum=a+b+c;
		System.out.println("Addition of static method is "+sum);
		
	}
	//method overloading
	public void add(int a,int b,int c)   //same object but behaviour is different
	{
		int average=(a+b+c)/3;
		System.out.println("Average is "+average);
	}
	//method overloading
	public void add(float a,int b,float c)   //same object but behaviour is different
	{
		float add=a+b+c;
		System.out.println("Addition is "+add );
	}
	//method overloading
	public void add(String a, String b)
	{
		String c=a+b;
		System.out.println("Concatenated strings := "+c);
	}
	//method overloading
	public void add(String a,int b)
	{
		System.out.println("String a is "+a+"int b value is "+b);
	}
}
