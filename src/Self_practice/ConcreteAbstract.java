package Self_practice;

public class ConcreteAbstract extends AbstractPractice{

	public static void main(String[] args)
	{
		ConcreteAbstract c1=new ConcreteAbstract();
		c1.add();
		c1.sub(20, 10);
		c1.con();
	
	}

	@Override
	public void add() {
		System.out.println("Addition is hii");
		
	}

}
