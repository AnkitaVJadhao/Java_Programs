package logical_program;

public class largest_number {

	public static void main(String[] args) {
		int num1=100;
		int num2=150;
		int num3=160;
		System.out.println("Largest between  "+num1+" "+num2+" "+num3);
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("The largest number is "+num1);
		}
		
		else if(num2>num1 && num2>num3)
		{
			System.out.println("The largest number is "+num2);
		}
		
		else
		{
			System.out.println("The largest number is "+num3);
		}
	}

}
