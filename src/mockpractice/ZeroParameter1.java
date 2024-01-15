package mockpractice;

public class ZeroParameter1 
{
	int a;
	int b;
	int c;
	
	public ZeroParameter1()
	{
		a=25;  //100
		b=35;
		c=45;
		System.out.println("Constructor stmt");
			
	}
	
	public ZeroParameter1(int x)
	{
		a=x;  
	}
	
	public ZeroParameter1(int p,int q)
	{
		b=p; //1=b
		c=q; //2=c
	}

	public static void main(String[] args) 
	{
		
	 ZeroParameter1 z1= new ZeroParameter1(); 	//calling zero parameter constructor
	 z1.addition();
	 
	ZeroParameter1 z2=new ZeroParameter1(100);  //calling single parameter constructor 
	 z2.addition();
	 
	ZeroParameter1 z3 =new ZeroParameter1(1, 2);   //calling two parameter constructor
	 z3.addition();

	}
	
	public void addition()
	{ 
		
		int sum;
		sum = a+b+c;  //0+1+2
		System.out.println("Sum is "+sum);
	}

}
