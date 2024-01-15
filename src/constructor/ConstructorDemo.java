package constructor;

public class ConstructorDemo {
	int a;
	int b;
	int c;
	
	public ConstructorDemo()
	{
		a=100;
		b=200;
		c=300;
	}
	public static void main(String[] args) {
ConstructorDemo CU1 = new ConstructorDemo();
	CU1.addition();
	CU1.substraction();
	CU1.Average();
	}
public void addition()
{
	int sum= a+b+c;
	System.out.println("Sum of variable is "+sum);
	
	}
public void substraction()
{
	int sub = b-a;
	System.out.println("Substraction of variable is "+sub);
	}
public void Average()
{
	int avg = a+b+c/3;
	System.out.println("Average of all variable is "+avg);
	}
}
