package Casting;

public class casting 
{
	
	public static void main(String[] args) 
	
	{
		//Implicit Casting
		// converting a smaller type to a larger type size
		
		int a= 123;
		System.out.println(a);
		
		double d=a;
		System.out.println(d);
		System.out.println("==========");
		
		//explicit casting
		//converting a larger type to a smaller size type
		
		double b=562.09d;
		System.out.println(b);
		
		int c=(int) b;  //we have to provide data type of int in bracket , so that it will not display error
		System.out.println(c);
		

	}

}
