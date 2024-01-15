package logical_program;
import java.util.Scanner;   //Scanner class from util

public class Add_number
{
	
	public static void main(String[] args)
	{
		int num1,num2,sum;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the num1 ");
		num1=input.nextInt();
		System.out.println("Enter the num2 ");
		num2=input.nextInt();
		input.close();
		
		sum=num1+num2;
		System.out.printf("%d + %d =%d" ,num1,num2,sum);
		
		
	}

}
