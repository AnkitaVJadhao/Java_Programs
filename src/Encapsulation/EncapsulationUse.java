package Encapsulation;

public class EncapsulationUse 
{

	//Encapsulation in Java is a mechanism of wrapping(binding) the data members (variables) and 
	//member functions(methods) together into single unit called as class.
	//data hide

		private int a=10;    //Declare the variables of a class as private.
		private int b=20;
		public void addition()
		{
		int sum=a+b;     //Provide public methods to access the data members.
		System.out.println(sum);
		}
		public int getAvalue()
		{
		return a;
		}
		public int getBvalue()
		{
		return b;
		}

		
	  public static void main(String[] args) 
	  {
		  EncapsulationUse e1 = new EncapsulationUse();
		  e1.addition();
		  
		  
		
	}
}
