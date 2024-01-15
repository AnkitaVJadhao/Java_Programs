package logical_program;

public class Swap_number {

	public static void main(String[] args) 
	{
		
		int a =10;    
		int b=20;
		int temp;
		System.out.println("Before swapping the value of a is "+a);
		System.out.println("Before swapping the value of b is "+b);
		System.out.println("=========================================");
		//Swapping numbers
		//The temp variable will store the value of a .
		//then a will store the value of b
		//then b will store the value temp.
		
		temp=a;    //temp = 10;
		a=b;      //a=20;
		b=temp;   //b=10;
		
		System.out.println("After swapping the value of a is "+a);
		System.out.println("After swapping the value of b is "+b);
		
		System.out.println("============================================");
		
	System.out.println("Swapping of two number without using third variable");
		
		int num1=40;
		int num2=30;
		num1=num1+num2;      //num1=40+30 =70
		num2=num1-num2;     //num2=70-30 =40
		num1=num1-num2;     //num1=70-40=30
		 System.out.println("swapping the value of num1 is "+num1);
		 System.out.println("swapping the value of num2 is "+num2);
		
		
	}
	

}
