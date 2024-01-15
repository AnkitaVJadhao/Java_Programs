package method;

public class MethodParameter {

	public static void main(String[] args)
	{
		//if we want to call non static method we need to create object 
		MethodParameter m1=new MethodParameter();
		//call non static method 
		m1.calculation(); //calling non-static without parameter
		m1.average(10, 120, 45, 65, 30); //calling non-static with arguments.
		m1.average(65, 55, 10, 20, 45); //calling non-static with arguments.
		m1.average(3, 1, 1, 1, 3);
		

	}
	public void calculation() //non-static method without parameter
	{
		int a=10;
		int b=20;
		int c=45;
		int calculation= (a*b/c)+a;
		System.out.println("The calcuation is "+calculation+".");		
	}
	public void average(float a, float b, float c, float d, float e)  //non-static method with parameter
	{
		float avg=(a+b+c+d+e)/5;    
		System.out.println("The average is "+avg);
	}
	

}
