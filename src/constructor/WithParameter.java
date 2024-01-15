package constructor;

public class WithParameter 
{ 
	String name;
	
	public WithParameter()
	{
		name="Ankita";
	}
	
	public static void main(String[] args) 
	{
		WithParameter w1=new WithParameter();
		w1.display();

	}
	
	public void display()
	{
		System.out.println("My name is "+name);
	}

}
