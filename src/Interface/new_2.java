package Interface;

public class new_2 implements new_1,new_3    //multiple inheritance 

{

	public static void main(String[] args) {
		new_2 n1=new new_2();     
		n1.display1();
		n1.display2();
		n1.display3();
		n1.m1();
		n1.m2();
		System.out.println(a);

	}

	@Override
	public void display1() {
		System.out.println("Hi I am method of new_1");
		
	}

	@Override
	public void display2() {
		System.out.println("Hi I am method of new_1");
		
	}
	
	void display3()
	{
		System.out.println("Hi I am method of new_2");
	}

	@Override
	public void m1() {
		System.out.println("Hi I am method of new_3");
		
	}

	@Override
	public void m2() {
		System.out.println("Hi I am method of new_3");
		
	}

}
