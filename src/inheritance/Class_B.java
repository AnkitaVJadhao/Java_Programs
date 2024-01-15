package inheritance;

public class Class_B extends Class_A1 
{
    public void msg()
    {
    	System.out.println("Hi I am sub class and all emp data is in super class ");
    }
   
    public static void main(String[] args) 
	{
		Class_A1 a=new Class_A1();
	    a.display2();
		Class_B b=new Class_B();
		b.msg();
		b.display2();		

	}
}
