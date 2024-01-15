package mock;

public class Poly2 extends Polymerphism {

	public static void main(String[] args)
	{
		Poly2 p2=new Poly2();
		p2.add(3);
		
		Polymerphism p3 =new Polymerphism();
		p3.add(2);
	
	}
	
	public void add(int a)
	{
		System.out.println("Same data type but different class");
	}

}
