package mock;

public class Polymerphism {

	public static void main(String[] args)
	{
		 Polymerphism p1=new Polymerphism();
		 p1.add();
		 p1.add(2);

	}
	public void add()
	{
		System.out.println("Hi");
	}
	public void add(int a)
	{
		System.out.println("Bye");
	}

}
