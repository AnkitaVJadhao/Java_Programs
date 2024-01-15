package constructor;

public class ZeroParameter 
{
	//use of constructor -->To initialize data member/variable
	int a;
	int b;
	int c;
	
	public ZeroParameter() //user defined zero/without parameter constructor
	{
		a=100;
		b=200;   
		c=300;
	}
	
	public ZeroParameter(int x)
	{
		a=x;
	}
	
	public ZeroParameter(int p,int q)
	{
		a=p;
		c=q;
		
	}
	public static void main(String[] args) 
	{
		//constructor is called when an object of a class is created.
		ZeroParameter p1=new ZeroParameter();   //create object
		p1.addition();
		
		ZeroParameter p2= new ZeroParameter(1000);
		p2.sub();
		
		ZeroParameter p3=new ZeroParameter(2, 4);
		p3.divide();
		
	}
	public void addition()
	{
		int sum;
		sum = a+b+c;
		System.out.println("Sum is "+sum);
	}
	public void sub()
	{
		int sub;
		sub=a-b-c;
		System.out.println("Sub is "+sub);
	}
	public void divide()
	{
		int div;
		div=a+b+c/a;
		System.out.println("Div is "+div);
	}

}
