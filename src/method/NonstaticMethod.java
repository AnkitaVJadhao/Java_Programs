package method;

public class NonstaticMethod {

	public static void main(String[] args) 
	{
		
		//calling non static method from same class
		//create object 
		//syntax is :- ClassName objectName= new ClassName();
		NonstaticMethod mathOpr=new NonstaticMethod();
		
		//calling Non-static method from same class
		//syntax :- objectName.methodname();
		System.out.println("Addition of a and b is :-");
		mathOpr.addition();
		System.out.println("Subtraction of a and b is :-");
		mathOpr.subtraction();
		
	}
	public void addition()    //non-static method complete and regular
	{
		int a;
		int b;
		a=10;
		b=20;
		System.out.println(a+b);
		
	}
	public void subtraction()    //non-static method complete and regular
	{
		int a;
		int b;
		a=20;
		b=10;
		System.out.println(a-b);
				
	}

}
