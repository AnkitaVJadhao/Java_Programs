package Abstract_Class;

public class Concrete_demo extends Abstract_demo
{
	
	
	public static void main(String[] args) 
	{
		Concrete_demo c1=new Concrete_demo();
		c1.msg1();
		c1.msg2();
		c1.msg3();
		c1.msg4();
	}

	
	public void msg4()
	
	{
//		int a=20;
//		int b=a/0;
//		System.out.println(b);    //Error handling
		System.out.println("Hi I am fourth complete class");
	}


	@Override
	public void msg3() {
		System.out.println("Hii");
		
	}
	 
	
}
