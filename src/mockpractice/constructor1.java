package mockpractice;

public class constructor1     //class 

{
    int a;
    int b;
    int c;

public constructor1()     //class name and constructor name should be same , this is zero parameter constructor;
{
	a=100;
	b=200;
	c=300;
}
public static void main(String[] args)
{
	constructor1 c1=new constructor1();   //if we create object then by default constructor get called
	c1.addition();                       //calling non-static method 
	c1.sub();
			
}
public void addition()
{
	int d=a+b+c;
	System.out.println("The addition is "+d);
}
public void sub()
{
	int e=a-b-c;
	System.out.println("The subtraction is"+e);
}
}	

