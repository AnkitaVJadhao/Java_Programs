package mockpractice;

public class VariableUse {

	public static void main(String[] args) 
	{
		
		//type is one of Java's types (such as int or String), and variableName is the name of the variable (such as x or name).
		int a;  //variable declaration
		a=10; //variable initialization 
		System.out.println("Value of variable a is "+a);
		
		String b;
		b="Ankita";
		System.out.println("The name is "+b);
		
		//One Value to Multiple Variables
		
		int x,y,z;
		x=y=z=10;
		System.out.println(x + y + z);
		
		
		String firstName = "Ankita ";
		String lastName = "Jadhao";
		String fullName = firstName + lastName;   //use +  to add a variable to another variable
		System.out.println(fullName);

	}

}
