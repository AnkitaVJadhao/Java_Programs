package mock;

public class Mainclass1 extends inheritance
{

	public Mainclass1()
	{
		super(5);
		//this(); 
		System.out.println("Mainclass1");
	}
	
	public Mainclass1(int c)
	{
		this("Ankita");
	
		System.out.println("Mainclass1 with values");
	}
	
	public Mainclass1(String a)
	{
		this();
		System.out.println("Mainclass1 with String");
	
	}
	
	
	public static void main(String[] args)
	{
		
		Mainclass1 m1=new Mainclass1(45);   
		int add=m1.add(20, 30);
		System.out.println(add);//50
		int add2=m1.add(10, 10);  //20
		System.out.println(add2); 
		System.out.println(m1.add(5, 5));  //10
		m1.sub(20, 10);
		System.out.println(m1.sub(20, 10));

	}

}
