package constructor;

public class constructor1
	{
	int a;
	int b;
	int c;
		public constructor1()//user defined without parameter/zero parameter
			{
				a=1;
				b=2;
				c=3;
			}
		public constructor1(int x)//user defined single parameter constructor
			{
				a=x;
				//b?
				//c?
			}
			public constructor1(int x, int y)//user defined two parameter constructor
			{
				a=x;
				b=y;
				//c?
			}
			public constructor1(int x, int y,int z)

			{
				a=x;
				b=y;
				c=z;
			}
			public static void main(String[] args)
			{
				constructor1 c= new constructor1();
				c.addition();
				c.subtraction();
				System.out.println("===================");
				constructor1 c1= new constructor1(100);
				c1.addition();
				c1.subtraction();
				System.out.println("===================");
				constructor1 c2= new constructor1(9, 10);
				c2.addition();
				c2.subtraction();
				System.out.println("===================");
				
			}
			public void addition()// non static method
			{
				int sum=a+b+c;
				System.out.println("a value is "+a);
				System.out.println("b value is "+b);

				System.out.println("c value is "+c);
				System.out.println("Sum is "+sum);
			}
			public void subtraction()
			{
				int sub=a-b-c;
				System.out.println("sub is "+sub);
			}
	}
